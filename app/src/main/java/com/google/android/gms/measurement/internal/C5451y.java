package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import f3.InterfaceC5781e;
import java.util.Iterator;
import java.util.Map;
import q.C6397a;

/* renamed from: com.google.android.gms.measurement.internal.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5451y extends AbstractC5286a1 {

    /* renamed from: b, reason: collision with root package name */
    private final Map f31267b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f31268c;

    /* renamed from: d, reason: collision with root package name */
    private long f31269d;

    public C5451y(S2 s22) {
        super(s22);
        this.f31268c = new C6397a();
        this.f31267b = new C6397a();
    }

    static /* synthetic */ void A(C5451y c5451y, String str, long j8) {
        c5451y.l();
        Z2.r.f(str);
        Integer num = (Integer) c5451y.f31268c.get(str);
        if (num == null) {
            c5451y.h().E().b("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        C5449x4 A7 = c5451y.q().A(false);
        int intValue = num.intValue() - 1;
        if (intValue != 0) {
            c5451y.f31268c.put(str, Integer.valueOf(intValue));
            return;
        }
        c5451y.f31268c.remove(str);
        Long l8 = (Long) c5451y.f31267b.get(str);
        if (l8 == null) {
            c5451y.h().E().a("First ad unit exposure time was never set");
        } else {
            long longValue = j8 - l8.longValue();
            c5451y.f31267b.remove(str);
            c5451y.y(str, longValue, A7);
        }
        if (c5451y.f31268c.isEmpty()) {
            long j9 = c5451y.f31269d;
            if (j9 == 0) {
                c5451y.h().E().a("First ad exposure time was never set");
            } else {
                c5451y.u(j8 - j9, A7);
                c5451y.f31269d = 0L;
            }
        }
    }

    private final void u(long j8, C5449x4 c5449x4) {
        if (c5449x4 == null) {
            h().I().a("Not logging ad exposure. No active activity");
            return;
        }
        if (j8 < 1000) {
            h().I().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j8));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j8);
        d6.V(c5449x4, bundle, true);
        p().Z0("am", "_xa", bundle);
    }

    static /* synthetic */ void w(C5451y c5451y, String str, long j8) {
        c5451y.l();
        Z2.r.f(str);
        if (c5451y.f31268c.isEmpty()) {
            c5451y.f31269d = j8;
        }
        Integer num = (Integer) c5451y.f31268c.get(str);
        if (num != null) {
            c5451y.f31268c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (c5451y.f31268c.size() >= 100) {
            c5451y.h().J().a("Too many ads visible");
        } else {
            c5451y.f31268c.put(str, 1);
            c5451y.f31267b.put(str, Long.valueOf(j8));
        }
    }

    private final void y(String str, long j8, C5449x4 c5449x4) {
        if (c5449x4 == null) {
            h().I().a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j8 < 1000) {
            h().I().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j8));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j8);
        d6.V(c5449x4, bundle, true);
        p().Z0("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(long j8) {
        Iterator it = this.f31267b.keySet().iterator();
        while (it.hasNext()) {
            this.f31267b.put((String) it.next(), Long.valueOf(j8));
        }
        if (this.f31267b.isEmpty()) {
            return;
        }
        this.f31269d = j8;
    }

    public final void B(String str, long j8) {
        if (str == null || str.length() == 0) {
            h().E().a("Ad unit id must be a non-empty string");
        } else {
            j().B(new RunnableC5459z0(this, str, j8));
        }
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

    public final void t(long j8) {
        C5449x4 A7 = q().A(false);
        for (String str : this.f31267b.keySet()) {
            y(str, j8 - ((Long) this.f31267b.get(str)).longValue(), A7);
        }
        if (!this.f31267b.isEmpty()) {
            u(j8 - this.f31269d, A7);
        }
        z(j8);
    }

    public final void x(String str, long j8) {
        if (str == null || str.length() == 0) {
            h().E().a("Ad unit id must be a non-empty string");
        } else {
            j().B(new RunnableC5284a(this, str, j8));
        }
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
