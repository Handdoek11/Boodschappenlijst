package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* loaded from: classes.dex */
public final class U4 implements InterfaceC3562o4 {

    /* renamed from: a, reason: collision with root package name */
    private final UQ f19280a = new UQ();

    /* renamed from: b, reason: collision with root package name */
    private final boolean f19281b;

    /* renamed from: c, reason: collision with root package name */
    private final int f19282c;

    /* renamed from: d, reason: collision with root package name */
    private final int f19283d;

    /* renamed from: e, reason: collision with root package name */
    private final String f19284e;

    /* renamed from: f, reason: collision with root package name */
    private final float f19285f;

    /* renamed from: g, reason: collision with root package name */
    private final int f19286g;

    public U4(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f19282c = 0;
            this.f19283d = -1;
            this.f19284e = "sans-serif";
            this.f19281b = false;
            this.f19285f = 0.85f;
            this.f19286g = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f19282c = bArr[24];
        this.f19283d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f19284e = true == "Serif".equals(AbstractC2301cW.c(bArr, 43, bArr.length + (-43))) ? "serif" : "sans-serif";
        int i8 = bArr[25] * 20;
        this.f19286g = i8;
        boolean z7 = (bArr[0] & 32) != 0;
        this.f19281b = z7;
        if (z7) {
            this.f19285f = Math.max(0.0f, Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i8, 0.95f));
        } else {
            this.f19285f = 0.85f;
        }
    }

    private static void b(SpannableStringBuilder spannableStringBuilder, int i8, int i9, int i10, int i11, int i12) {
        if (i8 != i9) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i8 >>> 8) | ((i8 & 255) << 24)), i10, i11, i12 | 33);
        }
    }

    private static void c(SpannableStringBuilder spannableStringBuilder, int i8, int i9, int i10, int i11, int i12) {
        if (i8 != i9) {
            int i13 = i12 | 33;
            int i14 = i8 & 1;
            int i15 = i8 & 2;
            boolean z7 = true;
            if (i14 != 0) {
                if (i15 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i10, i11, i13);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i10, i11, i13);
                    z7 = false;
                }
            } else if (i15 != 0) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i10, i11, i13);
            } else {
                z7 = false;
            }
            if ((i8 & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, i13);
            } else {
                if (i14 != 0 || z7) {
                    return;
                }
                spannableStringBuilder.setSpan(new StyleSpan(0), i10, i11, i13);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.InterfaceC3562o4
    public final void a(byte[] bArr, int i8, int i9, C3453n4 c3453n4, WE we) {
        String b8;
        int i10;
        int i11;
        int i12;
        this.f19280a.j(bArr, i8 + i9);
        this.f19280a.l(i8);
        UQ uq = this.f19280a;
        int i13 = 1;
        int i14 = 0;
        int i15 = 2;
        AbstractC3796qC.d(uq.r() >= 2);
        int G7 = uq.G();
        if (G7 == 0) {
            b8 = "";
        } else {
            int t7 = uq.t();
            Charset c8 = uq.c();
            int t8 = uq.t() - t7;
            if (c8 == null) {
                c8 = StandardCharsets.UTF_8;
            }
            b8 = uq.b(G7 - t8, c8);
        }
        if (b8.isEmpty()) {
            we.a(new C2692g4(AbstractC4169th0.w(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(b8);
        c(spannableStringBuilder, this.f19282c, 0, 0, spannableStringBuilder.length(), 16711680);
        b(spannableStringBuilder, this.f19283d, -1, 0, spannableStringBuilder.length(), 16711680);
        String str = this.f19284e;
        int length = spannableStringBuilder.length();
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f8 = this.f19285f;
        while (true) {
            UQ uq2 = this.f19280a;
            if (uq2.r() < 8) {
                C2677fx c2677fx = new C2677fx();
                c2677fx.l(spannableStringBuilder);
                c2677fx.e(f8, 0);
                c2677fx.f(0);
                we.a(new C2692g4(AbstractC4169th0.x(c2677fx.p()), -9223372036854775807L, -9223372036854775807L));
                return;
            }
            int t9 = uq2.t();
            int w7 = uq2.w();
            int w8 = this.f19280a.w();
            if (w8 == 1937013100) {
                AbstractC3796qC.d(this.f19280a.r() >= i15 ? i13 : i14);
                int G8 = this.f19280a.G();
                int i16 = i14;
                while (i16 < G8) {
                    UQ uq3 = this.f19280a;
                    AbstractC3796qC.d(uq3.r() >= 12 ? i13 : i14);
                    int G9 = uq3.G();
                    int G10 = uq3.G();
                    uq3.m(i15);
                    int C7 = uq3.C();
                    uq3.m(i13);
                    int w9 = uq3.w();
                    if (G10 > spannableStringBuilder.length()) {
                        int length2 = spannableStringBuilder.length();
                        StringBuilder sb = new StringBuilder();
                        i11 = G8;
                        sb.append("Truncating styl end (");
                        sb.append(G10);
                        sb.append(") to cueText.length() (");
                        sb.append(length2);
                        sb.append(").");
                        HL.f("Tx3gParser", sb.toString());
                        i12 = spannableStringBuilder.length();
                    } else {
                        i11 = G8;
                        i12 = G10;
                    }
                    if (G9 >= i12) {
                        HL.f("Tx3gParser", "Ignoring styl with start (" + G9 + ") >= end (" + i12 + ").");
                    } else {
                        int i17 = i12;
                        c(spannableStringBuilder, C7, this.f19282c, G9, i17, 0);
                        b(spannableStringBuilder, w9, this.f19283d, G9, i17, 0);
                    }
                    i16++;
                    G8 = i11;
                    i13 = 1;
                    i14 = 0;
                    i15 = 2;
                }
                i10 = i15;
            } else if (w8 == 1952608120 && this.f19281b) {
                i10 = 2;
                AbstractC3796qC.d(this.f19280a.r() >= 2);
                f8 = Math.max(0.0f, Math.min(this.f19280a.G() / this.f19286g, 0.95f));
            } else {
                i10 = 2;
            }
            this.f19280a.l(t9 + w7);
            i15 = i10;
            i13 = 1;
            i14 = 0;
        }
    }
}
