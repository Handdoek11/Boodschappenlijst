package F5;

import J6.AbstractC0650j;
import T5.h;

/* loaded from: classes2.dex */
public final class b extends T5.d {

    /* renamed from: g, reason: collision with root package name */
    public static final a f2391g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    private static final h f2392h = new h("Before");

    /* renamed from: i, reason: collision with root package name */
    private static final h f2393i = new h("State");

    /* renamed from: j, reason: collision with root package name */
    private static final h f2394j = new h("After");

    /* renamed from: f, reason: collision with root package name */
    private final boolean f2395f;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        public final h a() {
            return b.f2394j;
        }

        private a() {
        }
    }

    public b(boolean z7) {
        super(f2392h, f2393i, f2394j);
        this.f2395f = z7;
    }

    @Override // T5.d
    public boolean g() {
        return this.f2395f;
    }
}
