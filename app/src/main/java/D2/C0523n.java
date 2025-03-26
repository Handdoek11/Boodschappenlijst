package D2;

import android.content.Context;
import i3.BinderC5853b;

/* renamed from: D2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0523n extends AbstractC0552x {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f1314b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c2 f1315c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f1316d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C0549w f1317e;

    C0523n(C0549w c0549w, Context context, c2 c2Var, String str) {
        this.f1314b = context;
        this.f1315c = c2Var;
        this.f1316d = str;
        this.f1317e = c0549w;
    }

    @Override // D2.AbstractC0552x
    public final /* bridge */ /* synthetic */ Object a() {
        C0549w.q(this.f1314b, "search");
        return new B1();
    }

    @Override // D2.AbstractC0552x
    public final /* bridge */ /* synthetic */ Object b(InterfaceC0518l0 interfaceC0518l0) {
        return interfaceC0518l0.V5(BinderC5853b.p2(this.f1314b), this.f1315c, this.f1316d, 244410000);
    }

    @Override // D2.AbstractC0552x
    public final /* bridge */ /* synthetic */ Object c() {
        return this.f1317e.f1352a.c(this.f1314b, this.f1315c, this.f1316d, null, 3);
    }
}
