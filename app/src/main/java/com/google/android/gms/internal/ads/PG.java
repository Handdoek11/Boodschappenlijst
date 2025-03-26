package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class PG extends AbstractC1506Kz {

    /* renamed from: j, reason: collision with root package name */
    private final Context f18161j;

    /* renamed from: k, reason: collision with root package name */
    private final WeakReference f18162k;

    /* renamed from: l, reason: collision with root package name */
    private final UF f18163l;

    /* renamed from: m, reason: collision with root package name */
    private final CH f18164m;

    /* renamed from: n, reason: collision with root package name */
    private final C2704gA f18165n;

    /* renamed from: o, reason: collision with root package name */
    private final C1190Cc0 f18166o;

    /* renamed from: p, reason: collision with root package name */
    private final C4558xC f18167p;

    /* renamed from: q, reason: collision with root package name */
    private final C1283Eq f18168q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f18169r;

    PG(C1471Jz c1471Jz, Context context, InterfaceC4410vt interfaceC4410vt, UF uf, CH ch, C2704gA c2704gA, C1190Cc0 c1190Cc0, C4558xC c4558xC, C1283Eq c1283Eq) {
        super(c1471Jz);
        this.f18169r = false;
        this.f18161j = context;
        this.f18162k = new WeakReference(interfaceC4410vt);
        this.f18163l = uf;
        this.f18164m = ch;
        this.f18165n = c2704gA;
        this.f18166o = c1190Cc0;
        this.f18167p = c4558xC;
        this.f18168q = c1283Eq;
    }

    public final void finalize() {
        try {
            final InterfaceC4410vt interfaceC4410vt = (InterfaceC4410vt) this.f18162k.get();
            if (((Boolean) D2.A.c().a(AbstractC3184kf.f23637A6)).booleanValue()) {
                if (!this.f18169r && interfaceC4410vt != null) {
                    AbstractC1497Kq.f16649f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.OG
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

    public final boolean i() {
        return this.f18165n.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004e  */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j(boolean r5, android.app.Activity r6) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.UF r0 = r4.f18163l
            r0.zzb()
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.AbstractC3184kf.f23727M0
            com.google.android.gms.internal.ads.if r1 = D2.A.c()
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L4e
            C2.v.t()
            android.content.Context r0 = r4.f18161j
            boolean r0 = G2.D0.h(r0)
            if (r0 == 0) goto L4e
            java.lang.String r5 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"
            H2.p.g(r5)
            com.google.android.gms.internal.ads.xC r5 = r4.f18167p
            r5.zzb()
            com.google.android.gms.internal.ads.bf r5 = com.google.android.gms.internal.ads.AbstractC3184kf.f23735N0
            com.google.android.gms.internal.ads.if r6 = D2.A.c()
            java.lang.Object r5 = r6.a(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto Lc4
            com.google.android.gms.internal.ads.Cc0 r5 = r4.f18166o
            com.google.android.gms.internal.ads.C60 r6 = r4.f16709a
            com.google.android.gms.internal.ads.A60 r6 = r6.f14101b
            com.google.android.gms.internal.ads.t60 r6 = r6.f13520b
            java.lang.String r6 = r6.f26832b
            r5.a(r6)
            goto Lc4
        L4e:
            java.lang.ref.WeakReference r0 = r4.f18162k
            java.lang.Object r0 = r0.get()
            com.google.android.gms.internal.ads.vt r0 = (com.google.android.gms.internal.ads.InterfaceC4410vt) r0
            com.google.android.gms.internal.ads.bf r2 = com.google.android.gms.internal.ads.AbstractC3184kf.Mb
            com.google.android.gms.internal.ads.if r3 = D2.A.c()
            java.lang.Object r2 = r3.a(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r3 = 0
            if (r2 == 0) goto L92
            if (r0 == 0) goto L92
            com.google.android.gms.internal.ads.q60 r0 = r0.P()
            if (r0 == 0) goto L92
            boolean r2 = r0.f25813r0
            if (r2 == 0) goto L92
            int r0 = r0.f25815s0
            com.google.android.gms.internal.ads.Eq r2 = r4.f18168q
            int r2 = r2.a()
            if (r0 == r2) goto L92
            java.lang.String r5 = "The interstitial consent form has been shown."
            H2.p.g(r5)
            com.google.android.gms.internal.ads.xC r5 = r4.f18167p
            r6 = 12
            java.lang.String r0 = "The consent form has already been shown."
            D2.W0 r6 = com.google.android.gms.internal.ads.AbstractC3351m70.d(r6, r0, r3)
            r5.o(r6)
            goto Lc4
        L92:
            boolean r0 = r4.f18169r
            if (r0 == 0) goto La6
            java.lang.String r0 = "The interstitial ad has been shown."
            H2.p.g(r0)
            com.google.android.gms.internal.ads.xC r0 = r4.f18167p
            r2 = 10
            D2.W0 r2 = com.google.android.gms.internal.ads.AbstractC3351m70.d(r2, r3, r3)
            r0.o(r2)
        La6:
            boolean r0 = r4.f18169r
            if (r0 != 0) goto Lc4
            if (r6 != 0) goto Lae
            android.content.Context r6 = r4.f18161j
        Lae:
            com.google.android.gms.internal.ads.CH r0 = r4.f18164m     // Catch: com.google.android.gms.internal.ads.zzdgb -> Lbe
            com.google.android.gms.internal.ads.xC r2 = r4.f18167p     // Catch: com.google.android.gms.internal.ads.zzdgb -> Lbe
            r0.a(r5, r6, r2)     // Catch: com.google.android.gms.internal.ads.zzdgb -> Lbe
            com.google.android.gms.internal.ads.UF r5 = r4.f18163l     // Catch: com.google.android.gms.internal.ads.zzdgb -> Lbe
            r5.zza()     // Catch: com.google.android.gms.internal.ads.zzdgb -> Lbe
            r5 = 1
            r4.f18169r = r5
            return r5
        Lbe:
            r5 = move-exception
            com.google.android.gms.internal.ads.xC r6 = r4.f18167p
            r6.T(r5)
        Lc4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.PG.j(boolean, android.app.Activity):boolean");
    }
}
