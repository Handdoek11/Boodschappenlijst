package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class C0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f14051a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14052b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14053c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14054d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14055e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14056f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14057g;

    /* renamed from: h, reason: collision with root package name */
    public final int f14058h;

    /* renamed from: i, reason: collision with root package name */
    public final int f14059i;

    /* renamed from: j, reason: collision with root package name */
    public final long f14060j;

    /* renamed from: k, reason: collision with root package name */
    public final B0 f14061k;

    /* renamed from: l, reason: collision with root package name */
    private final C3503nb f14062l;

    private C0(int i8, int i9, int i10, int i11, int i12, int i13, int i14, long j8, B0 b02, C3503nb c3503nb) {
        this.f14051a = i8;
        this.f14052b = i9;
        this.f14053c = i10;
        this.f14054d = i11;
        this.f14055e = i12;
        this.f14056f = i(i12);
        this.f14057g = i13;
        this.f14058h = i14;
        this.f14059i = h(i14);
        this.f14060j = j8;
        this.f14061k = b02;
        this.f14062l = c3503nb;
    }

    private static int h(int i8) {
        if (i8 == 8) {
            return 1;
        }
        if (i8 == 12) {
            return 2;
        }
        if (i8 == 16) {
            return 4;
        }
        if (i8 != 20) {
            return i8 != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int i(int i8) {
        switch (i8) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long a() {
        long j8 = this.f14060j;
        if (j8 == 0) {
            return -9223372036854775807L;
        }
        return (j8 * 1000000) / this.f14055e;
    }

    public final long b(long j8) {
        return Math.max(0L, Math.min((j8 * this.f14055e) / 1000000, this.f14060j - 1));
    }

    public final D c(byte[] bArr, C3503nb c3503nb) {
        bArr[4] = Byte.MIN_VALUE;
        C3503nb d8 = d(c3503nb);
        C2723gJ0 c2723gJ0 = new C2723gJ0();
        c2723gJ0.B("audio/flac");
        int i8 = this.f14054d;
        if (i8 <= 0) {
            i8 = -1;
        }
        c2723gJ0.r(i8);
        c2723gJ0.r0(this.f14057g);
        c2723gJ0.C(this.f14055e);
        c2723gJ0.u(AbstractC2301cW.F(this.f14058h));
        c2723gJ0.n(Collections.singletonList(bArr));
        c2723gJ0.t(d8);
        return c2723gJ0.H();
    }

    public final C3503nb d(C3503nb c3503nb) {
        C3503nb c3503nb2 = this.f14062l;
        return c3503nb2 == null ? c3503nb : c3503nb2.d(c3503nb);
    }

    public final C0 e(List list) {
        return new C0(this.f14051a, this.f14052b, this.f14053c, this.f14054d, this.f14055e, this.f14057g, this.f14058h, this.f14060j, this.f14061k, d(new C3503nb(list)));
    }

    public final C0 f(B0 b02) {
        return new C0(this.f14051a, this.f14052b, this.f14053c, this.f14054d, this.f14055e, this.f14057g, this.f14058h, this.f14060j, b02, this.f14062l);
    }

    public final C0 g(List list) {
        return new C0(this.f14051a, this.f14052b, this.f14053c, this.f14054d, this.f14055e, this.f14057g, this.f14058h, this.f14060j, this.f14061k, d(AbstractC2468e1.b(list)));
    }

    public C0(byte[] bArr, int i8) {
        C4144tQ c4144tQ = new C4144tQ(bArr, bArr.length);
        c4144tQ.l(i8 * 8);
        this.f14051a = c4144tQ.d(16);
        this.f14052b = c4144tQ.d(16);
        this.f14053c = c4144tQ.d(24);
        this.f14054d = c4144tQ.d(24);
        int d8 = c4144tQ.d(20);
        this.f14055e = d8;
        this.f14056f = i(d8);
        this.f14057g = c4144tQ.d(3) + 1;
        int d9 = c4144tQ.d(5) + 1;
        this.f14058h = d9;
        this.f14059i = h(d9);
        this.f14060j = c4144tQ.e(36);
        this.f14061k = null;
        this.f14062l = null;
    }
}
