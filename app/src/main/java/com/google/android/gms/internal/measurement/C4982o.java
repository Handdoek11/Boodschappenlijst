package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4982o implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ Iterator f29483o;

    C4982o(Iterator it) {
        this.f29483o = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f29483o.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return new C5029u((String) this.f29483o.next());
    }
}
