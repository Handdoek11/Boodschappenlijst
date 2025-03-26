package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Z0 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f20371a = new byte[10];

    /* renamed from: b, reason: collision with root package name */
    private boolean f20372b;

    /* renamed from: c, reason: collision with root package name */
    private int f20373c;

    /* renamed from: d, reason: collision with root package name */
    private long f20374d;

    /* renamed from: e, reason: collision with root package name */
    private int f20375e;

    /* renamed from: f, reason: collision with root package name */
    private int f20376f;

    /* renamed from: g, reason: collision with root package name */
    private int f20377g;

    public final void a(Y0 y02, X0 x02) {
        if (this.f20373c > 0) {
            y02.b(this.f20374d, this.f20375e, this.f20376f, this.f20377g, x02);
            this.f20373c = 0;
        }
    }

    public final void b() {
        this.f20372b = false;
        this.f20373c = 0;
    }

    public final void c(Y0 y02, long j8, int i8, int i9, int i10, X0 x02) {
        AbstractC3796qC.g(this.f20377g <= i9 + i10, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f20372b) {
            int i11 = this.f20373c;
            int i12 = i11 + 1;
            this.f20373c = i12;
            if (i11 == 0) {
                this.f20374d = j8;
                this.f20375e = i8;
                this.f20376f = 0;
            }
            this.f20376f += i9;
            this.f20377g = i10;
            if (i12 >= 16) {
                a(y02, x02);
            }
        }
    }

    public final void d(InterfaceC3989s0 interfaceC3989s0) {
        if (this.f20372b) {
            return;
        }
        interfaceC3989s0.I(this.f20371a, 0, 10);
        interfaceC3989s0.h();
        byte[] bArr = this.f20371a;
        int i8 = Q.f18335g;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.f20372b = true;
        }
    }
}
