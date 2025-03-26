package j$.time.chrono;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* renamed from: j$.time.chrono.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5888h implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f37039e = 0;
    private static final long serialVersionUID = 57387258289L;

    /* renamed from: a, reason: collision with root package name */
    private final n f37040a;

    /* renamed from: b, reason: collision with root package name */
    final int f37041b;

    /* renamed from: c, reason: collision with root package name */
    final int f37042c;

    /* renamed from: d, reason: collision with root package name */
    final int f37043d;

    static {
        j$.com.android.tools.r8.a.f(new Object[]{j$.time.temporal.b.YEARS, j$.time.temporal.b.MONTHS, j$.time.temporal.b.DAYS});
    }

    C5888h(n nVar, int i8, int i9, int i10) {
        Objects.requireNonNull(nVar, "chrono");
        this.f37040a = nVar;
        this.f37041b = i8;
        this.f37042c = i9;
        this.f37043d = i10;
    }

    public final String toString() {
        n nVar = this.f37040a;
        int i8 = this.f37043d;
        int i9 = this.f37042c;
        int i10 = this.f37041b;
        if (i10 == 0 && i9 == 0 && i8 == 0) {
            return nVar.toString() + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(nVar.toString());
        sb.append(" P");
        if (i10 != 0) {
            sb.append(i10);
            sb.append('Y');
        }
        if (i9 != 0) {
            sb.append(i9);
            sb.append('M');
        }
        if (i8 != 0) {
            sb.append(i8);
            sb.append('D');
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5888h)) {
            return false;
        }
        C5888h c5888h = (C5888h) obj;
        return this.f37041b == c5888h.f37041b && this.f37042c == c5888h.f37042c && this.f37043d == c5888h.f37043d && this.f37040a.equals(c5888h.f37040a);
    }

    public final int hashCode() {
        return this.f37040a.hashCode() ^ (Integer.rotateLeft(this.f37043d, 16) + (Integer.rotateLeft(this.f37042c, 8) + this.f37041b));
    }

    protected Object writeReplace() {
        return new G((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeUTF(this.f37040a.i());
        objectOutput.writeInt(this.f37041b);
        objectOutput.writeInt(this.f37042c);
        objectOutput.writeInt(this.f37043d);
    }
}
