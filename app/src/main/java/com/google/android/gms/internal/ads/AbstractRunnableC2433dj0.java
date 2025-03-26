package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.internal.ads.dj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractRunnableC2433dj0 extends Rj0 implements Runnable {

    /* renamed from: A, reason: collision with root package name */
    Object f21639A;

    /* renamed from: y, reason: collision with root package name */
    com.google.common.util.concurrent.d f21640y;

    /* renamed from: z, reason: collision with root package name */
    Class f21641z;

    AbstractRunnableC2433dj0(com.google.common.util.concurrent.d dVar, Class cls, Object obj) {
        dVar.getClass();
        this.f21640y = dVar;
        this.f21641z = cls;
        this.f21639A = obj;
    }

    abstract Object E(Object obj, Throwable th);

    abstract void F(Object obj);

    @Override // com.google.android.gms.internal.ads.AbstractC3738pj0
    protected final String c() {
        String str;
        com.google.common.util.concurrent.d dVar = this.f21640y;
        Class cls = this.f21641z;
        Object obj = this.f21639A;
        String c8 = super.c();
        if (dVar != null) {
            str = "inputFuture=[" + dVar.toString() + "], ";
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (c8 != null) {
                return str.concat(c8);
            }
            return null;
        }
        return str + "exceptionType=[" + cls.toString() + "], fallback=[" + obj.toString() + "]";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3738pj0
    protected final void d() {
        u(this.f21640y);
        this.f21640y = null;
        this.f21641z = null;
        this.f21639A = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        com.google.common.util.concurrent.d dVar = this.f21640y;
        Class cls = this.f21641z;
        Object obj = this.f21639A;
        if (((obj == null) || ((dVar == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.f21640y = null;
        try {
            th = dVar instanceof Gk0 ? ((Gk0) dVar).a() : null;
        } catch (ExecutionException e8) {
            Throwable cause = e8.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + String.valueOf(dVar.getClass()) + " threw " + String.valueOf(e8.getClass()) + " without a cause");
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        Object p8 = th == null ? AbstractC2326ck0.p(dVar) : null;
        if (th == null) {
            e(p8);
            return;
        }
        if (!cls.isInstance(th)) {
            v(dVar);
            return;
        }
        try {
            Object E7 = E(obj, th);
            this.f21641z = null;
            this.f21639A = null;
            F(E7);
        } catch (Throwable th2) {
            try {
                AbstractC4502wk0.a(th2);
                h(th2);
            } finally {
                this.f21641z = null;
                this.f21639A = null;
            }
        }
    }
}
