package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.wt0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4520wt0 implements InterfaceC4847zt0 {

    /* renamed from: a, reason: collision with root package name */
    private final Jt0 f27579a;

    @Override // com.google.android.gms.internal.ads.InterfaceC4847zt0
    public final Object n(String str) {
        Iterator it = Bt0.b("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
        while (it.hasNext()) {
            try {
                return this.f27579a.a(str, (Provider) it.next());
            } catch (Exception unused) {
            }
        }
        return this.f27579a.a(str, null);
    }
}
