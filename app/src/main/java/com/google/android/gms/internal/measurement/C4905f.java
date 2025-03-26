package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4905f implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ Iterator f29287o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ Iterator f29288s;

    C4905f(C4914g c4914g, Iterator it, Iterator it2) {
        this.f29287o = it;
        this.f29288s = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f29287o.hasNext()) {
            return true;
        }
        return this.f29288s.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (this.f29287o.hasNext()) {
            return new C5029u(((Integer) this.f29287o.next()).toString());
        }
        if (this.f29288s.hasNext()) {
            return new C5029u((String) this.f29288s.next());
        }
        throw new NoSuchElementException();
    }
}
