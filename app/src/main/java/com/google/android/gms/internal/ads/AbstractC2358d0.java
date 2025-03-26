package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2358d0 {
    public static void a(long j8, UQ uq, Y0[] y0Arr) {
        int i8;
        while (true) {
            if (uq.r() <= 1) {
                return;
            }
            int c8 = c(uq);
            int c9 = c(uq);
            int t7 = uq.t() + c9;
            if (c9 == -1 || c9 > uq.r()) {
                HL.f("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                t7 = uq.u();
            } else if (c8 == 4 && c9 >= 8) {
                int C7 = uq.C();
                int G7 = uq.G();
                if (G7 == 49) {
                    i8 = uq.w();
                    G7 = 49;
                } else {
                    i8 = 0;
                }
                int C8 = uq.C();
                if (G7 == 47) {
                    uq.m(1);
                    G7 = 47;
                }
                boolean z7 = C7 == 181 && (G7 == 49 || G7 == 47) && C8 == 3;
                if (G7 == 49) {
                    z7 &= i8 == 1195456820;
                }
                if (z7) {
                    b(j8, uq, y0Arr);
                }
            }
            uq.l(t7);
        }
    }

    public static void b(long j8, UQ uq, Y0[] y0Arr) {
        int C7 = uq.C();
        if ((C7 & 64) != 0) {
            int i8 = C7 & 31;
            uq.m(1);
            int t7 = uq.t();
            for (Y0 y02 : y0Arr) {
                int i9 = i8 * 3;
                uq.l(t7);
                y02.a(uq, i9);
                AbstractC3796qC.f(j8 != -9223372036854775807L);
                y02.b(j8, 1, i9, 0, null);
            }
        }
    }

    private static int c(UQ uq) {
        int i8 = 0;
        while (uq.r() != 0) {
            int C7 = uq.C();
            i8 += C7;
            if (C7 != 255) {
                return i8;
            }
        }
        return -1;
    }
}
