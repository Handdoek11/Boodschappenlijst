package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.j80, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3026j80 implements InterfaceC2462dy0 {
    public static C3026j80 a() {
        return AbstractC2919i80.f22922a;
    }

    public static InterfaceExecutorServiceC3522nk0 b() {
        InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0;
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23676F5)).booleanValue()) {
            interfaceExecutorServiceC3522nk0 = AbstractC1497Kq.f16646c;
        } else {
            interfaceExecutorServiceC3522nk0 = ((Boolean) D2.A.c().a(AbstractC3184kf.f23668E5)).booleanValue() ? AbstractC1497Kq.f16644a : AbstractC1497Kq.f16649f;
        }
        AbstractC3332ly0.b(interfaceExecutorServiceC3522nk0);
        return interfaceExecutorServiceC3522nk0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* synthetic */ Object zzb() {
        return b();
    }
}
