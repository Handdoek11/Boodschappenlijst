package h4;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public enum l implements Executor {
    INSTANCE;


    /* renamed from: s, reason: collision with root package name */
    private static final Handler f36236s = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        f36236s.post(runnable);
    }
}
