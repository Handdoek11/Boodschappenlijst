package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import i3.BinderC5853b;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.yy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4747yy extends AbstractC4420vy {

    /* renamed from: j, reason: collision with root package name */
    private final Context f28237j;

    /* renamed from: k, reason: collision with root package name */
    private final View f28238k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC4410vt f28239l;

    /* renamed from: m, reason: collision with root package name */
    private final C3893r60 f28240m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC1436Iz f28241n;

    /* renamed from: o, reason: collision with root package name */
    private final SI f28242o;

    /* renamed from: p, reason: collision with root package name */
    private final C4130tG f28243p;

    /* renamed from: q, reason: collision with root package name */
    private final Xx0 f28244q;

    /* renamed from: r, reason: collision with root package name */
    private final Executor f28245r;

    /* renamed from: s, reason: collision with root package name */
    private D2.c2 f28246s;

    C4747yy(C1471Jz c1471Jz, Context context, C3893r60 c3893r60, View view, InterfaceC4410vt interfaceC4410vt, InterfaceC1436Iz interfaceC1436Iz, SI si, C4130tG c4130tG, Xx0 xx0, Executor executor) {
        super(c1471Jz);
        this.f28237j = context;
        this.f28238k = view;
        this.f28239l = interfaceC4410vt;
        this.f28240m = c3893r60;
        this.f28241n = interfaceC1436Iz;
        this.f28242o = si;
        this.f28243p = c4130tG;
        this.f28244q = xx0;
        this.f28245r = executor;
    }

    public static /* synthetic */ void q(C4747yy c4747yy) {
        InterfaceC1415Ih e8 = c4747yy.f28242o.e();
        if (e8 == null) {
            return;
        }
        try {
            e8.F5((D2.V) c4747yy.f28244q.zzb(), BinderC5853b.p2(c4747yy.f28237j));
        } catch (RemoteException e9) {
            H2.p.e("RemoteException when notifyAdLoad is called", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1506Kz
    public final void b() {
        this.f28245r.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.xy
            @Override // java.lang.Runnable
            public final void run() {
                C4747yy.q(this.f27944o);
            }
        });
        super.b();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4420vy
    public final int i() {
        return this.f16709a.f14101b.f13520b.f26834d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4420vy
    public final int j() {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.J7)).booleanValue() && this.f16710b.f25791g0) {
            if (!((Boolean) D2.A.c().a(AbstractC3184kf.K7)).booleanValue()) {
                return 0;
            }
        }
        return this.f16709a.f14101b.f13520b.f26833c;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4420vy
    public final View k() {
        return this.f28238k;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4420vy
    public final D2.Y0 l() {
        try {
            return this.f28241n.zza();
        } catch (zzfcq unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4420vy
    public final C3893r60 m() {
        D2.c2 c2Var = this.f28246s;
        if (c2Var != null) {
            return R60.b(c2Var);
        }
        C3785q60 c3785q60 = this.f16710b;
        if (c3785q60.f25783c0) {
            for (String str : c3785q60.f25778a) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.f28238k;
            return new C3893r60(view.getWidth(), view.getHeight(), false);
        }
        return (C3893r60) this.f16710b.f25812r.get(0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4420vy
    public final C3893r60 n() {
        return this.f28240m;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4420vy
    public final void o() {
        this.f28243p.zza();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4420vy
    public final void p(ViewGroup viewGroup, D2.c2 c2Var) {
        InterfaceC4410vt interfaceC4410vt;
        if (viewGroup == null || (interfaceC4410vt = this.f28239l) == null) {
            return;
        }
        interfaceC4410vt.i1(C3976ru.c(c2Var));
        viewGroup.setMinimumHeight(c2Var.f1223t);
        viewGroup.setMinimumWidth(c2Var.f1226w);
        this.f28246s = c2Var;
    }
}
