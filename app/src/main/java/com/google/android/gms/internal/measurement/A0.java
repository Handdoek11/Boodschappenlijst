package com.google.android.gms.internal.measurement;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class A0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f28789a;

    static {
        f28789a = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }

    public static PendingIntent a(Context context, int i8, Intent intent, int i9) {
        return PendingIntent.getBroadcast(context, 0, intent, i9);
    }
}
