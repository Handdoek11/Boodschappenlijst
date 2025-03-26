package j$.time.format;

import j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final s f37126a = new s();

    public final int hashCode() {
        return 182;
    }

    static {
        new ConcurrentHashMap(16, 0.75f, 2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        ((s) obj).getClass();
        return true;
    }

    public final String toString() {
        return "DecimalStyle[0+-.]";
    }
}
