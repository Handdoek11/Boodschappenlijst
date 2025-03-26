package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.sl0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4068sl0 implements Ik0 {

    /* renamed from: a, reason: collision with root package name */
    private final Ip0 f26730a;

    /* synthetic */ C4068sl0(Ip0 ip0, AbstractC4177tl0 abstractC4177tl0) {
        this.f26730a = ip0;
        if (ip0.g()) {
            So0 a8 = C2880hp0.b().a();
            Wo0 a9 = Zo0.a(ip0);
            a8.a(a9, "aead", "encrypt");
            a8.a(a9, "aead", "decrypt");
        }
    }

    @Override // com.google.android.gms.internal.ads.Ik0
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 5) {
            for (Gp0 gp0 : this.f26730a.f(Arrays.copyOf(bArr, 5))) {
                try {
                    byte[] a8 = ((Ik0) gp0.d()).a(bArr, bArr2);
                    gp0.a();
                    return a8;
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        for (Gp0 gp02 : this.f26730a.f(Nk0.f17583a)) {
            try {
                byte[] a9 = ((Ik0) gp02.d()).a(bArr, bArr2);
                gp02.a();
                return a9;
            } catch (GeneralSecurityException unused2) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
