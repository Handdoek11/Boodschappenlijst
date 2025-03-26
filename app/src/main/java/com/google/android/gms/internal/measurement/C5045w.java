package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5045w implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    private int f29609o = 0;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ C5029u f29610s;

    C5045w(C5029u c5029u) {
        this.f29610s = c5029u;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f29609o < this.f29610s.f29582o.length();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (this.f29609o >= this.f29610s.f29582o.length()) {
            throw new NoSuchElementException();
        }
        String str = this.f29610s.f29582o;
        int i8 = this.f29609o;
        this.f29609o = i8 + 1;
        return new C5029u(String.valueOf(str.charAt(i8)));
    }
}
