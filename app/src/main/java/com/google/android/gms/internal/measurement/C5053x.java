package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5053x implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    private int f29629o = 0;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ C5029u f29630s;

    C5053x(C5029u c5029u) {
        this.f29630s = c5029u;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f29629o < this.f29630s.f29582o.length();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (this.f29629o >= this.f29630s.f29582o.length()) {
            throw new NoSuchElementException();
        }
        int i8 = this.f29629o;
        this.f29629o = i8 + 1;
        return new C5029u(String.valueOf(i8));
    }
}
