package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
abstract class P3 implements Q3 {
    P3() {
    }

    @Override // java.util.Iterator
    public /* synthetic */ Object next() {
        return Byte.valueOf(zza());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
