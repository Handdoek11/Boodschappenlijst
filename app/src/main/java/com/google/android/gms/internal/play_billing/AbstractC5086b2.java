package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.play_billing.b2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5086b2 implements InterfaceC5123h3 {
    protected int zza = 0;

    protected static void c(Iterable iterable, List list) {
        AbstractC5080a2.h(iterable, list);
    }

    abstract int a(InterfaceC5188s3 interfaceC5188s3);

    public final byte[] d() {
        try {
            int i8 = i();
            byte[] bArr = new byte[i8];
            C5199u2 c5199u2 = new C5199u2(bArr, 0, i8);
            b(c5199u2);
            c5199u2.b();
            return bArr;
        } catch (IOException e8) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e8);
        }
    }
}
