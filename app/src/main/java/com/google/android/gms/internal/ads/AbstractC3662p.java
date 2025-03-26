package com.google.android.gms.internal.ads;

import android.view.Surface;

/* renamed from: com.google.android.gms.internal.ads.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC3662p {
    public static void a(Surface surface, float f8) {
        try {
            surface.setFrameRate(f8, f8 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e8) {
            HL.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e8);
        }
    }
}
