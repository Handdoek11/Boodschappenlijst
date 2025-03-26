package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class YK implements InterfaceC1519Lg {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f20247a = "_videoMediaView";

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ZK f20248b;

    YK(ZK zk, String str) {
        this.f20248b = zk;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1519Lg
    public final void a() {
        ZK zk = this.f20248b;
        if (zk.f20459u != null) {
            zk.f20459u.n(this.f20247a);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1519Lg
    public final void b(MotionEvent motionEvent) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1519Lg
    public final JSONObject zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1519Lg
    public final JSONObject zzb() {
        return null;
    }
}
