package com.google.android.gms.internal.wearable;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.wearable.s0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5269s0 {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f30212a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f30213b;

    static {
        Charset.forName("US-ASCII");
        f30212a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f30213b = bArr;
        ByteBuffer.wrap(bArr);
        int i8 = U.f30098a;
        try {
            new S(bArr, 0, 0, false, null).c(0);
        } catch (zzcx e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public static int a(boolean z7) {
        return z7 ? 1231 : 1237;
    }

    static int b(int i8, byte[] bArr, int i9, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            i8 = (i8 * 31) + bArr[i11];
        }
        return i8;
    }

    static Object c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("messageType");
    }
}
