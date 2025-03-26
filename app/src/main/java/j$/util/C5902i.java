package j$.util;

import j$.util.List;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* renamed from: j$.util.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C5902i extends C5901h implements java.util.List, List {
    private static final long serialVersionUID = -7754090372962971524L;

    /* renamed from: c, reason: collision with root package name */
    final java.util.List f37383c;

    C5902i(java.util.List list) {
        super(list);
        this.f37383c = list;
    }

    C5902i(java.util.List list, Object obj) {
        super(list, obj);
        this.f37383c = list;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f37379b) {
            equals = this.f37383c.equals(obj);
        }
        return equals;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int hashCode;
        synchronized (this.f37379b) {
            hashCode = this.f37383c.hashCode();
        }
        return hashCode;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        Object obj;
        synchronized (this.f37379b) {
            obj = this.f37383c.get(i8);
        }
        return obj;
    }

    @Override // java.util.List
    public final Object set(int i8, Object obj) {
        Object obj2;
        synchronized (this.f37379b) {
            obj2 = this.f37383c.set(i8, obj);
        }
        return obj2;
    }

    @Override // java.util.List
    public final void add(int i8, Object obj) {
        synchronized (this.f37379b) {
            this.f37383c.add(i8, obj);
        }
    }

    @Override // java.util.List
    public final Object remove(int i8) {
        Object remove;
        synchronized (this.f37379b) {
            remove = this.f37383c.remove(i8);
        }
        return remove;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int indexOf;
        synchronized (this.f37379b) {
            indexOf = this.f37383c.indexOf(obj);
        }
        return indexOf;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int lastIndexOf;
        synchronized (this.f37379b) {
            lastIndexOf = this.f37383c.lastIndexOf(obj);
        }
        return lastIndexOf;
    }

    @Override // java.util.List
    public final boolean addAll(int i8, java.util.Collection collection) {
        boolean addAll;
        synchronized (this.f37379b) {
            addAll = this.f37383c.addAll(i8, collection);
        }
        return addAll;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.f37383c.listIterator();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i8) {
        return this.f37383c.listIterator(i8);
    }

    @Override // java.util.List
    public java.util.List subList(int i8, int i9) {
        C5902i c5902i;
        synchronized (this.f37379b) {
            c5902i = new C5902i(this.f37383c.subList(i8, i9), this.f37379b);
        }
        return c5902i;
    }

    @Override // java.util.List, j$.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        synchronized (this.f37379b) {
            java.util.List list = this.f37383c;
            if (list instanceof List) {
                ((List) list).replaceAll(unaryOperator);
            } else {
                List.CC.$default$replaceAll(list, unaryOperator);
            }
        }
    }

    @Override // java.util.List, j$.util.List
    public final void sort(Comparator comparator) {
        synchronized (this.f37379b) {
            AbstractC5897d.r(this.f37383c, comparator);
        }
    }

    private Object readResolve() {
        java.util.List list = this.f37383c;
        return list instanceof RandomAccess ? new C5904k(list) : this;
    }
}
