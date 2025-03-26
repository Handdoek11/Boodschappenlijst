package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class C5 extends A5 {
    C5() {
    }

    private static void m(Object obj, C5075z5 c5075z5) {
        ((AbstractC5010r4) obj).zzb = c5075z5;
    }

    @Override // com.google.android.gms.internal.measurement.A5
    final /* synthetic */ int a(Object obj) {
        return ((C5075z5) obj).a();
    }

    @Override // com.google.android.gms.internal.measurement.A5
    final /* synthetic */ Object b(Object obj, Object obj2) {
        C5075z5 c5075z5 = (C5075z5) obj;
        C5075z5 c5075z52 = (C5075z5) obj2;
        return C5075z5.k().equals(c5075z52) ? c5075z5 : C5075z5.k().equals(c5075z5) ? C5075z5.c(c5075z5, c5075z52) : c5075z5.b(c5075z52);
    }

    @Override // com.google.android.gms.internal.measurement.A5
    final /* synthetic */ void c(Object obj, int i8, K3 k32) {
        ((C5075z5) obj).e((i8 << 3) | 2, k32);
    }

    @Override // com.google.android.gms.internal.measurement.A5
    final /* synthetic */ void d(Object obj, S5 s52) {
        ((C5075z5) obj).g(s52);
    }

    @Override // com.google.android.gms.internal.measurement.A5
    final /* synthetic */ int e(Object obj) {
        return ((C5075z5) obj).i();
    }

    @Override // com.google.android.gms.internal.measurement.A5
    final /* synthetic */ void f(Object obj, int i8, long j8) {
        ((C5075z5) obj).e(i8 << 3, Long.valueOf(j8));
    }

    @Override // com.google.android.gms.internal.measurement.A5
    final /* synthetic */ void g(Object obj, S5 s52) {
        ((C5075z5) obj).j(s52);
    }

    @Override // com.google.android.gms.internal.measurement.A5
    final /* synthetic */ void h(Object obj, Object obj2) {
        m(obj, (C5075z5) obj2);
    }

    @Override // com.google.android.gms.internal.measurement.A5
    final /* synthetic */ Object i(Object obj) {
        C5075z5 c5075z5 = ((AbstractC5010r4) obj).zzb;
        if (c5075z5 != C5075z5.k()) {
            return c5075z5;
        }
        C5075z5 l8 = C5075z5.l();
        m(obj, l8);
        return l8;
    }

    @Override // com.google.android.gms.internal.measurement.A5
    final /* synthetic */ void j(Object obj, Object obj2) {
        m(obj, (C5075z5) obj2);
    }

    @Override // com.google.android.gms.internal.measurement.A5
    final /* synthetic */ Object k(Object obj) {
        return ((AbstractC5010r4) obj).zzb;
    }

    @Override // com.google.android.gms.internal.measurement.A5
    final void l(Object obj) {
        ((AbstractC5010r4) obj).zzb.m();
    }
}
