package androidx.appcompat.widget;

/* loaded from: classes.dex */
class Y {

    /* renamed from: a, reason: collision with root package name */
    private int f7724a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f7725b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f7726c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    private int f7727d = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    private int f7728e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f7729f = 0;

    /* renamed from: g, reason: collision with root package name */
    private boolean f7730g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f7731h = false;

    Y() {
    }

    public int a() {
        return this.f7730g ? this.f7724a : this.f7725b;
    }

    public int b() {
        return this.f7724a;
    }

    public int c() {
        return this.f7725b;
    }

    public int d() {
        return this.f7730g ? this.f7725b : this.f7724a;
    }

    public void e(int i8, int i9) {
        this.f7731h = false;
        if (i8 != Integer.MIN_VALUE) {
            this.f7728e = i8;
            this.f7724a = i8;
        }
        if (i9 != Integer.MIN_VALUE) {
            this.f7729f = i9;
            this.f7725b = i9;
        }
    }

    public void f(boolean z7) {
        if (z7 == this.f7730g) {
            return;
        }
        this.f7730g = z7;
        if (!this.f7731h) {
            this.f7724a = this.f7728e;
            this.f7725b = this.f7729f;
            return;
        }
        if (z7) {
            int i8 = this.f7727d;
            if (i8 == Integer.MIN_VALUE) {
                i8 = this.f7728e;
            }
            this.f7724a = i8;
            int i9 = this.f7726c;
            if (i9 == Integer.MIN_VALUE) {
                i9 = this.f7729f;
            }
            this.f7725b = i9;
            return;
        }
        int i10 = this.f7726c;
        if (i10 == Integer.MIN_VALUE) {
            i10 = this.f7728e;
        }
        this.f7724a = i10;
        int i11 = this.f7727d;
        if (i11 == Integer.MIN_VALUE) {
            i11 = this.f7729f;
        }
        this.f7725b = i11;
    }

    public void g(int i8, int i9) {
        this.f7726c = i8;
        this.f7727d = i9;
        this.f7731h = true;
        if (this.f7730g) {
            if (i9 != Integer.MIN_VALUE) {
                this.f7724a = i9;
            }
            if (i8 != Integer.MIN_VALUE) {
                this.f7725b = i8;
                return;
            }
            return;
        }
        if (i8 != Integer.MIN_VALUE) {
            this.f7724a = i8;
        }
        if (i9 != Integer.MIN_VALUE) {
            this.f7725b = i9;
        }
    }
}
