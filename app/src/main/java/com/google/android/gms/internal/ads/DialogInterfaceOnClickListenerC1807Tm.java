package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;

/* renamed from: com.google.android.gms.internal.ads.Tm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC1807Tm implements DialogInterface.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ C1877Vm f19172o;

    DialogInterfaceOnClickListenerC1807Tm(C1877Vm c1877Vm) {
        this.f19172o = c1877Vm;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i8) {
        C1877Vm c1877Vm = this.f19172o;
        Intent i9 = c1877Vm.i();
        C2.v.t();
        G2.D0.t(c1877Vm.f19653d, i9);
    }
}
