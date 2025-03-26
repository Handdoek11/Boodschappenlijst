package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;

/* loaded from: classes.dex */
public final class S9 {

    /* renamed from: a, reason: collision with root package name */
    private NetworkCapabilities f18840a;

    S9(ConnectivityManager connectivityManager) {
        if (connectivityManager == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        try {
            connectivityManager.registerDefaultNetworkCallback(new R9(this));
        } catch (RuntimeException unused) {
            synchronized (S9.class) {
                this.f18840a = null;
            }
        }
    }

    public static S9 c(Context context) {
        if (context != null) {
            return new S9((ConnectivityManager) context.getSystemService("connectivity"));
        }
        return null;
    }

    public final long a() {
        synchronized (S9.class) {
            try {
                NetworkCapabilities networkCapabilities = this.f18840a;
                if (networkCapabilities != null) {
                    if (networkCapabilities.hasTransport(4)) {
                        return 2L;
                    }
                    if (this.f18840a.hasTransport(1)) {
                        return 1L;
                    }
                    if (this.f18840a.hasTransport(0)) {
                        return 0L;
                    }
                }
                return -1L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final NetworkCapabilities b() {
        return this.f18840a;
    }
}
