package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import w3.InterfaceC6890f;

/* loaded from: classes2.dex */
final class Q4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ C5449x4 f30663o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ F4 f30664s;

    Q4(F4 f42, C5449x4 c5449x4) {
        this.f30663o = c5449x4;
        this.f30664s = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC6890f interfaceC6890f = this.f30664s.f30363d;
        if (interfaceC6890f == null) {
            this.f30664s.h().E().a("Failed to send current screen to service");
            return;
        }
        try {
            C5449x4 c5449x4 = this.f30663o;
            if (c5449x4 == null) {
                interfaceC6890f.v3(0L, null, null, this.f30664s.zza().getPackageName());
            } else {
                interfaceC6890f.v3(c5449x4.f31262c, c5449x4.f31260a, c5449x4.f31261b, this.f30664s.zza().getPackageName());
            }
            this.f30664s.k0();
        } catch (RemoteException e8) {
            this.f30664s.h().E().b("Failed to send current screen to the service", e8);
        }
    }
}
