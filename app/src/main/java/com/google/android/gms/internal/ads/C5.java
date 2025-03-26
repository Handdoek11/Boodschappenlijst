package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class C5 {

    /* renamed from: a, reason: collision with root package name */
    private final Y0 f14086a;

    /* renamed from: b, reason: collision with root package name */
    private long f14087b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f14088c;

    /* renamed from: d, reason: collision with root package name */
    private int f14089d;

    /* renamed from: e, reason: collision with root package name */
    private long f14090e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14091f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f14092g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f14093h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f14094i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f14095j;

    /* renamed from: k, reason: collision with root package name */
    private long f14096k;

    /* renamed from: l, reason: collision with root package name */
    private long f14097l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f14098m;

    public C5(Y0 y02) {
        this.f14086a = y02;
    }

    private final void f(int i8) {
        long j8 = this.f14097l;
        if (j8 == -9223372036854775807L) {
            return;
        }
        boolean z7 = this.f14098m;
        long j9 = this.f14087b - this.f14096k;
        this.f14086a.b(j8, z7 ? 1 : 0, (int) j9, i8, null);
    }

    public final void a(long j8) {
        this.f14098m = this.f14088c;
        f((int) (j8 - this.f14087b));
        this.f14096k = this.f14087b;
        this.f14087b = j8;
        f(0);
        this.f14094i = false;
    }

    public final void b(long j8, int i8, boolean z7) {
        if (this.f14095j && this.f14092g) {
            this.f14098m = this.f14088c;
            this.f14095j = false;
        } else if (this.f14093h || this.f14092g) {
            if (z7 && this.f14094i) {
                f(i8 + ((int) (j8 - this.f14087b)));
            }
            this.f14096k = this.f14087b;
            this.f14097l = this.f14090e;
            this.f14098m = this.f14088c;
            this.f14094i = true;
        }
    }

    public final void c(byte[] bArr, int i8, int i9) {
        if (this.f14091f) {
            int i10 = this.f14089d;
            int i11 = (i8 + 2) - i10;
            if (i11 >= i9) {
                this.f14089d = i10 + (i9 - i8);
            } else {
                this.f14092g = (bArr[i11] & 128) != 0;
                this.f14091f = false;
            }
        }
    }

    public final void d() {
        this.f14091f = false;
        this.f14092g = false;
        this.f14093h = false;
        this.f14094i = false;
        this.f14095j = false;
    }

    public final void e(long j8, int i8, int i9, long j9, boolean z7) {
        this.f14092g = false;
        this.f14093h = false;
        this.f14090e = j9;
        this.f14089d = 0;
        this.f14087b = j8;
        if (i9 >= 32 && i9 != 40) {
            if (this.f14094i && !this.f14095j) {
                if (z7) {
                    f(i8);
                }
                this.f14094i = false;
            }
            if (i9 <= 35 || i9 == 39) {
                this.f14093h = !this.f14095j;
                this.f14095j = true;
            }
        }
        boolean z8 = i9 >= 16 && i9 <= 21;
        this.f14088c = z8;
        this.f14091f = z8 || i9 <= 9;
    }
}
