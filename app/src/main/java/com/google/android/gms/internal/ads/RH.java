package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class RH implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f18629a;

    public RH(InterfaceC4203ty0 interfaceC4203ty0) {
        this.f18629a = interfaceC4203ty0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = ((OH) this.f18629a).a().e() != null ? Collections.singleton("banner") : Collections.emptySet();
        AbstractC3332ly0.b(singleton);
        return singleton;
    }
}
