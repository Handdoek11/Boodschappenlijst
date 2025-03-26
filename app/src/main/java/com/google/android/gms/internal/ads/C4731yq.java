package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;

/* renamed from: com.google.android.gms.internal.ads.yq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4731yq extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1175Bq f28206a;

    C4731yq(C1175Bq c1175Bq) {
        this.f28206a = c1175Bq;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.f28206a.f13905o.set(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.f28206a.f13905o.set(false);
    }
}
