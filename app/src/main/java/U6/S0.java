package U6;

/* loaded from: classes2.dex */
public final class S0 {

    /* renamed from: a, reason: collision with root package name */
    public static final S0 f5422a = new S0();

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f5423b = Z6.J.a(new Z6.E("ThreadLocalEventLoop"));

    private S0() {
    }

    public final AbstractC0714f0 a() {
        return (AbstractC0714f0) f5423b.get();
    }

    public final AbstractC0714f0 b() {
        ThreadLocal threadLocal = f5423b;
        AbstractC0714f0 abstractC0714f0 = (AbstractC0714f0) threadLocal.get();
        if (abstractC0714f0 != null) {
            return abstractC0714f0;
        }
        AbstractC0714f0 a8 = AbstractC0720i0.a();
        threadLocal.set(a8);
        return a8;
    }

    public final void c() {
        f5423b.set(null);
    }

    public final void d(AbstractC0714f0 abstractC0714f0) {
        f5423b.set(abstractC0714f0);
    }
}
