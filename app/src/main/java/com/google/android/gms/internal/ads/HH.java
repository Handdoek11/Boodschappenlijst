package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;

/* loaded from: classes.dex */
public final class HH implements InterfaceC3033jC, VF {

    /* renamed from: o, reason: collision with root package name */
    private final C1810Tp f15676o;

    /* renamed from: s, reason: collision with root package name */
    private final Context f15677s;

    /* renamed from: t, reason: collision with root package name */
    private final C1950Xp f15678t;

    /* renamed from: u, reason: collision with root package name */
    private final View f15679u;

    /* renamed from: v, reason: collision with root package name */
    private String f15680v;

    /* renamed from: w, reason: collision with root package name */
    private final EnumC2746gd f15681w;

    public HH(C1810Tp c1810Tp, Context context, C1950Xp c1950Xp, View view, EnumC2746gd enumC2746gd) {
        this.f15676o = c1810Tp;
        this.f15677s = context;
        this.f15678t = c1950Xp;
        this.f15679u = view;
        this.f15681w = enumC2746gd;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3033jC
    public final void a() {
        View view = this.f15679u;
        if (view != null && this.f15680v != null) {
            this.f15678t.o(view.getContext(), this.f15680v);
        }
        this.f15676o.b(true);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3033jC
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3033jC
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.VF
    public final void i() {
    }

    @Override // com.google.android.gms.internal.ads.VF
    public final void j() {
        if (this.f15681w == EnumC2746gd.APP_OPEN) {
            return;
        }
        String c8 = this.f15678t.c(this.f15677s);
        this.f15680v = c8;
        this.f15680v = String.valueOf(c8).concat(this.f15681w == EnumC2746gd.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3033jC
    public final void o(InterfaceC1460Jo interfaceC1460Jo, String str, String str2) {
        if (this.f15678t.p(this.f15677s)) {
            try {
                C1950Xp c1950Xp = this.f15678t;
                Context context = this.f15677s;
                c1950Xp.l(context, c1950Xp.a(context), this.f15676o.a(), interfaceC1460Jo.a(), interfaceC1460Jo.zzb());
            } catch (RemoteException e8) {
                H2.p.h("Remote Exception to get reward item.", e8);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3033jC
    public final void zza() {
        this.f15676o.b(false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3033jC
    public final void zzb() {
    }
}
