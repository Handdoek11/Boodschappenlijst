package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import i3.BinderC5853b;
import i3.InterfaceC5852a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class MJ implements PI {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1771Sl f17325a;

    /* renamed from: b, reason: collision with root package name */
    private final CC f17326b;

    /* renamed from: c, reason: collision with root package name */
    private final C2817hC f17327c;

    /* renamed from: d, reason: collision with root package name */
    private final C3695pG f17328d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f17329e;

    /* renamed from: f, reason: collision with root package name */
    private final C3785q60 f17330f;

    /* renamed from: g, reason: collision with root package name */
    private final H2.a f17331g;

    /* renamed from: h, reason: collision with root package name */
    private final L60 f17332h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f17333i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f17334j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f17335k = true;

    /* renamed from: l, reason: collision with root package name */
    private final C1631Ol f17336l;

    /* renamed from: m, reason: collision with root package name */
    private final C1666Pl f17337m;

    public MJ(C1631Ol c1631Ol, C1666Pl c1666Pl, InterfaceC1771Sl interfaceC1771Sl, CC cc, C2817hC c2817hC, C3695pG c3695pG, Context context, C3785q60 c3785q60, H2.a aVar, L60 l60) {
        this.f17336l = c1631Ol;
        this.f17337m = c1666Pl;
        this.f17325a = interfaceC1771Sl;
        this.f17326b = cc;
        this.f17327c = c2817hC;
        this.f17328d = c3695pG;
        this.f17329e = context;
        this.f17330f = c3785q60;
        this.f17331g = aVar;
        this.f17332h = l60;
    }

    private final void v(View view) {
        try {
            InterfaceC1771Sl interfaceC1771Sl = this.f17325a;
            if (interfaceC1771Sl != null && !interfaceC1771Sl.f0()) {
                this.f17325a.u4(BinderC5853b.p2(view));
                this.f17327c.I0();
                if (((Boolean) D2.A.c().a(AbstractC3184kf.Fa)).booleanValue()) {
                    this.f17328d.K0();
                    return;
                }
                return;
            }
            C1631Ol c1631Ol = this.f17336l;
            if (c1631Ol != null && !c1631Ol.x7()) {
                this.f17336l.u7(BinderC5853b.p2(view));
                this.f17327c.I0();
                if (((Boolean) D2.A.c().a(AbstractC3184kf.Fa)).booleanValue()) {
                    this.f17328d.K0();
                    return;
                }
                return;
            }
            C1666Pl c1666Pl = this.f17337m;
            if (c1666Pl == null || c1666Pl.u()) {
                return;
            }
            this.f17337m.u7(BinderC5853b.p2(view));
            this.f17327c.I0();
            if (((Boolean) D2.A.c().a(AbstractC3184kf.Fa)).booleanValue()) {
                this.f17328d.K0();
            }
        } catch (RemoteException e8) {
            H2.p.h("Failed to call handleClick", e8);
        }
    }

    private static final HashMap x(Map map) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            synchronized (map) {
                try {
                    for (Map.Entry entry : map.entrySet()) {
                        View view = (View) ((WeakReference) entry.getValue()).get();
                        if (view != null) {
                            hashMap.put((String) entry.getKey(), view);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final void a(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            if (!this.f17333i) {
                this.f17333i = C2.v.w().n(this.f17329e, this.f17331g.f2914o, this.f17330f.f25754C.toString(), this.f17332h.f16768f);
            }
            if (this.f17335k) {
                InterfaceC1771Sl interfaceC1771Sl = this.f17325a;
                if (interfaceC1771Sl != null && !interfaceC1771Sl.c0()) {
                    this.f17325a.B();
                    this.f17326b.zza();
                    return;
                }
                C1631Ol c1631Ol = this.f17336l;
                if (c1631Ol != null && !c1631Ol.y7()) {
                    this.f17336l.t();
                    this.f17326b.zza();
                    return;
                }
                C1666Pl c1666Pl = this.f17337m;
                if (c1666Pl == null || c1666Pl.y7()) {
                    return;
                }
                this.f17337m.r();
                this.f17326b.zza();
            }
        } catch (RemoteException e8) {
            H2.p.h("Failed to call recordImpression", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final void b(View view) {
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final boolean c(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final boolean c0() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00cf A[Catch: RemoteException -> 0x002b, JSONException -> 0x0047, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0047, blocks: (B:49:0x00b4, B:50:0x00c9, B:52:0x00cf), top: B:73:0x00b4 }] */
    @Override // com.google.android.gms.internal.ads.PI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(android.view.View r9, java.util.Map r10, java.util.Map r11, android.view.View.OnTouchListener r12, android.view.View.OnClickListener r13) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.MJ.d(android.view.View, java.util.Map, java.util.Map, android.view.View$OnTouchListener, android.view.View$OnClickListener):void");
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final void e() {
        H2.p.g("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final void f() {
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final void g(View view, View view2, Map map, Map map2, boolean z7, ImageView.ScaleType scaleType) {
        if (this.f17334j && this.f17330f.f25763L) {
            return;
        }
        v(view);
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final void h() {
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final void i(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final void j(D2.D0 d02) {
        H2.p.g("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final void k(View view, Map map) {
        try {
            InterfaceC5852a p22 = BinderC5853b.p2(view);
            InterfaceC1771Sl interfaceC1771Sl = this.f17325a;
            if (interfaceC1771Sl != null) {
                interfaceC1771Sl.Y1(p22);
                return;
            }
            C1631Ol c1631Ol = this.f17336l;
            if (c1631Ol != null) {
                c1631Ol.u4(p22);
                return;
            }
            C1666Pl c1666Pl = this.f17337m;
            if (c1666Pl != null) {
                c1666Pl.x7(p22);
            }
        } catch (RemoteException e8) {
            H2.p.h("Failed to call untrackView", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final void l(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final void m(D2.A0 a02) {
        H2.p.g("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final void n(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final void o(View view, View view2, Map map, Map map2, boolean z7, ImageView.ScaleType scaleType, int i8) {
        if (!this.f17334j) {
            H2.p.g("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.f17330f.f25763L) {
            v(view2);
        } else {
            H2.p.g("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final void p(InterfaceC1695Qh interfaceC1695Qh) {
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final void q() {
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final JSONObject r(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final void r0(String str) {
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final void s() {
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final boolean t() {
        return this.f17330f.f25763L;
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final JSONObject u(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final void w() {
        this.f17334j = true;
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final int zza() {
        return 0;
    }
}
