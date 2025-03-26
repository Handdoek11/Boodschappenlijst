package com.google.android.gms.internal.ads;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.mc0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3397mc0 {

    /* renamed from: c, reason: collision with root package name */
    protected static final byte[] f24539c = {61, 122, 18, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, 63, 50, 108, -113, -103, 74};

    /* renamed from: d, reason: collision with root package name */
    protected static final byte[] f24540d = {-110, -13, -34, 70, -83, 43, 97, 21, -44, 16, -54, -125, -28, -57, -125, -127, -7, 17, 102, -69, 116, -121, -79, 43, -13, 120, 58, 55, -29, -108, 95, 83};

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f24541a = f24540d;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f24542b = f24539c;

    public final boolean a(File file) {
        try {
            X509Certificate[][] a8 = E6.a(file.getAbsolutePath());
            if (a8.length != 1) {
                throw new GeneralSecurityException("APK has more than one signature.");
            }
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(a8[0][0].getEncoded());
            if (Arrays.equals(this.f24542b, digest)) {
                return true;
            }
            return !"user".equals(Build.TYPE) && Arrays.equals(this.f24541a, digest);
        } catch (zzaoo e8) {
            throw new GeneralSecurityException("Package is not signed", e8);
        } catch (IOException e9) {
            e = e9;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        } catch (RuntimeException e10) {
            e = e10;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        }
    }
}
