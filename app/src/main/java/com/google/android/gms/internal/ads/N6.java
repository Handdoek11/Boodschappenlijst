package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class N6 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f17476a;

    public N6(Handler handler) {
        this.f17476a = new L6(this, handler);
    }

    public final void a(U6 u62, zzapv zzapvVar) {
        u62.r("post-error");
        ((L6) this.f17476a).f16762o.post(new M6(u62, Y6.a(zzapvVar), null));
    }

    public final void b(U6 u62, Y6 y62, Runnable runnable) {
        u62.v();
        u62.r("post-response");
        ((L6) this.f17476a).f16762o.post(new M6(u62, y62, runnable));
    }
}
