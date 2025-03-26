package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.Wg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC1904Wg0 implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    int f19826o;

    /* renamed from: s, reason: collision with root package name */
    int f19827s;

    /* renamed from: t, reason: collision with root package name */
    int f19828t = -1;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ C2212bh0 f19829u;

    /* synthetic */ AbstractC1904Wg0(C2212bh0 c2212bh0, AbstractC2103ah0 abstractC2103ah0) {
        this.f19829u = c2212bh0;
        this.f19826o = c2212bh0.f20916v;
        this.f19827s = c2212bh0.i();
    }

    private final void b() {
        if (this.f19829u.f20916v != this.f19826o) {
            throw new ConcurrentModificationException();
        }
    }

    abstract Object a(int i8);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19827s >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        b();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i8 = this.f19827s;
        this.f19828t = i8;
        Object a8 = a(i8);
        this.f19827s = this.f19829u.j(this.f19827s);
        return a8;
    }

    @Override // java.util.Iterator
    public final void remove() {
        b();
        AbstractC1762Sf0.m(this.f19828t >= 0, "no calls to next() since the last call to remove()");
        this.f19826o += 32;
        int i8 = this.f19828t;
        C2212bh0 c2212bh0 = this.f19829u;
        c2212bh0.remove(C2212bh0.k(c2212bh0, i8));
        this.f19827s--;
        this.f19828t = -1;
    }
}
