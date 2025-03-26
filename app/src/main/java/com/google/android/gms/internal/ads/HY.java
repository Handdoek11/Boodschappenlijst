package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.adadapted.android.sdk.core.ad.AdActionType;

/* loaded from: classes.dex */
public final class HY implements InterfaceC2907i20 {

    /* renamed from: a, reason: collision with root package name */
    private final D2.i2 f15745a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f15746b;

    public HY(D2.i2 i2Var, boolean z7) {
        this.f15745a = i2Var;
        this.f15746b = z7;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* synthetic */ void a(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = ((KB) obj).f16551a;
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23979p5)).booleanValue()) {
            bundle.putBoolean("app_switched", this.f15746b);
        }
        D2.i2 i2Var = this.f15745a;
        if (i2Var != null) {
            int i8 = i2Var.f1295o;
            if (i8 == 1) {
                bundle.putString("avo", AdActionType.POPUP);
            } else if (i8 == 2) {
                bundle.putString("avo", AdActionType.LINK);
            }
        }
    }
}
