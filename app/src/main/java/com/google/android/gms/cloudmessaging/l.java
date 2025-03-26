package com.google.android.gms.cloudmessaging;

import A3.AbstractC0376j;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import g3.ThreadFactoryC5803b;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: e, reason: collision with root package name */
    private static l f13179e;

    /* renamed from: a, reason: collision with root package name */
    private final Context f13180a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f13181b;

    /* renamed from: c, reason: collision with root package name */
    private g f13182c = new g(this, null);

    /* renamed from: d, reason: collision with root package name */
    private int f13183d = 1;

    l(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f13181b = scheduledExecutorService;
        this.f13180a = context.getApplicationContext();
    }

    public static synchronized l b(Context context) {
        l lVar;
        synchronized (l.class) {
            try {
                if (f13179e == null) {
                    n3.e.a();
                    f13179e = new l(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new ThreadFactoryC5803b("MessengerIpcClient"))));
                }
                lVar = f13179e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lVar;
    }

    private final synchronized int f() {
        int i8;
        i8 = this.f13183d;
        this.f13183d = i8 + 1;
        return i8;
    }

    private final synchronized AbstractC0376j g(j jVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(jVar.toString()));
            }
            if (!this.f13182c.g(jVar)) {
                g gVar = new g(this, null);
                this.f13182c = gVar;
                gVar.g(jVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return jVar.f13176b.a();
    }

    public final AbstractC0376j c(int i8, Bundle bundle) {
        return g(new i(f(), i8, bundle));
    }

    public final AbstractC0376j d(int i8, Bundle bundle) {
        return g(new k(f(), i8, bundle));
    }
}
