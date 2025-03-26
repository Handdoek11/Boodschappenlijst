package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes.dex */
final class ZH implements InterfaceC1662Pi {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f20441a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f20442b;

    /* synthetic */ ZH(C2285cI c2285cI, View view, AbstractC2177bI abstractC2177bI) {
        this.f20441a = new WeakReference(c2285cI);
        if (((Boolean) D2.A.c().a(AbstractC3184kf.Lc)).booleanValue()) {
            this.f20442b = new WeakReference(view);
        } else {
            this.f20442b = new WeakReference(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
    public final void a(Object obj, Map map) {
        C2285cI c2285cI = (C2285cI) this.f20441a.get();
        if (c2285cI == null) {
            return;
        }
        c2285cI.f21135g.zza();
        if (((Boolean) D2.A.c().a(AbstractC3184kf.Lc)).booleanValue()) {
            c2285cI.f21128D.a((View) this.f20442b.get(), c2285cI.f21138j);
        }
    }
}
