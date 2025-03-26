package com.headcode.ourgroceries.android;

import android.content.Context;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.headcode.ourgroceries.android.t2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5648t2 {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f35020a = new HashMap();

    public static void a(String str, String str2) {
        f35020a.put(str, str2);
    }

    public static void b() {
        f35020a.clear();
    }

    public static com.bumptech.glide.j c(Context context, String str) {
        com.bumptech.glide.k t7 = com.bumptech.glide.b.t(context);
        File g8 = AbstractC5662v2.g(context, str);
        if (g8 != null && g8.exists()) {
            return t7.s(g8);
        }
        String str2 = (String) f35020a.get(str);
        return str2 != null ? t7.t(str2) : t7.t(d(context, str));
    }

    private static String d(Context context, String str) {
        return AbstractRunnableC5500a.a(context) + "photo/" + str;
    }
}
