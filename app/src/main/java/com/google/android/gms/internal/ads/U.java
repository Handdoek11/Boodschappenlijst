package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class U {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f19207a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f19208b = 0;

    /* JADX WARN: Removed duplicated region for block: B:44:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.S a(com.google.android.gms.internal.ads.C4144tQ r12) {
        /*
            r0 = 16
            int r1 = r12.d(r0)
            int r0 = r12.d(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r12.d(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r8 = r0
            r0 = 2
            int r1 = r12.d(r0)
            r2 = 0
            r4 = 3
            if (r1 != r4) goto L38
            r1 = r2
        L2c:
            int r5 = r12.d(r0)
            int r1 = r1 + r5
            boolean r5 = r12.p()
            if (r5 != 0) goto L3a
            int r1 = r1 + r4
        L38:
            r5 = r1
            goto L3e
        L3a:
            int r1 = r1 + 1
            int r1 = r1 << r0
            goto L2c
        L3e:
            r1 = 10
            int r1 = r12.d(r1)
            boolean r6 = r12.p()
            if (r6 == 0) goto L53
            int r6 = r12.d(r4)
            if (r6 <= 0) goto L53
            r12.n(r0)
        L53:
            boolean r6 = r12.p()
            r7 = 48000(0xbb80, float:6.7262E-41)
            r9 = 44100(0xac44, float:6.1797E-41)
            r10 = 1
            if (r10 == r6) goto L62
            r11 = r9
            goto L63
        L62:
            r11 = r7
        L63:
            int r12 = r12.d(r3)
            if (r11 != r9) goto L73
            r6 = 13
            if (r12 != r6) goto L73
            int[] r12 = com.google.android.gms.internal.ads.U.f19207a
            r12 = r12[r6]
            r9 = r12
            goto La0
        L73:
            if (r11 != r7) goto L94
            r6 = 14
            if (r12 >= r6) goto L94
            int[] r2 = com.google.android.gms.internal.ads.U.f19207a
            r2 = r2[r12]
            int r1 = r1 % 5
            r6 = 8
            if (r1 == r10) goto L9b
            r7 = 11
            if (r1 == r0) goto L96
            if (r1 == r4) goto L9b
            if (r1 == r3) goto L8c
            goto L94
        L8c:
            if (r12 == r4) goto L92
            if (r12 == r6) goto L92
            if (r12 != r7) goto L94
        L92:
            int r2 = r2 + 1
        L94:
            r9 = r2
            goto La0
        L96:
            if (r12 == r6) goto L92
            if (r12 != r7) goto L94
            goto L92
        L9b:
            if (r12 == r4) goto L92
            if (r12 != r6) goto L94
            goto L92
        La0:
            com.google.android.gms.internal.ads.S r12 = new com.google.android.gms.internal.ads.S
            r6 = 2
            r10 = 0
            r4 = r12
            r7 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.U.a(com.google.android.gms.internal.ads.tQ):com.google.android.gms.internal.ads.S");
    }

    public static void b(int i8, UQ uq) {
        uq.i(7);
        byte[] n8 = uq.n();
        n8[0] = -84;
        n8[1] = 64;
        n8[2] = -1;
        n8[3] = -1;
        n8[4] = (byte) ((i8 >> 16) & 255);
        n8[5] = (byte) ((i8 >> 8) & 255);
        n8[6] = (byte) (i8 & 255);
    }
}
