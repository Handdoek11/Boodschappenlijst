package D2;

import android.content.Context;
import com.google.android.gms.internal.ads.InterfaceC1242Dl;
import i3.BinderC5853b;

/* renamed from: D2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0520m extends AbstractC0552x {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f1308b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c2 f1309c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f1310d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC1242Dl f1311e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C0549w f1312f;

    C0520m(C0549w c0549w, Context context, c2 c2Var, String str, InterfaceC1242Dl interfaceC1242Dl) {
        this.f1308b = context;
        this.f1309c = c2Var;
        this.f1310d = str;
        this.f1311e = interfaceC1242Dl;
        this.f1312f = c0549w;
    }

    @Override // D2.AbstractC0552x
    public final /* bridge */ /* synthetic */ Object a() {
        C0549w.q(this.f1308b, "app_open");
        return new B1();
    }

    @Override // D2.AbstractC0552x
    public final /* bridge */ /* synthetic */ Object b(InterfaceC0518l0 interfaceC0518l0) {
        return interfaceC0518l0.F2(BinderC5853b.p2(this.f1308b), this.f1309c, this.f1310d, this.f1311e, 244410000);
    }

    @Override // D2.AbstractC0552x
    public final /* bridge */ /* synthetic */ Object c() {
        return this.f1312f.f1352a.c(this.f1308b, this.f1309c, this.f1310d, this.f1311e, 4);
    }
}
