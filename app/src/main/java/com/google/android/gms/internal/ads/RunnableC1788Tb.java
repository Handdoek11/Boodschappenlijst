package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.Tb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC1788Tb implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ View f19154o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ C1928Xb f19155s;

    RunnableC1788Tb(C1928Xb c1928Xb, View view) {
        this.f19154o = view;
        this.f19155s = c1928Xb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19155s.b(this.f19154o);
    }
}
