package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* renamed from: com.google.android.gms.internal.ads.pt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC3757pt implements DialogInterface.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ JsResult f25531o;

    DialogInterfaceOnClickListenerC3757pt(JsResult jsResult) {
        this.f25531o = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i8) {
        this.f25531o.confirm();
    }
}
