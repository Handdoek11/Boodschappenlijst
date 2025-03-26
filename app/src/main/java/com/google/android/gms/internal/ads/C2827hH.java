package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.hH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2827hH implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f22528a;

    public C2827hH(TG tg, InterfaceC4203ty0 interfaceC4203ty0) {
        this.f22528a = interfaceC4203ty0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new C3041jG((DB) this.f22528a.zzb(), AbstractC1497Kq.f16650g));
        AbstractC3332ly0.b(singleton);
        return singleton;
    }
}
