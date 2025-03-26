package j2;

import java.util.concurrent.Executor;
import n2.AbstractC6247a;

/* renamed from: j2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class ExecutorC6065n implements Executor {

    /* renamed from: o, reason: collision with root package name */
    private final Executor f38210o;

    /* renamed from: j2.n$a */
    static class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        private final Runnable f38211o;

        a(Runnable runnable) {
            this.f38211o = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f38211o.run();
            } catch (Exception e8) {
                AbstractC6247a.d("Executor", "Background execution failure.", e8);
            }
        }
    }

    ExecutorC6065n(Executor executor) {
        this.f38210o = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f38210o.execute(new a(runnable));
    }
}
