package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.ml0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3415ml0 {
    public static AbstractC2763gl0 a(byte[] bArr) {
        try {
            C4082ss0 e02 = C4082ss0.e0(bArr, Eu0.a());
            C3423mp0 c8 = C3423mp0.c();
            Lp0 a8 = Lp0.a(e02);
            return !c8.k(a8) ? new No0(a8) : c8.b(a8);
        } catch (IOException e8) {
            throw new GeneralSecurityException("Failed to parse proto", e8);
        }
    }

    public static byte[] b(AbstractC2763gl0 abstractC2763gl0) {
        return ((Lp0) C3423mp0.c().e(abstractC2763gl0, Lp0.class)).c().m();
    }
}
