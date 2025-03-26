package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class LA0 {

    /* renamed from: a, reason: collision with root package name */
    private final YH0 f16787a;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray f16788b;

    public LA0(YH0 yh0, SparseArray sparseArray) {
        this.f16787a = yh0;
        SparseArray sparseArray2 = new SparseArray(yh0.b());
        for (int i8 = 0; i8 < yh0.b(); i8++) {
            int a8 = yh0.a(i8);
            KA0 ka0 = (KA0) sparseArray.get(a8);
            ka0.getClass();
            sparseArray2.append(a8, ka0);
        }
        this.f16788b = sparseArray2;
    }

    public final int a(int i8) {
        return this.f16787a.a(i8);
    }

    public final int b() {
        return this.f16787a.b();
    }

    public final KA0 c(int i8) {
        KA0 ka0 = (KA0) this.f16788b.get(i8);
        ka0.getClass();
        return ka0;
    }

    public final boolean d(int i8) {
        return this.f16787a.c(i8);
    }
}
