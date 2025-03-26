package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* renamed from: com.google.android.gms.internal.ads.Sm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC1772Sm implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ AdOverlayInfoParcel f18953o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ zzbrw f18954s;

    RunnableC1772Sm(zzbrw zzbrwVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f18953o = adOverlayInfoParcel;
        this.f18954s = zzbrwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2.v.m();
        F2.y.a(this.f18954s.f28756a, this.f18953o, true, null);
    }
}
