package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.measurement.i3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4936i3 {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b4.g f29336a = b4.g.a();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f29337b = new Object();

    private static boolean a(Context context) {
        return (context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0;
    }

    public static boolean b(Context context, Uri uri) {
        String authority = uri.getAuthority();
        boolean z7 = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            Log.e("PhenotypeClientHelper", authority + " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            return false;
        }
        if (f29336a.c()) {
            return ((Boolean) f29336a.b()).booleanValue();
        }
        synchronized (f29337b) {
            try {
                if (f29336a.c()) {
                    return ((Boolean) f29336a.b()).booleanValue();
                }
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", Build.VERSION.SDK_INT < 29 ? 0 : 268435456);
                    if (resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                    }
                    f29336a = b4.g.d(Boolean.valueOf(z7));
                    return ((Boolean) f29336a.b()).booleanValue();
                }
                if (a(context)) {
                    z7 = true;
                }
                f29336a = b4.g.d(Boolean.valueOf(z7));
                return ((Boolean) f29336a.b()).booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
