package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import w3.InterfaceC6884B;

/* renamed from: com.google.android.gms.measurement.internal.l5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5367l5 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f31075a;

    public C5367l5(Context context) {
        Z2.r.l(context);
        this.f31075a = context;
    }

    private final void f(Runnable runnable) {
        H5 k8 = H5.k(this.f31075a);
        k8.j().B(new RunnableC5374m5(this, k8, runnable));
    }

    private final C5378n2 j() {
        return S2.a(this.f31075a, null, null).h();
    }

    public final int a(final Intent intent, int i8, final int i9) {
        final C5378n2 h8 = S2.a(this.f31075a, null, null).h();
        if (intent == null) {
            h8.J().a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        h8.I().c("Local AppMeasurementService called. startId, action", Integer.valueOf(i9), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            f(new Runnable() { // from class: com.google.android.gms.measurement.internal.o5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f31133o.d(i9, h8, intent);
                }
            });
        }
        return 2;
    }

    public final IBinder b(Intent intent) {
        if (intent == null) {
            j().E().a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new X2(H5.k(this.f31075a));
        }
        j().J().b("onBind received unknown action", action);
        return null;
    }

    public final void c() {
        S2.a(this.f31075a, null, null).h().I().a("Local AppMeasurementService is starting up");
    }

    final /* synthetic */ void d(int i8, C5378n2 c5378n2, Intent intent) {
        if (((InterfaceC6884B) this.f31075a).m(i8)) {
            c5378n2.I().b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i8));
            j().I().a("Completed wakeful intent.");
            ((InterfaceC6884B) this.f31075a).a(intent);
        }
    }

    final /* synthetic */ void e(C5378n2 c5378n2, JobParameters jobParameters) {
        c5378n2.I().a("AppMeasurementJobService processed last upload request.");
        ((InterfaceC6884B) this.f31075a).b(jobParameters, false);
    }

    public final boolean g(final JobParameters jobParameters) {
        final C5378n2 h8 = S2.a(this.f31075a, null, null).h();
        String string = jobParameters.getExtras().getString("action");
        h8.I().b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        f(new Runnable() { // from class: com.google.android.gms.measurement.internal.k5
            @Override // java.lang.Runnable
            public final void run() {
                this.f31052o.e(h8, jobParameters);
            }
        });
        return true;
    }

    public final void h() {
        S2.a(this.f31075a, null, null).h().I().a("Local AppMeasurementService is shutting down");
    }

    public final void i(Intent intent) {
        if (intent == null) {
            j().E().a("onRebind called with null intent");
        } else {
            j().I().b("onRebind called. action", intent.getAction());
        }
    }

    public final boolean k(Intent intent) {
        if (intent == null) {
            j().E().a("onUnbind called with null intent");
            return true;
        }
        j().I().b("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
