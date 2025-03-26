package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* renamed from: com.google.android.gms.internal.ads.qt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class DialogInterfaceOnCancelListenerC3866qt implements DialogInterface.OnCancelListener {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ JsPromptResult f25998o;

    DialogInterfaceOnCancelListenerC3866qt(JsPromptResult jsPromptResult) {
        this.f25998o = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f25998o.cancel();
    }
}
