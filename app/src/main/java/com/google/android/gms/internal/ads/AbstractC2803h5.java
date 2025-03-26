package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.h5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2803h5 {
    public static float a(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long b(String str) {
        int i8 = AbstractC2301cW.f21206a;
        String[] split = str.split("\\.", 2);
        long j8 = 0;
        for (String str2 : split[0].split(":", -1)) {
            j8 = (j8 * 60) + Long.parseLong(str2);
        }
        long j9 = j8 * 1000;
        if (split.length == 2) {
            j9 += Long.parseLong(split[1]);
        }
        return j9 * 1000;
    }
}
