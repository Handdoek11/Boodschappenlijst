package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.Ch0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1200Ch0 extends AbstractC4825zi0 {

    /* renamed from: o, reason: collision with root package name */
    private final Object f14212o;

    /* renamed from: s, reason: collision with root package name */
    private boolean f14213s;

    C1200Ch0(Object obj) {
        this.f14212o = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f14213s;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f14213s) {
            throw new NoSuchElementException();
        }
        this.f14213s = true;
        return this.f14212o;
    }
}
