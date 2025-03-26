package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class M6 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final U6 f17228o;

    /* renamed from: s, reason: collision with root package name */
    private final Y6 f17229s;

    /* renamed from: t, reason: collision with root package name */
    private final Runnable f17230t;

    public M6(U6 u62, Y6 y62, Runnable runnable) {
        this.f17228o = u62;
        this.f17229s = y62;
        this.f17230t = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17228o.B();
        Y6 y62 = this.f17229s;
        if (y62.c()) {
            this.f17228o.t(y62.f20210a);
        } else {
            this.f17228o.s(y62.f20212c);
        }
        if (this.f17229s.f20213d) {
            this.f17228o.r("intermediate-response");
        } else {
            this.f17228o.u("done");
        }
        Runnable runnable = this.f17230t;
        if (runnable != null) {
            runnable.run();
        }
    }
}
