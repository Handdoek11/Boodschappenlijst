package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.sI0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4026sI0 extends AbstractC4244uI0 implements Comparable {

    /* renamed from: A, reason: collision with root package name */
    private final int f26622A;

    /* renamed from: B, reason: collision with root package name */
    private final int f26623B;

    /* renamed from: C, reason: collision with root package name */
    private final int f26624C;

    /* renamed from: D, reason: collision with root package name */
    private final boolean f26625D;

    /* renamed from: v, reason: collision with root package name */
    private final int f26626v;

    /* renamed from: w, reason: collision with root package name */
    private final boolean f26627w;

    /* renamed from: x, reason: collision with root package name */
    private final boolean f26628x;

    /* renamed from: y, reason: collision with root package name */
    private final boolean f26629y;

    /* renamed from: z, reason: collision with root package name */
    private final int f26630z;

    public C4026sI0(int i8, C4614xm c4614xm, int i9, C2721gI0 c2721gI0, int i10, String str) {
        int i11;
        super(i8, c4614xm, i9);
        int i12 = 0;
        this.f26627w = AA0.a(i10, false);
        int i13 = this.f27022u.f14324e;
        int i14 = c2721gI0.f17627w;
        this.f26628x = 1 == (i13 & 1);
        this.f26629y = (i13 & 2) != 0;
        AbstractC4169th0 x7 = c2721gI0.f17625u.isEmpty() ? AbstractC4169th0.x("") : c2721gI0.f17625u;
        int i15 = 0;
        while (true) {
            if (i15 >= x7.size()) {
                i15 = Integer.MAX_VALUE;
                i11 = 0;
                break;
            } else {
                i11 = C4789zI0.m(this.f27022u, (String) x7.get(i15), false);
                if (i11 > 0) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        this.f26630z = i15;
        this.f26622A = i11;
        int l8 = C4789zI0.l(this.f27022u.f14325f, c2721gI0.f17626v);
        this.f26623B = l8;
        this.f26625D = (this.f27022u.f14325f & 1088) != 0;
        int m8 = C4789zI0.m(this.f27022u, str, C4789zI0.p(str) == null);
        this.f26624C = m8;
        boolean z7 = i11 > 0 || (c2721gI0.f17625u.isEmpty() && l8 > 0) || this.f26628x || (this.f26629y && m8 > 0);
        if (AA0.a(i10, c2721gI0.f22298O) && z7) {
            i12 = 1;
        }
        this.f26626v = i12;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4244uI0
    public final int a() {
        return this.f26626v;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4244uI0
    public final /* bridge */ /* synthetic */ boolean c(AbstractC4244uI0 abstractC4244uI0) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C4026sI0 c4026sI0) {
        AbstractC2972ih0 b8 = AbstractC2972ih0.i().d(this.f26627w, c4026sI0.f26627w).c(Integer.valueOf(this.f26630z), Integer.valueOf(c4026sI0.f26630z), AbstractC2539ei0.c().a()).b(this.f26622A, c4026sI0.f26622A).b(this.f26623B, c4026sI0.f26623B).d(this.f26628x, c4026sI0.f26628x).c(Boolean.valueOf(this.f26629y), Boolean.valueOf(c4026sI0.f26629y), this.f26622A == 0 ? AbstractC2539ei0.c() : AbstractC2539ei0.c().a()).b(this.f26624C, c4026sI0.f26624C);
        if (this.f26623B == 0) {
            b8 = b8.e(this.f26625D, c4026sI0.f26625D);
        }
        return b8.a();
    }
}
