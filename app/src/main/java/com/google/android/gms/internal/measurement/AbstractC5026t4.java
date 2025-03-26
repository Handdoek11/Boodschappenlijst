package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.measurement.t4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5026t4 {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f29579a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f29580b;

    static {
        Charset.forName("US-ASCII");
        f29579a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f29580b = bArr;
        ByteBuffer.wrap(bArr);
        W3.c(bArr, 0, bArr.length, false);
    }

    static int a(int i8, byte[] bArr, int i9, int i10) {
        for (int i11 = i9; i11 < i9 + i10; i11++) {
            i8 = (i8 * 31) + bArr[i11];
        }
        return i8;
    }

    public static int b(long j8) {
        return (int) (j8 ^ (j8 >>> 32));
    }

    public static int c(boolean z7) {
        return z7 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        int length = bArr.length;
        int a8 = a(length, bArr, 0, length);
        if (a8 == 0) {
            return 1;
        }
        return a8;
    }

    static Object e(Object obj) {
        obj.getClass();
        return obj;
    }

    static Object f(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    static boolean g(W4 w42) {
        return false;
    }
}
