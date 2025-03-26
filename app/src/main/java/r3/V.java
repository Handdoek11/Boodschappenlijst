package r3;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    private static V f42569a;

    private V() {
    }

    public static synchronized V a() {
        V v7;
        synchronized (V.class) {
            try {
                if (f42569a == null) {
                    f42569a = new V();
                }
                v7 = f42569a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return v7;
    }
}
