package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class Kt0 {
    public static byte[] a(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = i8 + i8;
            int digit = Character.digit(str.charAt(i9), 16);
            int digit2 = Character.digit(str.charAt(i9 + 1), 16);
            if (digit == -1 || digit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i8] = (byte) ((digit * 16) + digit2);
        }
        return bArr;
    }
}
