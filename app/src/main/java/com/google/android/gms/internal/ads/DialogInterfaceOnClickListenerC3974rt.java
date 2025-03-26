package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* renamed from: com.google.android.gms.internal.ads.rt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC3974rt implements DialogInterface.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ JsPromptResult f26230o;

    DialogInterfaceOnClickListenerC3974rt(JsPromptResult jsPromptResult) {
        this.f26230o = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i8) {
        this.f26230o.cancel();
    }
}
