package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class UG implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f19324a;

    public UG(TG tg, InterfaceC4203ty0 interfaceC4203ty0) {
        this.f19324a = interfaceC4203ty0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new C3041jG((DB) this.f19324a.zzb(), AbstractC1497Kq.f16650g));
        AbstractC3332ly0.b(singleton);
        return singleton;
    }
}
