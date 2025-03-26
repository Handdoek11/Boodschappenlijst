package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class Wk0 {
    public static final AbstractC2763gl0 a(AbstractC2763gl0 abstractC2763gl0) {
        return abstractC2763gl0 != null ? abstractC2763gl0 : AbstractC3415ml0.a(b(null).m());
    }

    static final C4082ss0 b(AbstractC2763gl0 abstractC2763gl0) {
        try {
            return ((Lp0) C3423mp0.c().e(null, Lp0.class)).c();
        } catch (GeneralSecurityException e8) {
            throw new zzgnt("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat("null"), e8);
        }
    }
}
