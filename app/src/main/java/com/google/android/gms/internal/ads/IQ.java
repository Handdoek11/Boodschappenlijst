package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.C1103b;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class IQ extends MQ {

    /* renamed from: g, reason: collision with root package name */
    private final Context f15942g;

    /* renamed from: h, reason: collision with root package name */
    private final Executor f15943h;

    public IQ(Context context, Executor executor) {
        this.f15942g = context;
        this.f15943h = executor;
        this.f17352f = new C2116ao(context, C2.v.x().b(), this, this);
    }

    @Override // com.google.android.gms.internal.ads.MQ, Z2.AbstractC0765d.b
    public final void D0(C1103b c1103b) {
        H2.p.b("Cannot connect to remote service, fallback to local instance.");
        this.f17347a.d(new zzdyh(1));
    }

    @Override // Z2.AbstractC0765d.a
    public final void J0(Bundle bundle) {
        synchronized (this.f17348b) {
            try {
                if (!this.f17350d) {
                    this.f17350d = true;
                    try {
                        this.f17352f.j0().h3(this.f17351e, ((Boolean) D2.A.c().a(AbstractC3184kf.Nc)).booleanValue() ? new LQ(this.f17347a, this.f17351e) : new KQ(this));
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.f17347a.d(new zzdyh(1));
                    } catch (Throwable th) {
                        C2.v.s().x(th, "RemoteAdRequestClientTask.onConnected");
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
                this.f17347a.f(new Runnable() { // from class: com.google.android.gms.internal.ads.HQ
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f15724o.a();
                    }
                }, AbstractC1497Kq.f16650g);
                MQ.b(this.f15942g, this.f17347a, this.f15943h);
                return this.f17347a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
