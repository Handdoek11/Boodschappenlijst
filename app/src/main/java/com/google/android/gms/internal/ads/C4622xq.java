package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4622xq extends G2.B {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C1175Bq f27930c;

    C4622xq(C1175Bq c1175Bq) {
        this.f27930c = c1175Bq;
    }

    @Override // G2.B
    public final void a() {
        C1175Bq c1175Bq = this.f27930c;
        C3511nf c3511nf = new C3511nf(c1175Bq.f13895e, c1175Bq.f13896f.f2914o);
        synchronized (this.f27930c.f13891a) {
            try {
                C2.v.h();
                C3838qf.a(this.f27930c.f13898h, c3511nf);
            } catch (IllegalArgumentException e8) {
                H2.p.h("Cannot config CSI reporter.", e8);
            }
        }
    }
}
