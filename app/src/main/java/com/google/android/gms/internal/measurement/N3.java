package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class N3 extends P3 {

    /* renamed from: o, reason: collision with root package name */
    private int f28958o = 0;

    /* renamed from: s, reason: collision with root package name */
    private final int f28959s;

    /* renamed from: t, reason: collision with root package name */
    private final /* synthetic */ K3 f28960t;

    N3(K3 k32) {
        this.f28960t = k32;
        this.f28959s = k32.s();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f28958o < this.f28959s;
    }

    @Override // com.google.android.gms.internal.measurement.Q3
    public final byte zza() {
        int i8 = this.f28958o;
        if (i8 >= this.f28959s) {
            throw new NoSuchElementException();
        }
        this.f28958o = i8 + 1;
        return this.f28960t.r(i8);
    }
}
