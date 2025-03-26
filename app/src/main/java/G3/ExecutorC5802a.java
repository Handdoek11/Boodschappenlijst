package g3;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import o3.e;

/* renamed from: g3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ExecutorC5802a implements Executor {

    /* renamed from: o, reason: collision with root package name */
    private final Handler f36009o;

    public ExecutorC5802a(Looper looper) {
        this.f36009o = new e(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f36009o.post(runnable);
    }
}
