package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes.dex */
final class A5 {

    /* renamed from: a, reason: collision with root package name */
    private final Y0 f13500a;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray f13501b = new SparseArray();

    /* renamed from: c, reason: collision with root package name */
    private final SparseArray f13502c = new SparseArray();

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f13503d;

    /* renamed from: e, reason: collision with root package name */
    private int f13504e;

    /* renamed from: f, reason: collision with root package name */
    private long f13505f;

    /* renamed from: g, reason: collision with root package name */
    private long f13506g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f13507h;

    /* renamed from: i, reason: collision with root package name */
    private long f13508i;

    /* renamed from: j, reason: collision with root package name */
    private long f13509j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f13510k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f13511l;

    public A5(Y0 y02, boolean z7, boolean z8) {
        this.f13500a = y02;
        byte[] bArr = new byte[128];
        this.f13503d = bArr;
        new C2961ib0(bArr, 0, 0);
        this.f13507h = false;
    }

    private final void g(int i8) {
        long j8 = this.f13509j;
        if (j8 == -9223372036854775807L) {
            return;
        }
        boolean z7 = this.f13510k;
        long j9 = this.f13505f - this.f13508i;
        this.f13500a.b(j8, z7 ? 1 : 0, (int) j9, i8, null);
    }

    private final void h() {
        boolean z7 = this.f13511l;
        boolean z8 = this.f13510k;
        int i8 = this.f13504e;
        boolean z9 = true;
        if (i8 != 5 && (!z7 || i8 != 1)) {
            z9 = false;
        }
        this.f13510k = z8 | z9;
    }

    public final void a(long j8) {
        h();
        this.f13505f = j8;
        g(0);
        this.f13507h = false;
    }

    public final void b(G90 g90) {
        this.f13502c.append(g90.f15319a, g90);
    }

    public final void c(C2850ha0 c2850ha0) {
        this.f13501b.append(c2850ha0.f22576d, c2850ha0);
    }

    public final void d() {
        this.f13507h = false;
    }

    public final void e(long j8, int i8, long j9, boolean z7) {
        this.f13504e = i8;
        this.f13506g = j9;
        this.f13505f = j8;
        this.f13511l = z7;
    }

    public final boolean f(long j8, int i8, boolean z7) {
        if (this.f13504e == 9) {
            if (z7 && this.f13507h) {
                g(i8 + ((int) (j8 - this.f13505f)));
            }
            this.f13508i = this.f13505f;
            this.f13509j = this.f13506g;
            this.f13510k = false;
            this.f13507h = true;
        }
        h();
        return this.f13510k;
    }
}
