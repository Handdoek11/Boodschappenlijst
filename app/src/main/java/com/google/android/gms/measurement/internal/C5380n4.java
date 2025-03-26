package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.n4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5380n4 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ F3 f31114o;

    C5380n4(F3 f32) {
        this.f31114o = f32;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ void a(com.google.android.gms.measurement.internal.C5380n4 r17, boolean r18, android.net.Uri r19, java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5380n4.a(com.google.android.gms.measurement.internal.n4, boolean, android.net.Uri, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onActivityCreated(android.app.Activity r9, android.os.Bundle r10) {
        /*
            r8 = this;
            com.google.android.gms.measurement.internal.F3 r0 = r8.f31114o     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> L30
            com.google.android.gms.measurement.internal.n2 r0 = r0.h()     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> L30
            com.google.android.gms.measurement.internal.p2 r0 = r0.I()     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> L30
            java.lang.String r1 = "onActivityCreated"
            r0.a(r1)     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> L30
            android.content.Intent r0 = r9.getIntent()     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> L30
            if (r0 != 0) goto L1f
            com.google.android.gms.measurement.internal.F3 r0 = r8.f31114o
            com.google.android.gms.measurement.internal.w4 r0 = r0.q()
            r0.D(r9, r10)
            return
        L1f:
            android.net.Uri r1 = r0.getData()     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> L30
            if (r1 == 0) goto L33
            boolean r2 = r1.isHierarchical()     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> L30
            if (r2 == 0) goto L33
        L2b:
            r5 = r1
            goto L4c
        L2d:
            r0 = move-exception
            goto Lb1
        L30:
            r0 = move-exception
            goto L98
        L33:
            android.os.Bundle r1 = r0.getExtras()     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> L30
            if (r1 == 0) goto L4a
            java.lang.String r2 = "com.android.vending.referral_url"
            java.lang.String r1 = r1.getString(r2)     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> L30
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> L30
            if (r2 != 0) goto L4a
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> L30
            goto L2b
        L4a:
            r1 = 0
            goto L2b
        L4c:
            if (r5 == 0) goto L8e
            boolean r1 = r5.isHierarchical()     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> L30
            if (r1 != 0) goto L55
            goto L8e
        L55:
            com.google.android.gms.measurement.internal.F3 r1 = r8.f31114o     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> L30
            r1.g()     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> L30
            boolean r0 = com.google.android.gms.measurement.internal.d6.d0(r0)     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> L30
            if (r0 == 0) goto L64
            java.lang.String r0 = "gs"
        L62:
            r6 = r0
            goto L67
        L64:
            java.lang.String r0 = "auto"
            goto L62
        L67:
            java.lang.String r0 = "referrer"
            java.lang.String r7 = r5.getQueryParameter(r0)     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> L30
            if (r10 != 0) goto L72
            r0 = 1
        L70:
            r4 = r0
            goto L74
        L72:
            r0 = 0
            goto L70
        L74:
            com.google.android.gms.measurement.internal.F3 r0 = r8.f31114o     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> L30
            com.google.android.gms.measurement.internal.P2 r0 = r0.j()     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> L30
            com.google.android.gms.measurement.internal.q4 r1 = new com.google.android.gms.measurement.internal.q4     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> L30
            r2 = r1
            r3 = r8
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> L30
            r0.B(r1)     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> L30
            com.google.android.gms.measurement.internal.F3 r0 = r8.f31114o
            com.google.android.gms.measurement.internal.w4 r0 = r0.q()
            r0.D(r9, r10)
            return
        L8e:
            com.google.android.gms.measurement.internal.F3 r0 = r8.f31114o
            com.google.android.gms.measurement.internal.w4 r0 = r0.q()
            r0.D(r9, r10)
            return
        L98:
            com.google.android.gms.measurement.internal.F3 r1 = r8.f31114o     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.measurement.internal.n2 r1 = r1.h()     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.measurement.internal.p2 r1 = r1.E()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = "Throwable caught in onActivityCreated"
            r1.b(r2, r0)     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.measurement.internal.F3 r0 = r8.f31114o
            com.google.android.gms.measurement.internal.w4 r0 = r0.q()
            r0.D(r9, r10)
            return
        Lb1:
            com.google.android.gms.measurement.internal.F3 r1 = r8.f31114o
            com.google.android.gms.measurement.internal.w4 r1 = r1.q()
            r1.D(r9, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5380n4.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f31114o.q().C(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f31114o.q().O(activity);
        C5395p5 s8 = this.f31114o.s();
        s8.j().B(new RunnableC5402q5(s8, s8.zzb().b()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C5395p5 s8 = this.f31114o.s();
        s8.j().B(new RunnableC5408r5(s8, s8.zzb().b()));
        this.f31114o.q().Q(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f31114o.q().P(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
