package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
abstract class F3 {
    static /* bridge */ /* synthetic */ void a(byte b8, byte b9, byte b10, byte b11, char[] cArr, int i8) {
        if (e(b9) || (((b8 << 28) + (b9 + 112)) >> 30) != 0 || e(b10) || e(b11)) {
            throw new zzhr("Protocol message had invalid UTF-8.");
        }
        int i9 = ((b8 & 7) << 18) | ((b9 & 63) << 12) | ((b10 & 63) << 6) | (b11 & 63);
        cArr[i8] = (char) ((i9 >>> 10) + 55232);
        cArr[i8 + 1] = (char) ((i9 & 1023) + 56320);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0016 A[PHI: r2
  0x0016: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* bridge */ /* synthetic */ void b(byte r2, byte r3, byte r4, char[] r5, int r6) {
        /*
            boolean r0 = e(r3)
            if (r0 != 0) goto L2c
            r0 = -96
            r1 = -32
            if (r2 != r1) goto Lf
            if (r3 < r0) goto L2c
            r2 = r1
        Lf:
            r1 = -19
            if (r2 != r1) goto L16
            if (r3 >= r0) goto L2c
            r2 = r1
        L16:
            boolean r0 = e(r4)
            if (r0 != 0) goto L2c
            r2 = r2 & 15
            r3 = r3 & 63
            r4 = r4 & 63
            int r2 = r2 << 12
            int r3 = r3 << 6
            r2 = r2 | r3
            r2 = r2 | r4
            char r2 = (char) r2
            r5[r6] = r2
            return
        L2c:
            com.google.android.gms.internal.play_billing.zzhr r2 = new com.google.android.gms.internal.play_billing.zzhr
            java.lang.String r3 = "Protocol message had invalid UTF-8."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.F3.b(byte, byte, byte, char[], int):void");
    }

    static /* bridge */ /* synthetic */ void c(byte b8, byte b9, char[] cArr, int i8) {
        if (b8 < -62 || e(b9)) {
            throw new zzhr("Protocol message had invalid UTF-8.");
        }
        cArr[i8] = (char) (((b8 & 31) << 6) | (b9 & 63));
    }

    static /* bridge */ /* synthetic */ boolean d(byte b8) {
        return b8 >= 0;
    }

    private static boolean e(byte b8) {
        return b8 > -65;
    }
}
