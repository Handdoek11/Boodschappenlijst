package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;

/* renamed from: com.google.android.gms.internal.ads.ma, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC3392ma implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ int f24534o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ C3610oa f24535s;

    RunnableC3392ma(C3610oa c3610oa, int i8, boolean z7) {
        this.f24534o = i8;
        this.f24535s = c3610oa;
    }

    @Override // java.lang.Runnable
    public final void run() {
        E8 e8;
        int i8 = this.f24534o;
        C3610oa c3610oa = this.f24535s;
        if (i8 > 0) {
            try {
                Thread.sleep(i8 * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = c3610oa.f25209a.getPackageManager().getPackageInfo(c3610oa.f25209a.getPackageName(), 0);
            Context context = c3610oa.f25209a;
            e8 = AbstractC4813zc0.a(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            e8 = null;
        }
        this.f24535s.f25218j = e8;
        if (this.f24534o < 4) {
            if (e8 != null && e8.L0() && !e8.a1().equals("0000000000000000000000000000000000000000000000000000000000000000") && e8.M0() && e8.Y0().g0() && e8.Y0().b0() != -2) {
                return;
            }
            this.f24535s.o(this.f24534o + 1, true);
        }
    }
}
