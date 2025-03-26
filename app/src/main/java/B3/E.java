package B3;

import A3.AbstractC0376j;
import A3.InterfaceC0371e;
import C3.AbstractBinderC0409a1;
import C3.C0434j;
import C3.C0436j1;
import C3.C0451o1;
import C3.C0452p;
import C3.C0454p1;
import C3.W0;
import C3.W1;
import C3.h2;
import C3.k2;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import java.util.List;

/* loaded from: classes2.dex */
final class E extends AbstractBinderC0409a1 {

    /* renamed from: o, reason: collision with root package name */
    private volatile int f403o = -1;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ AbstractServiceC0403w f404s;

    /* synthetic */ E(AbstractServiceC0403w abstractServiceC0403w, F f8) {
        this.f404s = abstractServiceC0403w;
    }

    static final /* synthetic */ void J0(W0 w02, AbstractC0376j abstractC0376j) {
        if (abstractC0376j.s()) {
            q2(w02, true, (byte[]) abstractC0376j.o());
        } else {
            Log.e("WearableLS", "Failed to resolve future, sending null response", abstractC0376j.n());
            q2(w02, false, null);
        }
    }

    private final boolean p2(Runnable runnable, String str, Object obj) {
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", String.format("%s: %s %s", str, this.f404s.f483o.toString(), obj));
        }
        int callingUid = Binder.getCallingUid();
        if (callingUid != this.f403o) {
            if ((!h2.a(this.f404s).b() || !f3.r.b(this.f404s, callingUid, "com.google.android.wearable.app.cn")) && !f3.r.a(this.f404s, callingUid)) {
                Log.e("WearableLS", "Caller is not GooglePlayServices; caller UID: " + callingUid);
                return false;
            }
            this.f403o = callingUid;
        }
        synchronized (this.f404s.f488w) {
            try {
                AbstractServiceC0403w abstractServiceC0403w = this.f404s;
                if (abstractServiceC0403w.f489x) {
                    return false;
                }
                abstractServiceC0403w.f484s.post(runnable);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static final void q2(W0 w02, boolean z7, byte[] bArr) {
        try {
            w02.p2(z7, bArr);
        } catch (RemoteException e8) {
            Log.e("WearableLS", "Failed to send a response back", e8);
        }
    }

    final /* synthetic */ void D0(C0436j1 c0436j1, final W0 w02) {
        AbstractC0376j c8 = this.f404s.c(c0436j1.A0(), c0436j1.i0(), c0436j1.getData());
        if (c8 == null) {
            q2(w02, false, null);
        } else {
            c8.c(new InterfaceC0371e(this) { // from class: B3.X
                @Override // A3.InterfaceC0371e
                public final void a(AbstractC0376j abstractC0376j) {
                    E.J0(w02, abstractC0376j);
                }
            });
        }
    }

    @Override // C3.InterfaceC0412b1
    public final void G5(k2 k2Var) {
        p2(new B(this, k2Var), "onNotificationReceived", k2Var);
    }

    @Override // C3.InterfaceC0412b1
    public final void M1(W1 w12) {
        p2(new C(this, w12), "onEntityUpdate", w12);
    }

    @Override // C3.InterfaceC0412b1
    public final void O0(C0454p1 c0454p1) {
        p2(new b0(this, c0454p1), "onPeerConnected", c0454p1);
    }

    @Override // C3.InterfaceC0412b1
    public final void R0(C0434j c0434j) {
        p2(new A(this, c0434j), "onConnectedCapabilityChanged", c0434j);
    }

    @Override // C3.InterfaceC0412b1
    public final void W6(List list) {
        p2(new RunnableC0406z(this, list), "onConnectedNodes", list);
    }

    @Override // C3.InterfaceC0412b1
    public final void h4(C0452p c0452p) {
        p2(new D(this, c0452p), "onChannelEvent", c0452p);
    }

    @Override // C3.InterfaceC0412b1
    public final void k5(final C0451o1 c0451o1) {
        if (p2(new Runnable() { // from class: B3.Y
            @Override // java.lang.Runnable
            public final void run() {
                C0451o1 c0451o12 = c0451o1;
                C0393l c0393l = new C0393l(c0451o12.f1019s);
                try {
                    this.f449o.f404s.o(c0451o12.f1018o, c0393l);
                    c0393l.close();
                } catch (Throwable th) {
                    try {
                        c0393l.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }, "onNodeMigrated", "DataHolder[rows=" + c0451o1.f1019s.getCount() + "]")) {
            return;
        }
        c0451o1.f1019s.close();
    }

    @Override // C3.InterfaceC0412b1
    public final void n6(final C0436j1 c0436j1, final W0 w02) {
        p2(new Runnable() { // from class: B3.W
            @Override // java.lang.Runnable
            public final void run() {
                this.f445o.D0(c0436j1, w02);
            }
        }, "onRequestReceived", c0436j1);
    }

    @Override // C3.InterfaceC0412b1
    public final void p1(C0436j1 c0436j1) {
        p2(new a0(this, c0436j1), "onMessageReceived", c0436j1);
    }

    @Override // C3.InterfaceC0412b1
    public final void x1(C0454p1 c0454p1) {
        p2(new c0(this, c0454p1), "onPeerDisconnected", c0454p1);
    }

    @Override // C3.InterfaceC0412b1
    public final void z5(DataHolder dataHolder) {
        try {
            if (p2(new Z(this, dataHolder), "onDataItemChanged", String.valueOf(dataHolder) + ", rows=" + dataHolder.getCount())) {
            }
        } finally {
            dataHolder.close();
        }
    }
}
