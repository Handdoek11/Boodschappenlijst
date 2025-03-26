package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Ob0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1614Ob0 {

    /* renamed from: a, reason: collision with root package name */
    private static UiModeManager f17903a;

    public static EnumC2417db0 a() {
        UiModeManager uiModeManager = f17903a;
        if (uiModeManager == null) {
            return EnumC2417db0.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        return currentModeType != 1 ? currentModeType != 4 ? EnumC2417db0.OTHER : EnumC2417db0.CTV : EnumC2417db0.MOBILE;
    }

    public static void b(Context context) {
        if (context != null) {
            f17903a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
