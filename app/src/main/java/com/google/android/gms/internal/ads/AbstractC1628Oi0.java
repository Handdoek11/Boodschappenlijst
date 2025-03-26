package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Oi0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC1628Oi0 {
    static long a(double d8) {
        AbstractC1762Sf0.f(b(d8), "not a normal value");
        int exponent = Math.getExponent(d8);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d8) & 4503599627370495L;
        return exponent == -1023 ? doubleToRawLongBits + doubleToRawLongBits : doubleToRawLongBits | 4503599627370496L;
    }

    static boolean b(double d8) {
        return Math.getExponent(d8) <= 1023;
    }
}
