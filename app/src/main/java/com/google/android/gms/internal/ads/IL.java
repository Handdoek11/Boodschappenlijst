package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class IL extends AbstractC1506Kz {

    /* renamed from: j, reason: collision with root package name */
    private final Context f15926j;

    /* renamed from: k, reason: collision with root package name */
    private final WeakReference f15927k;

    /* renamed from: l, reason: collision with root package name */
    private final CH f15928l;

    /* renamed from: m, reason: collision with root package name */
    private final UF f15929m;

    /* renamed from: n, reason: collision with root package name */
    private final C4558xC f15930n;

    /* renamed from: o, reason: collision with root package name */
    private final C2601fD f15931o;

    /* renamed from: p, reason: collision with root package name */
    private final C2704gA f15932p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC2118ap f15933q;

    /* renamed from: r, reason: collision with root package name */
    private final C1190Cc0 f15934r;

    /* renamed from: s, reason: collision with root package name */
    private final E60 f15935s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f15936t;

    IL(C1471Jz c1471Jz, Context context, InterfaceC4410vt interfaceC4410vt, CH ch, UF uf, C4558xC c4558xC, C2601fD c2601fD, C2704gA c2704gA, C3785q60 c3785q60, C1190Cc0 c1190Cc0, E60 e60) {
        super(c1471Jz);
        this.f15936t = false;
        this.f15926j = context;
        this.f15928l = ch;
        this.f15927k = new WeakReference(interfaceC4410vt);
        this.f15929m = uf;
        this.f15930n = c4558xC;
        this.f15931o = c2601fD;
        this.f15932p = c2704gA;
        this.f15934r = c1190Cc0;
        C1914Wo c1914Wo = c3785q60.f25800l;
        this.f15933q = new BinderC4293up(c1914Wo != null ? c1914Wo.f19842o : "", c1914Wo != null ? c1914Wo.f19843s : 1);
        this.f15935s = e60;
    }

    public final void finalize() {
        try {
            final InterfaceC4410vt interfaceC4410vt = (InterfaceC4410vt) this.f15927k.get();
            if (((Boolean) D2.A.c().a(AbstractC3184kf.f23637A6)).booleanValue()) {
                if (!this.f15936t && interfaceC4410vt != null) {
                    AbstractC1497Kq.f16649f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.GL
                        @Override // java.lang.Runnable
                        public final void run() {
                            interfaceC4410vt.destroy();
                        }
                    });
                }
            } else if (interfaceC4410vt != null) {
                interfaceC4410vt.destroy();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public final Bundle i() {
        return this.f15931o.m1();
    }

    public final InterfaceC2118ap j() {
        return this.f15933q;
    }

    public final E60 k() {
        return this.f15935s;
    }

    public final boolean l() {
        return this.f15932p.a();
    }

    public final boolean m() {
        return this.f15936t;
    }

    public final boolean n() {
        InterfaceC4410vt interfaceC4410vt = (InterfaceC4410vt) this.f15927k.get();
        return (interfaceC4410vt == null || interfaceC4410vt.g1()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    public final boolean o(boolean z7, Activity activity) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23727M0)).booleanValue()) {
            C2.v.t();
            if (G2.D0.h(this.f15926j)) {
                H2.p.g("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.f15930n.zzb();
                if (((Boolean) D2.A.c().a(AbstractC3184kf.f23735N0)).booleanValue()) {
                    this.f15934r.a(this.f16709a.f14101b.f13520b.f26832b);
                }
                return false;
            }
        }
        if (this.f15936t) {
            H2.p.g("The rewarded ad have been showed.");
            this.f15930n.o(AbstractC3351m70.d(10, null, null));
            return false;
        }
        this.f15936t = true;
        this.f15929m.zzb();
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.f15926j;
        }
        try {
            this.f15928l.a(z7, activity2, this.f15930n);
            this.f15929m.zza();
            return true;
        } catch (zzdgb e8) {
            this.f15930n.T(e8);
            return false;
        }
    }
}
