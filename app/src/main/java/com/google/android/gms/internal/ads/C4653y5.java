package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.y5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4653y5 {

    /* renamed from: a, reason: collision with root package name */
    private final Y0 f28036a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f28037b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f28038c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f28039d;

    /* renamed from: e, reason: collision with root package name */
    private int f28040e;

    /* renamed from: f, reason: collision with root package name */
    private int f28041f;

    /* renamed from: g, reason: collision with root package name */
    private long f28042g;

    /* renamed from: h, reason: collision with root package name */
    private long f28043h;

    public C4653y5(Y0 y02) {
        this.f28036a = y02;
    }

    public final void a(byte[] bArr, int i8, int i9) {
        if (this.f28038c) {
            int i10 = this.f28041f;
            int i11 = (i8 + 1) - i10;
            if (i11 >= i9) {
                this.f28041f = i10 + (i9 - i8);
            } else {
                this.f28039d = ((bArr[i11] & 192) >> 6) == 0;
                this.f28038c = false;
            }
        }
    }

    public final void b(long j8, int i8, boolean z7) {
        AbstractC3796qC.f(this.f28043h != -9223372036854775807L);
        if (this.f28040e == 182 && z7 && this.f28037b) {
            this.f28036a.b(this.f28043h, this.f28039d ? 1 : 0, (int) (j8 - this.f28042g), i8, null);
        }
        if (this.f28040e != 179) {
            this.f28042g = j8;
        }
    }

    public final void c(int i8, long j8) {
        boolean z7;
        this.f28040e = i8;
        this.f28039d = false;
        if (i8 == 182) {
            z7 = true;
        } else if (i8 == 179) {
            i8 = 179;
            z7 = true;
        } else {
            z7 = false;
        }
        this.f28037b = z7;
        this.f28038c = i8 == 182;
        this.f28041f = 0;
        this.f28043h = j8;
    }

    public final void d() {
        this.f28037b = false;
        this.f28038c = false;
        this.f28039d = false;
        this.f28040e = -1;
    }
}
