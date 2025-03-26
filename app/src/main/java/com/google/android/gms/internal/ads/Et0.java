package com.google.android.gms.internal.ads;

import java.security.KeyFactory;
import java.security.Provider;

/* loaded from: classes.dex */
public final class Et0 implements Jt0 {
    @Override // com.google.android.gms.internal.ads.Jt0
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}
