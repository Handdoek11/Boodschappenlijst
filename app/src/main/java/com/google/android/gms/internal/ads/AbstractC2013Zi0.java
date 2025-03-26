package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.Zi0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC2013Zi0 {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f20531a;

    static {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i8 = 0; i8 < 10; i8++) {
            bArr[i8 + 48] = (byte) i8;
        }
        for (int i9 = 0; i9 < 26; i9++) {
            byte b8 = (byte) (i9 + 10);
            bArr[i9 + 65] = b8;
            bArr[i9 + 97] = b8;
        }
        f20531a = bArr;
    }

    static int a(char c8) {
        if (c8 < 128) {
            return f20531a[c8];
        }
        return -1;
    }
}
