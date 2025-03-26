package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;

/* renamed from: com.google.android.gms.internal.ads.Ba0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1150Ba0 extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1186Ca0 f13821a;

    C1150Ba0(C1186Ca0 c1186Ca0) {
        this.f13821a = c1186Ca0;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.f13821a.s(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.f13821a.s(false);
    }
}
