package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class OQ extends MQ {

    /* renamed from: g, reason: collision with root package name */
    private final Context f17882g;

    /* renamed from: h, reason: collision with root package name */
    private final Executor f17883h;

    OQ(Context context, Executor executor) {
        this.f17882g = context;
        this.f17883h = executor;
        this.f17352f = new C2116ao(context, C2.v.x().b(), this, this);
    }

    @Override // Z2.AbstractC0765d.a
    public final void J0(Bundle bundle) {
        synchronized (this.f17348b) {
            try {
                if (!this.f17350d) {
                    this.f17350d = true;
                    try {
                        this.f17352f.j0().a4(this.f17351e, ((Boolean) D2.A.c().a(AbstractC3184kf.Nc)).booleanValue() ? new LQ(this.f17347a, this.f17351e) : new KQ(this));
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.f17347a.d(new zzdyh(1));
                    } catch (Throwable th) {
                        C2.v.s().x(th, "RemoteSignalsClientTask.onConnected");
                        this.f17347a.d(new zzdyh(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final com.google.common.util.concurrent.d c(C4618xo c4618xo) {
        synchronized (this.f17348b) {
            try {
                if (this.f17349c) {
                    return this.f17347a;
                }
                this.f17349c = true;
                this.f17351e = c4618xo;
                this.f17352f.q();
                this.f17347a.f(new Runnable() { // from class: com.google.android.gms.internal.ads.NQ
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f17529o.a();
                    }
                }, AbstractC1497Kq.f16650g);
                MQ.b(this.f17882g, this.f17347a, this.f17883h);
                return this.f17347a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
