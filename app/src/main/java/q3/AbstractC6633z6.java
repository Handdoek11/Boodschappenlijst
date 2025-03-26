package q3;

/* renamed from: q3.z6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6633z6 {

    /* renamed from: a, reason: collision with root package name */
    private static C6625y6 f42369a;

    public static synchronized C6538n6 a(AbstractC6498i6 abstractC6498i6) {
        C6538n6 c6538n6;
        synchronized (AbstractC6633z6.class) {
            try {
                if (f42369a == null) {
                    f42369a = new C6625y6(null);
                }
                c6538n6 = (C6538n6) f42369a.b(abstractC6498i6);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c6538n6;
    }

    public static synchronized C6538n6 b(String str) {
        C6538n6 a8;
        synchronized (AbstractC6633z6.class) {
            a8 = a(AbstractC6498i6.d("play-services-code-scanner").c());
        }
        return a8;
    }
}
