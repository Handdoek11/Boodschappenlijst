package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class RB0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f18613a;

    /* renamed from: b, reason: collision with root package name */
    private int f18614b;

    /* renamed from: c, reason: collision with root package name */
    private long f18615c;

    /* renamed from: d, reason: collision with root package name */
    private GG0 f18616d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f18617e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f18618f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ TB0 f18619g;

    public RB0(TB0 tb0, String str, int i8, GG0 gg0) {
        this.f18619g = tb0;
        this.f18613a = str;
        this.f18614b = i8;
        this.f18615c = gg0 == null ? -1L : gg0.f15343d;
        if (gg0 == null || !gg0.b()) {
            return;
        }
        this.f18616d = gg0;
    }

    public final void g(int i8, GG0 gg0) {
        if (this.f18615c == -1 && i8 == this.f18614b && gg0 != null) {
            TB0 tb0 = this.f18619g;
            long j8 = gg0.f15343d;
            if (j8 >= tb0.l()) {
                this.f18615c = j8;
            }
        }
    }

    public final boolean j(int i8, GG0 gg0) {
        if (gg0 == null) {
            return i8 == this.f18614b;
        }
        GG0 gg02 = this.f18616d;
        return gg02 == null ? !gg0.b() && gg0.f15343d == this.f18615c : gg0.f15343d == gg02.f15343d && gg0.f15341b == gg02.f15341b && gg0.f15342c == gg02.f15342c;
    }

    public final boolean k(KA0 ka0) {
        GG0 gg0 = ka0.f16544d;
        if (gg0 == null) {
            return this.f18614b != ka0.f16543c;
        }
        long j8 = this.f18615c;
        if (j8 == -1) {
            return false;
        }
        if (gg0.f15343d > j8) {
            return true;
        }
        if (this.f18616d == null) {
            return false;
        }
        AbstractC1981Yl abstractC1981Yl = ka0.f16542b;
        int a8 = abstractC1981Yl.a(gg0.f15340a);
        int a9 = abstractC1981Yl.a(this.f18616d.f15340a);
        GG0 gg02 = ka0.f16544d;
        if (gg02.f15343d < this.f18616d.f15343d || a8 < a9) {
            return false;
        }
        if (a8 > a9) {
            return true;
        }
        if (!gg02.b()) {
            int i8 = ka0.f16544d.f15344e;
            return i8 == -1 || i8 > this.f18616d.f15341b;
        }
        GG0 gg03 = ka0.f16544d;
        int i9 = gg03.f15341b;
        int i10 = gg03.f15342c;
        GG0 gg04 = this.f18616d;
        int i11 = gg04.f15341b;
        if (i9 <= i11) {
            return i9 == i11 && i10 > gg04.f15342c;
        }
        return true;
    }

    public final boolean l(AbstractC1981Yl abstractC1981Yl, AbstractC1981Yl abstractC1981Yl2) {
        int i8 = this.f18614b;
        if (i8 < abstractC1981Yl.c()) {
            abstractC1981Yl.e(i8, this.f18619g.f19091a, 0L);
            for (int i9 = this.f18619g.f19091a.f28196m; i9 <= this.f18619g.f19091a.f28197n; i9++) {
                int a8 = abstractC1981Yl2.a(abstractC1981Yl.f(i9));
                if (a8 != -1) {
                    i8 = abstractC1981Yl2.d(a8, this.f18619g.f19092b, false).f20118c;
                    break;
                }
            }
            i8 = -1;
        } else if (i8 >= abstractC1981Yl2.c()) {
            i8 = -1;
        }
        this.f18614b = i8;
        if (i8 == -1) {
            return false;
        }
        GG0 gg0 = this.f18616d;
        return gg0 == null || abstractC1981Yl2.a(gg0.f15340a) != -1;
    }
}
