package j$.time.temporal;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class w implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;

    /* renamed from: a, reason: collision with root package name */
    private final long f37193a;

    /* renamed from: b, reason: collision with root package name */
    private final long f37194b;

    /* renamed from: c, reason: collision with root package name */
    private final long f37195c;

    /* renamed from: d, reason: collision with root package name */
    private final long f37196d;

    public static w j(long j8, long j9) {
        if (j8 > j9) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new w(j8, j8, j9, j9);
    }

    public static w k(long j8, long j9) {
        if (j8 > j9) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (1 > j9) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new w(1L, 1L, j8, j9);
    }

    private w(long j8, long j9, long j10, long j11) {
        this.f37193a = j8;
        this.f37194b = j9;
        this.f37195c = j10;
        this.f37196d = j11;
    }

    public final boolean g() {
        return this.f37193a == this.f37194b && this.f37195c == this.f37196d;
    }

    public final long e() {
        return this.f37193a;
    }

    public final long f() {
        return this.f37195c;
    }

    public final long d() {
        return this.f37196d;
    }

    public final boolean h() {
        return this.f37193a >= -2147483648L && this.f37196d <= 2147483647L;
    }

    public final boolean i(long j8) {
        return j8 >= this.f37193a && j8 <= this.f37196d;
    }

    public final int a(long j8, r rVar) {
        if (h() && i(j8)) {
            return (int) j8;
        }
        throw new j$.time.c(c(j8, rVar));
    }

    public final void b(long j8, r rVar) {
        if (!i(j8)) {
            throw new j$.time.c(c(j8, rVar));
        }
    }

    private String c(long j8, r rVar) {
        if (rVar != null) {
            return "Invalid value for " + rVar + " (valid values " + this + "): " + j8;
        }
        return "Invalid value (valid values " + this + "): " + j8;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        long j8 = this.f37193a;
        long j9 = this.f37194b;
        if (j8 > j9) {
            throw new InvalidObjectException("Smallest minimum value must be less than largest minimum value");
        }
        long j10 = this.f37195c;
        long j11 = this.f37196d;
        if (j10 > j11) {
            throw new InvalidObjectException("Smallest maximum value must be less than largest maximum value");
        }
        if (j9 > j11) {
            throw new InvalidObjectException("Minimum value must be less than maximum value");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f37193a == wVar.f37193a && this.f37194b == wVar.f37194b && this.f37195c == wVar.f37195c && this.f37196d == wVar.f37196d;
    }

    public final int hashCode() {
        long j8 = this.f37194b;
        long j9 = this.f37193a + (j8 << 16) + (j8 >> 48);
        long j10 = this.f37195c;
        long j11 = j9 + (j10 << 32) + (j10 >> 32);
        long j12 = this.f37196d;
        long j13 = j11 + (j12 << 48) + (j12 >> 16);
        return (int) ((j13 >>> 32) ^ j13);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        long j8 = this.f37193a;
        sb.append(j8);
        long j9 = this.f37194b;
        if (j8 != j9) {
            sb.append('/');
            sb.append(j9);
        }
        sb.append(" - ");
        long j10 = this.f37195c;
        sb.append(j10);
        long j11 = this.f37196d;
        if (j10 != j11) {
            sb.append('/');
            sb.append(j11);
        }
        return sb.toString();
    }
}
