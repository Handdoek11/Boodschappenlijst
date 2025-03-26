package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;

/* renamed from: com.google.android.gms.internal.ads.wJ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC4464wJ0 {
    public static boolean a(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null || !display.isHdr()) {
            return false;
        }
        for (int i8 : display.getHdrCapabilities().getSupportedHdrTypes()) {
            if (i8 == 1) {
                return true;
            }
        }
        return false;
    }
}
