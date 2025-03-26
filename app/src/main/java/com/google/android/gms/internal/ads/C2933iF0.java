package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.iF0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2933iF0 implements InterfaceC4129tF0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f22933a;

    public C2933iF0(Context context) {
        this.f22933a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    @Override // com.google.android.gms.internal.ads.InterfaceC4129tF0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.InterfaceC4347vF0 a(com.google.android.gms.internal.ads.C4020sF0 r7) {
        /*
            r6 = this;
            int r0 = com.google.android.gms.internal.ads.AbstractC2301cW.f21206a
            r1 = 23
            if (r0 < r1) goto L45
            r1 = 31
            if (r0 < r1) goto Lb
            goto L20
        Lb:
            android.content.Context r1 = r6.f22933a
            if (r1 == 0) goto L45
            r2 = 28
            if (r0 < r2) goto L45
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r2 = "com.amazon.hardware.tv_screen"
            boolean r1 = r1.hasSystemFeature(r2)
            if (r1 != 0) goto L20
            goto L45
        L20:
            com.google.android.gms.internal.ads.D r0 = r7.f26613c
            java.lang.String r0 = r0.f14334o
            int r0 = com.google.android.gms.internal.ads.AbstractC1650Pc.b(r0)
            java.lang.String r1 = com.google.android.gms.internal.ads.AbstractC2301cW.d(r0)
            java.lang.String r2 = "DMCodecAdapterFactory"
            java.lang.String r3 = "Creating an asynchronous MediaCodec adapter for track type "
            java.lang.String r1 = r3.concat(r1)
            com.google.android.gms.internal.ads.HL.e(r2, r1)
            com.google.android.gms.internal.ads.WE0 r1 = new com.google.android.gms.internal.ads.WE0
            r1.<init>(r0)
            r0 = 1
            r1.e(r0)
            com.google.android.gms.internal.ads.ZE0 r7 = r1.d(r7)
            return r7
        L45:
            r1 = 0
            com.google.android.gms.internal.ads.xF0 r2 = r7.f26611a     // Catch: java.lang.RuntimeException -> L92 java.io.IOException -> L94
            java.lang.String r2 = r2.f27773a     // Catch: java.lang.RuntimeException -> L92 java.io.IOException -> L94
            java.lang.String r3 = "createCodec:"
            java.lang.String r3 = r3.concat(r2)     // Catch: java.lang.RuntimeException -> L92 java.io.IOException -> L94
            android.os.Trace.beginSection(r3)     // Catch: java.lang.RuntimeException -> L92 java.io.IOException -> L94
            android.media.MediaCodec r2 = android.media.MediaCodec.createByCodecName(r2)     // Catch: java.lang.RuntimeException -> L92 java.io.IOException -> L94
            android.os.Trace.endSection()     // Catch: java.lang.RuntimeException -> L92 java.io.IOException -> L94
            java.lang.String r3 = "configureCodec"
            android.os.Trace.beginSection(r3)     // Catch: java.lang.RuntimeException -> L71 java.io.IOException -> L73
            android.view.Surface r3 = r7.f26614d     // Catch: java.lang.RuntimeException -> L71 java.io.IOException -> L73
            r4 = 0
            if (r3 != 0) goto L75
            com.google.android.gms.internal.ads.xF0 r5 = r7.f26611a     // Catch: java.lang.RuntimeException -> L71 java.io.IOException -> L73
            boolean r5 = r5.f27780h     // Catch: java.lang.RuntimeException -> L71 java.io.IOException -> L73
            if (r5 == 0) goto L75
            r5 = 35
            if (r0 < r5) goto L75
            r4 = 8
            goto L75
        L71:
            r7 = move-exception
            goto L90
        L73:
            r7 = move-exception
            goto L90
        L75:
            android.media.MediaFormat r0 = r7.f26612b     // Catch: java.lang.RuntimeException -> L71 java.io.IOException -> L73
            r2.configure(r0, r3, r1, r4)     // Catch: java.lang.RuntimeException -> L71 java.io.IOException -> L73
            android.os.Trace.endSection()     // Catch: java.lang.RuntimeException -> L71 java.io.IOException -> L73
            java.lang.String r0 = "startCodec"
            android.os.Trace.beginSection(r0)     // Catch: java.lang.RuntimeException -> L71 java.io.IOException -> L73
            r2.start()     // Catch: java.lang.RuntimeException -> L71 java.io.IOException -> L73
            android.os.Trace.endSection()     // Catch: java.lang.RuntimeException -> L71 java.io.IOException -> L73
            com.google.android.gms.internal.ads.cG0 r0 = new com.google.android.gms.internal.ads.cG0     // Catch: java.lang.RuntimeException -> L71 java.io.IOException -> L73
            com.google.android.gms.internal.ads.qF0 r7 = r7.f26616f     // Catch: java.lang.RuntimeException -> L71 java.io.IOException -> L73
            r0.<init>(r2, r7, r1)     // Catch: java.lang.RuntimeException -> L71 java.io.IOException -> L73
            return r0
        L90:
            r1 = r2
            goto L95
        L92:
            r7 = move-exception
            goto L95
        L94:
            r7 = move-exception
        L95:
            if (r1 == 0) goto L9a
            r1.release()
        L9a:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2933iF0.a(com.google.android.gms.internal.ads.sF0):com.google.android.gms.internal.ads.vF0");
    }
}
