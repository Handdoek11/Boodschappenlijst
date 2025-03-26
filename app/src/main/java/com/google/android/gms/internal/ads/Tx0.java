package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes.dex */
final class Tx0 implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    int f19200o = 0;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ Ux0 f19201s;

    Tx0(Ux0 ux0) {
        this.f19201s = ux0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19200o < this.f19201s.f19486o.size() || this.f19201s.f19487s.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f19200o >= this.f19201s.f19486o.size()) {
            Ux0 ux0 = this.f19201s;
            ux0.f19486o.add(ux0.f19487s.next());
            return next();
        }
        Ux0 ux02 = this.f19201s;
        int i8 = this.f19200o;
        this.f19200o = i8 + 1;
        return ux02.f19486o.get(i8);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
