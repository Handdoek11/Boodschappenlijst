package com.google.firebase;

import android.os.SystemClock;

/* loaded from: classes2.dex */
public abstract class o {
    public static o a(long j8, long j9, long j10) {
        return new a(j8, j9, j10);
    }

    public static o e() {
        return a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public abstract long b();

    public abstract long c();

    public abstract long d();
}
