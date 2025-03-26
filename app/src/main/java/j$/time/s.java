package j$.time;

import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;

/* loaded from: classes3.dex */
final class s implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;

    /* renamed from: a, reason: collision with root package name */
    private byte f37161a;

    /* renamed from: b, reason: collision with root package name */
    private Object f37162b;

    public s() {
    }

    s(byte b8, Object obj) {
        this.f37161a = b8;
        this.f37162b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b8 = this.f37161a;
        Object obj = this.f37162b;
        objectOutput.writeByte(b8);
        switch (b8) {
            case 1:
                ((Duration) obj).writeExternal(objectOutput);
                return;
            case 2:
                ((Instant) obj).J(objectOutput);
                return;
            case 3:
                ((h) obj).Z(objectOutput);
                return;
            case 4:
                ((k) obj).W(objectOutput);
                return;
            case 5:
                ((LocalDateTime) obj).T(objectOutput);
                return;
            case 6:
                ((z) obj).G(objectOutput);
                return;
            case 7:
                ((x) obj).I(objectOutput);
                return;
            case 8:
                ((ZoneOffset) obj).O(objectOutput);
                return;
            case 9:
                ((q) obj).writeExternal(objectOutput);
                return;
            case 10:
                ((OffsetDateTime) obj).writeExternal(objectOutput);
                return;
            case 11:
                ((Year) obj).G(objectOutput);
                return;
            case 12:
                ((v) obj).J(objectOutput);
                return;
            case 13:
                ((o) obj).D(objectOutput);
                return;
            case 14:
                ((r) obj).writeExternal(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        this.f37161a = readByte;
        this.f37162b = b(readByte, objectInput);
    }

    static Serializable a(ObjectInput objectInput) {
        return b(objectInput.readByte(), objectInput);
    }

    private static Serializable b(byte b8, ObjectInput objectInput) {
        switch (b8) {
            case 1:
                Duration duration = Duration.f36994c;
                return Duration.n(objectInput.readLong(), objectInput.readInt());
            case 2:
                Instant instant = Instant.f36997c;
                return Instant.F(objectInput.readLong(), objectInput.readInt());
            case 3:
                h hVar = h.f37132d;
                return h.N(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return k.R(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.f37000c;
                h hVar2 = h.f37132d;
                return LocalDateTime.K(h.N(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), k.R(objectInput));
            case 6:
                return z.E(objectInput);
            case 7:
                int i8 = x.f37202d;
                return w.D(objectInput.readUTF(), false);
            case 8:
                return ZoneOffset.N(objectInput);
            case 9:
                return q.E(objectInput);
            case 10:
                return OffsetDateTime.F(objectInput);
            case 11:
                int i9 = Year.f37006b;
                return Year.C(objectInput.readInt());
            case 12:
                return v.G(objectInput);
            case 13:
                return o.C(objectInput);
            case 14:
                return r.a(objectInput);
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.f37162b;
    }
}
