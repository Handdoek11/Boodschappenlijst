package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
abstract class E3 extends AbstractList implements A4 {

    /* renamed from: o, reason: collision with root package name */
    private boolean f28860o;

    E3(boolean z7) {
        this.f28860o = z7;
    }

    @Override // com.google.android.gms.internal.measurement.A4
    public final boolean a() {
        return this.f28860o;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        b();
        return super.addAll(collection);
    }

    protected final void b() {
        if (!this.f28860o) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        b();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i8 = 0; i8 < size; i8++) {
            if (!get(i8).equals(list.get(i8))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i8 = 1;
        for (int i9 = 0; i9 < size; i9++) {
            i8 = (i8 * 31) + get(i9).hashCode();
        }
        return i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public abstract Object remove(int i8);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        b();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        b();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection collection) {
        b();
        return super.retainAll(collection);
    }

    @Override // com.google.android.gms.internal.measurement.A4
    public final void zzb() {
        if (this.f28860o) {
            this.f28860o = false;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i8, Collection collection) {
        b();
        return super.addAll(i8, collection);
    }
}
