package E5;

import J6.AbstractC0650j;

/* loaded from: classes2.dex */
public final class h extends T5.d {

    /* renamed from: g, reason: collision with root package name */
    public static final a f2200g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    private static final T5.h f2201h = new T5.h("Before");

    /* renamed from: i, reason: collision with root package name */
    private static final T5.h f2202i = new T5.h("State");

    /* renamed from: j, reason: collision with root package name */
    private static final T5.h f2203j = new T5.h("Monitoring");

    /* renamed from: k, reason: collision with root package name */
    private static final T5.h f2204k = new T5.h("Engine");

    /* renamed from: l, reason: collision with root package name */
    private static final T5.h f2205l = new T5.h("Receive");

    /* renamed from: f, reason: collision with root package name */
    private final boolean f2206f;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        public final T5.h a() {
            return h.f2204k;
        }

        public final T5.h b() {
            return h.f2205l;
        }

        private a() {
        }
    }

    public h(boolean z7) {
        super(f2201h, f2202i, f2203j, f2204k, f2205l);
        this.f2206f = z7;
    }

    @Override // T5.d
    public boolean g() {
        return this.f2206f;
    }
}
