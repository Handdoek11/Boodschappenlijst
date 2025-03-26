package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ci0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1202Ci0 extends C1274Ei0 {

    /* renamed from: e, reason: collision with root package name */
    final char[] f14214e;

    private C1202Ci0(C1166Bi0 c1166Bi0) {
        super(c1166Bi0, null);
        this.f14214e = new char[512];
        AbstractC1762Sf0.e(c1166Bi0.f13834b.length == 16);
        for (int i8 = 0; i8 < 256; i8++) {
            this.f14214e[i8] = c1166Bi0.a(i8 >>> 4);
            this.f14214e[i8 | 256] = c1166Bi0.a(i8 & 15);
        }
    }

    @Override // com.google.android.gms.internal.ads.C1274Ei0, com.google.android.gms.internal.ads.AbstractC1382Hi0
    final int a(byte[] bArr, CharSequence charSequence) {
        if (charSequence.length() % 2 == 1) {
            throw new zzfzy("Invalid input length " + charSequence.length());
        }
        int i8 = 0;
        int i9 = 0;
        while (i8 < charSequence.length()) {
            bArr[i9] = (byte) ((this.f14760b.b(charSequence.charAt(i8)) << 4) | this.f14760b.b(charSequence.charAt(i8 + 1)));
            i8 += 2;
            i9++;
        }
        return i9;
    }

    @Override // com.google.android.gms.internal.ads.C1274Ei0, com.google.android.gms.internal.ads.AbstractC1382Hi0
    final void b(Appendable appendable, byte[] bArr, int i8, int i9) {
        AbstractC1762Sf0.k(0, i9, bArr.length);
        for (int i10 = 0; i10 < i9; i10++) {
            int i11 = bArr[i10] & 255;
            appendable.append(this.f14214e[i11]);
            appendable.append(this.f14214e[i11 | 256]);
        }
    }

    @Override // com.google.android.gms.internal.ads.C1274Ei0
    final AbstractC1382Hi0 j(C1166Bi0 c1166Bi0, Character ch) {
        return new C1202Ci0(c1166Bi0);
    }

    C1202Ci0(String str, String str2) {
        this(new C1166Bi0("base16()", "0123456789ABCDEF".toCharArray()));
    }
}
