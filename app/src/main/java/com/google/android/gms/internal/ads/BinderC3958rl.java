package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import i3.BinderC5853b;
import i3.InterfaceC5852a;
import java.util.List;
import java.util.Map;
import v3.C6835a;

/* renamed from: com.google.android.gms.internal.ads.rl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC3958rl extends AbstractBinderC4085su {

    /* renamed from: o, reason: collision with root package name */
    private final C6835a f26217o;

    BinderC3958rl(C6835a c6835a) {
        this.f26217o = c6835a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4194tu
    public final void A0(Bundle bundle) {
        this.f26217o.s(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4194tu
    public final void F6(String str, String str2, Bundle bundle) {
        this.f26217o.b(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4194tu
    public final List M4(String str, String str2) {
        return this.f26217o.g(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4194tu
    public final void T(Bundle bundle) {
        this.f26217o.r(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4194tu
    public final void W(String str) {
        this.f26217o.a(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4194tu
    public final long a() {
        return this.f26217o.d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4194tu
    public final String b() {
        return this.f26217o.e();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4194tu
    public final String c() {
        return this.f26217o.f();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4194tu
    public final String e() {
        return this.f26217o.i();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4194tu
    public final String f() {
        return this.f26217o.j();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4194tu
    public final String g() {
        return this.f26217o.h();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4194tu
    public final void i0(Bundle bundle) {
        this.f26217o.o(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4194tu
    public final void i5(String str, String str2, Bundle bundle) {
        this.f26217o.n(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4194tu
    public final Bundle j3(Bundle bundle) {
        return this.f26217o.p(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4194tu
    public final Map l6(String str, String str2, boolean z7) {
        return this.f26217o.m(str, str2, z7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4194tu
    public final void o0(String str) {
        this.f26217o.c(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4194tu
    public final void p7(InterfaceC5852a interfaceC5852a, String str, String str2) {
        this.f26217o.t(interfaceC5852a != null ? (Activity) BinderC5853b.J0(interfaceC5852a) : null, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4194tu
    public final int v(String str) {
        return this.f26217o.l(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4194tu
    public final void w4(String str, String str2, InterfaceC5852a interfaceC5852a) {
        this.f26217o.u(str, str2, interfaceC5852a != null ? BinderC5853b.J0(interfaceC5852a) : null);
    }
}
