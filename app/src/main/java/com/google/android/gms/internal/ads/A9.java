package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class A9 {
    public static final String a(Context context, String str, boolean z7) {
        try {
            M8 b02 = N8.b0();
            b02.D(str);
            b02.C("1.671910402");
            b02.E(context.getPackageName());
            b02.F(System.currentTimeMillis() / 1000);
            try {
                b02.G(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                b02.G(-1L);
            }
            T8 a8 = AbstractC3027j9.a(((N8) b02.x()).m(), null);
            a8.F(5);
            a8.E(2);
            return Base64.encodeToString(((U8) a8.x()).m(), 11);
        } catch (UnsupportedEncodingException | GeneralSecurityException unused2) {
            return Integer.toString(7);
        }
    }
}
