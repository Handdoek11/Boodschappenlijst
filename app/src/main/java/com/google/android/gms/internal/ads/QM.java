package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class QM implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f18453a;

    public QM(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02) {
        this.f18453a = interfaceC4203ty02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        InterfaceExecutorServiceC3522nk0 b8 = C3244l80.b();
        Set singleton = ((Boolean) D2.A.c().a(AbstractC3184kf.f23811W4)).booleanValue() ? Collections.singleton(new C3041jG(((C3052jN) this.f18453a).zzb(), b8)) : Collections.emptySet();
        AbstractC3332ly0.b(singleton);
        return singleton;
    }
}
