package j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public final class Duration implements Comparable<Duration>, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final Duration f36994c = new Duration(0, 0);
    private static final long serialVersionUID = 3078945930695997490L;

    /* renamed from: a, reason: collision with root package name */
    private final long f36995a;

    /* renamed from: b, reason: collision with root package name */
    private final int f36996b;

    @Override // java.lang.Comparable
    public final int compareTo(Duration duration) {
        Duration duration2 = duration;
        int compare = Long.compare(this.f36995a, duration2.f36995a);
        return compare != 0 ? compare : this.f36996b - duration2.f36996b;
    }

    static {
        BigInteger.valueOf(1000000000L);
    }

    public static Duration ofMinutes(long j8) {
        return j(j$.com.android.tools.r8.a.j(j8, 60), 0);
    }

    public static Duration m(long j8) {
        return j(j8, 0);
    }

    public static Duration n(long j8, long j9) {
        return j(j$.com.android.tools.r8.a.d(j8, j$.com.android.tools.r8.a.i(j9, 1000000000L)), (int) j$.com.android.tools.r8.a.h(j9, 1000000000L));
    }

    private static Duration j(long j8, int i8) {
        if ((i8 | j8) == 0) {
            return f36994c;
        }
        return new Duration(j8, i8);
    }

    private Duration(long j8, int i8) {
        this.f36995a = j8;
        this.f36996b = i8;
    }

    public final long k() {
        return this.f36995a;
    }

    public long toMillis() {
        long j8 = this.f36996b;
        long j9 = this.f36995a;
        if (j9 < 0) {
            j9++;
            j8 -= 1000000000;
        }
        return j$.com.android.tools.r8.a.d(j$.com.android.tools.r8.a.j(j9, 1000), j8 / 1000000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Duration)) {
            return false;
        }
        Duration duration = (Duration) obj;
        return this.f36995a == duration.f36995a && this.f36996b == duration.f36996b;
    }

    public final int hashCode() {
        long j8 = this.f36995a;
        return (this.f36996b * 51) + ((int) (j8 ^ (j8 >>> 32)));
    }

    public final String toString() {
        if (this == f36994c) {
            return "PT0S";
        }
        long j8 = this.f36995a;
        int i8 = this.f36996b;
        long j9 = (j8 >= 0 || i8 <= 0) ? j8 : 1 + j8;
        long j10 = j9 / 3600;
        int i9 = (int) ((j9 % 3600) / 60);
        int i10 = (int) (j9 % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j10 != 0) {
            sb.append(j10);
            sb.append('H');
        }
        if (i9 != 0) {
            sb.append(i9);
            sb.append('M');
        }
        if (i10 == 0 && i8 == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (j8 < 0 && i8 > 0 && i10 == 0) {
            sb.append("-0");
        } else {
            sb.append(i10);
        }
        if (i8 > 0) {
            int length = sb.length();
            if (j8 < 0) {
                sb.append(2000000000 - i8);
            } else {
                sb.append(i8 + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }

    private Object writeReplace() {
        return new s((byte) 1, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeLong(this.f36995a);
        objectOutput.writeInt(this.f36996b);
    }
}
