package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class Pz0 {

    /* renamed from: h, reason: collision with root package name */
    public static final Pz0 f18321h;

    /* renamed from: a, reason: collision with root package name */
    public final int f18322a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18323b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18324c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f18325d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18326e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18327f;

    /* renamed from: g, reason: collision with root package name */
    private int f18328g;

    static {
        Py0 py0 = new Py0();
        py0.c(1);
        py0.b(2);
        py0.d(3);
        f18321h = py0.g();
        Py0 py02 = new Py0();
        py02.c(1);
        py02.b(1);
        py02.d(2);
        py02.g();
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    /* synthetic */ Pz0(int i8, int i9, int i10, byte[] bArr, int i11, int i12, AbstractC3770pz0 abstractC3770pz0) {
        this.f18322a = i8;
        this.f18323b = i9;
        this.f18324c = i10;
        this.f18325d = bArr;
        this.f18326e = i11;
        this.f18327f = i12;
    }

    public static int a(int i8) {
        if (i8 == 1) {
            return 1;
        }
        if (i8 != 9) {
            return (i8 == 4 || i8 == 5 || i8 == 6 || i8 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int b(int i8) {
        if (i8 == 1) {
            return 3;
        }
        if (i8 == 4) {
            return 10;
        }
        if (i8 == 13) {
            return 2;
        }
        if (i8 == 16) {
            return 6;
        }
        if (i8 != 18) {
            return (i8 == 6 || i8 == 7) ? 3 : -1;
        }
        return 7;
    }

    public static boolean g(Pz0 pz0) {
        int i8;
        int i9;
        int i10;
        int i11;
        if (pz0 == null) {
            return true;
        }
        int i12 = pz0.f18322a;
        return (i12 == -1 || i12 == 1 || i12 == 2) && ((i8 = pz0.f18323b) == -1 || i8 == 2) && (((i9 = pz0.f18324c) == -1 || i9 == 3) && pz0.f18325d == null && (((i10 = pz0.f18327f) == -1 || i10 == 8) && ((i11 = pz0.f18326e) == -1 || i11 == 8)));
    }

    private static String h(int i8) {
        if (i8 == -1) {
            return "Unset color range";
        }
        if (i8 == 1) {
            return "Full range";
        }
        if (i8 == 2) {
            return "Limited range";
        }
        return "Undefined color range " + i8;
    }

    private static String i(int i8) {
        if (i8 == -1) {
            return "Unset color space";
        }
        if (i8 == 6) {
            return "BT2020";
        }
        if (i8 == 1) {
            return "BT709";
        }
        if (i8 == 2) {
            return "BT601";
        }
        return "Undefined color space " + i8;
    }

    private static String j(int i8) {
        if (i8 == -1) {
            return "Unset color transfer";
        }
        if (i8 == 10) {
            return "Gamma 2.2";
        }
        if (i8 == 1) {
            return "Linear";
        }
        if (i8 == 2) {
            return "sRGB";
        }
        if (i8 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i8 == 6) {
            return "ST2084 PQ";
        }
        if (i8 == 7) {
            return "HLG";
        }
        return "Undefined color transfer " + i8;
    }

    public final Py0 c() {
        return new Py0(this, null);
    }

    public final String d() {
        String str;
        String format = f() ? String.format(Locale.US, "%s/%s/%s", i(this.f18322a), h(this.f18323b), j(this.f18324c)) : "NA/NA/NA";
        if (e()) {
            str = this.f18326e + "/" + this.f18327f;
        } else {
            str = "NA/NA";
        }
        return format + "/" + str;
    }

    public final boolean e() {
        return (this.f18326e == -1 || this.f18327f == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Pz0.class == obj.getClass()) {
            Pz0 pz0 = (Pz0) obj;
            if (this.f18322a == pz0.f18322a && this.f18323b == pz0.f18323b && this.f18324c == pz0.f18324c && Arrays.equals(this.f18325d, pz0.f18325d) && this.f18326e == pz0.f18326e && this.f18327f == pz0.f18327f) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return (this.f18322a == -1 || this.f18323b == -1 || this.f18324c == -1) ? false : true;
    }

    public final int hashCode() {
        int i8 = this.f18328g;
        if (i8 != 0) {
            return i8;
        }
        int hashCode = ((((((((((this.f18322a + 527) * 31) + this.f18323b) * 31) + this.f18324c) * 31) + Arrays.hashCode(this.f18325d)) * 31) + this.f18326e) * 31) + this.f18327f;
        this.f18328g = hashCode;
        return hashCode;
    }

    public final String toString() {
        String str;
        int i8 = this.f18326e;
        int i9 = this.f18324c;
        int i10 = this.f18323b;
        String i11 = i(this.f18322a);
        String h8 = h(i10);
        String j8 = j(i9);
        String str2 = "NA";
        if (i8 != -1) {
            str = i8 + "bit Luma";
        } else {
            str = "NA";
        }
        int i12 = this.f18327f;
        if (i12 != -1) {
            str2 = i12 + "bit Chroma";
        }
        return "ColorInfo(" + i11 + ", " + h8 + ", " + j8 + ", " + (this.f18325d != null) + ", " + str + ", " + str2 + ")";
    }
}
