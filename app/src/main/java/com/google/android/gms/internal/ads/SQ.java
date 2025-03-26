package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.C1103b;

/* loaded from: classes.dex */
public final class SQ extends MQ {

    /* renamed from: g, reason: collision with root package name */
    private String f18900g;

    /* renamed from: h, reason: collision with root package name */
    private int f18901h = 1;

    SQ(Context context) {
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
                        int i8 = this.f18901h;
                        if (i8 == 2) {
                            this.f17352f.j0().o1(this.f17351e, ((Boolean) D2.A.c().a(AbstractC3184kf.Nc)).booleanValue() ? new LQ(this.f17347a, this.f17351e) : new KQ(this));
                        } else if (i8 == 3) {
                            this.f17352f.j0().r4(this.f18900g, ((Boolean) D2.A.c().a(AbstractC3184kf.Nc)).booleanValue() ? new LQ(this.f17347a, this.f17351e) : new KQ(this));
                        } else {
                            this.f17347a.d(new zzdyh(1));
                        }
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.f17347a.d(new zzdyh(1));
                    } catch (Throwable th) {
                        C2.v.s().x(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
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
                int i8 = this.f18901h;
                if (i8 != 1 && i8 != 2) {
                    return AbstractC2326ck0.g(new zzdyh(2));
                }
                if (this.f17349c) {
                    return this.f17347a;
                }
                this.f18901h = 2;
                this.f17349c = true;
                this.f17351e = c4618xo;
                this.f17352f.q();
                this.f17347a.f(new Runnable() { // from class: com.google.android.gms.internal.ads.QQ
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f18463o.a();
                    }
                }, AbstractC1497Kq.f16650g);
                return this.f17347a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final com.google.common.util.concurrent.d d(String str) {
        synchronized (this.f17348b) {
            try {
                int i8 = this.f18901h;
                if (i8 != 1 && i8 != 3) {
                    return AbstractC2326ck0.g(new zzdyh(2));
                }
                if (this.f17349c) {
                    return this.f17347a;
                }
                this.f18901h = 3;
                this.f17349c = true;
                this.f18900g = str;
                this.f17352f.q();
                this.f17347a.f(new Runnable() { // from class: com.google.android.gms.internal.ads.RQ
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f18650o.a();
                    }
                }, AbstractC1497Kq.f16650g);
                return this.f17347a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
