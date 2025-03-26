package com.google.android.gms.common.api.internal;

import A3.C0377k;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
abstract class C extends X2.s {

    /* renamed from: b, reason: collision with root package name */
    protected final C0377k f13263b;

    public C(int i8, C0377k c0377k) {
        super(i8);
        this.f13263b = c0377k;
    }

    @Override // com.google.android.gms.common.api.internal.H
    public final void a(Status status) {
        this.f13263b.d(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.H
    public final void b(Exception exc) {
        this.f13263b.d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.H
    public final void c(s sVar) {
        try {
            h(sVar);
        } catch (DeadObjectException e8) {
            a(H.e(e8));
            throw e8;
        } catch (RemoteException e9) {
            a(H.e(e9));
        } catch (RuntimeException e10) {
            this.f13263b.d(e10);
        }
    }

    protected abstract void h(s sVar);
}
