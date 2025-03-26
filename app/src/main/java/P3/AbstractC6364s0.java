package p3;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: p3.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6364s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Handler f40383a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    public static final Executor f40384b = new ExecutorC6362r0("Google consent worker");

    public static void a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Method must be call on main thread.");
        }
    }
}
