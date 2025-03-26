package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* renamed from: com.google.android.gms.internal.ads.nt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class DialogInterfaceOnCancelListenerC3539nt implements DialogInterface.OnCancelListener {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ JsResult f25047o;

    DialogInterfaceOnCancelListenerC3539nt(JsResult jsResult) {
        this.f25047o = jsResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f25047o.cancel();
    }
}
