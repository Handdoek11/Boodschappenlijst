package com.google.android.gms.common.api.internal;

import A3.C0377k;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.C1105d;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class F extends X2.s {

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC1096h f13266b;

    /* renamed from: c, reason: collision with root package name */
    private final C0377k f13267c;

    /* renamed from: d, reason: collision with root package name */
    private final X2.k f13268d;

    public F(int i8, AbstractC1096h abstractC1096h, C0377k c0377k, X2.k kVar) {
        super(i8);
        this.f13267c = c0377k;
        this.f13266b = abstractC1096h;
        this.f13268d = kVar;
        if (i8 == 2 && abstractC1096h.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.H
    public final void a(Status status) {
        this.f13267c.d(this.f13268d.a(status));
    }

    @Override // com.google.android.gms.common.api.internal.H
    public final void b(Exception exc) {
        this.f13267c.d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.H
    public final void c(s sVar) {
        try {
            this.f13266b.b(sVar.s(), this.f13267c);
        } catch (DeadObjectException e8) {
            throw e8;
        } catch (RemoteException e9) {
            a(H.e(e9));
        } catch (RuntimeException e10) {
            this.f13267c.d(e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.H
    public final void d(C1100l c1100l, boolean z7) {
        c1100l.d(this.f13267c, z7);
    }

    @Override // X2.s
    public final boolean f(s sVar) {
        return this.f13266b.c();
    }

    @Override // X2.s
    public final C1105d[] g(s sVar) {
        return this.f13266b.e();
    }
}
