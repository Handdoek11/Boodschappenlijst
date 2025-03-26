package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.g4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC5331g4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.T0 f30970o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ F3 f30971s;

    RunnableC5331g4(F3 f32, com.google.android.gms.internal.measurement.T0 t02) {
        this.f30970o = t02;
        this.f30971s = f32;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r7 = this;
            com.google.android.gms.measurement.internal.F3 r0 = r7.f30971s
            com.google.android.gms.measurement.internal.p5 r0 = r0.s()
            com.google.android.gms.measurement.internal.z2 r1 = r0.f()
            com.google.android.gms.measurement.internal.A3 r1 = r1.K()
            boolean r1 = r1.z()
            r2 = 0
            if (r1 != 0) goto L24
            com.google.android.gms.measurement.internal.n2 r0 = r0.h()
            com.google.android.gms.measurement.internal.p2 r0 = r0.K()
            java.lang.String r1 = "Analytics storage consent denied; will not get session id"
            r0.a(r1)
        L22:
            r0 = r2
            goto L55
        L24:
            com.google.android.gms.measurement.internal.z2 r1 = r0.f()
            f3.e r3 = r0.zzb()
            long r3 = r3.a()
            boolean r1 = r1.x(r3)
            if (r1 != 0) goto L22
            com.google.android.gms.measurement.internal.z2 r1 = r0.f()
            com.google.android.gms.measurement.internal.A2 r1 = r1.f31300s
            long r3 = r1.a()
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L47
            goto L22
        L47:
            com.google.android.gms.measurement.internal.z2 r0 = r0.f()
            com.google.android.gms.measurement.internal.A2 r0 = r0.f31300s
            long r0 = r0.a()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L55:
            if (r0 == 0) goto L69
            com.google.android.gms.measurement.internal.F3 r1 = r7.f30971s
            com.google.android.gms.measurement.internal.S2 r1 = r1.f31239a
            com.google.android.gms.measurement.internal.d6 r1 = r1.J()
            com.google.android.gms.internal.measurement.T0 r2 = r7.f30970o
            long r3 = r0.longValue()
            r1.O(r2, r3)
            return
        L69:
            com.google.android.gms.internal.measurement.T0 r0 = r7.f30970o     // Catch: android.os.RemoteException -> L6f
            r0.R(r2)     // Catch: android.os.RemoteException -> L6f
            return
        L6f:
            r0 = move-exception
            com.google.android.gms.measurement.internal.F3 r1 = r7.f30971s
            com.google.android.gms.measurement.internal.S2 r1 = r1.f31239a
            com.google.android.gms.measurement.internal.n2 r1 = r1.h()
            com.google.android.gms.measurement.internal.p2 r1 = r1.E()
            java.lang.String r2 = "getSessionId failed with exception"
            r1.b(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.RunnableC5331g4.run():void");
    }
}
