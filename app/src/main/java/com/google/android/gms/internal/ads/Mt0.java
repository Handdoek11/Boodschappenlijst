package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* loaded from: classes.dex */
final class Mt0 extends ThreadLocal {
    Mt0() {
    }

    protected static final Cipher a() {
        try {
            return (Cipher) Bt0.f13912b.a("AES/ECB/NoPadding");
        } catch (GeneralSecurityException e8) {
            throw new IllegalStateException(e8);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return a();
    }
}
