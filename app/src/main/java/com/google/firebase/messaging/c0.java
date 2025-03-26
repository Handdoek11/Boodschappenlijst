package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class c0 {

    /* renamed from: d, reason: collision with root package name */
    private static WeakReference f32942d;

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f32943a;

    /* renamed from: b, reason: collision with root package name */
    private Y f32944b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f32945c;

    private c0(SharedPreferences sharedPreferences, Executor executor) {
        this.f32945c = executor;
        this.f32943a = sharedPreferences;
    }

    public static synchronized c0 a(Context context, Executor executor) {
        c0 c0Var;
        synchronized (c0.class) {
            try {
                WeakReference weakReference = f32942d;
                c0Var = weakReference != null ? (c0) weakReference.get() : null;
                if (c0Var == null) {
                    c0Var = new c0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                    c0Var.c();
                    f32942d = new WeakReference(c0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0Var;
    }

    private synchronized void c() {
        this.f32944b = Y.c(this.f32943a, "topic_operation_queue", ",", this.f32945c);
    }

    synchronized b0 b() {
        return b0.a(this.f32944b.e());
    }

    synchronized boolean d(b0 b0Var) {
        return this.f32944b.f(b0Var.e());
    }
}
