package p3;

import android.app.Application;

/* renamed from: p3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6340g extends AbstractC6328a {

    /* renamed from: b, reason: collision with root package name */
    private final C6340g f40275b = this;

    /* renamed from: c, reason: collision with root package name */
    private final S0 f40276c;

    /* renamed from: d, reason: collision with root package name */
    private final S0 f40277d;

    /* renamed from: e, reason: collision with root package name */
    private final S0 f40278e;

    /* renamed from: f, reason: collision with root package name */
    private final S0 f40279f;

    /* renamed from: g, reason: collision with root package name */
    private final S0 f40280g;

    /* renamed from: h, reason: collision with root package name */
    private final S0 f40281h;

    /* renamed from: i, reason: collision with root package name */
    private final S0 f40282i;

    /* renamed from: j, reason: collision with root package name */
    private final S0 f40283j;

    /* renamed from: k, reason: collision with root package name */
    private final S0 f40284k;

    /* renamed from: l, reason: collision with root package name */
    private final S0 f40285l;

    /* renamed from: m, reason: collision with root package name */
    private final S0 f40286m;

    /* synthetic */ C6340g(Application application, AbstractC6348k abstractC6348k) {
        P0 a8 = Q0.a(application);
        this.f40276c = a8;
        S0 a9 = O0.a(new C6356o(a8));
        this.f40277d = a9;
        S0 a10 = O0.a(AbstractC6334d.f40253a);
        this.f40278e = a10;
        C6338f c6338f = new C6338f(this);
        this.f40279f = c6338f;
        S0 a11 = O0.a(new N(c6338f, r.f40379a));
        this.f40280g = a11;
        f1 f1Var = new f1(a8, a9);
        this.f40281h = f1Var;
        S0 a12 = O0.a(new V0(r.f40379a));
        this.f40282i = a12;
        C6352m c6352m = new C6352m(a8, a9, r.f40379a);
        this.f40283j = c6352m;
        C6330b c6330b = new C6330b(a12, c6352m, a9);
        this.f40284k = c6330b;
        m1 m1Var = new m1(a8, a10, AbstractC6358p.f40373a, r.f40379a, a9, a11, f1Var, c6330b, a12);
        this.f40285l = m1Var;
        this.f40286m = O0.a(new Z0(a9, m1Var, a11));
    }

    @Override // p3.AbstractC6328a
    public final Y0 b() {
        return (Y0) this.f40286m.zza();
    }

    @Override // p3.AbstractC6328a
    public final M c() {
        return (M) this.f40280g.zza();
    }
}
