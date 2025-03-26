package X2;

import Z2.C0766e;
import Z2.Q;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.C1103b;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import java.util.Set;

/* loaded from: classes.dex */
public final class B extends y3.d implements c.a, c.b {

    /* renamed from: y, reason: collision with root package name */
    private static final a.AbstractC0225a f5898y = x3.d.f44442c;

    /* renamed from: o, reason: collision with root package name */
    private final Context f5899o;

    /* renamed from: s, reason: collision with root package name */
    private final Handler f5900s;

    /* renamed from: t, reason: collision with root package name */
    private final a.AbstractC0225a f5901t;

    /* renamed from: u, reason: collision with root package name */
    private final Set f5902u;

    /* renamed from: v, reason: collision with root package name */
    private final C0766e f5903v;

    /* renamed from: w, reason: collision with root package name */
    private x3.e f5904w;

    /* renamed from: x, reason: collision with root package name */
    private A f5905x;

    public B(Context context, Handler handler, C0766e c0766e) {
        a.AbstractC0225a abstractC0225a = f5898y;
        this.f5899o = context;
        this.f5900s = handler;
        this.f5903v = (C0766e) Z2.r.m(c0766e, "ClientSettings must not be null");
        this.f5902u = c0766e.e();
        this.f5901t = abstractC0225a;
    }

    static /* bridge */ /* synthetic */ void r3(B b8, y3.l lVar) {
        C1103b A02 = lVar.A0();
        if (A02.E0()) {
            Q q8 = (Q) Z2.r.l(lVar.B0());
            C1103b A03 = q8.A0();
            if (!A03.E0()) {
                String valueOf = String.valueOf(A03);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                b8.f5905x.c(A03);
                b8.f5904w.g();
                return;
            }
            b8.f5905x.b(q8.B0(), b8.f5902u);
        } else {
            b8.f5905x.c(A02);
        }
        b8.f5904w.g();
    }

    @Override // X2.InterfaceC0761i
    public final void D0(C1103b c1103b) {
        this.f5905x.c(c1103b);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.common.api.a$f, x3.e] */
    public final void I3(A a8) {
        x3.e eVar = this.f5904w;
        if (eVar != null) {
            eVar.g();
        }
        this.f5903v.i(Integer.valueOf(System.identityHashCode(this)));
        a.AbstractC0225a abstractC0225a = this.f5901t;
        Context context = this.f5899o;
        Handler handler = this.f5900s;
        C0766e c0766e = this.f5903v;
        this.f5904w = abstractC0225a.b(context, handler.getLooper(), c0766e, c0766e.f(), this, this);
        this.f5905x = a8;
        Set set = this.f5902u;
        if (set == null || set.isEmpty()) {
            this.f5900s.post(new y(this));
        } else {
            this.f5904w.p();
        }
    }

    @Override // y3.f
    public final void I4(y3.l lVar) {
        this.f5900s.post(new z(this, lVar));
    }

    @Override // X2.InterfaceC0756d
    public final void J0(Bundle bundle) {
        this.f5904w.a(this);
    }

    public final void W4() {
        x3.e eVar = this.f5904w;
        if (eVar != null) {
            eVar.g();
        }
    }

    @Override // X2.InterfaceC0756d
    public final void w0(int i8) {
        this.f5905x.d(i8);
    }
}
