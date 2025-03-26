package D2;

import android.content.Context;
import com.google.android.gms.internal.ads.InterfaceC1242Dl;
import i3.BinderC5853b;

/* renamed from: D2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0526o extends AbstractC0552x {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f1318b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c2 f1319c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f1320d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC1242Dl f1321e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C0549w f1322f;

    C0526o(C0549w c0549w, Context context, c2 c2Var, String str, InterfaceC1242Dl interfaceC1242Dl) {
        this.f1318b = context;
        this.f1319c = c2Var;
        this.f1320d = str;
        this.f1321e = interfaceC1242Dl;
        this.f1322f = c0549w;
    }

    @Override // D2.AbstractC0552x
    public final /* bridge */ /* synthetic */ Object a() {
        C0549w.q(this.f1318b, "interstitial");
        return new B1();
    }

    @Override // D2.AbstractC0552x
    public final /* bridge */ /* synthetic */ Object b(InterfaceC0518l0 interfaceC0518l0) {
        return interfaceC0518l0.A4(BinderC5853b.p2(this.f1318b), this.f1319c, this.f1320d, this.f1321e, 244410000);
    }

    @Override // D2.AbstractC0552x
    public final /* bridge */ /* synthetic */ Object c() {
        return this.f1322f.f1352a.c(this.f1318b, this.f1319c, this.f1320d, this.f1321e, 2);
    }
}
