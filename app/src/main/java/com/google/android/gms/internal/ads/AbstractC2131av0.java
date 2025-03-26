package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.ads.av0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2131av0 {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f20782a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f20783b;

    /* renamed from: c, reason: collision with root package name */
    public static final ByteBuffer f20784c;

    static {
        Charset.forName("US-ASCII");
        f20782a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f20783b = bArr;
        f20784c = ByteBuffer.wrap(bArr);
        AbstractC4086su0.f(bArr, 0, 0, false);
    }

    public static int a(boolean z7) {
        return z7 ? 1231 : 1237;
    }

    static int b(int i8, byte[] bArr, int i9, int i10) {
        for (int i11 = i9; i11 < i9 + i10; i11++) {
            i8 = (i8 * 31) + bArr[i11];
        }
        return i8;
    }

    static Object c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }
}
