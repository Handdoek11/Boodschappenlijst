package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.ia0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2959ia0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f22993a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f22994b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceScheduledExecutorServiceC3631ok0 f22995c;

    /* renamed from: d, reason: collision with root package name */
    private final H2.u f22996d;

    /* renamed from: e, reason: collision with root package name */
    private final Y90 f22997e;

    /* renamed from: f, reason: collision with root package name */
    private final RunnableC3791q90 f22998f;

    C2959ia0(Context context, Executor executor, InterfaceScheduledExecutorServiceC3631ok0 interfaceScheduledExecutorServiceC3631ok0, H2.u uVar, Y90 y90, RunnableC3791q90 runnableC3791q90) {
        this.f22993a = context;
        this.f22994b = executor;
        this.f22995c = interfaceScheduledExecutorServiceC3631ok0;
        this.f22996d = uVar;
        this.f22997e = y90;
        this.f22998f = runnableC3791q90;
    }

    final /* synthetic */ H2.t a(String str) {
        return this.f22996d.n(str);
    }

    final com.google.common.util.concurrent.d c(final String str, H2.v vVar) {
        if (vVar == null) {
            return this.f22995c.p0(new Callable() { // from class: com.google.android.gms.internal.ads.ea0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f21835o.a(str);
                }
            });
        }
        return new X90(vVar.b(), this.f22996d, this.f22995c, this.f22997e).d(str);
    }

    public final void d(final String str, final H2.v vVar, RunnableC3464n90 runnableC3464n90) {
        if (!RunnableC3791q90.a() || !((Boolean) AbstractC2534eg.f21868d.e()).booleanValue()) {
            this.f22994b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.fa0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22058o.c(str, vVar);
                }
            });
            return;
        }
        InterfaceC2160b90 a8 = AbstractC2051a90.a(this.f22993a, 14);
        a8.f();
        AbstractC2326ck0.r(c(str, vVar), new C2741ga0(this, a8, runnableC3464n90), this.f22994b);
    }

    public final void e(List list, H2.v vVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d((String) it.next(), vVar, null);
        }
    }
}
