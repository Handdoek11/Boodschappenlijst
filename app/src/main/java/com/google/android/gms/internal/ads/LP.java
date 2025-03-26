package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.nativead.NativeAd;
import i3.BinderC5853b;
import i3.InterfaceC5852a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import w2.C6881g;
import y2.AbstractC6943a;

/* loaded from: classes.dex */
public final class LP extends D2.P0 {

    /* renamed from: o, reason: collision with root package name */
    final Map f16825o = new HashMap();

    /* renamed from: s, reason: collision with root package name */
    private final Context f16826s;

    /* renamed from: t, reason: collision with root package name */
    private final WeakReference f16827t;

    /* renamed from: u, reason: collision with root package name */
    private final C4797zP f16828u;

    /* renamed from: v, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f16829v;

    /* renamed from: w, reason: collision with root package name */
    private C3490nP f16830w;

    LP(Context context, WeakReference weakReference, C4797zP c4797zP, MP mp, InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0) {
        this.f16826s = context;
        this.f16827t = weakReference;
        this.f16828u = c4797zP;
        this.f16829v = interfaceExecutorServiceC3522nk0;
    }

    private final Context A7() {
        Context context = (Context) this.f16827t.get();
        return context == null ? this.f16826s : context;
    }

    private static C6881g B7() {
        Bundle bundle = new Bundle();
        bundle.putString("request_origin", "inspector_ooct");
        return ((C6881g.a) new C6881g.a().b(AdMobAdapter.class, bundle)).g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String C7(Object obj) {
        w2.u c8;
        D2.U0 f8;
        if (obj instanceof w2.m) {
            c8 = ((w2.m) obj).f();
        } else if (obj instanceof AbstractC6943a) {
            c8 = ((AbstractC6943a) obj).a();
        } else if (obj instanceof I2.a) {
            c8 = ((I2.a) obj).a();
        } else if (obj instanceof P2.c) {
            c8 = ((P2.c) obj).a();
        } else if (obj instanceof Q2.a) {
            c8 = ((Q2.a) obj).a();
        } else if (obj instanceof w2.i) {
            c8 = ((w2.i) obj).getResponseInfo();
        } else {
            if (!(obj instanceof NativeAd)) {
                return "";
            }
            c8 = ((NativeAd) obj).c();
        }
        if (c8 == null || (f8 = c8.f()) == null) {
            return "";
        }
        try {
            return f8.e();
        } catch (RemoteException unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void D7(String str, String str2) {
        try {
            AbstractC2326ck0.r(this.f16830w.c(str), new JP(this, str2), this.f16829v);
        } catch (NullPointerException e8) {
            C2.v.s().x(e8, "OutOfContextTester.setAdAsOutOfContext");
            this.f16828u.f(str2);
        }
    }

    private final synchronized void E7(String str, String str2) {
        try {
            AbstractC2326ck0.r(this.f16830w.c(str), new KP(this, str2), this.f16829v);
        } catch (NullPointerException e8) {
            C2.v.s().x(e8, "OutOfContextTester.setAdAsShown");
            this.f16828u.f(str2);
        }
    }

    @Override // D2.Q0
    public final void h7(String str, InterfaceC5852a interfaceC5852a, InterfaceC5852a interfaceC5852a2) {
        Context context = (Context) BinderC5853b.J0(interfaceC5852a);
        ViewGroup viewGroup = (ViewGroup) BinderC5853b.J0(interfaceC5852a2);
        if (context == null || viewGroup == null) {
            return;
        }
        Object obj = this.f16825o.get(str);
        if (obj != null) {
            this.f16825o.remove(str);
        }
        if (obj instanceof w2.i) {
            MP.a(context, viewGroup, (w2.i) obj);
        } else if (obj instanceof NativeAd) {
            MP.b(context, viewGroup, (NativeAd) obj);
        }
    }

    public final void w7(C3490nP c3490nP) {
        this.f16830w = c3490nP;
    }

    protected final synchronized void x7(String str, Object obj, String str2) {
        this.f16825o.put(str, obj);
        D7(C7(obj), str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void y7(final java.lang.String r7, java.lang.String r8, final java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.LP.y7(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final synchronized void z7(String str, String str2) {
        Object obj;
        try {
            Activity b8 = this.f16828u.b();
            if (b8 != null && (obj = this.f16825o.get(str)) != null) {
                AbstractC2207bf abstractC2207bf = AbstractC3184kf.n9;
                if (!((Boolean) D2.A.c().a(abstractC2207bf)).booleanValue() || (obj instanceof AbstractC6943a) || (obj instanceof I2.a) || (obj instanceof P2.c) || (obj instanceof Q2.a)) {
                    this.f16825o.remove(str);
                }
                E7(C7(obj), str2);
                if (obj instanceof AbstractC6943a) {
                    ((AbstractC6943a) obj).c(b8);
                    return;
                }
                if (obj instanceof I2.a) {
                    ((I2.a) obj).e(b8);
                    return;
                }
                if (obj instanceof P2.c) {
                    ((P2.c) obj).c(b8, new w2.p() { // from class: com.google.android.gms.internal.ads.BP
                        @Override // w2.p
                        public final void a(P2.b bVar) {
                        }
                    });
                    return;
                }
                if (obj instanceof Q2.a) {
                    ((Q2.a) obj).c(b8, new w2.p() { // from class: com.google.android.gms.internal.ads.CP
                        @Override // w2.p
                        public final void a(P2.b bVar) {
                        }
                    });
                    return;
                }
                if (((Boolean) D2.A.c().a(abstractC2207bf)).booleanValue() && ((obj instanceof w2.i) || (obj instanceof NativeAd))) {
                    Intent intent = new Intent();
                    Context A7 = A7();
                    intent.setClassName(A7, "com.google.android.gms.ads.OutOfContextTestingActivity");
                    intent.putExtra("adUnit", str);
                    C2.v.t();
                    G2.D0.t(A7, intent);
                }
            }
        } finally {
        }
    }
}
