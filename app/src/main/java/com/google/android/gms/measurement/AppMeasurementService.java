package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.C5367l5;
import w3.InterfaceC6884B;

/* loaded from: classes2.dex */
public final class AppMeasurementService extends Service implements InterfaceC6884B {

    /* renamed from: o, reason: collision with root package name */
    private C5367l5 f30245o;

    private final C5367l5 c() {
        if (this.f30245o == null) {
            this.f30245o = new C5367l5(this);
        }
        return this.f30245o;
    }

    @Override // w3.InterfaceC6884B
    public final void a(Intent intent) {
        R0.a.b(intent);
    }

    @Override // w3.InterfaceC6884B
    public final void b(JobParameters jobParameters, boolean z7) {
        throw new UnsupportedOperationException();
    }

    @Override // w3.InterfaceC6884B
    public final boolean m(int i8) {
        return stopSelfResult(i8);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return c().b(intent);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        c().c();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        c().h();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        c().i(intent);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i8, int i9) {
        return c().a(intent, i8, i9);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return c().k(intent);
    }
}
