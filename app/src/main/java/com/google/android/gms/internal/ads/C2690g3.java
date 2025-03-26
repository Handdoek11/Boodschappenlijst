package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.g3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2690g3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f22213a;

    /* renamed from: b, reason: collision with root package name */
    public int f22214b;

    /* renamed from: c, reason: collision with root package name */
    public int f22215c;

    /* renamed from: d, reason: collision with root package name */
    public long f22216d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f22217e;

    /* renamed from: f, reason: collision with root package name */
    private final UQ f22218f;

    /* renamed from: g, reason: collision with root package name */
    private final UQ f22219g;

    /* renamed from: h, reason: collision with root package name */
    private int f22220h;

    /* renamed from: i, reason: collision with root package name */
    private int f22221i;

    public C2690g3(UQ uq, UQ uq2, boolean z7) {
        this.f22219g = uq;
        this.f22218f = uq2;
        this.f22217e = z7;
        uq2.l(12);
        this.f22213a = uq2.F();
        uq.l(12);
        this.f22221i = uq.F();
        AbstractC4316v0.b(uq.w() == 1, "first_chunk must be 1");
        this.f22214b = -1;
    }

    public final boolean a() {
        int i8 = this.f22214b + 1;
        this.f22214b = i8;
        if (i8 == this.f22213a) {
            return false;
        }
        this.f22216d = this.f22217e ? this.f22218f.M() : this.f22218f.K();
        if (this.f22214b == this.f22220h) {
            this.f22215c = this.f22219g.F();
            this.f22219g.m(4);
            int i9 = this.f22221i - 1;
            this.f22221i = i9;
            this.f22220h = i9 > 0 ? (-1) + this.f22219g.F() : -1;
        }
        return true;
    }
}
