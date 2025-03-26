package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
public final class HW {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC4241uH f15744a;

    public HW(AbstractC4241uH abstractC4241uH) {
        this.f15744a = abstractC4241uH;
    }

    public final /* bridge */ /* synthetic */ Object a(C60 c60, C3785q60 c3785q60, View view, CW cw) {
        FW fw = new FW(this, new CH() { // from class: com.google.android.gms.internal.ads.EW
            @Override // com.google.android.gms.internal.ads.CH
            public final void a(boolean z7, Context context, C4558xC c4558xC) {
            }
        });
        QG c8 = this.f15744a.c(new C2161bA(c60, c3785q60, null), fw);
        cw.c(new GW(this, c8));
        return c8.i();
    }
}
