package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.Provider;

/* loaded from: classes.dex */
public final class Ht0 implements Jt0 {
    @Override // com.google.android.gms.internal.ads.Jt0
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }
}
