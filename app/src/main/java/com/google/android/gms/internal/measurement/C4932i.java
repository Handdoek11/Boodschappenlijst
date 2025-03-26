package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4932i implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    private int f29326o = 0;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ C4914g f29327s;

    C4932i(C4914g c4914g) {
        this.f29327s = c4914g;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f29326o < this.f29327s.t();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (this.f29326o < this.f29327s.t()) {
            C4914g c4914g = this.f29327s;
            int i8 = this.f29326o;
            this.f29326o = i8 + 1;
            return c4914g.q(i8);
        }
        throw new NoSuchElementException("Out of bounds index: " + this.f29326o);
    }
}
