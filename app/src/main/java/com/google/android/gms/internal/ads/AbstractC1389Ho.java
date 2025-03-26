package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: com.google.android.gms.internal.ads.Ho, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1389Ho extends ContextWrapper {
    public static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }
}
