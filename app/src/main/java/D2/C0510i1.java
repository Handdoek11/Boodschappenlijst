package D2;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.BinderC1543Mb;
import com.google.android.gms.internal.ads.BinderC4830zl;
import i3.BinderC5853b;
import i3.InterfaceC5852a;
import java.util.concurrent.atomic.AtomicBoolean;
import w2.AbstractC6878d;
import w2.C6882h;
import x2.InterfaceC6905d;

/* renamed from: D2.i1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0510i1 {

    /* renamed from: a, reason: collision with root package name */
    private final BinderC4830zl f1280a;

    /* renamed from: b, reason: collision with root package name */
    private final b2 f1281b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f1282c;

    /* renamed from: d, reason: collision with root package name */
    private final w2.w f1283d;

    /* renamed from: e, reason: collision with root package name */
    final AbstractC0558z f1284e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC0484a f1285f;

    /* renamed from: g, reason: collision with root package name */
    private AbstractC6878d f1286g;

    /* renamed from: h, reason: collision with root package name */
    private C6882h[] f1287h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC6905d f1288i;

    /* renamed from: j, reason: collision with root package name */
    private V f1289j;

    /* renamed from: k, reason: collision with root package name */
    private w2.x f1290k;

    /* renamed from: l, reason: collision with root package name */
    private String f1291l;

    /* renamed from: m, reason: collision with root package name */
    private final ViewGroup f1292m;

    /* renamed from: n, reason: collision with root package name */
    private int f1293n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f1294o;

    public C0510i1(ViewGroup viewGroup, int i8) {
        this(viewGroup, null, false, b2.f1210a, null, i8);
    }

    private static c2 b(Context context, C6882h[] c6882hArr, int i8) {
        for (C6882h c6882h : c6882hArr) {
            if (c6882h.equals(C6882h.f44279q)) {
                return new c2("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
            }
        }
        c2 c2Var = new c2(context, c6882hArr);
        c2Var.f1215A = c(i8);
        return c2Var;
    }

    private static boolean c(int i8) {
        return i8 == 1;
    }

    public final void A(w2.x xVar) {
        this.f1290k = xVar;
        try {
            V v7 = this.f1289j;
            if (v7 != null) {
                v7.r6(xVar == null ? null : new Q1(xVar));
            }
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
    }

    public final C6882h[] a() {
        return this.f1287h;
    }

    public final AbstractC6878d d() {
        return this.f1286g;
    }

    public final C6882h e() {
        c2 g8;
        try {
            V v7 = this.f1289j;
            if (v7 != null && (g8 = v7.g()) != null) {
                return w2.z.c(g8.f1225v, g8.f1222s, g8.f1221o);
            }
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
        C6882h[] c6882hArr = this.f1287h;
        if (c6882hArr != null) {
            return c6882hArr[0];
        }
        return null;
    }

    public final w2.o f() {
        return null;
    }

    public final w2.u g() {
        U0 u02 = null;
        try {
            V v7 = this.f1289j;
            if (v7 != null) {
                u02 = v7.i();
            }
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
        return w2.u.d(u02);
    }

    public final w2.w i() {
        return this.f1283d;
    }

    public final w2.x j() {
        return this.f1290k;
    }

    public final InterfaceC6905d k() {
        return this.f1288i;
    }

    public final Y0 l() {
        V v7 = this.f1289j;
        if (v7 != null) {
            try {
                return v7.j();
            } catch (RemoteException e8) {
                H2.p.i("#007 Could not call remote method.", e8);
            }
        }
        return null;
    }

    public final String m() {
        V v7;
        if (this.f1291l == null && (v7 = this.f1289j) != null) {
            try {
                this.f1291l = v7.r();
            } catch (RemoteException e8) {
                H2.p.i("#007 Could not call remote method.", e8);
            }
        }
        return this.f1291l;
    }

    public final void n() {
        try {
            V v7 = this.f1289j;
            if (v7 != null) {
                v7.B();
            }
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
    }

    final /* synthetic */ void o(InterfaceC5852a interfaceC5852a) {
        this.f1292m.addView((View) BinderC5853b.J0(interfaceC5852a));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d7 A[Catch: RemoteException -> 0x00d5, TRY_LEAVE, TryCatch #1 {RemoteException -> 0x00d5, blocks: (B:27:0x00a4, B:29:0x00aa, B:31:0x00b8, B:33:0x00ca, B:36:0x00d7), top: B:52:0x00a4, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(D2.C0501f1 r14) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: D2.C0510i1.p(D2.f1):void");
    }

    public final void q() {
        try {
            V v7 = this.f1289j;
            if (v7 != null) {
                v7.I();
            }
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
    }

    public final void r() {
        try {
            V v7 = this.f1289j;
            if (v7 != null) {
                v7.c0();
            }
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
    }

    public final void s(InterfaceC0484a interfaceC0484a) {
        try {
            this.f1285f = interfaceC0484a;
            V v7 = this.f1289j;
            if (v7 != null) {
                v7.H2(interfaceC0484a != null ? new BinderC0546v(interfaceC0484a) : null);
            }
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
    }

    public final void t(AbstractC6878d abstractC6878d) {
        this.f1286g = abstractC6878d;
        this.f1284e.t(abstractC6878d);
    }

    public final void u(C6882h... c6882hArr) {
        if (this.f1287h != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        v(c6882hArr);
    }

    public final void v(C6882h... c6882hArr) {
        this.f1287h = c6882hArr;
        try {
            V v7 = this.f1289j;
            if (v7 != null) {
                v7.m5(b(this.f1292m.getContext(), this.f1287h, this.f1293n));
            }
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
        this.f1292m.requestLayout();
    }

    public final void w(String str) {
        if (this.f1291l != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.f1291l = str;
    }

    public final void x(InterfaceC6905d interfaceC6905d) {
        try {
            this.f1288i = interfaceC6905d;
            V v7 = this.f1289j;
            if (v7 != null) {
                v7.h6(interfaceC6905d != null ? new BinderC1543Mb(interfaceC6905d) : null);
            }
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
    }

    public final void y(boolean z7) {
        this.f1294o = z7;
        try {
            V v7 = this.f1289j;
            if (v7 != null) {
                v7.f7(z7);
            }
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
    }

    public final void z(w2.o oVar) {
        try {
            V v7 = this.f1289j;
            if (v7 != null) {
                v7.i3(new H1(oVar));
            }
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
    }

    C0510i1(ViewGroup viewGroup, AttributeSet attributeSet, boolean z7, b2 b2Var, V v7, int i8) {
        c2 c2Var;
        this.f1280a = new BinderC4830zl();
        this.f1283d = new w2.w();
        this.f1284e = new C0507h1(this);
        this.f1292m = viewGroup;
        this.f1281b = b2Var;
        this.f1289j = null;
        this.f1282c = new AtomicBoolean(false);
        this.f1293n = i8;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                C0487b c0487b = new C0487b(context, attributeSet);
                this.f1287h = c0487b.b(z7);
                this.f1291l = c0487b.a();
                if (viewGroup.isInEditMode()) {
                    H2.g b8 = C0555y.b();
                    C6882h c6882h = this.f1287h[0];
                    int i9 = this.f1293n;
                    if (c6882h.equals(C6882h.f44279q)) {
                        c2Var = new c2("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
                    } else {
                        c2 c2Var2 = new c2(context, c6882h);
                        c2Var2.f1215A = c(i9);
                        c2Var = c2Var2;
                    }
                    b8.q(viewGroup, c2Var, "Ads by Google");
                }
            } catch (IllegalArgumentException e8) {
                C0555y.b().p(viewGroup, new c2(context, C6882h.f44271i), e8.getMessage(), e8.getMessage());
            }
        }
    }
}
