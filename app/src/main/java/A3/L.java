package A3;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import u3.HandlerC6813a;

/* loaded from: classes2.dex */
final class L implements Executor {

    /* renamed from: o, reason: collision with root package name */
    private final Handler f192o = new HandlerC6813a(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f192o.post(runnable);
    }
}
