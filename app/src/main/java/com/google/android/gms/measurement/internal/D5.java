package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.C5070z0;
import f3.InterfaceC5781e;

/* loaded from: classes2.dex */
public final class D5 extends E5 {

    /* renamed from: d, reason: collision with root package name */
    private final AlarmManager f30329d;

    /* renamed from: e, reason: collision with root package name */
    private AbstractC5416t f30330e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f30331f;

    protected D5(H5 h52) {
        super(h52);
        this.f30329d = (AlarmManager) zza().getSystemService("alarm");
    }

    private final AbstractC5416t A() {
        if (this.f30330e == null) {
            this.f30330e = new C5(this, this.f30369b.r0());
        }
        return this.f30330e;
    }

    private final void B() {
        JobScheduler jobScheduler = (JobScheduler) zza().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(y());
        }
    }

    private final int y() {
        if (this.f30331f == null) {
            this.f30331f = Integer.valueOf(("measurement" + zza().getPackageName()).hashCode());
        }
        return this.f30331f.intValue();
    }

    private final PendingIntent z() {
        Context zza = zza();
        return com.google.android.gms.internal.measurement.A0.a(zza, 0, new Intent().setClassName(zza, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.A0.f28789a);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5326g a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5444x c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ C5298c d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5336h2 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5461z2 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ d6 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ C5378n2 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ P2 j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ Z5 m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ h6 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ C5354k o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ I2 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ C5353j5 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ G5 r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.E5
    protected final boolean v() {
        AlarmManager alarmManager = this.f30329d;
        if (alarmManager != null) {
            alarmManager.cancel(z());
        }
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        B();
        return false;
    }

    public final void w(long j8) {
        s();
        Context zza = zza();
        if (!d6.b0(zza)) {
            h().D().a("Receiver not registered/enabled");
        }
        if (!d6.c0(zza, false)) {
            h().D().a("Service not registered/enabled");
        }
        x();
        h().I().b("Scheduling upload, millis", Long.valueOf(j8));
        long b8 = zzb().b() + j8;
        if (j8 < Math.max(0L, ((Long) G.f30485z.a(null)).longValue()) && !A().e()) {
            A().b(j8);
        }
        if (Build.VERSION.SDK_INT < 24) {
            AlarmManager alarmManager = this.f30329d;
            if (alarmManager != null) {
                alarmManager.setInexactRepeating(2, b8, Math.max(((Long) G.f30475u.a(null)).longValue(), j8), z());
                return;
            }
            return;
        }
        Context zza2 = zza();
        ComponentName componentName = new ComponentName(zza2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int y7 = y();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        C5070z0.c(zza2, new JobInfo.Builder(y7, componentName).setMinimumLatency(j8).setOverrideDeadline(j8 << 1).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    public final void x() {
        s();
        h().I().a("Unscheduling upload");
        AlarmManager alarmManager = this.f30329d;
        if (alarmManager != null) {
            alarmManager.cancel(z());
        }
        A().a();
        if (Build.VERSION.SDK_INT >= 24) {
            B();
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ InterfaceC5781e zzb() {
        return super.zzb();
    }
}
