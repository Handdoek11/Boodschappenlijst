package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class Qv0 extends Ov0 {
    Qv0() {
    }

    @Override // com.google.android.gms.internal.ads.Ov0
    final /* bridge */ /* synthetic */ Object a(Object obj) {
        Qu0 qu0 = (Qu0) obj;
        Pv0 pv0 = qu0.zzt;
        if (pv0 != Pv0.c()) {
            return pv0;
        }
        Pv0 f8 = Pv0.f();
        qu0.zzt = f8;
        return f8;
    }

    @Override // com.google.android.gms.internal.ads.Ov0
    final /* synthetic */ Object b() {
        return Pv0.f();
    }

    @Override // com.google.android.gms.internal.ads.Ov0
    final /* synthetic */ Object c(Object obj) {
        Pv0 pv0 = (Pv0) obj;
        pv0.h();
        return pv0;
    }

    @Override // com.google.android.gms.internal.ads.Ov0
    final /* bridge */ /* synthetic */ void d(Object obj, int i8, int i9) {
        ((Pv0) obj).j((i8 << 3) | 5, Integer.valueOf(i9));
    }

    @Override // com.google.android.gms.internal.ads.Ov0
    final /* bridge */ /* synthetic */ void e(Object obj, int i8, long j8) {
        ((Pv0) obj).j((i8 << 3) | 1, Long.valueOf(j8));
    }

    @Override // com.google.android.gms.internal.ads.Ov0
    final /* bridge */ /* synthetic */ void f(Object obj, int i8, Object obj2) {
        ((Pv0) obj).j((i8 << 3) | 3, (Pv0) obj2);
    }

    @Override // com.google.android.gms.internal.ads.Ov0
    final /* bridge */ /* synthetic */ void g(Object obj, int i8, AbstractC3542nu0 abstractC3542nu0) {
        ((Pv0) obj).j((i8 << 3) | 2, abstractC3542nu0);
    }

    @Override // com.google.android.gms.internal.ads.Ov0
    final /* bridge */ /* synthetic */ void h(Object obj, int i8, long j8) {
        ((Pv0) obj).j(i8 << 3, Long.valueOf(j8));
    }

    @Override // com.google.android.gms.internal.ads.Ov0
    final void i(Object obj) {
        ((Qu0) obj).zzt.h();
    }

    @Override // com.google.android.gms.internal.ads.Ov0
    final /* synthetic */ void j(Object obj, Object obj2) {
        ((Qu0) obj).zzt = (Pv0) obj2;
    }
}
