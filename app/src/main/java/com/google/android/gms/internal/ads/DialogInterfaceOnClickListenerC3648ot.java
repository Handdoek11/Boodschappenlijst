package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* renamed from: com.google.android.gms.internal.ads.ot, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC3648ot implements DialogInterface.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ JsResult f25284o;

    DialogInterfaceOnClickListenerC3648ot(JsResult jsResult) {
        this.f25284o = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i8) {
        this.f25284o.cancel();
    }
}
