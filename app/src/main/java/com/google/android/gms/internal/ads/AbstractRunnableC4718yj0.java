package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.internal.ads.yj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractRunnableC4718yj0 extends Rj0 implements Runnable {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f28177A = 0;

    /* renamed from: y, reason: collision with root package name */
    com.google.common.util.concurrent.d f28178y;

    /* renamed from: z, reason: collision with root package name */
    Object f28179z;

    AbstractRunnableC4718yj0(com.google.common.util.concurrent.d dVar, Object obj) {
        dVar.getClass();
        this.f28178y = dVar;
        this.f28179z = obj;
    }

    abstract Object E(Object obj, Object obj2);

    abstract void F(Object obj);

    @Override // com.google.android.gms.internal.ads.AbstractC3738pj0
    protected final String c() {
        String str;
        com.google.common.util.concurrent.d dVar = this.f28178y;
        Object obj = this.f28179z;
        String c8 = super.c();
        if (dVar != null) {
            str = "inputFuture=[" + dVar.toString() + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (c8 != null) {
                return str.concat(c8);
            }
            return null;
        }
        return str + "function=[" + obj.toString() + "]";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3738pj0
    protected final void d() {
        u(this.f28178y);
        this.f28178y = null;
        this.f28179z = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.common.util.concurrent.d dVar = this.f28178y;
        Object obj = this.f28179z;
        if ((isCancelled() | (dVar == null)) || (obj == null)) {
            return;
        }
        this.f28178y = null;
        if (dVar.isCancelled()) {
            v(dVar);
            return;
        }
        try {
            try {
                Object E7 = E(obj, AbstractC2326ck0.p(dVar));
                this.f28179z = null;
                F(E7);
            } catch (Throwable th) {
                try {
                    AbstractC4502wk0.a(th);
                    h(th);
                } finally {
                    this.f28179z = null;
                }
            }
        } catch (Error e8) {
            h(e8);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e9) {
            h(e9.getCause());
        } catch (Exception e10) {
            h(e10);
        }
    }
}
