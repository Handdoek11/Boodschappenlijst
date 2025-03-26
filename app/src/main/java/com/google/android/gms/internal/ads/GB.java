package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class GB implements ZC, FC {

    /* renamed from: o, reason: collision with root package name */
    private final C3785q60 f15322o;

    public GB(Context context, C3785q60 c3785q60, C4834zn c4834zn) {
        this.f15322o = c3785q60;
    }

    @Override // com.google.android.gms.internal.ads.FC
    public final void e(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.FC
    public final void i(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.FC
    public final void p(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.ZC
    public final void s() {
        C1136An c1136An = this.f15322o.f25785d0;
        if (c1136An == null || !c1136An.f13624a) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.f15322o.f25785d0.f13625b.isEmpty()) {
            return;
        }
        arrayList.add(this.f15322o.f25785d0.f13625b);
    }
}
