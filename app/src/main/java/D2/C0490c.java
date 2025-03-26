package D2;

import android.content.Context;
import com.google.android.gms.internal.ads.C3858qp;
import com.google.android.gms.internal.ads.InterfaceC1242Dl;
import i3.BinderC5853b;

/* renamed from: D2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0490c extends AbstractC0552x {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f1211b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f1212c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC1242Dl f1213d;

    C0490c(C0549w c0549w, Context context, String str, InterfaceC1242Dl interfaceC1242Dl) {
        this.f1211b = context;
        this.f1212c = str;
        this.f1213d = interfaceC1242Dl;
    }

    @Override // D2.AbstractC0552x
    protected final /* bridge */ /* synthetic */ Object a() {
        C0549w.q(this.f1211b, "rewarded");
        return new G1();
    }

    @Override // D2.AbstractC0552x
    public final /* bridge */ /* synthetic */ Object b(InterfaceC0518l0 interfaceC0518l0) {
        return interfaceC0518l0.O6(BinderC5853b.p2(this.f1211b), this.f1212c, this.f1213d, 244410000);
    }

    @Override // D2.AbstractC0552x
    public final /* bridge */ /* synthetic */ Object c() {
        return C3858qp.a(this.f1211b, this.f1212c, this.f1213d);
    }
}
