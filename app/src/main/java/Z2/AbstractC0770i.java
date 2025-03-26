package Z2;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* renamed from: Z2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0770i {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f6361a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static s0 f6362b = null;

    /* renamed from: c, reason: collision with root package name */
    static HandlerThread f6363c = null;

    /* renamed from: d, reason: collision with root package name */
    private static Executor f6364d = null;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f6365e = false;

    public static AbstractC0770i a(Context context) {
        synchronized (f6361a) {
            try {
                if (f6362b == null) {
                    f6362b = new s0(context.getApplicationContext(), f6365e ? b().getLooper() : context.getMainLooper(), f6364d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f6362b;
    }

    public static HandlerThread b() {
        synchronized (f6361a) {
            try {
                HandlerThread handlerThread = f6363c;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f6363c = handlerThread2;
                handlerThread2.start();
                return f6363c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected abstract void c(n0 n0Var, ServiceConnection serviceConnection, String str);

    public final void d(String str, String str2, int i8, ServiceConnection serviceConnection, String str3, boolean z7) {
        c(new n0(str, str2, 4225, z7), serviceConnection, str3);
    }

    protected abstract boolean e(n0 n0Var, ServiceConnection serviceConnection, String str, Executor executor);
}
