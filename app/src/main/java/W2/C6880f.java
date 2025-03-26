package w2;

import D2.BinderC0560z1;
import D2.C0501f1;
import D2.C0555y;
import D2.N;
import D2.P1;
import D2.Q;
import D2.Q1;
import D2.b2;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.internal.ads.AbstractC3077jg;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import com.google.android.gms.internal.ads.BinderC2321ci;
import com.google.android.gms.internal.ads.BinderC3091jn;
import com.google.android.gms.internal.ads.BinderC4830zl;
import com.google.android.gms.internal.ads.C1553Mg;
import com.google.android.gms.internal.ads.C2213bi;
import z2.C7070e;
import z2.InterfaceC7077l;
import z2.InterfaceC7078m;
import z2.InterfaceC7080o;

/* renamed from: w2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6880f {

    /* renamed from: a, reason: collision with root package name */
    private final b2 f44265a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f44266b;

    /* renamed from: c, reason: collision with root package name */
    private final N f44267c;

    /* renamed from: w2.f$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f44268a;

        /* renamed from: b, reason: collision with root package name */
        private final Q f44269b;

        public a(Context context, String str) {
            Context context2 = (Context) Z2.r.m(context, "context cannot be null");
            Q c8 = C0555y.a().c(context, str, new BinderC4830zl());
            this.f44268a = context2;
            this.f44269b = c8;
        }

        public C6880f a() {
            try {
                return new C6880f(this.f44268a, this.f44269b.b(), b2.f1210a);
            } catch (RemoteException e8) {
                H2.p.e("Failed to build AdLoader.", e8);
                return new C6880f(this.f44268a, new BinderC0560z1().u7(), b2.f1210a);
            }
        }

        public a b(NativeAd.c cVar) {
            try {
                this.f44269b.M6(new BinderC3091jn(cVar));
            } catch (RemoteException e8) {
                H2.p.h("Failed to add google native ad listener", e8);
            }
            return this;
        }

        public a c(AbstractC6878d abstractC6878d) {
            try {
                this.f44269b.X1(new P1(abstractC6878d));
            } catch (RemoteException e8) {
                H2.p.h("Failed to set AdListener.", e8);
            }
            return this;
        }

        public a d(com.google.android.gms.ads.nativead.c cVar) {
            try {
                this.f44269b.B5(new C1553Mg(4, cVar.e(), -1, cVar.d(), cVar.a(), cVar.c() != null ? new Q1(cVar.c()) : null, cVar.h(), cVar.b(), cVar.f(), cVar.g(), cVar.i() - 1));
            } catch (RemoteException e8) {
                H2.p.h("Failed to specify native ad options", e8);
            }
            return this;
        }

        public final a e(String str, InterfaceC7078m interfaceC7078m, InterfaceC7077l interfaceC7077l) {
            C2213bi c2213bi = new C2213bi(interfaceC7078m, interfaceC7077l);
            try {
                this.f44269b.O3(str, c2213bi.d(), c2213bi.c());
            } catch (RemoteException e8) {
                H2.p.h("Failed to add custom template ad listener", e8);
            }
            return this;
        }

        public final a f(InterfaceC7080o interfaceC7080o) {
            try {
                this.f44269b.M6(new BinderC2321ci(interfaceC7080o));
            } catch (RemoteException e8) {
                H2.p.h("Failed to add google native ad listener", e8);
            }
            return this;
        }

        public final a g(C7070e c7070e) {
            try {
                this.f44269b.B5(new C1553Mg(c7070e));
            } catch (RemoteException e8) {
                H2.p.h("Failed to specify native ad options", e8);
            }
            return this;
        }
    }

    C6880f(Context context, N n8, b2 b2Var) {
        this.f44266b = context;
        this.f44267c = n8;
        this.f44265a = b2Var;
    }

    private final void c(final C0501f1 c0501f1) {
        AbstractC3184kf.a(this.f44266b);
        if (((Boolean) AbstractC3077jg.f23297c.e()).booleanValue()) {
            if (((Boolean) D2.A.c().a(AbstractC3184kf.bb)).booleanValue()) {
                H2.c.f2922b.execute(new Runnable() { // from class: w2.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f44325o.b(c0501f1);
                    }
                });
                return;
            }
        }
        try {
            this.f44267c.K6(this.f44265a.a(this.f44266b, c0501f1));
        } catch (RemoteException e8) {
            H2.p.e("Failed to load ad.", e8);
        }
    }

    public void a(C6881g c6881g) {
        c(c6881g.f44270a);
    }

    final /* synthetic */ void b(C0501f1 c0501f1) {
        try {
            this.f44267c.K6(this.f44265a.a(this.f44266b, c0501f1));
        } catch (RemoteException e8) {
            H2.p.e("Failed to load ad.", e8);
        }
    }
}
