package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.qf0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class ServiceConnectionC3839qf0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C4056sf0 f25978a;

    /* synthetic */ ServiceConnectionC3839qf0(C4056sf0 c4056sf0, AbstractC3947rf0 abstractC3947rf0) {
        this.f25978a = c4056sf0;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.f25978a.f26713c.c("LmdServiceConnectionManager.onServiceConnected(%s)", componentName);
        this.f25978a.o(new Runnable() { // from class: com.google.android.gms.internal.ads.of0
            @Override // java.lang.Runnable
            public final void run() {
                IInterface iInterface;
                InterfaceC3837qe0 t7 = AbstractBinderC3728pe0.t7(iBinder);
                ServiceConnectionC3839qf0 serviceConnectionC3839qf0 = this.f25248o;
                serviceConnectionC3839qf0.f25978a.f26720j = t7;
                serviceConnectionC3839qf0.f25978a.f26713c.c("linkToDeath", new Object[0]);
                try {
                    iInterface = serviceConnectionC3839qf0.f25978a.f26720j;
                } catch (RemoteException e8) {
                    serviceConnectionC3839qf0.f25978a.f26713c.b(e8, "linkToDeath failed", new Object[0]);
                }
                if (iInterface == null) {
                    throw null;
                }
                iInterface.asBinder().linkToDeath(serviceConnectionC3839qf0.f25978a.f26718h, 0);
                serviceConnectionC3839qf0.f25978a.f26716f = false;
                synchronized (serviceConnectionC3839qf0.f25978a.f26715e) {
                    try {
                        Iterator it = serviceConnectionC3839qf0.f25978a.f26715e.iterator();
                        while (it.hasNext()) {
                            ((Runnable) it.next()).run();
                        }
                        serviceConnectionC3839qf0.f25978a.f26715e.clear();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f25978a.f26713c.c("LmdServiceConnectionManager.onServiceDisconnected(%s)", componentName);
        this.f25978a.o(new Runnable() { // from class: com.google.android.gms.internal.ads.pf0
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC3839qf0 serviceConnectionC3839qf0 = this.f25485o;
                serviceConnectionC3839qf0.f25978a.f26713c.c("unlinkToDeath", new Object[0]);
                IInterface iInterface = serviceConnectionC3839qf0.f25978a.f26720j;
                iInterface.getClass();
                iInterface.asBinder().unlinkToDeath(serviceConnectionC3839qf0.f25978a.f26718h, 0);
                serviceConnectionC3839qf0.f25978a.f26720j = null;
                serviceConnectionC3839qf0.f25978a.f26716f = false;
            }
        });
    }
}
