package com.google.android.gms.internal.ads;

import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.google.android.gms.internal.ads.gb0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2743gb0 extends TimerTask {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ Timer f22382o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ C3068jb0 f22383s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ C1639Ot f22384t;

    C2743gb0(C3068jb0 c3068jb0, C1639Ot c1639Ot, Timer timer) {
        this.f22384t = c1639Ot;
        this.f22382o = timer;
        this.f22383s = c3068jb0;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f22383s.h();
        this.f22384t.a(true);
        this.f22382o.cancel();
    }
}
