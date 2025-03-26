package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.DisplayMetrics;

/* renamed from: com.google.android.gms.internal.ads.ra, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3936ra {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f26194a = "0123456789abcdef".toCharArray();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f26195b = 0;

    public static long a(double d8, int i8, DisplayMetrics displayMetrics) {
        return Math.round(d8 / displayMetrics.density);
    }

    public static String b(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        for (int i8 = 0; i8 < bArr.length; i8++) {
            byte b8 = bArr[i8];
            char[] cArr2 = f26194a;
            int i9 = i8 + i8;
            cArr[i9] = cArr2[(b8 & 255) >>> 4];
            cArr[i9 + 1] = cArr2[b8 & 15];
        }
        return new String(cArr);
    }

    public static boolean c() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean d(String str) {
        return str == null || str.isEmpty();
    }

    public static boolean e(DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == 0.0f) ? false : true;
    }

    public static byte[] f(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("String must be of even-length");
        }
        byte[] bArr = new byte[length / 2];
        for (int i8 = 0; i8 < length; i8 += 2) {
            bArr[i8 / 2] = (byte) ((Character.digit(str.charAt(i8), 16) << 4) + Character.digit(str.charAt(i8 + 1), 16));
        }
        return bArr;
    }
}
