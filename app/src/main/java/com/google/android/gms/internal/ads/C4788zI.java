package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4788zI implements Yj0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f28575a = "Google";

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ CI f28576b;

    C4788zI(CI ci, String str, boolean z7) {
        this.f28576b = ci;
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final void a(Throwable th) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23952m5)).booleanValue()) {
            C2.v.s().w(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        this.f28576b.f14136k.t((InterfaceC4410vt) obj);
        CI ci = this.f28576b;
        C1811Tq c02 = ci.f14136k.c0();
        C3929rT T7 = ci.T(this.f28575a, true);
        if (T7 != null && c02 != null) {
            c02.c(T7);
        } else if (c02 != null) {
            c02.cancel(false);
        }
    }
}
