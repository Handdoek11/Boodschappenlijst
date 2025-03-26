package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class W2 {

    /* renamed from: d, reason: collision with root package name */
    private static final long[] f19694d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f19695a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    private int f19696b;

    /* renamed from: c, reason: collision with root package name */
    private int f19697c;

    public static int b(int i8) {
        int i9 = 0;
        while (i9 < 8) {
            int i10 = i9 + 1;
            if ((f19694d[i9] & i8) != 0) {
                return i10;
            }
            i9 = i10;
        }
        return -1;
    }

    public static long c(byte[] bArr, int i8, boolean z7) {
        long j8 = bArr[0] & 255;
        if (z7) {
            j8 &= ~f19694d[i8 - 1];
        }
        for (int i9 = 1; i9 < i8; i9++) {
            j8 = (j8 << 8) | (bArr[i9] & 255);
        }
        return j8;
    }

    public final int a() {
        return this.f19697c;
    }

    public final long d(InterfaceC3989s0 interfaceC3989s0, boolean z7, boolean z8, int i8) {
        if (this.f19696b == 0) {
            if (!interfaceC3989s0.E(this.f19695a, 0, 1, z7)) {
                return -1L;
            }
            int b8 = b(this.f19695a[0] & 255);
            this.f19697c = b8;
            if (b8 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f19696b = 1;
        }
        int i9 = this.f19697c;
        if (i9 > i8) {
            this.f19696b = 0;
            return -2L;
        }
        if (i9 != 1) {
            interfaceC3989s0.H(this.f19695a, 1, i9 - 1);
        }
        this.f19696b = 0;
        return c(this.f19695a, this.f19697c, z8);
    }

    public final void e() {
        this.f19696b = 0;
        this.f19697c = 0;
    }
}
