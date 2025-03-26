package D2;

import android.content.Context;
import com.google.android.gms.internal.ads.InterfaceC1242Dl;
import i3.BinderC5853b;

/* renamed from: D2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0517l extends AbstractC0552x {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f1301b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c2 f1302c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f1303d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC1242Dl f1304e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C0549w f1305f;

    C0517l(C0549w c0549w, Context context, c2 c2Var, String str, InterfaceC1242Dl interfaceC1242Dl) {
        this.f1301b = context;
        this.f1302c = c2Var;
        this.f1303d = str;
        this.f1304e = interfaceC1242Dl;
        this.f1305f = c0549w;
    }

    @Override // D2.AbstractC0552x
    public final /* bridge */ /* synthetic */ Object a() {
        C0549w.q(this.f1301b, "banner");
        return new B1();
    }

    @Override // D2.AbstractC0552x
    public final /* bridge */ /* synthetic */ Object b(InterfaceC0518l0 interfaceC0518l0) {
        return interfaceC0518l0.F3(BinderC5853b.p2(this.f1301b), this.f1302c, this.f1303d, this.f1304e, 244410000);
    }

    @Override // D2.AbstractC0552x
    public final /* bridge */ /* synthetic */ Object c() {
        return this.f1305f.f1352a.c(this.f1301b, this.f1302c, this.f1303d, this.f1304e, 1);
    }
}
