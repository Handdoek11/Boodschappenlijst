package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C5367l5;
import w3.InterfaceC6884B;

@TargetApi(24)
/* loaded from: classes2.dex */
public final class AppMeasurementJobService extends JobService implements InterfaceC6884B {

    /* renamed from: o, reason: collision with root package name */
    private C5367l5 f30243o;

    private final C5367l5 c() {
        if (this.f30243o == null) {
            this.f30243o = new C5367l5(this);
        }
        return this.f30243o;
    }

    @Override // w3.InterfaceC6884B
    public final void a(Intent intent) {
    }

    @Override // w3.InterfaceC6884B
    public final void b(JobParameters jobParameters, boolean z7) {
        jobFinished(jobParameters, false);
    }

    @Override // w3.InterfaceC6884B
    public final boolean m(int i8) {
        throw new UnsupportedOperationException();
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

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        return c().g(jobParameters);
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return c().k(intent);
    }
}
