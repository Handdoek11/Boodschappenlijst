package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class Z3 extends W3 {

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f29131c;

    /* renamed from: d, reason: collision with root package name */
    private int f29132d;

    /* renamed from: e, reason: collision with root package name */
    private int f29133e;

    /* renamed from: f, reason: collision with root package name */
    private int f29134f;

    /* renamed from: g, reason: collision with root package name */
    private int f29135g;

    /* renamed from: h, reason: collision with root package name */
    private int f29136h;

    private final void f() {
        int i8 = this.f29132d + this.f29133e;
        this.f29132d = i8;
        int i9 = i8 - this.f29135g;
        int i10 = this.f29136h;
        if (i9 <= i10) {
            this.f29133e = 0;
            return;
        }
        int i11 = i9 - i10;
        this.f29133e = i11;
        this.f29132d = i8 - i11;
    }

    @Override // com.google.android.gms.internal.measurement.W3
    public final int d(int i8) {
        if (i8 < 0) {
            throw zzkb.d();
        }
        int e8 = i8 + e();
        if (e8 < 0) {
            throw zzkb.e();
        }
        int i9 = this.f29136h;
        if (e8 > i9) {
            throw zzkb.g();
        }
        this.f29136h = e8;
        f();
        return i9;
    }

    @Override // com.google.android.gms.internal.measurement.W3
    public final int e() {
        return this.f29134f - this.f29135g;
    }

    private Z3(byte[] bArr, int i8, int i9, boolean z7) {
        super();
        this.f29136h = Integer.MAX_VALUE;
        this.f29131c = bArr;
        this.f29132d = i9 + i8;
        this.f29134f = i8;
        this.f29135g = i8;
    }
}
