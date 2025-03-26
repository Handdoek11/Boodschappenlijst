package com.google.android.gms.internal.ads;

import android.os.Looper;

/* renamed from: com.google.android.gms.internal.ads.Hr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC1392Hr implements Runnable {
    RunnableC1392Hr(C1463Jr c1463Jr) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.myLooper().quit();
    }
}
