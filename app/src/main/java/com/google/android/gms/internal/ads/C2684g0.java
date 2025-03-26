package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2684g0 implements InterfaceC3989s0 {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3684pA0 f22183b;

    /* renamed from: c, reason: collision with root package name */
    private final long f22184c;

    /* renamed from: d, reason: collision with root package name */
    private long f22185d;

    /* renamed from: f, reason: collision with root package name */
    private int f22187f;

    /* renamed from: g, reason: collision with root package name */
    private int f22188g;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f22186e = new byte[65536];

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f22182a = new byte[4096];

    static {
        AbstractC2591f8.b("media3.extractor");
    }

    public C2684g0(InterfaceC3684pA0 interfaceC3684pA0, long j8, long j9) {
        this.f22183b = interfaceC3684pA0;
        this.f22185d = j8;
        this.f22184c = j9;
    }

    private final int j(byte[] bArr, int i8, int i9) {
        int i10 = this.f22188g;
        if (i10 == 0) {
            return 0;
        }
        int min = Math.min(i10, i9);
        System.arraycopy(this.f22186e, 0, bArr, i8, min);
        o(min);
        return min;
    }

    private final int k(byte[] bArr, int i8, int i9, int i10, boolean z7) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int C7 = this.f22183b.C(bArr, i8 + i10, i9 - i10);
        if (C7 != -1) {
            return i10 + C7;
        }
        if (i10 == 0 && z7) {
            return -1;
        }
        throw new EOFException();
    }

    private final int l(int i8) {
        int min = Math.min(this.f22188g, i8);
        o(min);
        return min;
    }

    private final void m(int i8) {
        if (i8 != -1) {
            this.f22185d += i8;
        }
    }

    private final void n(int i8) {
        int i9 = this.f22187f + i8;
        int length = this.f22186e.length;
        if (i9 > length) {
            this.f22186e = Arrays.copyOf(this.f22186e, Math.max(65536 + i9, Math.min(length + length, i9 + 524288)));
        }
    }

    private final void o(int i8) {
        int i9 = this.f22188g - i8;
        this.f22188g = i9;
        this.f22187f = 0;
        byte[] bArr = this.f22186e;
        byte[] bArr2 = i9 < bArr.length + (-524288) ? new byte[65536 + i9] : bArr;
        System.arraycopy(bArr, i8, bArr2, 0, i9);
        this.f22186e = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3989s0
    public final int B(int i8) {
        int l8 = l(1);
        if (l8 == 0) {
            l8 = k(this.f22182a, 0, Math.min(1, 4096), 0, true);
        }
        m(l8);
        return l8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3989s0, com.google.android.gms.internal.ads.InterfaceC3684pA0
    public final int C(byte[] bArr, int i8, int i9) {
        int j8 = j(bArr, i8, i9);
        if (j8 == 0) {
            j8 = k(bArr, i8, i9, 0, true);
        }
        m(j8);
        return j8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3989s0
    public final void D(int i8) {
        i(i8, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3989s0
    public final boolean E(byte[] bArr, int i8, int i9, boolean z7) {
        int j8 = j(bArr, i8, i9);
        while (j8 < i9 && j8 != -1) {
            j8 = k(bArr, i8, i9, j8, z7);
        }
        m(j8);
        return j8 != -1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3989s0
    public final int F(byte[] bArr, int i8, int i9) {
        int min;
        n(i9);
        int i10 = this.f22188g;
        int i11 = this.f22187f;
        int i12 = i10 - i11;
        if (i12 == 0) {
            min = k(this.f22186e, i11, i9, 0, true);
            if (min == -1) {
                return -1;
            }
            this.f22188g += min;
        } else {
            min = Math.min(i9, i12);
        }
        System.arraycopy(this.f22186e, this.f22187f, bArr, i8, min);
        this.f22187f += min;
        return min;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3989s0
    public final boolean G(byte[] bArr, int i8, int i9, boolean z7) {
        if (!g(i9, z7)) {
            return false;
        }
        System.arraycopy(this.f22186e, this.f22187f - i9, bArr, i8, i9);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3989s0
    public final void H(byte[] bArr, int i8, int i9) {
        E(bArr, i8, i9, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3989s0
    public final void I(byte[] bArr, int i8, int i9) {
        G(bArr, i8, i9, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3989s0
    public final long b() {
        return this.f22185d + this.f22187f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3989s0
    public final long c() {
        return this.f22185d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3989s0
    public final long d() {
        return this.f22184c;
    }

    public final boolean g(int i8, boolean z7) {
        n(i8);
        int i9 = this.f22188g - this.f22187f;
        while (i9 < i8) {
            i9 = k(this.f22186e, this.f22187f, i8, i9, z7);
            if (i9 == -1) {
                return false;
            }
            this.f22188g = this.f22187f + i9;
        }
        this.f22187f += i8;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3989s0
    public final void h() {
        this.f22187f = 0;
    }

    public final boolean i(int i8, boolean z7) {
        int l8 = l(i8);
        while (l8 < i8 && l8 != -1) {
            l8 = k(this.f22182a, -l8, Math.min(i8, l8 + 4096), l8, false);
        }
        m(l8);
        return l8 != -1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3989s0
    public final void z(int i8) {
        g(i8, false);
    }
}
