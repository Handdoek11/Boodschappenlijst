package com.google.android.gms.internal.ads;

import android.util.Pair;

/* renamed from: com.google.android.gms.internal.ads.u6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC4219u6 {
    public static Pair a(InterfaceC3989s0 interfaceC3989s0) {
        interfaceC3989s0.h();
        C4110t6 d8 = d(1684108385, interfaceC3989s0, new UQ(8));
        interfaceC3989s0.D(8);
        return Pair.create(Long.valueOf(interfaceC3989s0.c()), Long.valueOf(d8.f26830b));
    }

    public static C4001s6 b(InterfaceC3989s0 interfaceC3989s0) {
        byte[] bArr;
        UQ uq = new UQ(16);
        C4110t6 d8 = d(1718449184, interfaceC3989s0, uq);
        AbstractC3796qC.f(d8.f26830b >= 16);
        interfaceC3989s0.I(uq.n(), 0, 16);
        uq.l(0);
        int A7 = uq.A();
        int A8 = uq.A();
        int z7 = uq.z();
        int z8 = uq.z();
        int A9 = uq.A();
        int A10 = uq.A();
        int i8 = ((int) d8.f26830b) - 16;
        if (i8 > 0) {
            byte[] bArr2 = new byte[i8];
            interfaceC3989s0.I(bArr2, 0, i8);
            bArr = bArr2;
        } else {
            bArr = AbstractC2301cW.f21211f;
        }
        interfaceC3989s0.D((int) (interfaceC3989s0.b() - interfaceC3989s0.c()));
        return new C4001s6(A7, A8, z7, z8, A9, A10, bArr);
    }

    public static boolean c(InterfaceC3989s0 interfaceC3989s0) {
        UQ uq = new UQ(8);
        int i8 = C4110t6.a(interfaceC3989s0, uq).f26829a;
        if (i8 != 1380533830 && i8 != 1380333108) {
            return false;
        }
        interfaceC3989s0.I(uq.n(), 0, 4);
        uq.l(0);
        int w7 = uq.w();
        if (w7 == 1463899717) {
            return true;
        }
        HL.c("WavHeaderReader", "Unsupported form type: " + w7);
        return false;
    }

    private static C4110t6 d(int i8, InterfaceC3989s0 interfaceC3989s0, UQ uq) {
        C4110t6 a8 = C4110t6.a(interfaceC3989s0, uq);
        while (true) {
            int i9 = a8.f26829a;
            if (i9 == i8) {
                return a8;
            }
            HL.f("WavHeaderReader", "Ignoring unknown WAV chunk: " + i9);
            long j8 = a8.f26830b;
            long j9 = 8 + j8;
            if ((1 & j8) != 0) {
                j9 = j8 + 9;
            }
            if (j9 > 2147483647L) {
                throw zzbc.c("Chunk is too large (~2GB+) to skip; id: " + a8.f26829a);
            }
            interfaceC3989s0.D((int) j9);
            a8 = C4110t6.a(interfaceC3989s0, uq);
        }
    }
}
