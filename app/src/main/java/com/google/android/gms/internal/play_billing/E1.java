package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
final class E1 extends Z0 implements Runnable {

    /* renamed from: y, reason: collision with root package name */
    private final Runnable f29690y;

    public E1(Runnable runnable) {
        runnable.getClass();
        this.f29690y = runnable;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5091c1
    protected final String i() {
        return "task=[" + this.f29690y.toString() + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f29690y.run();
        } catch (Throwable th) {
            p(th);
            throw th;
        }
    }
}
