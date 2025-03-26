package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.bc0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC2202bc0 implements Runnable {
    RunnableC2202bc0() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C2310cc0.f21244k != null) {
            C2310cc0.f21244k.post(C2310cc0.f21245l);
            C2310cc0.f21244k.postDelayed(C2310cc0.f21246m, 200L);
        }
    }
}
