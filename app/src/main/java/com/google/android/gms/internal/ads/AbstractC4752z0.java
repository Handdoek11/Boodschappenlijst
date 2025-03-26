package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4752z0 {
    public static C3503nb a(InterfaceC3989s0 interfaceC3989s0, boolean z7) {
        C3503nb a8 = new I0().a(interfaceC3989s0, z7 ? null : AbstractC3449n2.f24860a);
        if (a8 == null || a8.a() == 0) {
            return null;
        }
        return a8;
    }

    public static B0 b(UQ uq) {
        uq.m(1);
        int E7 = uq.E();
        long t7 = uq.t();
        long j8 = E7;
        int i8 = E7 / 18;
        long[] jArr = new long[i8];
        long[] jArr2 = new long[i8];
        int i9 = 0;
        while (true) {
            if (i9 >= i8) {
                break;
            }
            long J7 = uq.J();
            if (J7 == -1) {
                jArr = Arrays.copyOf(jArr, i9);
                jArr2 = Arrays.copyOf(jArr2, i9);
                break;
            }
            jArr[i9] = J7;
            jArr2[i9] = uq.J();
            uq.m(2);
            i9++;
        }
        uq.m((int) ((t7 + j8) - uq.t()));
        return new B0(jArr, jArr2);
    }
}
