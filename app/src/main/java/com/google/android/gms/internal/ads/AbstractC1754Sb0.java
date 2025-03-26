package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;

/* renamed from: com.google.android.gms.internal.ads.Sb0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1754Sb0 {

    /* renamed from: a, reason: collision with root package name */
    private static int f18932a = 2;

    public static void a(Context context) {
        context.registerReceiver(new C1719Rb0(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }

    public static int b() {
        if (AbstractC1614Ob0.a() != EnumC2417db0.CTV) {
            return 2;
        }
        return f18932a;
    }
}
