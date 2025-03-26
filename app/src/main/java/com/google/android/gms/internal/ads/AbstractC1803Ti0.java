package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ti0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC1803Ti0 {
    static long a(String str, long j8) {
        if (j8 >= 0) {
            return j8;
        }
        throw new IllegalArgumentException(str + " (" + j8 + ") must be >= 0");
    }

    static void b(boolean z7) {
        if (!z7) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
