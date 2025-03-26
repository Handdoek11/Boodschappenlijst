package com.google.protobuf;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f33101a;

    /* renamed from: b, reason: collision with root package name */
    public static final ByteBuffer f33102b;

    public interface a {
    }

    static {
        byte[] bArr = new byte[0];
        f33101a = bArr;
        f33102b = ByteBuffer.wrap(bArr);
    }

    public static boolean a(byte[] bArr) {
        return r.e(bArr);
    }

    public static String b(byte[] bArr) {
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e8) {
            throw new RuntimeException("UTF-8 not supported?", e8);
        }
    }
}
