package q3;

/* loaded from: classes.dex */
public final class A6 {

    /* renamed from: a, reason: collision with root package name */
    private static A6 f41018a;

    private A6() {
    }

    public static synchronized A6 a() {
        A6 a62;
        synchronized (A6.class) {
            try {
                if (f41018a == null) {
                    f41018a = new A6();
                }
                a62 = f41018a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return a62;
    }
}
