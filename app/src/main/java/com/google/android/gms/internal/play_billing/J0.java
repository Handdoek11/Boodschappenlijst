package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* loaded from: classes2.dex */
final class J0 extends AbstractC5156n0 {

    /* renamed from: y, reason: collision with root package name */
    private static final Object[] f29770y;

    /* renamed from: z, reason: collision with root package name */
    static final J0 f29771z;

    /* renamed from: t, reason: collision with root package name */
    final transient Object[] f29772t;

    /* renamed from: u, reason: collision with root package name */
    private final transient int f29773u;

    /* renamed from: v, reason: collision with root package name */
    final transient Object[] f29774v;

    /* renamed from: w, reason: collision with root package name */
    private final transient int f29775w;

    /* renamed from: x, reason: collision with root package name */
    private final transient int f29776x;

    static {
        Object[] objArr = new Object[0];
        f29770y = objArr;
        f29771z = new J0(objArr, 0, objArr, 0, 0);
    }

    J0(Object[] objArr, int i8, Object[] objArr2, int i9, int i10) {
        this.f29772t = objArr;
        this.f29773u = i8;
        this.f29774v = objArr2;
        this.f29775w = i9;
        this.f29776x = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5084b0
    final int b(Object[] objArr, int i8) {
        System.arraycopy(this.f29772t, 0, objArr, 0, this.f29776x);
        return this.f29776x;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5084b0
    final int c() {
        return this.f29776x;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5084b0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f29774v;
            if (objArr.length != 0) {
                int a8 = Y.a(obj.hashCode());
                while (true) {
                    int i8 = a8 & this.f29775w;
                    Object obj2 = objArr[i8];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    a8 = i8 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5084b0
    final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5156n0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f29773u;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return e().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5084b0
    final Object[] n() {
        return this.f29772t;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5156n0
    final AbstractC5114g0 p() {
        return AbstractC5114g0.q(this.f29772t, this.f29776x);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5156n0
    final boolean r() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f29776x;
    }
}
