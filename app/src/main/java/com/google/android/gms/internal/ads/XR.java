package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class XR implements RC {
    protected XR() {
    }

    @Override // com.google.android.gms.internal.ads.RC
    public final long a() {
        return System.nanoTime();
    }

    @Override // com.google.android.gms.internal.ads.RC
    public final InterfaceC2068aI b(Looper looper, Handler.Callback callback) {
        return new AT(new Handler(looper, callback));
    }

    @Override // com.google.android.gms.internal.ads.RC
    public final long zza() {
        return System.currentTimeMillis();
    }

    @Override // com.google.android.gms.internal.ads.RC
    public final long zzb() {
        return SystemClock.elapsedRealtime();
    }
}
