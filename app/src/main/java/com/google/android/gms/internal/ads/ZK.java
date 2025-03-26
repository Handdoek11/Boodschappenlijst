package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import i3.BinderC5853b;
import i3.InterfaceC5852a;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import q.C6397a;
import q.C6407k;

/* loaded from: classes.dex */
public final class ZK extends AbstractBinderC3733ph {

    /* renamed from: o, reason: collision with root package name */
    private final Context f20456o;

    /* renamed from: s, reason: collision with root package name */
    private final HI f20457s;

    /* renamed from: t, reason: collision with root package name */
    private C2940iJ f20458t;

    /* renamed from: u, reason: collision with root package name */
    private CI f20459u;

    public ZK(Context context, HI hi, C2940iJ c2940iJ, CI ci) {
        this.f20456o = context;
        this.f20457s = hi;
        this.f20458t = c2940iJ;
        this.f20459u = ci;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3842qh
    public final String E0(String str) {
        return (String) this.f20457s.V().get(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3842qh
    public final InterfaceC1938Xg Q(String str) {
        return (InterfaceC1938Xg) this.f20457s.U().get(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3842qh
    public final boolean X(InterfaceC5852a interfaceC5852a) {
        C2940iJ c2940iJ;
        Object J02 = BinderC5853b.J0(interfaceC5852a);
        if (!(J02 instanceof ViewGroup) || (c2940iJ = this.f20458t) == null || !c2940iJ.f((ViewGroup) J02)) {
            return false;
        }
        this.f20457s.d0().Q0(new YK(this, "_videoMediaView"));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3842qh
    public final D2.Y0 b() {
        return this.f20457s.W();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3842qh
    public final InterfaceC1833Ug c() {
        try {
            return this.f20459u.Q().a();
        } catch (NullPointerException e8) {
            C2.v.s().x(e8, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3842qh
    public final InterfaceC5852a e() {
        return BinderC5853b.p2(this.f20456o);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3842qh
    public final String f() {
        return this.f20457s.a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3842qh
    public final boolean g0(InterfaceC5852a interfaceC5852a) {
        C2940iJ c2940iJ;
        Object J02 = BinderC5853b.J0(interfaceC5852a);
        if (!(J02 instanceof ViewGroup) || (c2940iJ = this.f20458t) == null || !c2940iJ.g((ViewGroup) J02)) {
            return false;
        }
        this.f20457s.f0().Q0(new YK(this, "_videoMediaView"));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3842qh
    public final List i() {
        try {
            C6407k U7 = this.f20457s.U();
            C6407k V7 = this.f20457s.V();
            String[] strArr = new String[U7.size() + V7.size()];
            int i8 = 0;
            for (int i9 = 0; i9 < U7.size(); i9++) {
                strArr[i8] = (String) U7.g(i9);
                i8++;
            }
            for (int i10 = 0; i10 < V7.size(); i10++) {
                strArr[i8] = (String) V7.g(i10);
                i8++;
            }
            return Arrays.asList(strArr);
        } catch (NullPointerException e8) {
            C2.v.s().x(e8, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3842qh
    public final void j() {
        CI ci = this.f20459u;
        if (ci != null) {
            ci.a();
        }
        this.f20459u = null;
        this.f20458t = null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3842qh
    public final void k() {
        try {
            String c8 = this.f20457s.c();
            if (Objects.equals(c8, "Google")) {
                H2.p.g("Illegal argument specified for omid partner name.");
                return;
            }
            if (TextUtils.isEmpty(c8)) {
                H2.p.g("Not starting OMID session. OM partner name has not been configured.");
                return;
            }
            CI ci = this.f20459u;
            if (ci != null) {
                ci.T(c8, false);
            }
        } catch (NullPointerException e8) {
            C2.v.s().x(e8, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3842qh
    public final void o() {
        CI ci = this.f20459u;
        if (ci != null) {
            ci.s();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3842qh
    public final void o0(String str) {
        CI ci = this.f20459u;
        if (ci != null) {
            ci.n(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3842qh
    public final boolean q() {
        CI ci = this.f20459u;
        return (ci == null || ci.G()) && this.f20457s.e0() != null && this.f20457s.f0() == null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3842qh
    public final void q6(InterfaceC5852a interfaceC5852a) {
        CI ci;
        Object J02 = BinderC5853b.J0(interfaceC5852a);
        if (!(J02 instanceof View) || this.f20457s.h0() == null || (ci = this.f20459u) == null) {
            return;
        }
        ci.t((View) J02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3842qh
    public final boolean t() {
        C3929rT h02 = this.f20457s.h0();
        if (h02 == null) {
            H2.p.g("Trying to start OMID session before creation.");
            return false;
        }
        C2.v.b().e(h02.a());
        if (this.f20457s.e0() == null) {
            return true;
        }
        this.f20457s.e0().D0("onSdkLoaded", new C6397a());
        return true;
    }
}
