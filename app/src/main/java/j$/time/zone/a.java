package j$.time.zone;

import j$.time.ZoneOffset;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.util.TimeZone;

/* loaded from: classes3.dex */
final class a implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;

    /* renamed from: a, reason: collision with root package name */
    private byte f37209a;

    /* renamed from: b, reason: collision with root package name */
    private Serializable f37210b;

    public a() {
    }

    a(byte b8, Serializable serializable) {
        this.f37209a = b8;
        this.f37210b = serializable;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b8 = this.f37209a;
        Serializable serializable = this.f37210b;
        objectOutput.writeByte(b8);
        if (b8 == 1) {
            ((f) serializable).writeExternal(objectOutput);
            return;
        }
        if (b8 == 2) {
            ((b) serializable).writeExternal(objectOutput);
        } else if (b8 == 3) {
            ((e) serializable).writeExternal(objectOutput);
        } else {
            if (b8 == 100) {
                ((f) serializable).k(objectOutput);
                return;
            }
            throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        Serializable j8;
        byte readByte = objectInput.readByte();
        this.f37209a = readByte;
        if (readByte == 1) {
            j8 = f.j(objectInput);
        } else if (readByte == 2) {
            long a8 = a(objectInput);
            ZoneOffset b8 = b(objectInput);
            ZoneOffset b9 = b(objectInput);
            if (b8.equals(b9)) {
                throw new IllegalArgumentException("Offsets must not be equal");
            }
            j8 = new b(a8, b8, b9);
        } else if (readByte == 3) {
            j8 = e.b(objectInput);
        } else {
            if (readByte != 100) {
                throw new StreamCorruptedException("Unknown serialized type");
            }
            j8 = new f(TimeZone.getTimeZone(objectInput.readUTF()));
        }
        this.f37210b = j8;
    }

    private Object readResolve() {
        return this.f37210b;
    }

    static void d(ZoneOffset zoneOffset, ObjectOutput objectOutput) {
        int I7 = zoneOffset.I();
        int i8 = I7 % 900 == 0 ? I7 / 900 : 127;
        objectOutput.writeByte(i8);
        if (i8 == 127) {
            objectOutput.writeInt(I7);
        }
    }

    static ZoneOffset b(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        return readByte == Byte.MAX_VALUE ? ZoneOffset.L(objectInput.readInt()) : ZoneOffset.L(readByte * 900);
    }

    static void c(long j8, ObjectOutput objectOutput) {
        if (j8 >= -4575744000L && j8 < 10413792000L && j8 % 900 == 0) {
            int i8 = (int) ((j8 + 4575744000L) / 900);
            objectOutput.writeByte((i8 >>> 16) & 255);
            objectOutput.writeByte((i8 >>> 8) & 255);
            objectOutput.writeByte(i8 & 255);
            return;
        }
        objectOutput.writeByte(255);
        objectOutput.writeLong(j8);
    }

    static long a(ObjectInput objectInput) {
        if ((objectInput.readByte() & 255) == 255) {
            return objectInput.readLong();
        }
        return ((((r0 << 16) + ((objectInput.readByte() & 255) << 8)) + (objectInput.readByte() & 255)) * 900) - 4575744000L;
    }
}
