package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.Bt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class ViewOnAttachStateChangeListenerC1178Bt implements View.OnAttachStateChangeListener {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ InterfaceC1426Ip f13910o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ AbstractC1358Gt f13911s;

    ViewOnAttachStateChangeListenerC1178Bt(AbstractC1358Gt abstractC1358Gt, InterfaceC1426Ip interfaceC1426Ip) {
        this.f13910o = interfaceC1426Ip;
        this.f13911s = abstractC1358Gt;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f13911s.N(view, this.f13910o, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
