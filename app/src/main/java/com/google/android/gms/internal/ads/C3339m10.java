package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.m10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3339m10 implements InterfaceC3014j20 {

    /* renamed from: d, reason: collision with root package name */
    private static String f24413d;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f24414a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f24415b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f24416c;

    public C3339m10(InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0, Context context, Set set) {
        this.f24414a = interfaceExecutorServiceC3522nk0;
        this.f24415b = context;
        this.f24416c = set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (r0.contains("banner") == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ com.google.android.gms.internal.ads.C3557o10 a() {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.AbstractC3184kf.f23862c5
            com.google.android.gms.internal.ads.if r1 = D2.A.c()
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L80
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.AbstractC3184kf.f23961n5
            com.google.android.gms.internal.ads.if r1 = D2.A.c()
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L46
            java.util.Set r0 = r3.f24416c
            java.lang.String r1 = "rewarded"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L46
            java.lang.String r1 = "interstitial"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L46
            java.lang.String r1 = "native"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L46
            java.lang.String r1 = "banner"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L80
        L46:
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.AbstractC3184kf.f23970o5
            com.google.android.gms.internal.ads.if r1 = D2.A.c()
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L70
            java.lang.String r0 = com.google.android.gms.internal.ads.C3339m10.f24413d
            if (r0 != 0) goto L68
            android.content.Context r0 = r3.f24415b
            com.google.android.gms.internal.ads.mT r1 = C2.v.b()
            java.lang.String r0 = r1.a(r0)
            com.google.android.gms.internal.ads.C3339m10.f24413d = r0
        L68:
            com.google.android.gms.internal.ads.o10 r0 = new com.google.android.gms.internal.ads.o10
            java.lang.String r1 = com.google.android.gms.internal.ads.C3339m10.f24413d
            r0.<init>(r1)
            return r0
        L70:
            android.content.Context r0 = r3.f24415b
            com.google.android.gms.internal.ads.o10 r1 = new com.google.android.gms.internal.ads.o10
            com.google.android.gms.internal.ads.mT r2 = C2.v.b()
            java.lang.String r0 = r2.a(r0)
            r1.<init>(r0)
            return r1
        L80:
            com.google.android.gms.internal.ads.o10 r0 = new com.google.android.gms.internal.ads.o10
            r1 = 0
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3339m10.a():com.google.android.gms.internal.ads.o10");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 27;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        return this.f24414a.p0(new Callable() { // from class: com.google.android.gms.internal.ads.l10
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f24262o.a();
            }
        });
    }
}
