package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* renamed from: com.google.android.gms.internal.ads.Um, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC1842Um implements DialogInterface.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ C1877Vm f19455o;

    DialogInterfaceOnClickListenerC1842Um(C1877Vm c1877Vm) {
        this.f19455o = c1877Vm;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i8) {
        this.f19455o.c("Operation denied by user.");
    }
}
