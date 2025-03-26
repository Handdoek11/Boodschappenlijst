package r3;

/* loaded from: classes.dex */
public abstract class U {

    /* renamed from: a, reason: collision with root package name */
    private static T f42568a;

    public static synchronized L a(H h8) {
        L l8;
        synchronized (U.class) {
            try {
                if (f42568a == null) {
                    f42568a = new T(null);
                }
                l8 = (L) f42568a.b(h8);
            } catch (Throwable th) {
                throw th;
            }
        }
        return l8;
    }

    public static synchronized L b(String str) {
        L a8;
        synchronized (U.class) {
            a8 = a(H.d("common").c());
        }
        return a8;
    }
}
