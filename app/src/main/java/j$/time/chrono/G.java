package j$.time.chrono;

import j$.time.ZoneOffset;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* loaded from: classes3.dex */
final class G implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;

    /* renamed from: a, reason: collision with root package name */
    private byte f37025a;

    /* renamed from: b, reason: collision with root package name */
    private Object f37026b;

    public G() {
    }

    G(byte b8, Object obj) {
        this.f37025a = b8;
        this.f37026b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b8 = this.f37025a;
        Object obj = this.f37026b;
        objectOutput.writeByte(b8);
        switch (b8) {
            case 1:
                objectOutput.writeUTF(((AbstractC5881a) obj).i());
                return;
            case 2:
                ((C5887g) obj).writeExternal(objectOutput);
                return;
            case 3:
                ((m) obj).writeExternal(objectOutput);
                return;
            case 4:
                z zVar = (z) obj;
                zVar.getClass();
                objectOutput.writeInt(j$.time.temporal.n.a(zVar, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(zVar, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(zVar, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 5:
                ((A) obj).E(objectOutput);
                return;
            case 6:
                ((s) obj).writeExternal(objectOutput);
                return;
            case 7:
                E e8 = (E) obj;
                e8.getClass();
                objectOutput.writeInt(j$.time.temporal.n.a(e8, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(e8, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(e8, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 8:
                K k8 = (K) obj;
                k8.getClass();
                objectOutput.writeInt(j$.time.temporal.n.a(k8, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(k8, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(k8, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 9:
                ((C5888h) obj).writeExternal(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        Object j8;
        byte readByte = objectInput.readByte();
        this.f37025a = readByte;
        switch (readByte) {
            case 1:
                int i8 = AbstractC5881a.f37034c;
                j8 = AbstractC5881a.j(objectInput.readUTF());
                break;
            case 2:
                j8 = ((InterfaceC5882b) objectInput.readObject()).u((j$.time.k) objectInput.readObject());
                break;
            case 3:
                j8 = ((InterfaceC5885e) objectInput.readObject()).p((ZoneOffset) objectInput.readObject()).h((j$.time.w) objectInput.readObject());
                break;
            case 4:
                j$.time.h hVar = z.f37073d;
                int readInt = objectInput.readInt();
                byte readByte2 = objectInput.readByte();
                byte readByte3 = objectInput.readByte();
                x.f37071d.getClass();
                j8 = new z(j$.time.h.N(readInt, readByte2, readByte3));
                break;
            case 5:
                A a8 = A.f37015d;
                j8 = A.A(objectInput.readByte());
                break;
            case 6:
                q qVar = (q) objectInput.readObject();
                int readInt2 = objectInput.readInt();
                byte readByte4 = objectInput.readByte();
                byte readByte5 = objectInput.readByte();
                qVar.getClass();
                j8 = s.K(qVar, readInt2, readByte4, readByte5);
                break;
            case 7:
                int readInt3 = objectInput.readInt();
                byte readByte6 = objectInput.readByte();
                byte readByte7 = objectInput.readByte();
                C.f37021d.getClass();
                j8 = new E(j$.time.h.N(readInt3 + 1911, readByte6, readByte7));
                break;
            case 8:
                int readInt4 = objectInput.readInt();
                byte readByte8 = objectInput.readByte();
                byte readByte9 = objectInput.readByte();
                I.f37028d.getClass();
                j8 = new K(j$.time.h.N(readInt4 - 543, readByte8, readByte9));
                break;
            case 9:
                int i9 = C5888h.f37039e;
                j8 = new C5888h(AbstractC5881a.j(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.f37026b = j8;
    }

    private Object readResolve() {
        return this.f37026b;
    }
}
