package com.google.android.gms.internal.wearable;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class J extends K {

    /* renamed from: o, reason: collision with root package name */
    private int f30057o = 0;

    /* renamed from: s, reason: collision with root package name */
    private final int f30058s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ Q f30059t;

    J(Q q8) {
        this.f30059t = q8;
        this.f30058s = q8.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f30057o < this.f30058s;
    }

    @Override // com.google.android.gms.internal.wearable.M
    public final byte zza() {
        int i8 = this.f30057o;
        if (i8 >= this.f30058s) {
            throw new NoSuchElementException();
        }
        this.f30057o = i8 + 1;
        return this.f30059t.c(i8);
    }
}
