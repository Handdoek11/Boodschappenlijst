package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4679yI implements InterfaceC4701yb {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ String f28064o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ CI f28065s;

    C4679yI(CI ci, String str) {
        this.f28064o = str;
        this.f28065s = ci;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4701yb
    public final void A0(C4592xb c4592xb) {
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.f23768R1)).booleanValue()) {
            if (c4592xb.f27883j) {
                CI ci = this.f28065s;
                if (ci.f14146u != null) {
                    ci.f14133E.put(this.f28064o, Boolean.TRUE);
                    CI ci2 = this.f28065s;
                    if (ci2.f14146u == null) {
                        return;
                    }
                    ci2.j(ci2.f14146u.c(), this.f28065s.f14146u.j(), this.f28065s.f14146u.k(), true);
                    return;
                }
                return;
            }
            return;
        }
        synchronized (this) {
            try {
                if (c4592xb.f27883j) {
                    CI ci3 = this.f28065s;
                    if (ci3.f14146u != null) {
                        ci3.f14133E.put(this.f28064o, Boolean.TRUE);
                        CI ci4 = this.f28065s;
                        if (ci4.f14146u == null) {
                        } else {
                            ci4.j(ci4.f14146u.c(), this.f28065s.f14146u.j(), this.f28065s.f14146u.k(), true);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
