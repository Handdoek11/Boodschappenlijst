package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.yt0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4738yt0 implements InterfaceC4847zt0 {

    /* renamed from: a, reason: collision with root package name */
    private final Jt0 f28221a;

    @Override // com.google.android.gms.internal.ads.InterfaceC4847zt0
    public final Object n(String str) {
        Iterator it = Bt0.b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.f28221a.a(str, (Provider) it.next());
            } catch (Exception e8) {
                if (exc == null) {
                    exc = e8;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
