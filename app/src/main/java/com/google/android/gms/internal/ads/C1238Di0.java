package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Di0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1238Di0 extends C1274Ei0 {
    private C1238Di0(C1166Bi0 c1166Bi0, Character ch) {
        super(c1166Bi0, ch);
        AbstractC1762Sf0.e(c1166Bi0.f13834b.length == 64);
    }

    @Override // com.google.android.gms.internal.ads.C1274Ei0, com.google.android.gms.internal.ads.AbstractC1382Hi0
    final int a(byte[] bArr, CharSequence charSequence) {
        CharSequence f8 = f(charSequence);
        if (!this.f14760b.d(f8.length())) {
            throw new zzfzy("Invalid input length " + f8.length());
        }
        int i8 = 0;
        int i9 = 0;
        while (i8 < f8.length()) {
            int i10 = i9 + 1;
            int b8 = (this.f14760b.b(f8.charAt(i8)) << 18) | (this.f14760b.b(f8.charAt(i8 + 1)) << 12);
            bArr[i9] = (byte) (b8 >>> 16);
            int i11 = i8 + 2;
            if (i11 < f8.length()) {
                int i12 = i8 + 3;
                int b9 = b8 | (this.f14760b.b(f8.charAt(i11)) << 6);
                int i13 = i9 + 2;
                bArr[i10] = (byte) ((b9 >>> 8) & 255);
                if (i12 < f8.length()) {
                    i8 += 4;
                    i9 += 3;
                    bArr[i13] = (byte) ((b9 | this.f14760b.b(f8.charAt(i12))) & 255);
                } else {
                    i9 = i13;
                    i8 = i12;
                }
            } else {
                i8 = i11;
                i9 = i10;
            }
        }
        return i9;
    }

    @Override // com.google.android.gms.internal.ads.C1274Ei0, com.google.android.gms.internal.ads.AbstractC1382Hi0
    final void b(Appendable appendable, byte[] bArr, int i8, int i9) {
        int i10 = 0;
        AbstractC1762Sf0.k(0, i9, bArr.length);
        for (int i11 = i9; i11 >= 3; i11 -= 3) {
            int i12 = bArr[i10] & 255;
            int i13 = ((bArr[i10 + 1] & 255) << 8) | (i12 << 16) | (bArr[i10 + 2] & 255);
            appendable.append(this.f14760b.a(i13 >>> 18));
            appendable.append(this.f14760b.a((i13 >>> 12) & 63));
            appendable.append(this.f14760b.a((i13 >>> 6) & 63));
            appendable.append(this.f14760b.a(i13 & 63));
            i10 += 3;
        }
        if (i10 < i9) {
            k(appendable, bArr, i10, i9 - i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.C1274Ei0
    final AbstractC1382Hi0 j(C1166Bi0 c1166Bi0, Character ch) {
        return new C1238Di0(c1166Bi0, ch);
    }

    C1238Di0(String str, String str2, Character ch) {
        this(new C1166Bi0(str, str2.toCharArray()), ch);
    }
}
