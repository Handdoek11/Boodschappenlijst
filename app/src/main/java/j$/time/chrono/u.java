package j$.time.chrono;

import j$.time.LocalDateTime;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class u extends AbstractC5881a implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final u f37068d = new u();
    private static final long serialVersionUID = -1440403870442975015L;

    @Override // j$.time.chrono.n
    public final o A(int i8) {
        if (i8 == 0) {
            return v.BCE;
        }
        if (i8 == 1) {
            return v.CE;
        }
        throw new j$.time.c("Invalid era: " + i8);
    }

    private u() {
    }

    @Override // j$.time.chrono.n
    public final String i() {
        return "ISO";
    }

    @Override // j$.time.chrono.n
    public final String r() {
        return "iso8601";
    }

    @Override // j$.time.chrono.n
    public final InterfaceC5882b l(j$.time.temporal.o oVar) {
        return j$.time.h.E(oVar);
    }

    @Override // j$.time.chrono.AbstractC5881a, j$.time.chrono.n
    public final InterfaceC5885e o(LocalDateTime localDateTime) {
        return LocalDateTime.D(localDateTime);
    }

    public static boolean m(long j8) {
        return (3 & j8) == 0 && (j8 % 100 != 0 || j8 % 400 == 0);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    Object writeReplace() {
        return new G((byte) 1, this);
    }
}
