package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class F0 extends AbstractC5156n0 {

    /* renamed from: t, reason: collision with root package name */
    private final transient AbstractC5132j0 f29700t;

    /* renamed from: u, reason: collision with root package name */
    private final transient Object[] f29701u;

    /* renamed from: v, reason: collision with root package name */
    private final transient int f29702v;

    F0(AbstractC5132j0 abstractC5132j0, Object[] objArr, int i8, int i9) {
        this.f29700t = abstractC5132j0;
        this.f29701u = objArr;
        this.f29702v = i9;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5084b0
    final int b(Object[] objArr, int i8) {
        return e().b(objArr, 0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5084b0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f29700t.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return e().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5156n0
    final AbstractC5114g0 p() {
        return new E0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f29702v;
    }
}
