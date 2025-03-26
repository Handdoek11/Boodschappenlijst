package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import i3.BinderC5853b;
import i3.InterfaceC5852a;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.bL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC2182bL extends AbstractBinderC1765Sh {

    /* renamed from: o, reason: collision with root package name */
    private final String f20852o;

    /* renamed from: s, reason: collision with root package name */
    private final CI f20853s;

    /* renamed from: t, reason: collision with root package name */
    private final HI f20854t;

    /* renamed from: u, reason: collision with root package name */
    private final HN f20855u;

    public BinderC2182bL(String str, CI ci, HI hi, HN hn) {
        this.f20852o = str;
        this.f20853s = ci;
        this.f20854t = hi;
        this.f20855u = hn;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1800Th
    public final void B() {
        this.f20853s.a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1800Th
    public final void D5(D2.N0 n02) {
        try {
            if (!n02.c()) {
                this.f20855u.e();
            }
        } catch (RemoteException e8) {
            H2.p.c("Error in making CSI ping for reporting paid event callback", e8);
        }
        this.f20853s.z(n02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1800Th
    public final boolean F() {
        return (this.f20854t.h().isEmpty() || this.f20854t.X() == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1800Th
    public final boolean G4(Bundle bundle) {
        return this.f20853s.I(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1800Th
    public final void K3(D2.A0 a02) {
        this.f20853s.y(a02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1800Th
    public final void P() {
        this.f20853s.x();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1800Th
    public final boolean S() {
        return this.f20853s.F();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1800Th
    public final void U5(D2.D0 d02) {
        this.f20853s.k(d02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1800Th
    public final void V6(Bundle bundle) {
        this.f20853s.o(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1800Th
    public final double b() {
        return this.f20854t.A();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1800Th
    public final Bundle c() {
        return this.f20854t.Q();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1800Th
    public final D2.Y0 e() {
        return this.f20854t.W();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1800Th
    public final InterfaceC1693Qg f() {
        return this.f20854t.Y();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1800Th
    public final void f0() {
        this.f20853s.p();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1800Th
    public final D2.U0 g() {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23653C6)).booleanValue()) {
            return this.f20853s.c();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1800Th
    public final InterfaceC1833Ug h() {
        return this.f20853s.Q().a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1800Th
    public final InterfaceC1938Xg i() {
        return this.f20854t.a0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1800Th
    public final InterfaceC5852a j() {
        return this.f20854t.i0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1800Th
    public final InterfaceC5852a k() {
        return BinderC5853b.p2(this.f20853s);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1800Th
    public final String l() {
        return this.f20854t.k0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1800Th
    public final void m3(Bundle bundle) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.Pc)).booleanValue()) {
            this.f20853s.q(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1800Th
    public final String o() {
        return this.f20854t.l0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1800Th
    public final void o2(Bundle bundle) {
        this.f20853s.v(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1800Th
    public final String p() {
        return this.f20854t.m0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1800Th
    public final String q() {
        return this.f20854t.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1800Th
    public final void q3(InterfaceC1695Qh interfaceC1695Qh) {
        this.f20853s.A(interfaceC1695Qh);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1800Th
    public final String r() {
        return this.f20852o;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1800Th
    public final String s() {
        return this.f20854t.d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1800Th
    public final String t() {
        return this.f20854t.e();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1800Th
    public final List u() {
        return F() ? this.f20854t.h() : Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1800Th
    public final void w() {
        this.f20853s.b0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1800Th
    public final List x() {
        return this.f20854t.g();
    }
}
