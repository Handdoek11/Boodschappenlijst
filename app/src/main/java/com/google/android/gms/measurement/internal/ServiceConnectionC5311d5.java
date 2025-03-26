package com.google.android.gms.measurement.internal;

import Z2.AbstractC0765d;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.C1103b;
import e3.C5745b;
import w3.InterfaceC6890f;

/* renamed from: com.google.android.gms.measurement.internal.d5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ServiceConnectionC5311d5 implements ServiceConnection, AbstractC0765d.a, AbstractC0765d.b {

    /* renamed from: a, reason: collision with root package name */
    private volatile boolean f30908a;

    /* renamed from: b, reason: collision with root package name */
    private volatile C5350j2 f30909b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ F4 f30910c;

    protected ServiceConnectionC5311d5(F4 f42) {
        this.f30910c = f42;
    }

    @Override // Z2.AbstractC0765d.b
    public final void D0(C1103b c1103b) {
        Z2.r.e("MeasurementServiceConnection.onConnectionFailed");
        C5378n2 C7 = this.f30910c.f31239a.C();
        if (C7 != null) {
            C7.J().b("Service connection failed", c1103b);
        }
        synchronized (this) {
            this.f30908a = false;
            this.f30909b = null;
        }
        this.f30910c.j().B(new RunnableC5332g5(this));
    }

    @Override // Z2.AbstractC0765d.a
    public final void J0(Bundle bundle) {
        Z2.r.e("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                Z2.r.l(this.f30909b);
                this.f30910c.j().B(new RunnableC5318e5(this, (InterfaceC6890f) this.f30909b.D()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f30909b = null;
                this.f30908a = false;
            }
        }
    }

    public final void a() {
        this.f30910c.l();
        Context zza = this.f30910c.zza();
        synchronized (this) {
            try {
                if (this.f30908a) {
                    this.f30910c.h().I().a("Connection attempt already in progress");
                    return;
                }
                if (this.f30909b != null && (this.f30909b.e() || this.f30909b.h())) {
                    this.f30910c.h().I().a("Already awaiting connection attempt");
                    return;
                }
                this.f30909b = new C5350j2(zza, Looper.getMainLooper(), this, this);
                this.f30910c.h().I().a("Connecting to remote service");
                this.f30908a = true;
                Z2.r.l(this.f30909b);
                this.f30909b.q();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Intent intent) {
        this.f30910c.l();
        Context zza = this.f30910c.zza();
        C5745b b8 = C5745b.b();
        synchronized (this) {
            try {
                if (this.f30908a) {
                    this.f30910c.h().I().a("Connection attempt already in progress");
                    return;
                }
                this.f30910c.h().I().a("Using local app measurement service");
                this.f30908a = true;
                b8.a(zza, intent, this.f30910c.f30362c, 129);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        if (this.f30909b != null && (this.f30909b.h() || this.f30909b.e())) {
            this.f30909b.g();
        }
        this.f30909b = null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Z2.r.e("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f30908a = false;
                this.f30910c.h().E().a("Service connected with null binder");
                return;
            }
            InterfaceC6890f interfaceC6890f = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    interfaceC6890f = queryLocalInterface instanceof InterfaceC6890f ? (InterfaceC6890f) queryLocalInterface : new C5315e2(iBinder);
                    this.f30910c.h().I().a("Bound to IMeasurementService interface");
                } else {
                    this.f30910c.h().E().b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f30910c.h().E().a("Service connect failed to get IMeasurementService");
            }
            if (interfaceC6890f == null) {
                this.f30908a = false;
                try {
                    C5745b.b().c(this.f30910c.zza(), this.f30910c.f30362c);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f30910c.j().B(new RunnableC5304c5(this, interfaceC6890f));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Z2.r.e("MeasurementServiceConnection.onServiceDisconnected");
        this.f30910c.h().D().a("Service disconnected");
        this.f30910c.j().B(new RunnableC5325f5(this, componentName));
    }

    @Override // Z2.AbstractC0765d.a
    public final void w0(int i8) {
        Z2.r.e("MeasurementServiceConnection.onConnectionSuspended");
        this.f30910c.h().D().a("Service connection suspended");
        this.f30910c.j().B(new RunnableC5339h5(this));
    }
}
