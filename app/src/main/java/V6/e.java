package V6;

import J6.r;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import x6.C6934p;
import x6.q;

/* loaded from: classes2.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final d f5742a;
    private static volatile Choreographer choreographer;

    static {
        Object b8;
        try {
            C6934p.a aVar = C6934p.f44487s;
            b8 = C6934p.b(new c(a(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            C6934p.a aVar2 = C6934p.f44487s;
            b8 = C6934p.b(q.a(th));
        }
        f5742a = (d) (C6934p.g(b8) ? null : b8);
    }

    public static final Handler a(Looper looper, boolean z7) {
        if (!z7) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        r.c(invoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) invoke;
    }
}
