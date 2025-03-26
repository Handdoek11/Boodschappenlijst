package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class Z60 {
    public Z60() {
        try {
            AbstractC3633ol0.a();
        } catch (GeneralSecurityException e8) {
            AbstractC0608p0.k("Failed to Configure Aead. ".concat(e8.toString()));
            C2.v.s().x(e8, "CryptoUtils.registerAead");
        }
    }

    public static final String a() {
        byte[] bArr;
        try {
            C2328cl0 b8 = C2328cl0.b(Wk0.a(C2988ip0.b().a("AES128_GCM")));
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Lk0.b(b8, Kk0.b(byteArrayOutputStream));
                bArr = byteArrayOutputStream.toByteArray();
            } catch (IOException unused) {
                throw new GeneralSecurityException("Serialize keyset failed");
            }
        } catch (GeneralSecurityException e8) {
            AbstractC0608p0.k("Failed to generate key".concat(e8.toString()));
            C2.v.s().x(e8, "CryptoUtils.generateKey");
            bArr = new byte[0];
        }
        return Base64.encodeToString(bArr, 11);
    }

    public static final String b(byte[] bArr, byte[] bArr2, String str, BN bn) {
        C2328cl0 c8;
        if (str != null && (c8 = c(str)) != null) {
            try {
                byte[] a8 = ((Ik0) c8.d(Op0.d(), Ik0.class)).a(bArr, bArr2);
                bn.b().put("ds", "1");
                return new String(a8, "UTF-8");
            } catch (UnsupportedEncodingException | UnsupportedOperationException | GeneralSecurityException e8) {
                AbstractC0608p0.k("Failed to decrypt ".concat(e8.toString()));
                C2.v.s().x(e8, "CryptoUtils.decrypt");
                bn.b().put("dsf", e8.toString());
            }
        }
        return null;
    }

    private static final C2328cl0 c(String str) {
        try {
            try {
                return Lk0.a(Jk0.b(Base64.decode(str, 11)));
            } catch (IOException unused) {
                throw new GeneralSecurityException("Parse keyset failed");
            }
        } catch (GeneralSecurityException e8) {
            AbstractC0608p0.k("Failed to get keysethandle".concat(e8.toString()));
            C2.v.s().x(e8, "CryptoUtils.getHandle");
            return null;
        }
    }
}
