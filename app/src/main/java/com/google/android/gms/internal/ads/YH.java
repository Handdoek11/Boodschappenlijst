package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes.dex */
final class YH implements InterfaceC1662Pi {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f20239a;

    /* synthetic */ YH(C2285cI c2285cI, AbstractC2177bI abstractC2177bI) {
        this.f20239a = new WeakReference(c2285cI);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
    public final void a(Object obj, Map map) {
        C2285cI c2285cI = (C2285cI) this.f20239a.get();
        if (c2285cI == null) {
            return;
        }
        c2285cI.f21136h.I0();
        if (((Boolean) D2.A.c().a(AbstractC3184kf.Fa)).booleanValue()) {
            c2285cI.f21137i.K0();
            if (TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                return;
            }
            c2285cI.f21137i.x();
        }
    }
}
