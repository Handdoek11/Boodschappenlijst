package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ev0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2565ev0 {
    C2565ev0() {
    }

    public static final List a(Object obj, long j8) {
        Zu0 zu0 = (Zu0) Vv0.p(obj, j8);
        if (zu0.a()) {
            return zu0;
        }
        int size = zu0.size();
        Zu0 g8 = zu0.g(size == 0 ? 10 : size + size);
        Vv0.D(obj, j8, g8);
        return g8;
    }
}
