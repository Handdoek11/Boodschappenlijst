package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* loaded from: classes.dex */
public final class I0 {

    /* renamed from: a, reason: collision with root package name */
    private final UQ f15839a = new UQ(10);

    public final C3503nb a(InterfaceC3989s0 interfaceC3989s0, C3231l2 c3231l2) {
        C3503nb c3503nb = null;
        int i8 = 0;
        while (true) {
            try {
                interfaceC3989s0.I(this.f15839a.n(), 0, 10);
                this.f15839a.l(0);
                if (this.f15839a.E() != 4801587) {
                    break;
                }
                this.f15839a.m(3);
                int B7 = this.f15839a.B();
                int i9 = B7 + 10;
                if (c3503nb == null) {
                    byte[] bArr = new byte[i9];
                    System.arraycopy(this.f15839a.n(), 0, bArr, 0, 10);
                    interfaceC3989s0.I(bArr, 10, B7);
                    c3503nb = AbstractC3449n2.a(bArr, i9, c3231l2, new O1());
                } else {
                    interfaceC3989s0.z(B7);
                }
                i8 += i9;
            } catch (EOFException unused) {
            }
        }
        interfaceC3989s0.h();
        interfaceC3989s0.z(i8);
        return c3503nb;
    }
}
