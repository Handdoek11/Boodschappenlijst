package j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class r implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final r f37157d = new r(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;

    /* renamed from: a, reason: collision with root package name */
    private final int f37158a;

    /* renamed from: b, reason: collision with root package name */
    private final int f37159b;

    /* renamed from: c, reason: collision with root package name */
    private final int f37160c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        j$.com.android.tools.r8.a.f(new Object[]{j$.time.temporal.b.YEARS, j$.time.temporal.b.MONTHS, j$.time.temporal.b.DAYS});
    }

    private r(int i8, int i9, int i10) {
        this.f37158a = i8;
        this.f37159b = i9;
        this.f37160c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f37158a == rVar.f37158a && this.f37159b == rVar.f37159b && this.f37160c == rVar.f37160c;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.f37160c, 16) + Integer.rotateLeft(this.f37159b, 8) + this.f37158a;
    }

    public final String toString() {
        if (this == f37157d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder("P");
        int i8 = this.f37158a;
        if (i8 != 0) {
            sb.append(i8);
            sb.append('Y');
        }
        int i9 = this.f37159b;
        if (i9 != 0) {
            sb.append(i9);
            sb.append('M');
        }
        int i10 = this.f37160c;
        if (i10 != 0) {
            sb.append(i10);
            sb.append('D');
        }
        return sb.toString();
    }

    private Object writeReplace() {
        return new s((byte) 14, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeInt(this.f37158a);
        objectOutput.writeInt(this.f37159b);
        objectOutput.writeInt(this.f37160c);
    }

    static r a(ObjectInput objectInput) {
        int readInt = objectInput.readInt();
        int readInt2 = objectInput.readInt();
        int readInt3 = objectInput.readInt();
        if ((readInt | readInt2 | readInt3) == 0) {
            return f37157d;
        }
        return new r(readInt, readInt2, readInt3);
    }
}
