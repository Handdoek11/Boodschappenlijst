package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* renamed from: com.google.android.gms.internal.ads.nt0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3540nt0 extends ThreadLocal {
    C3540nt0() {
    }

    protected static final Cipher a() {
        try {
            return (Cipher) Bt0.f13912b.a("AES/CTR/NoPadding");
        } catch (GeneralSecurityException e8) {
            throw new IllegalStateException(e8);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return a();
    }
}
