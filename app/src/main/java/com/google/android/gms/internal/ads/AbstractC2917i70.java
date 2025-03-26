package com.google.android.gms.internal.ads;

import D2.C0555y;
import G2.AbstractC0608p0;
import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.i70, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2917i70 {
    public static void a(Context context, boolean z7) {
        if (z7) {
            H2.p.f("This request is sent from a test device.");
            return;
        }
        C0555y.b();
        H2.p.f("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + H2.g.C(context) + "\")) to get test ads on this device.");
    }

    public static void b(int i8, Throwable th, String str) {
        H2.p.f("Ad failed to load : " + i8);
        AbstractC0608p0.l(str, th);
        if (i8 == 3) {
            return;
        }
        C2.v.s().w(th, str);
    }
}
