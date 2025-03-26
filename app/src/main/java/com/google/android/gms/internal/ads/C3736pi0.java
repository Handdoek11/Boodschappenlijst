package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.pi0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3736pi0 extends AbstractC4171ti0 {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ Set f25491o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ Set f25492s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3736pi0(Set set, Set set2) {
        super(null);
        this.f25491o = set;
        this.f25492s = set2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC4825zi0 iterator() {
        return new C3627oi0(this, this.f25491o, this.f25492s);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f25491o.contains(obj) && this.f25492s.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f25491o.containsAll(collection) && this.f25492s.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.f25492s, this.f25491o);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f25491o.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            if (this.f25492s.contains(it.next())) {
                i8++;
            }
        }
        return i8;
    }
}
