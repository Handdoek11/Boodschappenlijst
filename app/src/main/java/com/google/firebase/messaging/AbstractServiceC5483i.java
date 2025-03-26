package com.google.firebase.messaging;

import A3.AbstractC0376j;
import A3.AbstractC0379m;
import A3.C0377k;
import A3.InterfaceC0371e;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.firebase.messaging.j0;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.firebase.messaging.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractServiceC5483i extends Service {

    /* renamed from: s, reason: collision with root package name */
    private Binder f32988s;

    /* renamed from: u, reason: collision with root package name */
    private int f32990u;

    /* renamed from: o, reason: collision with root package name */
    final ExecutorService f32987o = AbstractC5489o.d();

    /* renamed from: t, reason: collision with root package name */
    private final Object f32989t = new Object();

    /* renamed from: v, reason: collision with root package name */
    private int f32991v = 0;

    /* renamed from: com.google.firebase.messaging.i$a */
    class a implements j0.a {
        a() {
        }

        @Override // com.google.firebase.messaging.j0.a
        public AbstractC0376j a(Intent intent) {
            return AbstractServiceC5483i.this.j(intent);
        }
    }

    private void d(Intent intent) {
        if (intent != null) {
            h0.c(intent);
        }
        synchronized (this.f32989t) {
            try {
                int i8 = this.f32991v - 1;
                this.f32991v = i8;
                if (i8 == 0) {
                    k(this.f32990u);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(Intent intent, AbstractC0376j abstractC0376j) {
        d(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(Intent intent, C0377k c0377k) {
        try {
            f(intent);
        } finally {
            c0377k.c(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AbstractC0376j j(final Intent intent) {
        if (g(intent)) {
            return AbstractC0379m.e(null);
        }
        final C0377k c0377k = new C0377k();
        this.f32987o.execute(new Runnable() { // from class: com.google.firebase.messaging.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f32981o.i(intent, c0377k);
            }
        });
        return c0377k.a();
    }

    protected abstract Intent e(Intent intent);

    public abstract void f(Intent intent);

    public boolean g(Intent intent) {
        return false;
    }

    boolean k(int i8) {
        return stopSelfResult(i8);
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.f32988s == null) {
                this.f32988s = new j0(new a());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f32988s;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f32987o.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i8, int i9) {
        synchronized (this.f32989t) {
            this.f32990u = i9;
            this.f32991v++;
        }
        Intent e8 = e(intent);
        if (e8 == null) {
            d(intent);
            return 2;
        }
        AbstractC0376j j8 = j(e8);
        if (j8.r()) {
            d(intent);
            return 2;
        }
        j8.d(new Z0.m(), new InterfaceC0371e() { // from class: com.google.firebase.messaging.g
            @Override // A3.InterfaceC0371e
            public final void a(AbstractC0376j abstractC0376j) {
                this.f32978a.h(intent, abstractC0376j);
            }
        });
        return 3;
    }
}
