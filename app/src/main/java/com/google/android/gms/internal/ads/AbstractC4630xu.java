package com.google.android.gms.internal.ads;

import G2.AbstractC0606o0;
import G2.C0586e0;
import M2.BinderC0675w;
import M2.InterfaceC0657d;
import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.xu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4630xu implements InterfaceC1181Bw {

    /* renamed from: a, reason: collision with root package name */
    private static AbstractC4630xu f27938a;

    private static synchronized AbstractC4630xu g(Context context, InterfaceC1242Dl interfaceC1242Dl, int i8, boolean z7, int i9, C2673fv c2673fv) {
        synchronized (AbstractC4630xu.class) {
            try {
                AbstractC4630xu abstractC4630xu = f27938a;
                if (abstractC4630xu != null) {
                    return abstractC4630xu;
                }
                long a8 = C2.v.c().a();
                AbstractC3184kf.a(context);
                if (((Boolean) AbstractC2426dg.f21630e.e()).booleanValue()) {
                    AbstractC1829Ue.d(context);
                }
                C2808h70 d8 = C2808h70.d(context);
                H2.a c8 = d8.c(244410000, false, i9);
                d8.f(interfaceC1242Dl);
                C4305uv c4305uv = new C4305uv(null);
                C4739yu c4739yu = new C4739yu();
                c4739yu.f(c8);
                c4739yu.e(context);
                c4739yu.d(a8);
                c4305uv.b(new C1179Bu(c4739yu, null));
                c4305uv.c(new C1711Qv(c2673fv));
                AbstractC4630xu a9 = c4305uv.a();
                C2.v.s().v(context, c8);
                C2.v.f().i(context);
                C2.v.t().R(context);
                C2.v.t().Q(context);
                AbstractC0606o0.a(context);
                C2.v.e().d(context);
                C2.v.z().b(context);
                a9.h().c();
                AbstractC1985Yp.d(context);
                if (((Boolean) D2.A.c().a(AbstractC3184kf.f23854b6)).booleanValue()) {
                    if (!((Boolean) D2.A.c().a(AbstractC3184kf.f23695I0)).booleanValue()) {
                        new C4364vS(context, c8, new C2000Zc(new C2637fd(context)), new C2080aS(new UR(context), a9.c())).b(C2.v.s().j().L());
                    }
                }
                f27938a = a9;
                return a9;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static AbstractC4630xu i(Context context, InterfaceC1242Dl interfaceC1242Dl, int i8) {
        return g(context, interfaceC1242Dl, 244410000, false, i8, new C2673fv());
    }

    public abstract A40 A();

    public abstract InterfaceC4000s50 B();

    public abstract InterfaceC3022j60 C();

    public abstract Z60 D();

    public abstract C3133k70 E();

    public abstract RunnableC3791q90 F();

    @Override // com.google.android.gms.internal.ads.InterfaceC1181Bw
    public final C3860qq M() {
        return f();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1181Bw
    public final O20 a(C4618xo c4618xo, int i8) {
        return y(new C3996s30(c4618xo, i8));
    }

    public abstract BinderC3829qa0 b();

    public abstract InterfaceExecutorServiceC3522nk0 c();

    public abstract Executor d();

    public abstract ScheduledExecutorService e();

    public abstract C3860qq f();

    public abstract C0586e0 h();

    public abstract BinderC2241bw j();

    public abstract InterfaceC2897hy k();

    public abstract InterfaceC2029Zy l();

    public abstract ED m();

    public abstract InterfaceC4132tH n();

    public abstract PH o();

    public abstract ML p();

    public abstract HN q();

    public abstract InterfaceC4251uO r();

    public abstract C3490nP s();

    public abstract LP t();

    public abstract US u();

    public abstract M2.s0 v();

    public abstract InterfaceC0657d w();

    public abstract BinderC0675w x();

    protected abstract O20 y(C3996s30 c3996s30);

    public abstract K30 z();
}
