package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* loaded from: classes.dex */
final class On0 extends ThreadLocal {
    On0() {
    }

    protected static final Cipher a() {
        try {
            Cipher cipher = (Cipher) Bt0.f13912b.a("ChaCha20-Poly1305");
            if (Pn0.f(cipher)) {
                return cipher;
            }
            return null;
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return a();
    }
}
