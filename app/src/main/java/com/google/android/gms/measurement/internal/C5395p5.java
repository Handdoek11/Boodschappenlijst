package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import f3.InterfaceC5781e;

/* renamed from: com.google.android.gms.measurement.internal.p5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5395p5 extends AbstractC5454y2 {

    /* renamed from: c, reason: collision with root package name */
    private Handler f31152c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f31153d;

    /* renamed from: e, reason: collision with root package name */
    protected final C5443w5 f31154e;

    /* renamed from: f, reason: collision with root package name */
    protected final C5429u5 f31155f;

    /* renamed from: g, reason: collision with root package name */
    private final C5422t5 f31156g;

    C5395p5(S2 s22) {
        super(s22);
        this.f31153d = true;
        this.f31154e = new C5443w5(this);
        this.f31155f = new C5429u5(this);
        this.f31156g = new C5422t5(this);
    }

    static /* synthetic */ void A(C5395p5 c5395p5, long j8) {
        c5395p5.l();
        c5395p5.E();
        c5395p5.h().I().b("Activity paused, time", Long.valueOf(j8));
        c5395p5.f31156g.b(j8);
        if (c5395p5.a().T()) {
            c5395p5.f31155f.e(j8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E() {
        l();
        if (this.f31152c == null) {
            this.f31152c = new com.google.android.gms.internal.measurement.M0(Looper.getMainLooper());
        }
    }

    static /* synthetic */ void G(C5395p5 c5395p5, long j8) {
        c5395p5.l();
        c5395p5.E();
        c5395p5.h().I().b("Activity resumed, time", Long.valueOf(j8));
        if (c5395p5.a().r(G.f30401P0)) {
            if (c5395p5.a().T() || c5395p5.f31153d) {
                c5395p5.f31155f.f(j8);
            }
        } else if (c5395p5.a().T() || c5395p5.f().f31302u.b()) {
            c5395p5.f31155f.f(j8);
        }
        c5395p5.f31156g.a();
        C5443w5 c5443w5 = c5395p5.f31154e;
        c5443w5.f31250a.l();
        if (c5443w5.f31250a.f31239a.n()) {
            c5443w5.b(c5443w5.f31250a.zzb().a(), false);
        }
    }

    final void B(boolean z7) {
        l();
        this.f31153d = z7;
    }

    public final boolean C(boolean z7, boolean z8, long j8) {
        return this.f31155f.d(z7, z8, j8);
    }

    final boolean D() {
        l();
        return this.f31153d;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5326g a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5444x c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ C5298c d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5336h2 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5461z2 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ d6 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ C5378n2 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5286a1, com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ P2 j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5286a1, com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5286a1, com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5286a1
    public final /* bridge */ /* synthetic */ C5451y m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5286a1
    public final /* bridge */ /* synthetic */ C5329g2 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5286a1
    public final /* bridge */ /* synthetic */ C5322f2 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5286a1
    public final /* bridge */ /* synthetic */ F3 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5286a1
    public final /* bridge */ /* synthetic */ C5442w4 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5286a1
    public final /* bridge */ /* synthetic */ F4 r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5286a1
    public final /* bridge */ /* synthetic */ C5395p5 s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5454y2
    protected final boolean y() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ InterfaceC5781e zzb() {
        return super.zzb();
    }
}
