package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import java.util.List;

/* loaded from: classes.dex */
abstract class DF0 {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(android.media.MediaCodecInfo.VideoCapabilities r2, int r3, int r4, double r5) {
        /*
            java.util.List r2 = com.google.android.gms.internal.ads.AF0.a(r2)
            r0 = 0
            if (r2 == 0) goto L50
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto Le
            goto L50
        Le:
            int r5 = (int) r5
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r3 = com.google.android.gms.internal.ads.AbstractC4674yF0.a(r3, r4, r5)
            int r2 = c(r2, r3)
            r3 = 1
            if (r2 != r3) goto L4f
            java.lang.Boolean r4 = com.google.android.gms.internal.ads.EF0.b()
            if (r4 != 0) goto L4f
            int r4 = com.google.android.gms.internal.ads.AbstractC2301cW.f21206a
            r5 = 35
            if (r4 < r5) goto L28
        L26:
            r3 = r0
            goto L3d
        L28:
            int r4 = b(r0)
            int r5 = b(r3)
            if (r4 != 0) goto L33
            goto L3d
        L33:
            r6 = 2
            if (r5 != 0) goto L39
            if (r4 == r6) goto L26
            goto L3d
        L39:
            if (r4 != r6) goto L3d
            if (r5 == r6) goto L26
        L3d:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            com.google.android.gms.internal.ads.EF0.c(r3)
            java.lang.Boolean r3 = com.google.android.gms.internal.ads.EF0.b()
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L4f
            return r0
        L4f:
            return r2
        L50:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.DF0.a(android.media.MediaCodecInfo$VideoCapabilities, int, int, double):int");
    }

    private static int b(boolean z7) {
        List supportedPerformancePoints;
        try {
            C2723gJ0 c2723gJ0 = new C2723gJ0();
            c2723gJ0.B("video/avc");
            D H7 = c2723gJ0.H();
            if (H7.f14334o != null) {
                List e8 = AbstractC2065aG0.e(LF0.f16803a, H7, z7, false);
                for (int i8 = 0; i8 < e8.size(); i8++) {
                    if (((C4565xF0) e8.get(i8)).f27776d != null && ((C4565xF0) e8.get(i8)).f27776d.getVideoCapabilities() != null && (supportedPerformancePoints = ((C4565xF0) e8.get(i8)).f27776d.getVideoCapabilities().getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        AbstractC4783zF0.a();
                        return c(supportedPerformancePoints, AbstractC4674yF0.a(1280, 720, 60));
                    }
                }
            }
        } catch (zzsu unused) {
        }
        return 0;
    }

    private static int c(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            if (BF0.a(list.get(i8)).covers(performancePoint)) {
                return 2;
            }
        }
        return 1;
    }
}
