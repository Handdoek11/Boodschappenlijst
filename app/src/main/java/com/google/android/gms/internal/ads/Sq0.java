package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class Sq0 implements InterfaceC2990iq0 {
    public Sq0(Zp0 zp0) {
        if (!AbstractC4183to0.a(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
    }
}
