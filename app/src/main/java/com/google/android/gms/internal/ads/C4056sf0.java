package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.sf0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4056sf0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3296lg0 f26711a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f26712b;

    /* renamed from: c, reason: collision with root package name */
    private final C4165tf0 f26713c;

    /* renamed from: f, reason: collision with root package name */
    private boolean f26716f;

    /* renamed from: g, reason: collision with root package name */
    private final Intent f26717g;

    /* renamed from: i, reason: collision with root package name */
    private ServiceConnection f26719i;

    /* renamed from: j, reason: collision with root package name */
    private IInterface f26720j;

    /* renamed from: e, reason: collision with root package name */
    private final List f26715e = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final String f26714d = "OverlayDisplayService";

    /* renamed from: h, reason: collision with root package name */
    private final IBinder.DeathRecipient f26718h = new IBinder.DeathRecipient() { // from class: com.google.android.gms.internal.ads.kf0
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            this.f24065a.k();
        }
    };

    C4056sf0(Context context, C4165tf0 c4165tf0, String str, Intent intent, C1900We0 c1900We0) {
        this.f26712b = context;
        this.f26713c = c4165tf0;
        final String str2 = "OverlayDisplayService";
        this.f26717g = intent;
        this.f26711a = AbstractC3732pg0.a(new InterfaceC3296lg0(str2) { // from class: com.google.android.gms.internal.ads.jf0

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ String f23294o = "OverlayDisplayService";

            @Override // com.google.android.gms.internal.ads.InterfaceC3296lg0
            public final Object zza() {
                HandlerThread handlerThread = new HandlerThread(this.f23294o, 10);
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(final Runnable runnable) {
        ((Handler) this.f26711a.zza()).post(new Runnable() { // from class: com.google.android.gms.internal.ads.lf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f24359o.l(runnable);
            }
        });
    }

    public final IInterface c() {
        return this.f26720j;
    }

    public final void i(final Runnable runnable) {
        o(new Runnable() { // from class: com.google.android.gms.internal.ads.mf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f24544o.j(runnable);
            }
        });
    }

    final /* synthetic */ void j(Runnable runnable) {
        if (this.f26720j != null || this.f26716f) {
            if (!this.f26716f) {
                runnable.run();
                return;
            }
            this.f26713c.c("Waiting to bind to the service.", new Object[0]);
            synchronized (this.f26715e) {
                this.f26715e.add(runnable);
            }
            return;
        }
        this.f26713c.c("Initiate binding to the service.", new Object[0]);
        synchronized (this.f26715e) {
            this.f26715e.add(runnable);
        }
        ServiceConnectionC3839qf0 serviceConnectionC3839qf0 = new ServiceConnectionC3839qf0(this, null);
        this.f26719i = serviceConnectionC3839qf0;
        this.f26716f = true;
        if (this.f26712b.bindService(this.f26717g, serviceConnectionC3839qf0, 1)) {
            return;
        }
        this.f26713c.c("Failed to bind to the service.", new Object[0]);
        this.f26716f = false;
        synchronized (this.f26715e) {
            this.f26715e.clear();
        }
    }

    final /* synthetic */ void k() {
        this.f26713c.c("%s : Binder has died.", this.f26714d);
        synchronized (this.f26715e) {
            this.f26715e.clear();
        }
    }

    final /* synthetic */ void l(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e8) {
            this.f26713c.a("error caused by ", e8);
        }
    }

    final /* synthetic */ void m() {
        if (this.f26720j != null) {
            this.f26713c.c("Unbind from service.", new Object[0]);
            Context context = this.f26712b;
            ServiceConnection serviceConnection = this.f26719i;
            serviceConnection.getClass();
            context.unbindService(serviceConnection);
            this.f26716f = false;
            this.f26720j = null;
            this.f26719i = null;
            synchronized (this.f26715e) {
                this.f26715e.clear();
            }
        }
    }

    public final void n() {
        o(new Runnable() { // from class: com.google.android.gms.internal.ads.nf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f25024o.m();
            }
        });
    }
}
