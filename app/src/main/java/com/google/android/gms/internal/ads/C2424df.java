package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.google.android.gms.internal.ads.df, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2424df {
    public static final SharedPreferences a(Context context) {
        try {
            return context.getSharedPreferences("google_ads_flags", 0);
        } catch (IllegalStateException e8) {
            H2.p.h("", e8);
            return null;
        }
    }
}
