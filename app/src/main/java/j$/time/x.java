package j$.time;

import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;

/* loaded from: classes3.dex */
final class x extends w {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f37202d = 0;
    private static final long serialVersionUID = 8386373296231747096L;

    /* renamed from: b, reason: collision with root package name */
    private final String f37203b;

    /* renamed from: c, reason: collision with root package name */
    private final transient j$.time.zone.f f37204c;

    static x H(String str, boolean z7) {
        j$.time.zone.f fVar;
        Objects.requireNonNull(str, "zoneId");
        int length = str.length();
        if (length >= 2) {
            for (int i8 = 0; i8 < length; i8++) {
                char charAt = str.charAt(i8);
                if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && ((charAt != '/' || i8 == 0) && ((charAt < '0' || charAt > '9' || i8 == 0) && ((charAt != '~' || i8 == 0) && ((charAt != '.' || i8 == 0) && ((charAt != '_' || i8 == 0) && ((charAt != '+' || i8 == 0) && (charAt != '-' || i8 == 0))))))))) {
                    throw new c("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
                }
            }
            try {
                fVar = j$.time.zone.j.a(str, true);
            } catch (j$.time.zone.g e8) {
                if (z7) {
                    throw e8;
                }
                fVar = null;
            }
            return new x(str, fVar);
        }
        throw new c("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
    }

    x(String str, j$.time.zone.f fVar) {
        this.f37203b = str;
        this.f37204c = fVar;
    }

    @Override // j$.time.w
    public final String i() {
        return this.f37203b;
    }

    @Override // j$.time.w
    public final j$.time.zone.f C() {
        j$.time.zone.f fVar = this.f37204c;
        return fVar != null ? fVar : j$.time.zone.j.a(this.f37203b, false);
    }

    private Object writeReplace() {
        return new s((byte) 7, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.w
    final void G(ObjectOutput objectOutput) {
        objectOutput.writeByte(7);
        objectOutput.writeUTF(this.f37203b);
    }

    final void I(DataOutput dataOutput) {
        dataOutput.writeUTF(this.f37203b);
    }
}
