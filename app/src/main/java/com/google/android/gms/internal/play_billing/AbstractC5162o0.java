package com.google.android.gms.internal.play_billing;

import j$.util.SortedSet;
import java.util.Comparator;
import java.util.NavigableSet;

/* renamed from: com.google.android.gms.internal.play_billing.o0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5162o0 extends AbstractC5156n0 implements NavigableSet, N0, SortedSet {

    /* renamed from: t, reason: collision with root package name */
    final transient Comparator f29957t;

    /* renamed from: u, reason: collision with root package name */
    transient AbstractC5162o0 f29958u;

    AbstractC5162o0(Comparator comparator) {
        this.f29957t = comparator;
    }

    static K0 C(Comparator comparator) {
        if (C5203v0.f30017o.equals(comparator)) {
            return K0.f29778w;
        }
        int i8 = AbstractC5114g0.f29907t;
        return new K0(D0.f29684w, comparator);
    }

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet, com.google.android.gms.internal.play_billing.N0
    public final Comparator comparator() {
        return this.f29957t;
    }

    @Override // java.util.NavigableSet
    public final /* bridge */ /* synthetic */ NavigableSet descendingSet() {
        AbstractC5162o0 abstractC5162o0 = this.f29958u;
        if (abstractC5162o0 != null) {
            return abstractC5162o0;
        }
        AbstractC5162o0 t7 = t();
        this.f29958u = t7;
        t7.f29958u = this;
        return t7;
    }

    public abstract Object first();

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ java.util.SortedSet headSet(Object obj) {
        obj.getClass();
        return v(obj, false);
    }

    public abstract Object last();

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ java.util.SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    abstract AbstractC5162o0 t();

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ java.util.SortedSet tailSet(Object obj) {
        obj.getClass();
        return y(obj, true);
    }

    abstract AbstractC5162o0 v(Object obj, boolean z7);

    @Override // java.util.NavigableSet
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final AbstractC5162o0 subSet(Object obj, boolean z7, Object obj2, boolean z8) {
        obj.getClass();
        obj2.getClass();
        if (this.f29957t.compare(obj, obj2) <= 0) {
            return x(obj, z7, obj2, z8);
        }
        throw new IllegalArgumentException();
    }

    abstract AbstractC5162o0 x(Object obj, boolean z7, Object obj2, boolean z8);

    abstract AbstractC5162o0 y(Object obj, boolean z7);

    @Override // java.util.NavigableSet
    public final /* synthetic */ NavigableSet headSet(Object obj, boolean z7) {
        obj.getClass();
        return v(obj, z7);
    }

    @Override // java.util.NavigableSet
    public final /* synthetic */ NavigableSet tailSet(Object obj, boolean z7) {
        obj.getClass();
        return y(obj, z7);
    }
}
