package com.google.firebase.messaging;

import A3.AbstractC0376j;
import A3.InterfaceC0371e;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
import z3.C7081a;

/* loaded from: classes2.dex */
abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    static final long f32984a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b, reason: collision with root package name */
    private static final Object f32985b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static C7081a f32986c;

    private static void b(Context context) {
        if (f32986c == null) {
            C7081a c7081a = new C7081a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f32986c = c7081a;
            c7081a.d(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Intent intent) {
        synchronized (f32985b) {
            try {
                if (f32986c != null && d(intent)) {
                    g(intent, false);
                    f32986c.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static boolean d(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    static void f(Context context, m0 m0Var, final Intent intent) {
        synchronized (f32985b) {
            try {
                b(context);
                boolean d8 = d(intent);
                g(intent, true);
                if (!d8) {
                    f32986c.a(f32984a);
                }
                m0Var.d(intent).c(new InterfaceC0371e() { // from class: com.google.firebase.messaging.g0
                    @Override // A3.InterfaceC0371e
                    public final void a(AbstractC0376j abstractC0376j) {
                        h0.c(intent);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void g(Intent intent, boolean z7) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z7);
    }

    static ComponentName h(Context context, Intent intent) {
        synchronized (f32985b) {
            try {
                b(context);
                boolean d8 = d(intent);
                g(intent, true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!d8) {
                    f32986c.a(f32984a);
                }
                return startService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
