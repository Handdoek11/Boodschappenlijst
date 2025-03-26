package z2;

import w2.x;

/* renamed from: z2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7070e {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f44852a;

    /* renamed from: b, reason: collision with root package name */
    private final int f44853b;

    /* renamed from: c, reason: collision with root package name */
    private final int f44854c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f44855d;

    /* renamed from: e, reason: collision with root package name */
    private final int f44856e;

    /* renamed from: f, reason: collision with root package name */
    private final x f44857f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f44858g;

    /* renamed from: z2.e$a */
    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        private x f44863e;

        /* renamed from: a, reason: collision with root package name */
        private boolean f44859a = false;

        /* renamed from: b, reason: collision with root package name */
        private int f44860b = -1;

        /* renamed from: c, reason: collision with root package name */
        private int f44861c = 0;

        /* renamed from: d, reason: collision with root package name */
        private boolean f44862d = false;

        /* renamed from: f, reason: collision with root package name */
        private int f44864f = 1;

        /* renamed from: g, reason: collision with root package name */
        private boolean f44865g = false;

        public C7070e a() {
            return new C7070e(this, null);
        }

        public a b(int i8) {
            this.f44864f = i8;
            return this;
        }

        public a c(int i8) {
            this.f44860b = i8;
            return this;
        }

        public a d(int i8) {
            this.f44861c = i8;
            return this;
        }

        public a e(boolean z7) {
            this.f44865g = z7;
            return this;
        }

        public a f(boolean z7) {
            this.f44862d = z7;
            return this;
        }

        public a g(boolean z7) {
            this.f44859a = z7;
            return this;
        }

        public a h(x xVar) {
            this.f44863e = xVar;
            return this;
        }
    }

    /* synthetic */ C7070e(a aVar, AbstractC7075j abstractC7075j) {
        this.f44852a = aVar.f44859a;
        this.f44853b = aVar.f44860b;
        this.f44854c = aVar.f44861c;
        this.f44855d = aVar.f44862d;
        this.f44856e = aVar.f44864f;
        this.f44857f = aVar.f44863e;
        this.f44858g = aVar.f44865g;
    }

    public int a() {
        return this.f44856e;
    }

    public int b() {
        return this.f44853b;
    }

    public int c() {
        return this.f44854c;
    }

    public x d() {
        return this.f44857f;
    }

    public boolean e() {
        return this.f44855d;
    }

    public boolean f() {
        return this.f44852a;
    }

    public final boolean g() {
        return this.f44858g;
    }
}
