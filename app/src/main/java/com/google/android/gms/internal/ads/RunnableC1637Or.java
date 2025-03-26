package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Or, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC1637Or implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final C1140Ar f17953o;

    /* renamed from: s, reason: collision with root package name */
    private boolean f17954s = false;

    RunnableC1637Or(C1140Ar c1140Ar) {
        this.f17953o = c1140Ar;
    }

    private final void c() {
        HandlerC1968Yd0 handlerC1968Yd0 = G2.D0.f2566l;
        handlerC1968Yd0.removeCallbacks(this);
        handlerC1968Yd0.postDelayed(this, 250L);
    }

    public final void a() {
        this.f17954s = true;
        this.f17953o.D();
    }

    public final void b() {
        this.f17954s = false;
        c();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f17954s) {
            return;
        }
        this.f17953o.D();
        c();
    }
}
