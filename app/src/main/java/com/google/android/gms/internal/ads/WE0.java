package com.google.android.gms.internal.ads;

import android.os.HandlerThread;

/* loaded from: classes.dex */
public final class WE0 implements InterfaceC4129tF0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3296lg0 f19761a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3296lg0 f19762b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f19763c;

    public WE0(int i8) {
        UE0 ue0 = new UE0(i8);
        VE0 ve0 = new VE0(i8);
        this.f19761a = ue0;
        this.f19762b = ve0;
        this.f19763c = true;
    }

    static /* synthetic */ HandlerThread b(int i8) {
        return new HandlerThread(ZE0.q(i8, "ExoPlayer:MediaCodecAsyncAdapter:"));
    }

    static /* synthetic */ HandlerThread c(int i8) {
        return new HandlerThread(ZE0.q(i8, "ExoPlayer:MediaCodecQueueingThread:"));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4129tF0
    public final /* bridge */ /* synthetic */ InterfaceC4347vF0 a(C4020sF0 c4020sF0) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042 A[Catch: Exception -> 0x0037, TryCatch #1 {Exception -> 0x0037, blocks: (B:4:0x001d, B:6:0x0023, B:10:0x002e, B:15:0x0039, B:18:0x0053, B:17:0x0042), top: B:40:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.ZE0 d(com.google.android.gms.internal.ads.C4020sF0 r12) {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.xF0 r0 = r12.f26611a
            java.lang.String r0 = r0.f27773a
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L85
            r2.<init>()     // Catch: java.lang.Exception -> L85
            java.lang.String r3 = "createCodec:"
            r2.append(r3)     // Catch: java.lang.Exception -> L85
            r2.append(r0)     // Catch: java.lang.Exception -> L85
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L85
            android.os.Trace.beginSection(r2)     // Catch: java.lang.Exception -> L85
            android.media.MediaCodec r0 = android.media.MediaCodec.createByCodecName(r0)     // Catch: java.lang.Exception -> L85
            boolean r2 = r11.f19763c     // Catch: java.lang.Exception -> L37
            r9 = 35
            if (r2 == 0) goto L42
            com.google.android.gms.internal.ads.D r2 = r12.f26613c     // Catch: java.lang.Exception -> L37
            int r3 = com.google.android.gms.internal.ads.AbstractC2301cW.f21206a     // Catch: java.lang.Exception -> L37
            r4 = 34
            if (r3 >= r4) goto L2c
            goto L42
        L2c:
            if (r3 >= r9) goto L39
            java.lang.String r2 = r2.f14334o     // Catch: java.lang.Exception -> L37
            boolean r2 = com.google.android.gms.internal.ads.AbstractC1650Pc.i(r2)     // Catch: java.lang.Exception -> L37
            if (r2 == 0) goto L42
            goto L39
        L37:
            r12 = move-exception
            goto L87
        L39:
            com.google.android.gms.internal.ads.dG0 r2 = new com.google.android.gms.internal.ads.dG0     // Catch: java.lang.Exception -> L37
            r2.<init>(r0)     // Catch: java.lang.Exception -> L37
            r3 = 4
        L3f:
            r6 = r2
            r2 = r3
            goto L53
        L42:
            com.google.android.gms.internal.ads.eF0 r2 = new com.google.android.gms.internal.ads.eF0     // Catch: java.lang.Exception -> L37
            com.google.android.gms.internal.ads.lg0 r3 = r11.f19762b     // Catch: java.lang.Exception -> L37
            com.google.android.gms.internal.ads.VE0 r3 = (com.google.android.gms.internal.ads.VE0) r3     // Catch: java.lang.Exception -> L37
            int r3 = r3.f19569o     // Catch: java.lang.Exception -> L37
            android.os.HandlerThread r3 = c(r3)     // Catch: java.lang.Exception -> L37
            r2.<init>(r0, r3)     // Catch: java.lang.Exception -> L37
            r3 = 0
            goto L3f
        L53:
            com.google.android.gms.internal.ads.ZE0 r10 = new com.google.android.gms.internal.ads.ZE0     // Catch: java.lang.Exception -> L37
            com.google.android.gms.internal.ads.lg0 r3 = r11.f19761a     // Catch: java.lang.Exception -> L37
            com.google.android.gms.internal.ads.UE0 r3 = (com.google.android.gms.internal.ads.UE0) r3     // Catch: java.lang.Exception -> L37
            int r3 = r3.f19323o     // Catch: java.lang.Exception -> L37
            android.os.HandlerThread r5 = b(r3)     // Catch: java.lang.Exception -> L37
            com.google.android.gms.internal.ads.qF0 r7 = r12.f26616f     // Catch: java.lang.Exception -> L37
            r8 = 0
            r3 = r10
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L37
            android.os.Trace.endSection()     // Catch: java.lang.Exception -> L7b
            android.view.Surface r3 = r12.f26614d     // Catch: java.lang.Exception -> L7b
            if (r3 != 0) goto L7d
            com.google.android.gms.internal.ads.xF0 r4 = r12.f26611a     // Catch: java.lang.Exception -> L7b
            boolean r4 = r4.f27780h     // Catch: java.lang.Exception -> L7b
            if (r4 == 0) goto L7d
            int r4 = com.google.android.gms.internal.ads.AbstractC2301cW.f21206a     // Catch: java.lang.Exception -> L7b
            if (r4 < r9) goto L7d
            r2 = r2 | 8
            goto L7d
        L7b:
            r12 = move-exception
            goto L83
        L7d:
            android.media.MediaFormat r12 = r12.f26612b     // Catch: java.lang.Exception -> L7b
            com.google.android.gms.internal.ads.ZE0.p(r10, r12, r3, r1, r2)     // Catch: java.lang.Exception -> L7b
            return r10
        L83:
            r1 = r10
            goto L87
        L85:
            r12 = move-exception
            r0 = r1
        L87:
            if (r1 != 0) goto L8f
            if (r0 == 0) goto L92
            r0.release()
            goto L92
        L8f:
            r1.k()
        L92:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.WE0.d(com.google.android.gms.internal.ads.sF0):com.google.android.gms.internal.ads.ZE0");
    }

    public final void e(boolean z7) {
        this.f19763c = true;
    }
}
