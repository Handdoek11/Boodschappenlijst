package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class Tq0 implements InterfaceC2990iq0 {
    public Tq0(C3643oq0 c3643oq0) {
        if (!AbstractC4183to0.a(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
    }
}
