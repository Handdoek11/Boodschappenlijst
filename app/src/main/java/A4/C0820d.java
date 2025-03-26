package a4;

/* renamed from: a4.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0820d {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f6550a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6551b;

    /* renamed from: c, reason: collision with root package name */
    private final C0817a f6552c;

    /* renamed from: a4.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f6553a;

        /* renamed from: b, reason: collision with root package name */
        private String f6554b;

        /* renamed from: c, reason: collision with root package name */
        private C0817a f6555c;

        public C0820d a() {
            return new C0820d(this, null);
        }

        public a b(C0817a c0817a) {
            this.f6555c = c0817a;
            return this;
        }

        public a c(boolean z7) {
            this.f6553a = z7;
            return this;
        }
    }

    /* synthetic */ C0820d(a aVar, h hVar) {
        this.f6550a = aVar.f6553a;
        this.f6551b = aVar.f6554b;
        this.f6552c = aVar.f6555c;
    }

    public C0817a a() {
        return this.f6552c;
    }

    public boolean b() {
        return this.f6550a;
    }

    public final String c() {
        return this.f6551b;
    }
}
