package com.google.android.gms.common.api.internal;

import X2.InterfaceC0755c;
import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;

/* renamed from: com.google.android.gms.common.api.internal.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1090b extends BasePendingResult implements InterfaceC0755c {

    /* renamed from: n, reason: collision with root package name */
    private final a.c f13288n;

    /* renamed from: o, reason: collision with root package name */
    private final com.google.android.gms.common.api.a f13289o;

    protected AbstractC1090b(com.google.android.gms.common.api.a aVar, com.google.android.gms.common.api.c cVar) {
        super((com.google.android.gms.common.api.c) Z2.r.m(cVar, "GoogleApiClient must not be null"));
        Z2.r.m(aVar, "Api must not be null");
        this.f13288n = aVar.b();
        this.f13289o = aVar;
    }

    private void p(RemoteException remoteException) {
        q(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    protected abstract void m(a.b bVar);

    public final void o(a.b bVar) {
        try {
            m(bVar);
        } catch (DeadObjectException e8) {
            p(e8);
            throw e8;
        } catch (RemoteException e9) {
            p(e9);
        }
    }

    public final void q(Status status) {
        Z2.r.b(!status.E0(), "Failed result must not be success");
        W2.f d8 = d(status);
        g(d8);
        n(d8);
    }

    protected void n(W2.f fVar) {
    }
}
