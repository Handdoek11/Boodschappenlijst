package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;

/* renamed from: com.google.android.gms.internal.ads.Kt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1500Kt {
    public static final InterfaceC4410vt a(final Context context, final C3976ru c3976ru, final String str, final boolean z7, final boolean z8, final N9 n9, final C1726Rf c1726Rf, final H2.a aVar, C4818zf c4818zf, final C2.n nVar, final C2.a aVar2, final C2000Zc c2000Zc, final C3785q60 c3785q60, final C4111t60 c4111t60, final US us, final P60 p60) {
        AbstractC3184kf.a(context);
        try {
            final C4818zf c4818zf2 = null;
            InterfaceC3296lg0 interfaceC3296lg0 = new InterfaceC3296lg0(context, c3976ru, str, z7, z8, n9, c1726Rf, aVar, c4818zf2, nVar, aVar2, c2000Zc, c3785q60, c4111t60, p60, us) { // from class: com.google.android.gms.internal.ads.Ht

                /* renamed from: A, reason: collision with root package name */
                public final /* synthetic */ C2.a f15794A;

                /* renamed from: B, reason: collision with root package name */
                public final /* synthetic */ C2000Zc f15795B;

                /* renamed from: C, reason: collision with root package name */
                public final /* synthetic */ C3785q60 f15796C;

                /* renamed from: D, reason: collision with root package name */
                public final /* synthetic */ C4111t60 f15797D;

                /* renamed from: E, reason: collision with root package name */
                public final /* synthetic */ P60 f15798E;

                /* renamed from: F, reason: collision with root package name */
                public final /* synthetic */ US f15799F;

                /* renamed from: o, reason: collision with root package name */
                public final /* synthetic */ Context f15800o;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ C3976ru f15801s;

                /* renamed from: t, reason: collision with root package name */
                public final /* synthetic */ String f15802t;

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ boolean f15803u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ boolean f15804v;

                /* renamed from: w, reason: collision with root package name */
                public final /* synthetic */ N9 f15805w;

                /* renamed from: x, reason: collision with root package name */
                public final /* synthetic */ C1726Rf f15806x;

                /* renamed from: y, reason: collision with root package name */
                public final /* synthetic */ H2.a f15807y;

                /* renamed from: z, reason: collision with root package name */
                public final /* synthetic */ C2.n f15808z;

                {
                    this.f15808z = nVar;
                    this.f15794A = aVar2;
                    this.f15795B = c2000Zc;
                    this.f15796C = c3785q60;
                    this.f15797D = c4111t60;
                    this.f15798E = p60;
                    this.f15799F = us;
                }

                @Override // com.google.android.gms.internal.ads.InterfaceC3296lg0
                public final Object zza() {
                    C3976ru c3976ru2 = this.f15801s;
                    String str2 = this.f15802t;
                    boolean z9 = this.f15803u;
                    C2000Zc c2000Zc2 = this.f15795B;
                    boolean z10 = this.f15804v;
                    N9 n92 = this.f15805w;
                    C3785q60 c3785q602 = this.f15796C;
                    C1726Rf c1726Rf2 = this.f15806x;
                    C2.n nVar2 = this.f15808z;
                    C4111t60 c4111t602 = this.f15797D;
                    Context context2 = this.f15800o;
                    H2.a aVar3 = this.f15807y;
                    C2.a aVar4 = this.f15794A;
                    P60 p602 = this.f15798E;
                    US us2 = this.f15799F;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i8 = ViewTreeObserverOnGlobalLayoutListenerC1919Wt.f19855s0;
                        C1674Pt c1674Pt = new C1674Pt(new ViewTreeObserverOnGlobalLayoutListenerC1919Wt(new C3868qu(context2), c3976ru2, str2, z9, z10, n92, c1726Rf2, aVar3, null, nVar2, aVar4, c2000Zc2, c3785q602, c4111t602, p602));
                        c1674Pt.setWebViewClient(C2.v.u().c(c1674Pt, c2000Zc2, z10, us2));
                        c1674Pt.setWebChromeClient(new C4301ut(c1674Pt));
                        return c1674Pt;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                Object zza = interfaceC3296lg0.zza();
                StrictMode.setThreadPolicy(threadPolicy);
                return (InterfaceC4410vt) zza;
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th;
            }
        } catch (Throwable th2) {
            throw new zzcfj("Webview initialization failed.", th2);
        }
    }
}
