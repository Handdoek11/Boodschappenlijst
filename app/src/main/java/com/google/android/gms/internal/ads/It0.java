package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.security.Signature;

/* loaded from: classes.dex */
public final class It0 implements Jt0 {
    @Override // com.google.android.gms.internal.ads.Jt0
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }
}
