package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public abstract class C3 implements W4 {
    protected int zza = 0;

    protected static void e(Iterable iterable, List list) {
        D3.l(iterable, list);
    }

    abstract int d(InterfaceC4964l5 interfaceC4964l5);

    abstract int g();

    abstract void i(int i8);

    public final byte[] j() {
        try {
            byte[] bArr = new byte[h()];
            zzjc D7 = zzjc.D(bArr);
            b(D7);
            D7.E();
            return bArr;
        } catch (IOException e8) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e8);
        }
    }
}
