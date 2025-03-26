package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.Hi0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1382Hi0 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC1382Hi0 f15780a;

    static {
        new C1238Di0("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
        new C1238Di0("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
        new C1274Ei0("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new C1274Ei0("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        f15780a = new C1202Ci0("base16()", "0123456789ABCDEF");
    }

    AbstractC1382Hi0() {
    }

    public static AbstractC1382Hi0 g() {
        return f15780a;
    }

    abstract int a(byte[] bArr, CharSequence charSequence);

    abstract void b(Appendable appendable, byte[] bArr, int i8, int i9);

    abstract int c(int i8);

    abstract int d(int i8);

    public abstract AbstractC1382Hi0 e();

    abstract CharSequence f(CharSequence charSequence);

    public final String h(byte[] bArr, int i8, int i9) {
        AbstractC1762Sf0.k(0, i9, bArr.length);
        StringBuilder sb = new StringBuilder(d(i9));
        try {
            b(sb, bArr, 0, i9);
            return sb.toString();
        } catch (IOException e8) {
            throw new AssertionError(e8);
        }
    }

    public final byte[] i(CharSequence charSequence) {
        try {
            CharSequence f8 = f(charSequence);
            int c8 = c(f8.length());
            byte[] bArr = new byte[c8];
            int a8 = a(bArr, f8);
            if (a8 == c8) {
                return bArr;
            }
            byte[] bArr2 = new byte[a8];
            System.arraycopy(bArr, 0, bArr2, 0, a8);
            return bArr2;
        } catch (zzfzy e8) {
            throw new IllegalArgumentException(e8);
        }
    }
}
