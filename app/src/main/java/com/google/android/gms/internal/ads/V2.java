package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class V2 {

    /* renamed from: a, reason: collision with root package name */
    private final UQ f19515a = new UQ(8);

    /* renamed from: b, reason: collision with root package name */
    private int f19516b;

    private final long b(InterfaceC3989s0 interfaceC3989s0) {
        int i8;
        C2684g0 c2684g0 = (C2684g0) interfaceC3989s0;
        int i9 = 0;
        c2684g0.G(this.f19515a.n(), 0, 1, false);
        int i10 = this.f19515a.n()[0] & 255;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int i11 = 128;
        int i12 = 0;
        while (true) {
            i8 = i12 + 1;
            if ((i10 & i11) != 0) {
                break;
            }
            i11 >>= 1;
            i12 = i8;
        }
        int i13 = i10 & (~i11);
        c2684g0.G(this.f19515a.n(), 1, i12, false);
        while (i9 < i12) {
            i9++;
            i13 = (this.f19515a.n()[i9] & 255) + (i13 << 8);
        }
        this.f19516b += i8;
        return i13;
    }

    public final boolean a(InterfaceC3989s0 interfaceC3989s0) {
        long d8 = interfaceC3989s0.d();
        long j8 = 1024;
        if (d8 != -1 && d8 <= 1024) {
            j8 = d8;
        }
        C2684g0 c2684g0 = (C2684g0) interfaceC3989s0;
        c2684g0.G(this.f19515a.n(), 0, 4, false);
        long K7 = this.f19515a.K();
        this.f19516b = 4;
        while (K7 != 440786851) {
            int i8 = (int) j8;
            int i9 = this.f19516b + 1;
            this.f19516b = i9;
            if (i9 == i8) {
                return false;
            }
            c2684g0.G(this.f19515a.n(), 0, 1, false);
            K7 = ((K7 << 8) & (-256)) | (this.f19515a.n()[0] & 255);
        }
        long b8 = b(interfaceC3989s0);
        long j9 = this.f19516b;
        if (b8 != Long.MIN_VALUE) {
            long j10 = j9 + b8;
            if (d8 == -1 || j10 < d8) {
                while (true) {
                    long j11 = this.f19516b;
                    if (j11 < j10) {
                        if (b(interfaceC3989s0) == Long.MIN_VALUE) {
                            return false;
                        }
                        long b9 = b(interfaceC3989s0);
                        if (b9 < 0) {
                            return false;
                        }
                        if (b9 != 0) {
                            int i10 = (int) b9;
                            c2684g0.g(i10, false);
                            this.f19516b += i10;
                        }
                    } else if (j11 == j10) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
