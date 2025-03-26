package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.ya, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4699ya {

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f28142e = {"android:establish_vpn_service", "android:establish_vpn_manager"};

    /* renamed from: a, reason: collision with root package name */
    private long f28143a = 0;

    /* renamed from: b, reason: collision with root package name */
    private long f28144b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f28145c = -1;

    /* renamed from: d, reason: collision with root package name */
    private boolean f28146d = false;

    C4699ya(Context context, Executor executor, String[] strArr) {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        try {
            ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new C4481wa(this));
        } catch (IllegalArgumentException | NoSuchMethodError unused) {
        }
    }

    public static C4699ya d(Context context, Executor executor) {
        return new C4699ya(context, executor, f28142e);
    }

    public final long b() {
        long j8 = this.f28145c;
        this.f28145c = -1L;
        return j8;
    }

    public final long c() {
        if (this.f28146d) {
            return this.f28144b - this.f28143a;
        }
        return -1L;
    }

    public final void h() {
        if (this.f28146d) {
            this.f28144b = System.currentTimeMillis();
        }
    }
}
