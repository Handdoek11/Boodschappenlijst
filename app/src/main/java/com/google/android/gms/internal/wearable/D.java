package com.google.android.gms.internal.wearable;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
abstract class D extends AbstractList implements InterfaceC5267r0 {

    /* renamed from: o, reason: collision with root package name */
    private boolean f30047o;

    D(boolean z7) {
        this.f30047o = z7;
    }

    @Override // com.google.android.gms.internal.wearable.InterfaceC5267r0
    public final boolean a() {
        return this.f30047o;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i8, Collection collection) {
        b();
        return super.addAll(i8, collection);
    }

    protected final void b() {
        if (!this.f30047o) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
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
    public final boolean remove(Object obj) {
        b();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        b();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        b();
        return super.retainAll(collection);
    }

    @Override // com.google.android.gms.internal.wearable.InterfaceC5267r0
    public final void zzb() {
        if (this.f30047o) {
            this.f30047o = false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        b();
        return super.addAll(collection);
    }
}
