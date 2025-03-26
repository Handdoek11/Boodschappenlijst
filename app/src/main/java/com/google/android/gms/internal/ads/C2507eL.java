package com.google.android.gms.internal.ads;

import D2.InterfaceC0484a;
import F2.InterfaceC0572d;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.eL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2507eL implements InterfaceC0484a, InterfaceC2538ei, F2.z, InterfaceC2756gi, InterfaceC0572d {

    /* renamed from: o, reason: collision with root package name */
    private InterfaceC0484a f21795o;

    /* renamed from: s, reason: collision with root package name */
    private InterfaceC2538ei f21796s;

    /* renamed from: t, reason: collision with root package name */
    private F2.z f21797t;

    /* renamed from: u, reason: collision with root package name */
    private InterfaceC2756gi f21798u;

    /* renamed from: v, reason: collision with root package name */
    private InterfaceC0572d f21799v;

    @Override // F2.z
    public final synchronized void D0() {
        F2.z zVar = this.f21797t;
        if (zVar != null) {
            zVar.D0();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2538ei
    public final synchronized void E(String str, Bundle bundle) {
        InterfaceC2538ei interfaceC2538ei = this.f21796s;
        if (interfaceC2538ei != null) {
            interfaceC2538ei.E(str, bundle);
        }
    }

    @Override // D2.InterfaceC0484a
    public final synchronized void I0() {
        InterfaceC0484a interfaceC0484a = this.f21795o;
        if (interfaceC0484a != null) {
            interfaceC0484a.I0();
        }
    }

    @Override // F2.z
    public final synchronized void I3() {
        F2.z zVar = this.f21797t;
        if (zVar != null) {
            zVar.I3();
        }
    }

    @Override // F2.z
    public final synchronized void W4(int i8) {
        F2.z zVar = this.f21797t;
        if (zVar != null) {
            zVar.W4(i8);
        }
    }

    protected final synchronized void a(InterfaceC0484a interfaceC0484a, InterfaceC2538ei interfaceC2538ei, F2.z zVar, InterfaceC2756gi interfaceC2756gi, InterfaceC0572d interfaceC0572d) {
        this.f21795o = interfaceC0484a;
        this.f21796s = interfaceC2538ei;
        this.f21797t = zVar;
        this.f21798u = interfaceC2756gi;
        this.f21799v = interfaceC0572d;
    }

    @Override // F2.InterfaceC0572d
    public final synchronized void g() {
        InterfaceC0572d interfaceC0572d = this.f21799v;
        if (interfaceC0572d != null) {
            interfaceC0572d.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2756gi
    public final synchronized void m(String str, String str2) {
        InterfaceC2756gi interfaceC2756gi = this.f21798u;
        if (interfaceC2756gi != null) {
            interfaceC2756gi.m(str, str2);
        }
    }

    @Override // F2.z
    public final synchronized void q2() {
        F2.z zVar = this.f21797t;
        if (zVar != null) {
            zVar.q2();
        }
    }

    @Override // F2.z
    public final synchronized void r3() {
        F2.z zVar = this.f21797t;
        if (zVar != null) {
            zVar.r3();
        }
    }

    @Override // F2.z
    public final synchronized void w0() {
        F2.z zVar = this.f21797t;
        if (zVar != null) {
            zVar.w0();
        }
    }
}
