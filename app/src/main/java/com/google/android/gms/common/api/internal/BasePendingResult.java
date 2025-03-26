package com.google.android.gms.common.api.internal;

import W2.d;
import W2.f;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends W2.f> extends W2.d {

    /* renamed from: m, reason: collision with root package name */
    static final ThreadLocal f13250m = new M();

    /* renamed from: b, reason: collision with root package name */
    protected final a f13252b;

    /* renamed from: c, reason: collision with root package name */
    protected final WeakReference f13253c;

    /* renamed from: g, reason: collision with root package name */
    private W2.f f13257g;

    /* renamed from: h, reason: collision with root package name */
    private Status f13258h;

    /* renamed from: i, reason: collision with root package name */
    private volatile boolean f13259i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f13260j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f13261k;

    @KeepName
    private N resultGuardian;

    /* renamed from: a, reason: collision with root package name */
    private final Object f13251a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final CountDownLatch f13254d = new CountDownLatch(1);

    /* renamed from: e, reason: collision with root package name */
    private final ArrayList f13255e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference f13256f = new AtomicReference();

    /* renamed from: l, reason: collision with root package name */
    private boolean f13262l = false;

    public static class a extends m3.h {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i8 = message.what;
            if (i8 == 1) {
                Pair pair = (Pair) message.obj;
                androidx.appcompat.app.E.a(pair.first);
                W2.f fVar = (W2.f) pair.second;
                try {
                    throw null;
                } catch (RuntimeException e8) {
                    BasePendingResult.l(fVar);
                    throw e8;
                }
            }
            if (i8 == 2) {
                ((BasePendingResult) message.obj).e(Status.f13222z);
                return;
            }
            Log.wtf("BasePendingResult", "Don't know how to handle message: " + i8, new Exception());
        }
    }

    protected BasePendingResult(com.google.android.gms.common.api.c cVar) {
        this.f13252b = new a(cVar != null ? cVar.b() : Looper.getMainLooper());
        this.f13253c = new WeakReference(cVar);
    }

    private final W2.f h() {
        W2.f fVar;
        synchronized (this.f13251a) {
            Z2.r.q(!this.f13259i, "Result has already been consumed.");
            Z2.r.q(f(), "Result is not ready.");
            fVar = this.f13257g;
            this.f13257g = null;
            this.f13259i = true;
        }
        androidx.appcompat.app.E.a(this.f13256f.getAndSet(null));
        return (W2.f) Z2.r.l(fVar);
    }

    private final void i(W2.f fVar) {
        this.f13257g = fVar;
        this.f13258h = fVar.m0();
        this.f13254d.countDown();
        if (!this.f13260j && (this.f13257g instanceof W2.e)) {
            this.resultGuardian = new N(this, null);
        }
        ArrayList arrayList = this.f13255e;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((d.a) arrayList.get(i8)).a(this.f13258h);
        }
        this.f13255e.clear();
    }

    public static void l(W2.f fVar) {
        if (fVar instanceof W2.e) {
            try {
                ((W2.e) fVar).d();
            } catch (RuntimeException e8) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(fVar)), e8);
            }
        }
    }

    @Override // W2.d
    public final void b(d.a aVar) {
        Z2.r.b(aVar != null, "Callback cannot be null.");
        synchronized (this.f13251a) {
            try {
                if (f()) {
                    aVar.a(this.f13258h);
                } else {
                    this.f13255e.add(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // W2.d
    public final W2.f c(long j8, TimeUnit timeUnit) {
        if (j8 > 0) {
            Z2.r.k("await must not be called on the UI thread when time is greater than zero.");
        }
        Z2.r.q(!this.f13259i, "Result has already been consumed.");
        Z2.r.q(true, "Cannot await if then() has been called.");
        try {
            if (!this.f13254d.await(j8, timeUnit)) {
                e(Status.f13222z);
            }
        } catch (InterruptedException unused) {
            e(Status.f13220x);
        }
        Z2.r.q(f(), "Result is not ready.");
        return h();
    }

    protected abstract W2.f d(Status status);

    public final void e(Status status) {
        synchronized (this.f13251a) {
            try {
                if (!f()) {
                    g(d(status));
                    this.f13261k = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean f() {
        return this.f13254d.getCount() == 0;
    }

    public final void g(W2.f fVar) {
        synchronized (this.f13251a) {
            try {
                if (this.f13261k || this.f13260j) {
                    l(fVar);
                    return;
                }
                f();
                Z2.r.q(!f(), "Results have already been set");
                Z2.r.q(!this.f13259i, "Result has already been consumed");
                i(fVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k() {
        boolean z7 = true;
        if (!this.f13262l && !((Boolean) f13250m.get()).booleanValue()) {
            z7 = false;
        }
        this.f13262l = z7;
    }
}
