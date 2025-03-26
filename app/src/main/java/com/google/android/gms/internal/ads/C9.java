package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class C9 implements InterfaceC3399md0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3397mc0 f14112a;

    C9(E9 e9, C3397mc0 c3397mc0) {
        this.f14112a = c3397mc0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3399md0
    public final boolean a(File file) {
        try {
            return this.f14112a.a(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
