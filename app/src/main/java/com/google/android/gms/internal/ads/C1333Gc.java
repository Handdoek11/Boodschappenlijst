package com.google.android.gms.internal.ads;

import Z2.AbstractC0765d;
import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Gc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1333Gc {

    /* renamed from: a, reason: collision with root package name */
    private ScheduledFuture f15409a = null;

    /* renamed from: b, reason: collision with root package name */
    private final Runnable f15410b = new RunnableC1189Cc(this);

    /* renamed from: c, reason: collision with root package name */
    private final Object f15411c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private C1441Jc f15412d;

    /* renamed from: e, reason: collision with root package name */
    private Context f15413e;

    /* renamed from: f, reason: collision with root package name */
    private C1545Mc f15414f;

    static /* bridge */ /* synthetic */ void h(C1333Gc c1333Gc) {
        synchronized (c1333Gc.f15411c) {
            try {
                C1441Jc c1441Jc = c1333Gc.f15412d;
                if (c1441Jc == null) {
                    return;
                }
                if (c1441Jc.h() || c1333Gc.f15412d.e()) {
                    c1333Gc.f15412d.g();
                }
                c1333Gc.f15412d = null;
                c1333Gc.f15414f = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        synchronized (this.f15411c) {
            try {
                if (this.f15413e != null && this.f15412d == null) {
                    C1441Jc d8 = d(new C1261Ec(this), new C1297Fc(this));
                    this.f15412d = d8;
                    d8.q();
                }
            } finally {
            }
        }
    }

    public final long a(C1476Kc c1476Kc) {
        synchronized (this.f15411c) {
            try {
                if (this.f15414f == null) {
                    return -2L;
                }
                if (this.f15412d.j0()) {
                    try {
                        return this.f15414f.q2(c1476Kc);
                    } catch (RemoteException e8) {
                        H2.p.e("Unable to call into cache service.", e8);
                    }
                }
                return -2L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C1369Hc b(C1476Kc c1476Kc) {
        synchronized (this.f15411c) {
            if (this.f15414f == null) {
                return new C1369Hc();
            }
            try {
                if (this.f15412d.j0()) {
                    return this.f15414f.I3(c1476Kc);
                }
                return this.f15414f.r3(c1476Kc);
            } catch (RemoteException e8) {
                H2.p.e("Unable to call into cache service.", e8);
                return new C1369Hc();
            }
        }
    }

    protected final synchronized C1441Jc d(AbstractC0765d.a aVar, AbstractC0765d.b bVar) {
        return new C1441Jc(this.f15413e, C2.v.x().b(), aVar, bVar);
    }

    public final void i(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.f15411c) {
            try {
                if (this.f15413e != null) {
                    return;
                }
                this.f15413e = context.getApplicationContext();
                if (((Boolean) D2.A.c().a(AbstractC3184kf.f23951m4)).booleanValue()) {
                    l();
                } else {
                    if (((Boolean) D2.A.c().a(AbstractC3184kf.f23942l4)).booleanValue()) {
                        C2.v.e().c(new C1225Dc(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j() {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23960n4)).booleanValue()) {
            synchronized (this.f15411c) {
                try {
                    l();
                    ScheduledFuture scheduledFuture = this.f15409a;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f15409a = AbstractC1497Kq.f16647d.schedule(this.f15410b, ((Long) D2.A.c().a(AbstractC3184kf.f23969o4)).longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
