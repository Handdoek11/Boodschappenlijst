package l3;

import A3.AbstractC0376j;
import A3.C0377k;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class l implements S2.b {

    /* renamed from: e, reason: collision with root package name */
    private static S2.b f38790e;

    /* renamed from: a, reason: collision with root package name */
    private final Context f38791a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f38792b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f38793c;

    /* renamed from: d, reason: collision with root package name */
    private final ExecutorService f38794d;

    l(Context context) {
        this.f38792b = false;
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f38793c = newSingleThreadScheduledExecutor;
        this.f38794d = Executors.newSingleThreadExecutor();
        this.f38791a = context;
        if (this.f38792b) {
            return;
        }
        newSingleThreadScheduledExecutor.scheduleAtFixedRate(new j(this, null), 0L, 86400L, TimeUnit.SECONDS);
        this.f38792b = true;
    }

    static synchronized S2.b d(Context context) {
        S2.b bVar;
        synchronized (l.class) {
            try {
                Z2.r.m(context, "Context must not be null");
                if (f38790e == null) {
                    f38790e = new l(context.getApplicationContext());
                }
                bVar = f38790e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    protected static final void f(Context context) {
        if (!g(context).edit().remove("app_set_id").commit()) {
            String valueOf = String.valueOf(context.getPackageName());
            Log.e("AppSet", valueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(valueOf) : new String("Failed to clear app set ID generated for App "));
        }
        if (g(context).edit().remove("app_set_id_last_used_time").commit()) {
            return;
        }
        String valueOf2 = String.valueOf(context.getPackageName());
        Log.e("AppSet", valueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(valueOf2) : new String("Failed to clear app set ID last used time for App "));
    }

    private static final SharedPreferences g(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    private static final void h(Context context) {
        if (g(context).edit().putLong("app_set_id_last_used_time", f3.h.d().a()).commit()) {
            return;
        }
        String valueOf = String.valueOf(context.getPackageName());
        Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(valueOf) : new String("Failed to store app set ID last used time for App "));
        throw new k("Failed to store the app set ID last used time.");
    }

    @Override // S2.b
    public final AbstractC0376j a() {
        final C0377k c0377k = new C0377k();
        this.f38794d.execute(new Runnable() { // from class: l3.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f38787o.e(c0377k);
            }
        });
        return c0377k.a();
    }

    protected final long b() {
        long j8 = g(this.f38791a).getLong("app_set_id_last_used_time", -1L);
        if (j8 != -1) {
            return j8 + 33696000000L;
        }
        return -1L;
    }

    final /* synthetic */ void e(C0377k c0377k) {
        String string = g(this.f38791a).getString("app_set_id", null);
        long b8 = b();
        if (string == null || f3.h.d().a() > b8) {
            string = UUID.randomUUID().toString();
            try {
                Context context = this.f38791a;
                if (!g(context).edit().putString("app_set_id", string).commit()) {
                    String valueOf = String.valueOf(context.getPackageName());
                    Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID generated for App ".concat(valueOf) : new String("Failed to store app set ID generated for App "));
                    throw new k("Failed to store the app set ID.");
                }
                h(context);
                Context context2 = this.f38791a;
                if (!g(context2).edit().putLong("app_set_id_creation_time", f3.h.d().a()).commit()) {
                    String valueOf2 = String.valueOf(context2.getPackageName());
                    Log.e("AppSet", valueOf2.length() != 0 ? "Failed to store app set ID creation time for App ".concat(valueOf2) : new String("Failed to store app set ID creation time for App "));
                    throw new k("Failed to store the app set ID creation time.");
                }
            } catch (k e8) {
                c0377k.b(e8);
                return;
            }
        } else {
            try {
                h(this.f38791a);
            } catch (k e9) {
                c0377k.b(e9);
                return;
            }
        }
        c0377k.c(new S2.c(string, 1));
    }
}
