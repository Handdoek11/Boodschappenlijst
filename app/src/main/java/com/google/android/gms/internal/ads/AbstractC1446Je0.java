package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Je0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1446Je0 {
    public static InterfaceC1410Ie0 a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new C1481Ke0(new C2099af0(context));
    }
}
