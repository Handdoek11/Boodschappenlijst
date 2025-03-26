package com.google.android.gms.internal.ads;

import java.security.cert.X509Certificate;

/* loaded from: classes.dex */
final class B6 extends C6 {

    /* renamed from: s, reason: collision with root package name */
    private final byte[] f13741s;

    public B6(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f13741s = bArr;
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() {
        return this.f13741s;
    }
}
