package E5;

import J6.AbstractC0650j;

/* loaded from: classes2.dex */
public final class f extends T5.d {

    /* renamed from: g, reason: collision with root package name */
    public static final a f2186g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    private static final T5.h f2187h = new T5.h("Before");

    /* renamed from: i, reason: collision with root package name */
    private static final T5.h f2188i = new T5.h("State");

    /* renamed from: j, reason: collision with root package name */
    private static final T5.h f2189j = new T5.h("Transform");

    /* renamed from: k, reason: collision with root package name */
    private static final T5.h f2190k = new T5.h("Render");

    /* renamed from: l, reason: collision with root package name */
    private static final T5.h f2191l = new T5.h("Send");

    /* renamed from: f, reason: collision with root package name */
    private final boolean f2192f;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        public final T5.h a() {
            return f.f2187h;
        }

        public final T5.h b() {
            return f.f2190k;
        }

        public final T5.h c() {
            return f.f2191l;
        }

        public final T5.h d() {
            return f.f2189j;
        }

        private a() {
        }
    }

    public f(boolean z7) {
        super(f2187h, f2188i, f2189j, f2190k, f2191l);
        this.f2192f = z7;
    }

    @Override // T5.d
    public boolean g() {
        return this.f2192f;
    }
}
