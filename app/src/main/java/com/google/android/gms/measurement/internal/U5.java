package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* loaded from: classes2.dex */
final class U5 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ String f30729o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ String f30730s;

    /* renamed from: t, reason: collision with root package name */
    private final /* synthetic */ Bundle f30731t;

    /* renamed from: u, reason: collision with root package name */
    private final /* synthetic */ S5 f30732u;

    U5(S5 s52, String str, String str2, Bundle bundle) {
        this.f30729o = str;
        this.f30730s = str2;
        this.f30731t = bundle;
        this.f30732u = s52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30732u.f30714a.u((E) Z2.r.l(this.f30732u.f30714a.w0().F(this.f30729o, this.f30730s, this.f30731t, "auto", this.f30732u.f30714a.zzb().a(), false, true)), this.f30729o);
    }
}
