package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.AbstractC1110i;
import com.google.android.gms.common.C1111j;
import com.google.android.gms.internal.measurement.C4896e;
import com.google.android.gms.internal.measurement.C4939i6;
import com.google.android.gms.internal.measurement.zzc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import w3.C6886b;

/* loaded from: classes2.dex */
public final class X2 extends w3.h {

    /* renamed from: o, reason: collision with root package name */
    private final H5 f30758o;

    /* renamed from: s, reason: collision with root package name */
    private Boolean f30759s;

    /* renamed from: t, reason: collision with root package name */
    private String f30760t;

    public X2(H5 h52) {
        this(h52, null);
    }

    private final void W4(M5 m52, boolean z7) {
        Z2.r.l(m52);
        Z2.r.f(m52.f30614o);
        q2(m52.f30614o, false);
        this.f30758o.w0().i0(m52.f30615s, m52.f30598H);
    }

    private final void p2(Runnable runnable) {
        Z2.r.l(runnable);
        if (this.f30758o.j().H()) {
            runnable.run();
        } else {
            this.f30758o.j().E(runnable);
        }
    }

    private final void q2(String str, boolean z7) {
        if (TextUtils.isEmpty(str)) {
            this.f30758o.h().E().a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z7) {
            try {
                if (this.f30759s == null) {
                    this.f30759s = Boolean.valueOf("com.google.android.gms".equals(this.f30760t) || f3.r.a(this.f30758o.zza(), Binder.getCallingUid()) || C1111j.a(this.f30758o.zza()).c(Binder.getCallingUid()));
                }
                if (this.f30759s.booleanValue()) {
                    return;
                }
            } catch (SecurityException e8) {
                this.f30758o.h().E().b("Measurement Service called with invalid calling package. appId", C5378n2.t(str));
                throw e8;
            }
        }
        if (this.f30760t == null && AbstractC1110i.uidHasPackageName(this.f30758o.zza(), Binder.getCallingUid(), str)) {
            this.f30760t = str;
        }
        if (str.equals(this.f30760t)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    private final void s7(Runnable runnable) {
        Z2.r.l(runnable);
        if (this.f30758o.j().H()) {
            runnable.run();
        } else {
            this.f30758o.j().B(runnable);
        }
    }

    private final void u7(E e8, M5 m52) {
        this.f30758o.x0();
        this.f30758o.t(e8, m52);
    }

    @Override // w3.InterfaceC6890f
    public final String A2(M5 m52) {
        W4(m52, false);
        return this.f30758o.T(m52);
    }

    @Override // w3.InterfaceC6890f
    public final void B3(M5 m52) {
        W4(m52, false);
        s7(new RunnableC5330g3(this, m52));
    }

    @Override // w3.InterfaceC6890f
    public final List C3(String str, String str2, String str3) {
        q2(str, true);
        try {
            return (List) this.f30758o.j().u(new CallableC5365l3(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e8) {
            this.f30758o.h().E().b("Failed to get conditional user properties as", e8);
            return Collections.emptyList();
        }
    }

    @Override // w3.InterfaceC6890f
    public final List D1(String str, String str2, String str3, boolean z7) {
        q2(str, true);
        try {
            List<a6> list = (List) this.f30758o.j().u(new CallableC5351j3(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (a6 a6Var : list) {
                if (z7 || !d6.H0(a6Var.f30822c)) {
                    arrayList.add(new Y5(a6Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e8) {
            e = e8;
            this.f30758o.h().E().c("Failed to get user properties as. appId", C5378n2.t(str), e);
            return Collections.emptyList();
        } catch (ExecutionException e9) {
            e = e9;
            this.f30758o.h().E().c("Failed to get user properties as. appId", C5378n2.t(str), e);
            return Collections.emptyList();
        }
    }

    final /* synthetic */ void I3(Bundle bundle, String str) {
        if (bundle.isEmpty()) {
            this.f30758o.j0().b1(str);
        } else {
            this.f30758o.j0().D0(str, bundle);
            this.f30758o.j0().V(str, bundle);
        }
    }

    final /* synthetic */ void J0(Bundle bundle, String str) {
        boolean r8 = this.f30758o.g0().r(G.f30439f1);
        boolean r9 = this.f30758o.g0().r(G.f30445h1);
        if (bundle.isEmpty() && r8 && r9) {
            this.f30758o.j0().b1(str);
            return;
        }
        this.f30758o.j0().D0(str, bundle);
        if (r9 && this.f30758o.j0().f1(str)) {
            this.f30758o.j0().V(str, bundle);
        }
    }

    @Override // w3.InterfaceC6890f
    public final void K4(final M5 m52) {
        Z2.r.f(m52.f30614o);
        Z2.r.l(m52.f30603M);
        p2(new Runnable() { // from class: com.google.android.gms.measurement.internal.a3
            @Override // java.lang.Runnable
            public final void run() {
                this.f30810o.w7(m52);
            }
        });
    }

    @Override // w3.InterfaceC6890f
    public final List L0(String str, String str2, M5 m52) {
        W4(m52, false);
        String str3 = m52.f30614o;
        Z2.r.l(str3);
        try {
            return (List) this.f30758o.j().u(new CallableC5372m3(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e8) {
            this.f30758o.h().E().b("Failed to get conditional user properties", e8);
            return Collections.emptyList();
        }
    }

    @Override // w3.InterfaceC6890f
    public final void L1(M5 m52) {
        Z2.r.f(m52.f30614o);
        q2(m52.f30614o, false);
        s7(new RunnableC5386o3(this, m52));
    }

    @Override // w3.InterfaceC6890f
    public final void O1(final Bundle bundle, M5 m52) {
        W4(m52, false);
        final String str = m52.f30614o;
        Z2.r.l(str);
        s7(new Runnable() { // from class: com.google.android.gms.measurement.internal.b3
            @Override // java.lang.Runnable
            public final void run() {
                this.f30838o.J0(bundle, str);
            }
        });
    }

    @Override // w3.InterfaceC6890f
    public final void P3(C5312e c5312e) {
        Z2.r.l(c5312e);
        Z2.r.l(c5312e.f30923t);
        Z2.r.f(c5312e.f30921o);
        q2(c5312e.f30921o, true);
        s7(new RunnableC5337h3(this, new C5312e(c5312e)));
    }

    @Override // w3.InterfaceC6890f
    public final void Q1(M5 m52) {
        Z2.r.f(m52.f30614o);
        Z2.r.l(m52.f30603M);
        p2(new RunnableC5379n3(this, m52));
    }

    @Override // w3.InterfaceC6890f
    public final void T0(final Bundle bundle, M5 m52) {
        if (C4939i6.a() && this.f30758o.g0().r(G.f30445h1)) {
            W4(m52, false);
            final String str = m52.f30614o;
            Z2.r.l(str);
            s7(new Runnable() { // from class: com.google.android.gms.measurement.internal.Z2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f30796o.I3(bundle, str);
                }
            });
        }
    }

    @Override // w3.InterfaceC6890f
    public final void U2(C5312e c5312e, M5 m52) {
        Z2.r.l(c5312e);
        Z2.r.l(c5312e.f30923t);
        W4(m52, false);
        C5312e c5312e2 = new C5312e(c5312e);
        c5312e2.f30921o = m52.f30614o;
        s7(new RunnableC5344i3(this, c5312e2, m52));
    }

    @Override // w3.InterfaceC6890f
    public final void U6(M5 m52) {
        W4(m52, false);
        s7(new RunnableC5316e3(this, m52));
    }

    @Override // w3.InterfaceC6890f
    public final void V1(Y5 y52, M5 m52) {
        Z2.r.l(y52);
        W4(m52, false);
        s7(new RunnableC5427u3(this, y52, m52));
    }

    @Override // w3.InterfaceC6890f
    public final void X0(M5 m52) {
        W4(m52, false);
        s7(new RunnableC5309d3(this, m52));
    }

    @Override // w3.InterfaceC6890f
    public final void X5(final M5 m52) {
        Z2.r.f(m52.f30614o);
        Z2.r.l(m52.f30603M);
        p2(new Runnable() { // from class: com.google.android.gms.measurement.internal.c3
            @Override // java.lang.Runnable
            public final void run() {
                this.f30893o.v7(m52);
            }
        });
    }

    @Override // w3.InterfaceC6890f
    public final C6886b Z4(M5 m52) {
        W4(m52, false);
        Z2.r.f(m52.f30614o);
        try {
            return (C6886b) this.f30758o.j().z(new CallableC5400q3(this, m52)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e8) {
            this.f30758o.h().E().c("Failed to get consent. appId", C5378n2.t(m52.f30614o), e8);
            return new C6886b(null);
        }
    }

    @Override // w3.InterfaceC6890f
    public final List Z5(M5 m52, Bundle bundle) {
        W4(m52, false);
        Z2.r.l(m52.f30614o);
        try {
            return (List) this.f30758o.j().u(new CallableC5420t3(this, m52, bundle)).get();
        } catch (InterruptedException | ExecutionException e8) {
            this.f30758o.h().E().c("Failed to get trigger URIs. appId", C5378n2.t(m52.f30614o), e8);
            return Collections.emptyList();
        }
    }

    @Override // w3.InterfaceC6890f
    public final byte[] a6(E e8, String str) {
        Z2.r.f(str);
        Z2.r.l(e8);
        q2(str, true);
        this.f30758o.h().D().b("Log and bundle. event", this.f30758o.l0().c(e8.f30332o));
        long c8 = this.f30758o.zzb().c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f30758o.j().z(new CallableC5406r3(this, e8, str)).get();
            if (bArr == null) {
                this.f30758o.h().E().b("Log and bundle returned null. appId", C5378n2.t(str));
                bArr = new byte[0];
            }
            this.f30758o.h().D().d("Log and bundle processed. event, size, time_ms", this.f30758o.l0().c(e8.f30332o), Integer.valueOf(bArr.length), Long.valueOf((this.f30758o.zzb().c() / 1000000) - c8));
            return bArr;
        } catch (InterruptedException e9) {
            e = e9;
            this.f30758o.h().E().d("Failed to log and bundle. appId, event, error", C5378n2.t(str), this.f30758o.l0().c(e8.f30332o), e);
            return null;
        } catch (ExecutionException e10) {
            e = e10;
            this.f30758o.h().E().d("Failed to log and bundle. appId, event, error", C5378n2.t(str), this.f30758o.l0().c(e8.f30332o), e);
            return null;
        }
    }

    @Override // w3.InterfaceC6890f
    public final void d7(E e8, M5 m52) {
        Z2.r.l(e8);
        W4(m52, false);
        s7(new RunnableC5393p3(this, e8, m52));
    }

    final E r3(E e8, M5 m52) {
        D d8;
        if ("_cmp".equals(e8.f30332o) && (d8 = e8.f30333s) != null && d8.A0() != 0) {
            String G02 = e8.f30333s.G0("_cis");
            if ("referrer broadcast".equals(G02) || "referrer API".equals(G02)) {
                this.f30758o.h().H().b("Event has been filtered ", e8.toString());
                return new E("_cmpx", e8.f30333s, e8.f30334t, e8.f30335u);
            }
        }
        return e8;
    }

    final void t7(E e8, M5 m52) {
        boolean z7;
        if (!this.f30758o.p0().U(m52.f30614o)) {
            u7(e8, m52);
            return;
        }
        this.f30758o.h().I().b("EES config found for", m52.f30614o);
        I2 p02 = this.f30758o.p0();
        String str = m52.f30614o;
        com.google.android.gms.internal.measurement.C c8 = TextUtils.isEmpty(str) ? null : (com.google.android.gms.internal.measurement.C) p02.f30542j.c(str);
        if (c8 == null) {
            this.f30758o.h().I().b("EES not loaded for", m52.f30614o);
            u7(e8, m52);
            return;
        }
        try {
            Map O7 = this.f30758o.v0().O(e8.f30333s.D0(), true);
            String a8 = w3.q.a(e8.f30332o);
            if (a8 == null) {
                a8 = e8.f30332o;
            }
            z7 = c8.d(new C4896e(a8, e8.f30335u, O7));
        } catch (zzc unused) {
            this.f30758o.h().E().c("EES error. appId, eventName", m52.f30615s, e8.f30332o);
            z7 = false;
        }
        if (!z7) {
            this.f30758o.h().I().b("EES was not applied to event", e8.f30332o);
            u7(e8, m52);
            return;
        }
        if (c8.g()) {
            this.f30758o.h().I().b("EES edited event", e8.f30332o);
            u7(this.f30758o.v0().F(c8.a().d()), m52);
        } else {
            u7(e8, m52);
        }
        if (c8.f()) {
            for (C4896e c4896e : c8.a().f()) {
                this.f30758o.h().I().b("EES logging created event", c4896e.e());
                u7(this.f30758o.v0().F(c4896e), m52);
            }
        }
    }

    @Override // w3.InterfaceC6890f
    public final List u6(M5 m52, boolean z7) {
        W4(m52, false);
        String str = m52.f30614o;
        Z2.r.l(str);
        try {
            List<a6> list = (List) this.f30758o.j().u(new CallableC5448x3(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (a6 a6Var : list) {
                if (z7 || !d6.H0(a6Var.f30822c)) {
                    arrayList.add(new Y5(a6Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e8) {
            e = e8;
            this.f30758o.h().E().c("Failed to get user properties. appId", C5378n2.t(m52.f30614o), e);
            return null;
        } catch (ExecutionException e9) {
            e = e9;
            this.f30758o.h().E().c("Failed to get user properties. appId", C5378n2.t(m52.f30614o), e);
            return null;
        }
    }

    @Override // w3.InterfaceC6890f
    public final void v3(long j8, String str, String str2, String str3) {
        s7(new RunnableC5323f3(this, str2, str3, str, j8));
    }

    final /* synthetic */ void v7(M5 m52) {
        this.f30758o.x0();
        this.f30758o.k0(m52);
    }

    final /* synthetic */ void w7(M5 m52) {
        this.f30758o.x0();
        this.f30758o.m0(m52);
    }

    @Override // w3.InterfaceC6890f
    public final List y5(String str, String str2, boolean z7, M5 m52) {
        W4(m52, false);
        String str3 = m52.f30614o;
        Z2.r.l(str3);
        try {
            List<a6> list = (List) this.f30758o.j().u(new CallableC5358k3(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (a6 a6Var : list) {
                if (z7 || !d6.H0(a6Var.f30822c)) {
                    arrayList.add(new Y5(a6Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e8) {
            e = e8;
            this.f30758o.h().E().c("Failed to query user properties. appId", C5378n2.t(m52.f30614o), e);
            return Collections.emptyList();
        } catch (ExecutionException e9) {
            e = e9;
            this.f30758o.h().E().c("Failed to query user properties. appId", C5378n2.t(m52.f30614o), e);
            return Collections.emptyList();
        }
    }

    @Override // w3.InterfaceC6890f
    public final void z4(E e8, String str, String str2) {
        Z2.r.l(e8);
        Z2.r.f(str);
        q2(str, true);
        s7(new RunnableC5413s3(this, e8, str));
    }

    private X2(H5 h52, String str) {
        Z2.r.l(h52);
        this.f30758o = h52;
        this.f30760t = null;
    }
}
