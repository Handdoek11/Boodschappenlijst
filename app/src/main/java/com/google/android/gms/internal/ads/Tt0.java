package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class Tt0 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f19195a;

    private Tt0(byte[] bArr, int i8, int i9) {
        byte[] bArr2 = new byte[i9];
        this.f19195a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i9);
    }

    public static Tt0 b(byte[] bArr) {
        if (bArr != null) {
            return new Tt0(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final int a() {
        return this.f19195a.length;
    }

    public final byte[] c() {
        byte[] bArr = this.f19195a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Tt0) {
            return Arrays.equals(((Tt0) obj).f19195a, this.f19195a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f19195a);
    }

    public final String toString() {
        byte[] bArr = this.f19195a;
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b8 : bArr) {
            sb.append("0123456789abcdef".charAt((b8 & 255) >> 4));
            sb.append("0123456789abcdef".charAt(b8 & 15));
        }
        return "Bytes(" + sb.toString() + ")";
    }
}
