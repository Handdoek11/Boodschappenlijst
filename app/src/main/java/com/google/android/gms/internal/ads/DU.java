package com.google.android.gms.internal.ads;

import android.content.Context;
import i3.BinderC5853b;
import w2.EnumC6877c;

/* loaded from: classes.dex */
final class DU implements CH {

    /* renamed from: a, reason: collision with root package name */
    private final C3785q60 f14500a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1171Bm f14501b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC6877c f14502c;

    /* renamed from: d, reason: collision with root package name */
    private CC f14503d = null;

    DU(C3785q60 c3785q60, InterfaceC1171Bm interfaceC1171Bm, EnumC6877c enumC6877c) {
        this.f14500a = c3785q60;
        this.f14501b = interfaceC1171Bm;
        this.f14502c = enumC6877c;
    }

    @Override // com.google.android.gms.internal.ads.CH
    public final void a(boolean z7, Context context, C4558xC c4558xC) {
        boolean g02;
        try {
            EnumC6877c enumC6877c = EnumC6877c.BANNER;
            int ordinal = this.f14502c.ordinal();
            if (ordinal == 1) {
                g02 = this.f14501b.g0(BinderC5853b.p2(context));
            } else {
                if (ordinal != 2) {
                    if (ordinal == 5) {
                        g02 = this.f14501b.X(BinderC5853b.p2(context));
                    }
                    throw new zzdgb("Adapter failed to show.");
                }
                g02 = this.f14501b.u3(BinderC5853b.p2(context));
            }
            if (g02) {
                CC cc = this.f14503d;
                if (cc == null) {
                    return;
                }
                if (((Boolean) D2.A.c().a(AbstractC3184kf.f23664E1)).booleanValue() || this.f14500a.f25776Y != 2) {
                    return;
                }
                cc.zza();
                return;
            }
            throw new zzdgb("Adapter failed to show.");
        } catch (Throwable th) {
            throw new zzdgb(th);
        }
    }

    public final void b(CC cc) {
        this.f14503d = cc;
    }
}
