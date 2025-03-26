package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.kW, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3170kW implements UC {

    /* renamed from: a, reason: collision with root package name */
    boolean f23613a = false;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C4801zT f23614b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C1811Tq f23615c;

    C3170kW(C3279lW c3279lW, C4801zT c4801zT, C1811Tq c1811Tq) {
        this.f23614b = c4801zT;
        this.f23615c = c1811Tq;
    }

    private final synchronized void a(D2.W0 w02) {
        int i8 = 1;
        if (true == ((Boolean) D2.A.c().a(AbstractC3184kf.f24023u5)).booleanValue()) {
            i8 = 3;
        }
        this.f23615c.d(new zzeda(i8, w02));
    }

    @Override // com.google.android.gms.internal.ads.UC
    public final synchronized void d() {
        this.f23615c.c(null);
    }

    @Override // com.google.android.gms.internal.ads.UC
    public final synchronized void h0(D2.W0 w02) {
        if (this.f23613a) {
            return;
        }
        this.f23613a = true;
        a(w02);
    }

    @Override // com.google.android.gms.internal.ads.UC
    public final synchronized void m(int i8) {
        if (this.f23613a) {
            return;
        }
        this.f23613a = true;
        a(new D2.W0(i8, C3279lW.e(this.f23614b.f28626a, i8), "undefined", null, null));
    }

    @Override // com.google.android.gms.internal.ads.UC
    public final synchronized void n(int i8, String str) {
        try {
            if (this.f23613a) {
                return;
            }
            this.f23613a = true;
            if (str == null) {
                str = C3279lW.e(this.f23614b.f28626a, i8);
            }
            a(new D2.W0(i8, str, "undefined", null, null));
        } catch (Throwable th) {
            throw th;
        }
    }
}
