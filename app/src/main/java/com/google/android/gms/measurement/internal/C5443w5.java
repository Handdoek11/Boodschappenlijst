package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.w5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5443w5 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C5395p5 f31250a;

    C5443w5(C5395p5 c5395p5) {
        this.f31250a = c5395p5;
    }

    private final void c(long j8, boolean z7) {
        this.f31250a.l();
        if (this.f31250a.f31239a.n()) {
            this.f31250a.f().f31299r.b(j8);
            this.f31250a.h().I().b("Session started, time", Long.valueOf(this.f31250a.zzb().b()));
            long j9 = j8 / 1000;
            this.f31250a.p().g0("auto", "_sid", Long.valueOf(j9), j8);
            this.f31250a.f().f31300s.b(j9);
            this.f31250a.f().f31295n.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j9);
            this.f31250a.p().a0("auto", "_s", j8, bundle);
            String a8 = this.f31250a.f().f31305x.a();
            if (TextUtils.isEmpty(a8)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", a8);
            this.f31250a.p().a0("auto", "_ssr", j8, bundle2);
        }
    }

    final void a() {
        this.f31250a.l();
        if (this.f31250a.f().x(this.f31250a.zzb().a())) {
            this.f31250a.f().f31295n.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f31250a.h().I().a("Detected application was in foreground");
                c(this.f31250a.zzb().a(), false);
            }
        }
    }

    final void b(long j8, boolean z7) {
        this.f31250a.l();
        this.f31250a.E();
        if (this.f31250a.f().x(j8)) {
            this.f31250a.f().f31295n.a(true);
            this.f31250a.n().G();
        }
        this.f31250a.f().f31299r.b(j8);
        if (this.f31250a.f().f31295n.b()) {
            c(j8, z7);
        }
    }
}
