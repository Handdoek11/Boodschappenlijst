package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* loaded from: classes2.dex */
final class M0 extends AbstractC5156n0 {

    /* renamed from: t, reason: collision with root package name */
    final transient Object f29785t;

    M0(Object obj) {
        obj.getClass();
        this.f29785t = obj;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5084b0
    final int b(Object[] objArr, int i8) {
        objArr[0] = this.f29785t;
        return 1;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5084b0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f29785t.equals(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5156n0, com.google.android.gms.internal.play_billing.AbstractC5084b0
    public final AbstractC5114g0 e() {
        return AbstractC5114g0.t(this.f29785t);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5156n0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f29785t.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new C5179r0(this.f29785t);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f29785t.toString() + "]";
    }
}
