package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;

/* renamed from: com.google.android.gms.internal.ads.Qq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1706Qq {

    /* renamed from: a, reason: collision with root package name */
    public final AudioAttributes f18545a;

    /* synthetic */ C1706Qq(WR wr, AbstractC4235uE abstractC4235uE) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        int i8 = AbstractC2301cW.f21206a;
        if (i8 >= 29) {
            usage.setAllowedCapturePolicy(1);
        }
        if (i8 >= 32) {
            usage.setSpatializationBehavior(0);
        }
        this.f18545a = usage.build();
    }
}
