package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ui0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1838Ui0 {
    public static char a(long j8) {
        char c8 = (char) j8;
        AbstractC1762Sf0.h(((long) c8) == j8, "Out of range: %s", j8);
        return c8;
    }

    public static char b(byte b8, byte b9) {
        return (char) ((b8 << 8) | (b9 & 255));
    }
}
