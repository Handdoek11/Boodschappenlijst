package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.Bi0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1166Bi0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f13833a;

    /* renamed from: b, reason: collision with root package name */
    private final char[] f13834b;

    /* renamed from: c, reason: collision with root package name */
    final int f13835c;

    /* renamed from: d, reason: collision with root package name */
    final int f13836d;

    /* renamed from: e, reason: collision with root package name */
    final int f13837e;

    /* renamed from: f, reason: collision with root package name */
    final int f13838f;

    /* renamed from: g, reason: collision with root package name */
    private final byte[] f13839g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean[] f13840h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f13841i;

    /* JADX WARN: Illegal instructions before constructor call */
    C1166Bi0(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i8 = 0; i8 < cArr.length; i8++) {
            char c8 = cArr[i8];
            boolean z7 = true;
            AbstractC1762Sf0.g(c8 < 128, "Non-ASCII character: %s", c8);
            if (bArr[c8] != -1) {
                z7 = false;
            }
            AbstractC1762Sf0.g(z7, "Duplicate character: %s", c8);
            bArr[c8] = (byte) i8;
        }
        this(str, cArr, bArr, false);
    }

    final char a(int i8) {
        return this.f13834b[i8];
    }

    final int b(char c8) {
        if (c8 > 127) {
            throw new zzfzy("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c8))));
        }
        byte b8 = this.f13839g[c8];
        if (b8 != -1) {
            return b8;
        }
        if (c8 <= ' ' || c8 == 127) {
            throw new zzfzy("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c8))));
        }
        throw new zzfzy("Unrecognized character: " + c8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    final C1166Bi0 c() {
        boolean z7;
        int i8 = 0;
        while (true) {
            char[] cArr = this.f13834b;
            if (i8 >= cArr.length) {
                return this;
            }
            if (AbstractC4710yf0.e(cArr[i8])) {
                int i9 = 0;
                while (true) {
                    if (i9 >= cArr.length) {
                        z7 = false;
                        break;
                    }
                    if (AbstractC4710yf0.d(cArr[i9])) {
                        z7 = true;
                        break;
                    }
                    i9++;
                }
                AbstractC1762Sf0.m(!z7, "Cannot call lowerCase() on a mixed-case alphabet");
                char[] cArr2 = new char[this.f13834b.length];
                int i10 = 0;
                while (true) {
                    char[] cArr3 = this.f13834b;
                    if (i10 >= cArr3.length) {
                        break;
                    }
                    char c8 = cArr3[i10];
                    if (AbstractC4710yf0.e(c8)) {
                        c8 ^= 32;
                    }
                    cArr2[i10] = (char) c8;
                    i10++;
                }
                C1166Bi0 c1166Bi0 = new C1166Bi0(this.f13833a.concat(".lowerCase()"), cArr2);
                if (!this.f13841i || c1166Bi0.f13841i) {
                    return c1166Bi0;
                }
                byte[] bArr = c1166Bi0.f13839g;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                for (int i11 = 65; i11 <= 90; i11++) {
                    int i12 = i11 | 32;
                    byte[] bArr2 = c1166Bi0.f13839g;
                    byte b8 = bArr2[i11];
                    byte b9 = bArr2[i12];
                    if (b8 == -1) {
                        copyOf[i11] = b9;
                    } else {
                        char c9 = (char) i11;
                        char c10 = (char) i12;
                        if (b9 != -1) {
                            throw new IllegalStateException(AbstractC3187kg0.b("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c9), Character.valueOf(c10)));
                        }
                        copyOf[i12] = b8;
                    }
                }
                return new C1166Bi0(c1166Bi0.f13833a.concat(".ignoreCase()"), c1166Bi0.f13834b, copyOf, true);
            }
            i8++;
        }
    }

    final boolean d(int i8) {
        return this.f13840h[i8 % this.f13837e];
    }

    public final boolean e(char c8) {
        byte[] bArr = this.f13839g;
        return bArr.length > 61 && bArr[61] != -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1166Bi0) {
            C1166Bi0 c1166Bi0 = (C1166Bi0) obj;
            if (this.f13841i == c1166Bi0.f13841i && Arrays.equals(this.f13834b, c1166Bi0.f13834b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f13834b) + (true != this.f13841i ? 1237 : 1231);
    }

    public final String toString() {
        return this.f13833a;
    }

    private C1166Bi0(String str, char[] cArr, byte[] bArr, boolean z7) {
        this.f13833a = str;
        cArr.getClass();
        this.f13834b = cArr;
        try {
            int length = cArr.length;
            int c8 = AbstractC1698Qi0.c(length, RoundingMode.UNNECESSARY);
            this.f13836d = c8;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(c8);
            int i8 = 1 << (3 - numberOfTrailingZeros);
            this.f13837e = i8;
            this.f13838f = c8 >> numberOfTrailingZeros;
            this.f13835c = length - 1;
            this.f13839g = bArr;
            boolean[] zArr = new boolean[i8];
            for (int i9 = 0; i9 < this.f13838f; i9++) {
                zArr[AbstractC1698Qi0.b(i9 * 8, this.f13836d, RoundingMode.CEILING)] = true;
            }
            this.f13840h = zArr;
            this.f13841i = z7;
        } catch (ArithmeticException e8) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e8);
        }
    }
}
