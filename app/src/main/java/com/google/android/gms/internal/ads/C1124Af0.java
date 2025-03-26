package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Af0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1124Af0 extends AbstractC4819zf0 {

    /* renamed from: o, reason: collision with root package name */
    private final char f13615o;

    C1124Af0(char c8) {
        this.f13615o = c8;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1232Df0
    public final boolean b(char c8) {
        return c8 == this.f13615o;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i8 = this.f13615o;
        for (int i9 = 0; i9 < 4; i9++) {
            cArr[5 - i9] = "0123456789ABCDEF".charAt(i8 & 15);
            i8 >>= 4;
        }
        return "CharMatcher.is('" + String.copyValueOf(cArr) + "')";
    }
}
