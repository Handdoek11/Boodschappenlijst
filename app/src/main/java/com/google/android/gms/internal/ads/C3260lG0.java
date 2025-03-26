package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.lG0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3260lG0 implements RG0, NE0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f24296a;

    /* renamed from: b, reason: collision with root package name */
    private QG0 f24297b;

    /* renamed from: c, reason: collision with root package name */
    private ME0 f24298c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC3478nG0 f24299d;

    public C3260lG0(AbstractC3478nG0 abstractC3478nG0, Object obj) {
        this.f24299d = abstractC3478nG0;
        this.f24297b = abstractC3478nG0.p(null);
        this.f24298c = abstractC3478nG0.n(null);
        this.f24296a = obj;
    }

    private final CG0 a(CG0 cg0, GG0 gg0) {
        AbstractC3478nG0 abstractC3478nG0 = this.f24299d;
        Object obj = this.f24296a;
        long j8 = cg0.f14123c;
        abstractC3478nG0.B(obj, j8, gg0);
        AbstractC3478nG0 abstractC3478nG02 = this.f24299d;
        Object obj2 = this.f24296a;
        long j9 = cg0.f14124d;
        abstractC3478nG02.B(obj2, j9, gg0);
        return (j8 == cg0.f14123c && j9 == cg0.f14124d) ? cg0 : new CG0(1, cg0.f14121a, cg0.f14122b, 0, null, j8, j9);
    }

    private final boolean z(int i8, GG0 gg0) {
        GG0 gg02;
        if (gg0 != null) {
            gg02 = this.f24299d.C(this.f24296a, gg0);
            if (gg02 == null) {
                return false;
            }
        } else {
            gg02 = null;
        }
        this.f24299d.A(this.f24296a, 0);
        QG0 qg0 = this.f24297b;
        int i9 = qg0.f18435a;
        if (!Objects.equals(qg0.f18436b, gg02)) {
            this.f24297b = this.f24299d.q(0, gg02);
        }
        ME0 me0 = this.f24298c;
        int i10 = me0.f17305a;
        if (Objects.equals(me0.f17306b, gg02)) {
            return true;
        }
        this.f24298c = this.f24299d.o(0, gg02);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.RG0
    public final void A(int i8, GG0 gg0, C4458wG0 c4458wG0, CG0 cg0) {
        if (z(0, gg0)) {
            this.f24297b.f(c4458wG0, a(cg0, gg0));
        }
    }

    @Override // com.google.android.gms.internal.ads.RG0
    public final void C(int i8, GG0 gg0, CG0 cg0) {
        if (z(0, gg0)) {
            this.f24297b.d(a(cg0, gg0));
        }
    }

    @Override // com.google.android.gms.internal.ads.RG0
    public final void H(int i8, GG0 gg0, C4458wG0 c4458wG0, CG0 cg0, IOException iOException, boolean z7) {
        if (z(0, gg0)) {
            this.f24297b.g(c4458wG0, a(cg0, gg0), iOException, z7);
        }
    }

    @Override // com.google.android.gms.internal.ads.RG0
    public final void i(int i8, GG0 gg0, C4458wG0 c4458wG0, CG0 cg0) {
        if (z(0, gg0)) {
            this.f24297b.e(c4458wG0, a(cg0, gg0));
        }
    }

    @Override // com.google.android.gms.internal.ads.RG0
    public final void t(int i8, GG0 gg0, C4458wG0 c4458wG0, CG0 cg0) {
        if (z(0, gg0)) {
            this.f24297b.h(c4458wG0, a(cg0, gg0));
        }
    }
}
