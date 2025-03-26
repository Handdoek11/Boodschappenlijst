package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import q.C6397a;

/* renamed from: com.google.android.gms.internal.measurement.k3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4954k3 {

    /* renamed from: a, reason: collision with root package name */
    private static final C6397a f29382a = new C6397a();

    public static synchronized Uri a(String str) {
        Uri uri;
        synchronized (AbstractC4954k3.class) {
            C6397a c6397a = f29382a;
            uri = (Uri) c6397a.get(str);
            if (uri == null) {
                uri = Uri.parse("content://com.google.android.gms.phenotype/" + Uri.encode(str));
                c6397a.put(str, uri);
            }
        }
        return uri;
    }

    public static String b(Context context, String str) {
        if (str.contains("#")) {
            throw new IllegalArgumentException("The passed in package cannot already have a subpackage: " + str);
        }
        return str + "#" + context.getPackageName();
    }

    public static boolean c(String str, String str2) {
        if (str.equals("eng") || str.equals("userdebug")) {
            return str2.contains("dev-keys") || str2.contains("test-keys");
        }
        return false;
    }
}
