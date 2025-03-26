package com.google.android.gms.internal.ads;

import java.security.Provider;
import javax.crypto.Cipher;

/* loaded from: classes.dex */
public final class Ct0 implements Jt0 {
    @Override // com.google.android.gms.internal.ads.Jt0
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
