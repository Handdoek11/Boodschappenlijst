package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class Fv0 implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    private final ArrayDeque f15223o;

    /* renamed from: s, reason: collision with root package name */
    private AbstractC3106ju0 f15224s;

    /* synthetic */ Fv0(AbstractC3542nu0 abstractC3542nu0, Gv0 gv0) {
        if (!(abstractC3542nu0 instanceof Hv0)) {
            this.f15223o = null;
            this.f15224s = (AbstractC3106ju0) abstractC3542nu0;
            return;
        }
        Hv0 hv0 = (Hv0) abstractC3542nu0;
        ArrayDeque arrayDeque = new ArrayDeque(hv0.o());
        this.f15223o = arrayDeque;
        arrayDeque.push(hv0);
        this.f15224s = b(hv0.f15816u);
    }

    private final AbstractC3106ju0 b(AbstractC3542nu0 abstractC3542nu0) {
        while (abstractC3542nu0 instanceof Hv0) {
            Hv0 hv0 = (Hv0) abstractC3542nu0;
            this.f15223o.push(hv0);
            abstractC3542nu0 = hv0.f15816u;
        }
        return (AbstractC3106ju0) abstractC3542nu0;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final AbstractC3106ju0 next() {
        AbstractC3106ju0 abstractC3106ju0;
        AbstractC3106ju0 abstractC3106ju02 = this.f15224s;
        if (abstractC3106ju02 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.f15223o;
            abstractC3106ju0 = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            abstractC3106ju0 = b(((Hv0) this.f15223o.pop()).f15817v);
        } while (abstractC3106ju0.j() == 0);
        this.f15224s = abstractC3106ju0;
        return abstractC3106ju02;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15224s != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
