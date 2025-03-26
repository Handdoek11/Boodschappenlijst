package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* renamed from: com.google.android.gms.internal.ads.st, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC4083st implements DialogInterface.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ JsPromptResult f26748o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ EditText f26749s;

    DialogInterfaceOnClickListenerC4083st(JsPromptResult jsPromptResult, EditText editText) {
        this.f26748o = jsPromptResult;
        this.f26749s = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i8) {
        this.f26748o.confirm(this.f26749s.getText().toString());
    }
}
