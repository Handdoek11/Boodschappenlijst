package com.google.android.gms.internal.ads;

import G2.InterfaceC0611r0;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class VY implements InterfaceC2907i20 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f19613a;

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f19614b;

    /* renamed from: c, reason: collision with root package name */
    private final String f19615c;

    /* renamed from: d, reason: collision with root package name */
    private final String f19616d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC0611r0 f19617e;

    /* renamed from: f, reason: collision with root package name */
    private final String f19618f;

    /* renamed from: g, reason: collision with root package name */
    private final QA f19619g;

    public VY(Context context, Bundle bundle, String str, String str2, InterfaceC0611r0 interfaceC0611r0, String str3, QA qa) {
        this.f19613a = context;
        this.f19614b = bundle;
        this.f19615c = str;
        this.f19616d = str2;
        this.f19617e = interfaceC0611r0;
        this.f19618f = str3;
        this.f19619g = qa;
    }

    private final void b(Bundle bundle) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23636A5)).booleanValue()) {
            try {
                C2.v.t();
                bundle.putString("_app_id", G2.D0.V(this.f19613a));
            } catch (RemoteException | RuntimeException e8) {
                C2.v.s().x(e8, "AppStatsSignal_AppId");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        KB kb = (KB) obj;
        kb.f16552b.putBundle("quality_signals", this.f19614b);
        b(kb.f16552b);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = ((KB) obj).f16551a;
        bundle.putBundle("quality_signals", this.f19614b);
        bundle.putString("seq_num", this.f19615c);
        if (!this.f19617e.L()) {
            bundle.putString("session_id", this.f19616d);
        }
        bundle.putBoolean("client_purpose_one", !this.f19617e.L());
        b(bundle);
        if (this.f19618f != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dload", this.f19619g.b(this.f19618f));
            bundle2.putInt("pcc", this.f19619g.a(this.f19618f));
            bundle.putBundle("ad_unit_quality_signals", bundle2);
        }
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.E9)).booleanValue() || C2.v.s().b() <= 0) {
            return;
        }
        bundle.putInt("nrwv", C2.v.s().b());
    }
}
