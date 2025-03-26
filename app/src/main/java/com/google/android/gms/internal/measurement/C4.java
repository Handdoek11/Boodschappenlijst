package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class C4 implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    private Iterator f28836o;

    public C4(Iterator it) {
        this.f28836o = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f28836o.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f28836o.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f28836o.remove();
    }
}
