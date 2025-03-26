package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class D extends H {

    /* renamed from: b, reason: collision with root package name */
    protected final AbstractC1090b f13264b;

    public D(int i8, AbstractC1090b abstractC1090b) {
        super(i8);
        this.f13264b = (AbstractC1090b) Z2.r.m(abstractC1090b, "Null methods are not runnable.");
    }

    @Override // com.google.android.gms.common.api.internal.H
    public final void a(Status status) {
        try {
            this.f13264b.q(status);
        } catch (IllegalStateException e8) {
            Log.w("ApiCallRunner", "Exception reporting failure", e8);
        }
    }

    @Override // com.google.android.gms.common.api.internal.H
    public final void b(Exception exc) {
        try {
            this.f13264b.q(new Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage()));
        } catch (IllegalStateException e8) {
            Log.w("ApiCallRunner", "Exception reporting failure", e8);
        }
    }

    @Override // com.google.android.gms.common.api.internal.H
    public final void c(s sVar) {
        try {
            this.f13264b.o(sVar.s());
        } catch (RuntimeException e8) {
            b(e8);
        }
    }

    @Override // com.google.android.gms.common.api.internal.H
    public final void d(C1100l c1100l, boolean z7) {
        c1100l.c(this.f13264b, z7);
    }
}
