package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C4894d6;
import e3.C5745b;
import f3.InterfaceC5781e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import w3.C6886b;
import w3.InterfaceC6890f;

/* loaded from: classes2.dex */
public final class F4 extends AbstractC5454y2 {

    /* renamed from: c, reason: collision with root package name */
    private final ServiceConnectionC5311d5 f30362c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC6890f f30363d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Boolean f30364e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC5416t f30365f;

    /* renamed from: g, reason: collision with root package name */
    private final C5457y5 f30366g;

    /* renamed from: h, reason: collision with root package name */
    private final List f30367h;

    /* renamed from: i, reason: collision with root package name */
    private final AbstractC5416t f30368i;

    protected F4(S2 s22) {
        super(s22);
        this.f30367h = new ArrayList();
        this.f30366g = new C5457y5(s22.zzb());
        this.f30362c = new ServiceConnectionC5311d5(this);
        this.f30365f = new G4(this, s22);
        this.f30368i = new T4(this, s22);
    }

    static /* synthetic */ void I(F4 f42, ComponentName componentName) {
        f42.l();
        if (f42.f30363d != null) {
            f42.f30363d = null;
            f42.h().I().b("Disconnected from device MeasurementService", componentName);
            f42.l();
            f42.X();
        }
    }

    private final void L(Runnable runnable) {
        l();
        if (e0()) {
            runnable.run();
        } else {
            if (this.f30367h.size() >= 1000) {
                h().E().a("Discarding data. Max runnable queue size reached");
                return;
            }
            this.f30367h.add(runnable);
            this.f30368i.b(60000L);
            X();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j0() {
        l();
        h().I().b("Processing queued up service tasks", Integer.valueOf(this.f30367h.size()));
        Iterator it = this.f30367h.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e8) {
                h().E().b("Task exception while flushing queue", e8);
            }
        }
        this.f30367h.clear();
        this.f30368i.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k0() {
        l();
        this.f30366g.c();
        this.f30365f.b(((Long) G.f30394M.a(null)).longValue());
    }

    private final M5 n0(boolean z7) {
        return n().z(z7 ? h().M() : null);
    }

    static /* synthetic */ void p0(F4 f42) {
        f42.l();
        if (f42.e0()) {
            f42.h().I().a("Inactivity, disconnecting from the service");
            f42.Y();
        }
    }

    public final void A(Bundle bundle) {
        l();
        t();
        L(new S4(this, n0(false), bundle));
    }

    public final void B(com.google.android.gms.internal.measurement.T0 t02) {
        l();
        t();
        L(new P4(this, n0(false), t02));
    }

    public final void C(com.google.android.gms.internal.measurement.T0 t02, E e8, String str) {
        l();
        t();
        if (g().s(12451000) == 0) {
            L(new V4(this, e8, str, t02));
        } else {
            h().J().a("Not bundling data. Service unavailable or out of date");
            g().T(t02, new byte[0]);
        }
    }

    protected final void D(com.google.android.gms.internal.measurement.T0 t02, String str, String str2) {
        l();
        t();
        L(new RunnableC5297b5(this, str, str2, n0(false), t02));
    }

    protected final void E(com.google.android.gms.internal.measurement.T0 t02, String str, String str2, boolean z7) {
        l();
        t();
        L(new I4(this, str, str2, n0(false), z7, t02));
    }

    protected final void F(C5312e c5312e) {
        Z2.r.l(c5312e);
        l();
        t();
        L(new Z4(this, true, n0(true), o().C(c5312e), new C5312e(c5312e), c5312e));
    }

    protected final void G(E e8, String str) {
        Z2.r.l(e8);
        l();
        t();
        L(new W4(this, true, n0(true), o().D(e8), e8, str));
    }

    protected final void H(C5449x4 c5449x4) {
        l();
        t();
        L(new Q4(this, c5449x4));
    }

    protected final void K(Y5 y52) {
        l();
        t();
        L(new J4(this, n0(true), o().E(y52), y52));
    }

    public final void M(AtomicReference atomicReference) {
        l();
        t();
        L(new L4(this, atomicReference, n0(false)));
    }

    protected final void N(AtomicReference atomicReference, Bundle bundle) {
        l();
        t();
        L(new K4(this, atomicReference, n0(false), bundle));
    }

    protected final void O(AtomicReference atomicReference, String str, String str2, String str3) {
        l();
        t();
        L(new Y4(this, atomicReference, str, str2, str3, n0(false)));
    }

    protected final void P(AtomicReference atomicReference, String str, String str2, String str3, boolean z7) {
        l();
        t();
        L(new RunnableC5290a5(this, atomicReference, str, str2, str3, n0(false), z7));
    }

    protected final void Q(InterfaceC6890f interfaceC6890f) {
        l();
        Z2.r.l(interfaceC6890f);
        this.f30363d = interfaceC6890f;
        k0();
        j0();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0139 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void R(w3.InterfaceC6890f r37, a3.AbstractC0813a r38, com.google.android.gms.measurement.internal.M5 r39) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.F4.R(w3.f, a3.a, com.google.android.gms.measurement.internal.M5):void");
    }

    protected final void S(boolean z7) {
        l();
        t();
        if ((!C4894d6.a() || !a().r(G.f30419Y0)) && z7) {
            o().F();
        }
        if (g0()) {
            L(new X4(this, n0(false)));
        }
    }

    protected final C6886b T() {
        l();
        t();
        InterfaceC6890f interfaceC6890f = this.f30363d;
        if (interfaceC6890f == null) {
            X();
            h().D().a("Failed to get consents; not connected to service yet.");
            return null;
        }
        M5 n02 = n0(false);
        Z2.r.l(n02);
        try {
            C6886b Z42 = interfaceC6890f.Z4(n02);
            k0();
            return Z42;
        } catch (RemoteException e8) {
            h().E().b("Failed to get consents; remote exception", e8);
            return null;
        }
    }

    final Boolean U() {
        return this.f30364e;
    }

    protected final void V() {
        l();
        t();
        L(new R4(this, n0(true)));
    }

    protected final void W() {
        l();
        t();
        M5 n02 = n0(true);
        o().G();
        L(new O4(this, n02));
    }

    final void X() {
        l();
        t();
        if (e0()) {
            return;
        }
        if (i0()) {
            this.f30362c.a();
            return;
        }
        if (a().V()) {
            return;
        }
        List<ResolveInfo> queryIntentServices = zza().getPackageManager().queryIntentServices(new Intent().setClassName(zza(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            h().E().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(zza(), "com.google.android.gms.measurement.AppMeasurementService"));
        this.f30362c.b(intent);
    }

    public final void Y() {
        l();
        t();
        this.f30362c.d();
        try {
            C5745b.b().c(zza(), this.f30362c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f30363d = null;
    }

    final /* synthetic */ void Z() {
        InterfaceC6890f interfaceC6890f = this.f30363d;
        if (interfaceC6890f == null) {
            h().E().a("Failed to send Dma consent settings to service");
            return;
        }
        try {
            M5 n02 = n0(false);
            Z2.r.l(n02);
            interfaceC6890f.X5(n02);
            k0();
        } catch (RemoteException e8) {
            h().E().b("Failed to send Dma consent settings to the service", e8);
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5326g a() {
        return super.a();
    }

    final /* synthetic */ void a0() {
        InterfaceC6890f interfaceC6890f = this.f30363d;
        if (interfaceC6890f == null) {
            h().E().a("Failed to send storage consent settings to service");
            return;
        }
        try {
            M5 n02 = n0(false);
            Z2.r.l(n02);
            interfaceC6890f.K4(n02);
            k0();
        } catch (RemoteException e8) {
            h().E().b("Failed to send storage consent settings to the service", e8);
        }
    }

    protected final void b0() {
        l();
        t();
        M5 n02 = n0(false);
        o().F();
        L(new N4(this, n02));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5444x c() {
        return super.c();
    }

    protected final void c0() {
        l();
        t();
        L(new Runnable() { // from class: com.google.android.gms.measurement.internal.H4
            @Override // java.lang.Runnable
            public final void run() {
                this.f30494o.Z();
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ C5298c d() {
        return super.d();
    }

    protected final void d0() {
        l();
        t();
        L(new U4(this, n0(true)));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5336h2 e() {
        return super.e();
    }

    public final boolean e0() {
        l();
        t();
        return this.f30363d != null;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5461z2 f() {
        return super.f();
    }

    final boolean f0() {
        l();
        t();
        return !i0() || g().G0() >= 200900;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ d6 g() {
        return super.g();
    }

    final boolean g0() {
        l();
        t();
        return !i0() || g().G0() >= ((Integer) G.f30476u0.a(null)).intValue();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ C5378n2 h() {
        return super.h();
    }

    final boolean h0() {
        l();
        t();
        return !i0() || g().G0() >= 241200;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5286a1, com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean i0() {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.F4.i0():boolean");
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

    protected final void m0(boolean z7) {
        l();
        t();
        if ((!C4894d6.a() || !a().r(G.f30419Y0)) && z7) {
            o().F();
        }
        L(new Runnable() { // from class: com.google.android.gms.measurement.internal.E4
            @Override // java.lang.Runnable
            public final void run() {
                this.f30337o.a0();
            }
        });
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
