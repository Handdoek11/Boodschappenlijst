package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.wk0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC4502wk0 {
    static void a(Throwable th) {
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
}
