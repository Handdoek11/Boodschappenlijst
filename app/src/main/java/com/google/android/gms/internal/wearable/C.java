package com.google.android.gms.internal.wearable;

import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class C implements I0 {
    protected int zza = 0;

    protected static void c(Iterable iterable, List list) {
        A.f(iterable, list);
    }

    abstract int a(U0 u02);

    public final byte[] d() {
        try {
            int J7 = J();
            byte[] bArr = new byte[J7];
            V v7 = new V(bArr, 0, J7);
            b(v7);
            v7.b();
            return bArr;
        } catch (IOException e8) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e8);
        }
    }
}
