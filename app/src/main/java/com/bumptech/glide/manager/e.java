package com.bumptech.glide.manager;

import android.content.Context;
import android.util.Log;
import com.bumptech.glide.manager.b;
import o0.AbstractC6278a;

/* loaded from: classes.dex */
public class e implements c {
    @Override // com.bumptech.glide.manager.c
    public b a(Context context, b.a aVar) {
        boolean z7 = AbstractC6278a.a(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z7 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        return z7 ? new d(context, aVar) : new m();
    }
}
