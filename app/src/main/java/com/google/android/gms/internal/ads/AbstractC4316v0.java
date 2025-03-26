package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* renamed from: com.google.android.gms.internal.ads.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4316v0 {
    public static int a(InterfaceC3989s0 interfaceC3989s0, byte[] bArr, int i8, int i9) {
        int i10 = 0;
        while (i10 < i9) {
            int F7 = interfaceC3989s0.F(bArr, i8 + i10, i9 - i10);
            if (F7 == -1) {
                break;
            }
            i10 += F7;
        }
        return i10;
    }

    public static void b(boolean z7, String str) {
        if (!z7) {
            throw zzbc.a(str, null);
        }
    }

    public static boolean c(InterfaceC3989s0 interfaceC3989s0, byte[] bArr, int i8, int i9, boolean z7) {
        try {
            return interfaceC3989s0.G(bArr, 0, i9, z7);
        } catch (EOFException e8) {
            if (z7) {
                return false;
            }
            throw e8;
        }
    }

    public static boolean d(InterfaceC3989s0 interfaceC3989s0, byte[] bArr, int i8, int i9) {
        try {
            interfaceC3989s0.H(bArr, i8, i9);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean e(InterfaceC3989s0 interfaceC3989s0, int i8) {
        try {
            interfaceC3989s0.D(i8);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
