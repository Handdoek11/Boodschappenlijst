package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.math.RoundingMode;

/* renamed from: com.google.android.gms.internal.ads.Ei0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1274Ei0 extends AbstractC1382Hi0 {

    /* renamed from: b, reason: collision with root package name */
    final C1166Bi0 f14760b;

    /* renamed from: c, reason: collision with root package name */
    final Character f14761c;

    /* renamed from: d, reason: collision with root package name */
    private volatile AbstractC1382Hi0 f14762d;

    C1274Ei0(C1166Bi0 c1166Bi0, Character ch) {
        this.f14760b = c1166Bi0;
        boolean z7 = true;
        if (ch != null && c1166Bi0.e('=')) {
            z7 = false;
        }
        AbstractC1762Sf0.i(z7, "Padding character %s was already in alphabet", ch);
        this.f14761c = ch;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1382Hi0
    int a(byte[] bArr, CharSequence charSequence) {
        C1166Bi0 c1166Bi0;
        CharSequence f8 = f(charSequence);
        if (!this.f14760b.d(f8.length())) {
            throw new zzfzy("Invalid input length " + f8.length());
        }
        int i8 = 0;
        int i9 = 0;
        while (i8 < f8.length()) {
            long j8 = 0;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                c1166Bi0 = this.f14760b;
                if (i10 >= c1166Bi0.f13837e) {
                    break;
                }
                j8 <<= c1166Bi0.f13836d;
                if (i8 + i10 < f8.length()) {
                    j8 |= this.f14760b.b(f8.charAt(i11 + i8));
                    i11++;
                }
                i10++;
            }
            int i12 = c1166Bi0.f13838f;
            int i13 = i11 * c1166Bi0.f13836d;
            int i14 = (i12 - 1) * 8;
            while (i14 >= (i12 * 8) - i13) {
                bArr[i9] = (byte) ((j8 >>> i14) & 255);
                i14 -= 8;
                i9++;
            }
            i8 += this.f14760b.f13837e;
        }
        return i9;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1382Hi0
    void b(Appendable appendable, byte[] bArr, int i8, int i9) {
        int i10 = 0;
        AbstractC1762Sf0.k(0, i9, bArr.length);
        while (i10 < i9) {
            k(appendable, bArr, i10, Math.min(this.f14760b.f13838f, i9 - i10));
            i10 += this.f14760b.f13838f;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1382Hi0
    final int c(int i8) {
        return (int) (((this.f14760b.f13836d * i8) + 7) / 8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1382Hi0
    final int d(int i8) {
        C1166Bi0 c1166Bi0 = this.f14760b;
        return c1166Bi0.f13837e * AbstractC1698Qi0.b(i8, c1166Bi0.f13838f, RoundingMode.CEILING);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1382Hi0
    public final AbstractC1382Hi0 e() {
        AbstractC1382Hi0 abstractC1382Hi0 = this.f14762d;
        if (abstractC1382Hi0 == null) {
            C1166Bi0 c1166Bi0 = this.f14760b;
            C1166Bi0 c8 = c1166Bi0.c();
            abstractC1382Hi0 = c8 == c1166Bi0 ? this : j(c8, this.f14761c);
            this.f14762d = abstractC1382Hi0;
        }
        return abstractC1382Hi0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1274Ei0) {
            C1274Ei0 c1274Ei0 = (C1274Ei0) obj;
            if (this.f14760b.equals(c1274Ei0.f14760b) && Objects.equals(this.f14761c, c1274Ei0.f14761c)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1382Hi0
    final CharSequence f(CharSequence charSequence) {
        charSequence.getClass();
        if (this.f14761c == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final int hashCode() {
        Character ch = this.f14761c;
        return Objects.hashCode(ch) ^ this.f14760b.hashCode();
    }

    AbstractC1382Hi0 j(C1166Bi0 c1166Bi0, Character ch) {
        return new C1274Ei0(c1166Bi0, ch);
    }

    final void k(Appendable appendable, byte[] bArr, int i8, int i9) {
        AbstractC1762Sf0.k(i8, i8 + i9, bArr.length);
        int i10 = 0;
        AbstractC1762Sf0.e(i9 <= this.f14760b.f13838f);
        long j8 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            j8 = (j8 | (bArr[i8 + i11] & 255)) << 8;
        }
        int i12 = (i9 + 1) * 8;
        C1166Bi0 c1166Bi0 = this.f14760b;
        while (i10 < i9 * 8) {
            long j9 = j8 >>> ((i12 - c1166Bi0.f13836d) - i10);
            C1166Bi0 c1166Bi02 = this.f14760b;
            appendable.append(c1166Bi02.a(((int) j9) & c1166Bi02.f13835c));
            i10 += this.f14760b.f13836d;
        }
        if (this.f14761c != null) {
            while (i10 < this.f14760b.f13838f * 8) {
                this.f14761c.charValue();
                appendable.append('=');
                i10 += this.f14760b.f13836d;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.f14760b);
        if (8 % this.f14760b.f13836d != 0) {
            if (this.f14761c == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.f14761c);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    C1274Ei0(String str, String str2, Character ch) {
        this(new C1166Bi0(str, str2.toCharArray()), ch);
    }
}
