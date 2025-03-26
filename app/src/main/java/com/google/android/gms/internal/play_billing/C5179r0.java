package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.play_billing.r0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5179r0 extends P0 {

    /* renamed from: o, reason: collision with root package name */
    private final Object f29980o;

    /* renamed from: s, reason: collision with root package name */
    private boolean f29981s;

    C5179r0(Object obj) {
        this.f29980o = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f29981s;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f29981s) {
            throw new NoSuchElementException();
        }
        this.f29981s = true;
        return this.f29980o;
    }
}
