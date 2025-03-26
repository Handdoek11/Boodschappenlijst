package j$.time;

import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes3.dex */
final class a extends b implements Serializable {
    private static final long serialVersionUID = 6740630888130243051L;

    /* renamed from: a, reason: collision with root package name */
    private final w f37014a;

    static {
        System.currentTimeMillis();
        new a(ZoneOffset.UTC);
    }

    a(w wVar) {
        this.f37014a = wVar;
    }

    public final w a() {
        return this.f37014a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f37014a.equals(((a) obj).f37014a);
    }

    public final int hashCode() {
        return this.f37014a.hashCode() + 1;
    }

    public final String toString() {
        return "SystemClock[" + this.f37014a + "]";
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
    }
}
