package com.google.android.gms.internal.wearable;

/* loaded from: classes2.dex */
abstract class K implements M {
    K() {
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return Byte.valueOf(zza());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
