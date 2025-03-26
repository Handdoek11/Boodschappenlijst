package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.sk0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC4066sk0 extends AbstractC3411mj0 implements Runnable {

    /* renamed from: y, reason: collision with root package name */
    private final Runnable f26729y;

    public RunnableC4066sk0(Runnable runnable) {
        runnable.getClass();
        this.f26729y = runnable;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3738pj0
    protected final String c() {
        return "task=[" + this.f26729y.toString() + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f26729y.run();
        } catch (Throwable th) {
            h(th);
            throw th;
        }
    }
}
