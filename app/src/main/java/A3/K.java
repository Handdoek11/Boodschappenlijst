package A3;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class K implements Executor {
    K() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
