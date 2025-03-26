package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.e9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class PackageManagerOnChecksumsReadyListenerC2484e9 implements PackageManager$OnChecksumsReadyListener {

    /* renamed from: a, reason: collision with root package name */
    final C4611xk0 f21742a = C4611xk0.D();

    public final void onChecksumsReady(List list) {
        if (list == null) {
            this.f21742a.e("");
            return;
        }
        try {
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                ApkChecksum a8 = AbstractC2159b9.a(list.get(i8));
                if (a8.getType() == 8) {
                    C4611xk0 c4611xk0 = this.f21742a;
                    AbstractC1382Hi0 e8 = AbstractC1382Hi0.g().e();
                    byte[] value = a8.getValue();
                    c4611xk0.e(e8.h(value, 0, value.length));
                    return;
                }
            }
        } catch (Throwable unused) {
        }
        this.f21742a.e("");
    }
}
