package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class E4 implements F4 {
    E4() {
    }

    private static A4 c(Object obj, long j8) {
        return (A4) B5.B(obj, j8);
    }

    @Override // com.google.android.gms.internal.measurement.F4
    public final void a(Object obj, long j8) {
        c(obj, j8).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.F4
    public final void b(Object obj, Object obj2, long j8) {
        A4 c8 = c(obj, j8);
        A4 c9 = c(obj2, j8);
        int size = c8.size();
        int size2 = c9.size();
        if (size > 0 && size2 > 0) {
            if (!c8.a()) {
                c8 = c8.m(size2 + size);
            }
            c8.addAll(c9);
        }
        if (size > 0) {
            c9 = c8;
        }
        B5.j(obj, j8, c9);
    }
}
