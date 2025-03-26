package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import i3.BinderC5853b;
import i3.InterfaceC5852a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import z2.AbstractC7069d;

/* renamed from: com.google.android.gms.internal.ads.im, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC2981im extends AbstractBinderC1736Rl {

    /* renamed from: o, reason: collision with root package name */
    private final J2.r f23059o;

    public BinderC2981im(J2.r rVar) {
        this.f23059o = rVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Sl
    public final void B() {
        this.f23059o.s();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Sl
    public final void U1(InterfaceC5852a interfaceC5852a, InterfaceC5852a interfaceC5852a2, InterfaceC5852a interfaceC5852a3) {
        HashMap hashMap = (HashMap) BinderC5853b.J0(interfaceC5852a2);
        HashMap hashMap2 = (HashMap) BinderC5853b.J0(interfaceC5852a3);
        this.f23059o.E((View) BinderC5853b.J0(interfaceC5852a), hashMap, hashMap2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Sl
    public final void Y1(InterfaceC5852a interfaceC5852a) {
        this.f23059o.F((View) BinderC5853b.J0(interfaceC5852a));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Sl
    public final double b() {
        if (this.f23059o.o() != null) {
            return this.f23059o.o().doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Sl
    public final float c() {
        return this.f23059o.k();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Sl
    public final boolean c0() {
        return this.f23059o.m();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Sl
    public final float e() {
        return this.f23059o.f();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Sl
    public final Bundle f() {
        return this.f23059o.g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Sl
    public final boolean f0() {
        return this.f23059o.l();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Sl
    public final float g() {
        return this.f23059o.e();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Sl
    public final D2.Y0 h() {
        if (this.f23059o.H() != null) {
            return this.f23059o.H().b();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Sl
    public final InterfaceC1693Qg i() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Sl
    public final InterfaceC1938Xg j() {
        AbstractC7069d i8 = this.f23059o.i();
        if (i8 != null) {
            return new BinderC1484Kg(i8.a(), i8.c(), i8.b(), i8.e(), i8.d());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Sl
    public final InterfaceC5852a k() {
        View a8 = this.f23059o.a();
        if (a8 == null) {
            return null;
        }
        return BinderC5853b.p2(a8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Sl
    public final InterfaceC5852a l() {
        View G7 = this.f23059o.G();
        if (G7 == null) {
            return null;
        }
        return BinderC5853b.p2(G7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Sl
    public final InterfaceC5852a o() {
        Object I7 = this.f23059o.I();
        if (I7 == null) {
            return null;
        }
        return BinderC5853b.p2(I7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Sl
    public final String p() {
        return this.f23059o.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Sl
    public final String q() {
        return this.f23059o.c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Sl
    public final String r() {
        return this.f23059o.d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Sl
    public final String s() {
        return this.f23059o.h();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Sl
    public final String t() {
        return this.f23059o.n();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Sl
    public final List u() {
        List<AbstractC7069d> j8 = this.f23059o.j();
        ArrayList arrayList = new ArrayList();
        if (j8 != null) {
            for (AbstractC7069d abstractC7069d : j8) {
                arrayList.add(new BinderC1484Kg(abstractC7069d.a(), abstractC7069d.c(), abstractC7069d.b(), abstractC7069d.e(), abstractC7069d.d()));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Sl
    public final void u4(InterfaceC5852a interfaceC5852a) {
        this.f23059o.q((View) BinderC5853b.J0(interfaceC5852a));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Sl
    public final String x() {
        return this.f23059o.p();
    }
}
