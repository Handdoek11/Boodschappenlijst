package com.adadapted.android.sdk.core.view;

import J6.r;
import J6.s;
import android.content.Context;

/* loaded from: classes.dex */
final class AdadaptedComposable$InternalZoneView$1$1 extends s implements I6.l {
    final /* synthetic */ AdadaptedComposable this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdadaptedComposable$InternalZoneView$1$1(AdadaptedComposable adadaptedComposable) {
        super(1);
        this.this$0 = adadaptedComposable;
    }

    @Override // I6.l
    public final AdWebView invoke(Context context) {
        r.e(context, "it");
        return this.this$0.webView;
    }
}
