package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;

/* loaded from: classes.dex */
abstract class EF0 {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f14695a;

    public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i8, int i9, double d8) {
        if (AbstractC2301cW.f21206a < 29) {
            return 0;
        }
        Boolean bool = f14695a;
        if (bool == null || !bool.booleanValue()) {
            return DF0.a(videoCapabilities, i8, i9, d8);
        }
        return 0;
    }
}
