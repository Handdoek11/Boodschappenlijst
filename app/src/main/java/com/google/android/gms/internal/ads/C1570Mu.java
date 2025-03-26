package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Mu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1570Mu implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f17423a;

    public C1570Mu(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02) {
        this.f17423a = interfaceC4203ty0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = ((Boolean) D2.A.c().a(AbstractC3184kf.f23720L1)).booleanValue() ? Collections.singleton(new C3041jG((UO) this.f17423a.zzb(), C3244l80.b())) : Collections.emptySet();
        AbstractC3332ly0.b(singleton);
        return singleton;
    }
}
