package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class H20 implements InterfaceC2907i20 {

    /* renamed from: a, reason: collision with root package name */
    final String f15603a;

    /* renamed from: b, reason: collision with root package name */
    final int f15604b;

    /* synthetic */ H20(String str, int i8, G20 g20) {
        this.f15603a = str;
        this.f15604b = i8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* synthetic */ void a(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        KB kb = (KB) obj;
        if (((Boolean) D2.A.c().a(AbstractC3184kf.na)).booleanValue()) {
            if (!TextUtils.isEmpty(this.f15603a)) {
                kb.f16551a.putString("topics", this.f15603a);
            }
            int i8 = this.f15604b;
            if (i8 != -1) {
                kb.f16551a.putInt("atps", i8);
            }
        }
    }
}
