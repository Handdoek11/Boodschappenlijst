package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.ext.SdkExtensions;

/* loaded from: classes.dex */
public final class ZY implements InterfaceC2907i20 {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f20493a;

    private ZY(Integer num) {
        this.f20493a = num;
    }

    static /* bridge */ /* synthetic */ ZY b(H2.a aVar) {
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.U9)).booleanValue()) {
            return new ZY(null);
        }
        C2.v.t();
        int i8 = 0;
        try {
            int i9 = Build.VERSION.SDK_INT;
            if (i9 < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
                if (((Boolean) D2.A.c().a(AbstractC3184kf.X9)).booleanValue()) {
                    if (aVar.f2916t >= ((Integer) D2.A.c().a(AbstractC3184kf.W9)).intValue() && i9 >= 31 && SdkExtensions.getExtensionVersion(31) >= 9) {
                        i8 = SdkExtensions.getExtensionVersion(31);
                    }
                }
            } else {
                i8 = SdkExtensions.getExtensionVersion(1000000);
            }
        } catch (Exception e8) {
            C2.v.s().x(e8, "AdUtil.getAdServicesExtensionVersion");
        }
        return new ZY(Integer.valueOf(i8));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* synthetic */ void a(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Integer num = this.f20493a;
        KB kb = (KB) obj;
        if (num != null) {
            kb.f16551a.putInt("aos", num.intValue());
        }
    }
}
