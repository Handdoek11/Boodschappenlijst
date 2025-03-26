package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* renamed from: com.google.android.gms.internal.ads.ri0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3953ri0 extends C3845qi0 implements SortedSet {
    C3953ri0(SortedSet sortedSet, InterfaceC1797Tf0 interfaceC1797Tf0) {
        super(sortedSet, interfaceC1797Tf0);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f18521o).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f18521o.iterator();
        it.getClass();
        InterfaceC1797Tf0 interfaceC1797Tf0 = this.f18522s;
        interfaceC1797Tf0.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (interfaceC1797Tf0.a(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new C3953ri0(((SortedSet) this.f18521o).headSet(obj), this.f18522s);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.f18521o;
        while (true) {
            InterfaceC1797Tf0 interfaceC1797Tf0 = this.f18522s;
            Object last = sortedSet.last();
            if (interfaceC1797Tf0.a(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new C3953ri0(((SortedSet) this.f18521o).subSet(obj, obj2), this.f18522s);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new C3953ri0(((SortedSet) this.f18521o).tailSet(obj), this.f18522s);
    }
}
