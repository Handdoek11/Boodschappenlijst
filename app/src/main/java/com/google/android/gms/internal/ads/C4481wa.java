package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;

/* renamed from: com.google.android.gms.internal.ads.wa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4481wa implements AppOpsManager$OnOpActiveChangedListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C4699ya f27507a;

    C4481wa(C4699ya c4699ya) {
        this.f27507a = c4699ya;
    }

    public final void onOpActiveChanged(String str, int i8, String str2, boolean z7) {
        if (z7) {
            this.f27507a.f28143a = System.currentTimeMillis();
            this.f27507a.f28146d = true;
            return;
        }
        C4699ya c4699ya = this.f27507a;
        long currentTimeMillis = System.currentTimeMillis();
        if (c4699ya.f28144b > 0) {
            C4699ya c4699ya2 = this.f27507a;
            if (currentTimeMillis >= c4699ya2.f28144b) {
                c4699ya2.f28145c = currentTimeMillis - c4699ya2.f28144b;
            }
        }
        this.f27507a.f28146d = false;
    }
}
