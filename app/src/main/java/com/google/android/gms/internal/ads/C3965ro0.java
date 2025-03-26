package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* renamed from: com.google.android.gms.internal.ads.ro0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3965ro0 extends ThreadLocal {
    C3965ro0() {
    }

    protected static final Cipher a() {
        try {
            Cipher cipher = (Cipher) Bt0.f13912b.a("AES/GCM-SIV/NoPadding");
            if (C4074so0.d(cipher)) {
                return cipher;
            }
            return null;
        } catch (GeneralSecurityException e8) {
            throw new IllegalStateException(e8);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return a();
    }
}
