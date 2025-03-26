package Y4;

import A3.AbstractC0376j;
import A3.C0377k;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.mlkit.common.MlKitException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import r3.HandlerC6683a;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f6076b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static f f6077c;

    /* renamed from: a, reason: collision with root package name */
    private final Handler f6078a;

    private f(Looper looper) {
        this.f6078a = new HandlerC6683a(looper);
    }

    public static f a() {
        f fVar;
        synchronized (f6076b) {
            try {
                if (f6077c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f6077c = new f(handlerThread.getLooper());
                }
                fVar = f6077c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    public static Executor d() {
        return p.f6117o;
    }

    public AbstractC0376j b(final Callable callable) {
        final C0377k c0377k = new C0377k();
        c(new Runnable() { // from class: Y4.o
            @Override // java.lang.Runnable
            public final void run() {
                Callable callable2 = callable;
                C0377k c0377k2 = c0377k;
                try {
                    c0377k2.c(callable2.call());
                } catch (MlKitException e8) {
                    c0377k2.b(e8);
                } catch (Exception e9) {
                    c0377k2.b(new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e9));
                }
            }
        });
        return c0377k.a();
    }

    public void c(Runnable runnable) {
        d().execute(runnable);
    }
}
