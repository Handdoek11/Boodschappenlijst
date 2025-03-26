package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* loaded from: classes2.dex */
final class G0 extends AbstractC5156n0 {

    /* renamed from: t, reason: collision with root package name */
    private final transient AbstractC5132j0 f29703t;

    /* renamed from: u, reason: collision with root package name */
    private final transient AbstractC5114g0 f29704u;

    G0(AbstractC5132j0 abstractC5132j0, AbstractC5114g0 abstractC5114g0) {
        this.f29703t = abstractC5132j0;
        this.f29704u = abstractC5114g0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5084b0
    final int b(Object[] objArr, int i8) {
        return this.f29704u.b(objArr, 0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5084b0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f29703t.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5156n0, com.google.android.gms.internal.play_billing.AbstractC5084b0
    public final AbstractC5114g0 e() {
        return this.f29704u;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f29704u.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f29703t.size();
    }
}
