package F5;

import J6.AbstractC0650j;
import T5.h;

/* loaded from: classes2.dex */
public final class f extends T5.d {

    /* renamed from: g, reason: collision with root package name */
    public static final a f2401g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    private static final h f2402h = new h("Receive");

    /* renamed from: i, reason: collision with root package name */
    private static final h f2403i = new h("Parse");

    /* renamed from: j, reason: collision with root package name */
    private static final h f2404j = new h("Transform");

    /* renamed from: k, reason: collision with root package name */
    private static final h f2405k = new h("State");

    /* renamed from: l, reason: collision with root package name */
    private static final h f2406l = new h("After");

    /* renamed from: f, reason: collision with root package name */
    private final boolean f2407f;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        public final h a() {
            return f.f2403i;
        }

        public final h b() {
            return f.f2402h;
        }

        public final h c() {
            return f.f2404j;
        }

        private a() {
        }
    }

    public f(boolean z7) {
        super(f2402h, f2403i, f2404j, f2405k, f2406l);
        this.f2407f = z7;
    }

    @Override // T5.d
    public boolean g() {
        return this.f2407f;
    }
}
