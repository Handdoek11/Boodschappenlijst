package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* loaded from: classes.dex */
final class J extends X2.q {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Dialog f13273a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K f13274b;

    J(K k8, Dialog dialog) {
        this.f13274b = k8;
        this.f13273a = dialog;
    }

    @Override // X2.q
    public final void a() {
        this.f13274b.f13276s.o();
        if (this.f13273a.isShowing()) {
            this.f13273a.dismiss();
        }
    }
}
