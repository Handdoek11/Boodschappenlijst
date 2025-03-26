package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class Zq0 implements InterfaceC2654fl0 {
    private Zq0(InterfaceC2654fl0 interfaceC2654fl0, Ts0 ts0, byte[] bArr) {
    }

    public static InterfaceC2654fl0 a(Mo0 mo0) {
        byte[] c8;
        Kp0 a8 = mo0.a(Rk0.a());
        C3320ls0 b02 = C3647os0.b0();
        b02.D(a8.g());
        b02.E(a8.e());
        b02.C(a8.b());
        InterfaceC2654fl0 interfaceC2654fl0 = (InterfaceC2654fl0) AbstractC3088jl0.b((C3647os0) b02.x(), InterfaceC2654fl0.class);
        Ts0 c9 = a8.c();
        int ordinal = c9.ordinal();
        if (ordinal == 1) {
            c8 = AbstractC3532np0.b(mo0.b().intValue()).c();
        } else if (ordinal == 2) {
            c8 = AbstractC3532np0.a(mo0.b().intValue()).c();
        } else if (ordinal != 3) {
            if (ordinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            c8 = AbstractC3532np0.a(mo0.b().intValue()).c();
        } else {
            c8 = AbstractC3532np0.f25038a.c();
        }
        return new Zq0(interfaceC2654fl0, c9, c8);
    }
}
