package Y4;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
enum p implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f.a().f6078a.post(runnable);
    }
}
