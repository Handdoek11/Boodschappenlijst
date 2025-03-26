package com.google.android.gms.internal.ads;

import android.os.StrictMode;

/* renamed from: com.google.android.gms.internal.ads.mf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3402mf {
    public static Object a(InterfaceC3296lg0 interfaceC3296lg0) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return interfaceC3296lg0.zza();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
