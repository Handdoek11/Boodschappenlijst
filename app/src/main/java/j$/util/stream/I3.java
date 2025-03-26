package j$.util.stream;

/* loaded from: classes3.dex */
final class I3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f37482a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Runnable f37483b;

    I3(Runnable runnable, Runnable runnable2) {
        this.f37482a = runnable;
        this.f37483b = runnable2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f37483b;
        try {
            this.f37482a.run();
            runnable.run();
        } catch (Throwable th) {
            try {
                runnable.run();
            } catch (Throwable th2) {
                try {
                    th.addSuppressed(th2);
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }
}
