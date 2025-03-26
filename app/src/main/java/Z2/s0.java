package Z2;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import com.adadapted.android.sdk.constants.Config;
import e3.C5745b;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class s0 extends AbstractC0770i {

    /* renamed from: f, reason: collision with root package name */
    private final HashMap f6405f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private final Context f6406g;

    /* renamed from: h, reason: collision with root package name */
    private volatile Handler f6407h;

    /* renamed from: i, reason: collision with root package name */
    private final r0 f6408i;

    /* renamed from: j, reason: collision with root package name */
    private final C5745b f6409j;

    /* renamed from: k, reason: collision with root package name */
    private final long f6410k;

    /* renamed from: l, reason: collision with root package name */
    private final long f6411l;

    /* renamed from: m, reason: collision with root package name */
    private volatile Executor f6412m;

    s0(Context context, Looper looper, Executor executor) {
        r0 r0Var = new r0(this, null);
        this.f6408i = r0Var;
        this.f6406g = context.getApplicationContext();
        this.f6407h = new o3.e(looper, r0Var);
        this.f6409j = C5745b.b();
        this.f6410k = 5000L;
        this.f6411l = Config.DEFAULT_AD_POLLING;
        this.f6412m = executor;
    }

    @Override // Z2.AbstractC0770i
    protected final void c(n0 n0Var, ServiceConnection serviceConnection, String str) {
        r.m(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f6405f) {
            try {
                p0 p0Var = (p0) this.f6405f.get(n0Var);
                if (p0Var == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: " + n0Var.toString());
                }
                if (!p0Var.h(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + n0Var.toString());
                }
                p0Var.f(serviceConnection, str);
                if (p0Var.i()) {
                    this.f6407h.sendMessageDelayed(this.f6407h.obtainMessage(0, n0Var), this.f6410k);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Z2.AbstractC0770i
    protected final boolean e(n0 n0Var, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean j8;
        r.m(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f6405f) {
            try {
                p0 p0Var = (p0) this.f6405f.get(n0Var);
                if (executor == null) {
                    executor = this.f6412m;
                }
                if (p0Var == null) {
                    p0Var = new p0(this, n0Var);
                    p0Var.d(serviceConnection, serviceConnection, str);
                    p0Var.e(str, executor);
                    this.f6405f.put(n0Var, p0Var);
                } else {
                    this.f6407h.removeMessages(0, n0Var);
                    if (p0Var.h(serviceConnection)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + n0Var.toString());
                    }
                    p0Var.d(serviceConnection, serviceConnection, str);
                    int a8 = p0Var.a();
                    if (a8 == 1) {
                        serviceConnection.onServiceConnected(p0Var.b(), p0Var.c());
                    } else if (a8 == 2) {
                        p0Var.e(str, executor);
                    }
                }
                j8 = p0Var.j();
            } catch (Throwable th) {
                throw th;
            }
        }
        return j8;
    }
}
