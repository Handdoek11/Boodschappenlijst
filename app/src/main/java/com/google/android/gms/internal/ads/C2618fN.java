package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.fN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2618fN implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f22030a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f22031b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4203ty0 f22032c;

    public C2618fN(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02, InterfaceC4203ty0 interfaceC4203ty03, InterfaceC4203ty0 interfaceC4203ty04) {
        this.f22030a = interfaceC4203ty0;
        this.f22031b = interfaceC4203ty02;
        this.f22032c = interfaceC4203ty04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        final String a8 = ((C4759z30) this.f22030a).a();
        Context a9 = ((C1323Fu) this.f22031b).a();
        InterfaceExecutorServiceC3522nk0 b8 = C3244l80.b();
        Map zzb = ((C2898hy0) this.f22032c).zzb();
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23811W4)).booleanValue()) {
            C2000Zc c2000Zc = new C2000Zc(new C2637fd(a9));
            c2000Zc.b(new InterfaceC1965Yc() { // from class: com.google.android.gms.internal.ads.gN
                @Override // com.google.android.gms.internal.ads.InterfaceC1965Yc
                public final void a(C1409Ie c1409Ie) {
                    c1409Ie.F(a8);
                }
            });
            emptySet = Collections.singleton(new C3041jG(new C2945iN(c2000Zc, zzb), b8));
        } else {
            emptySet = Collections.emptySet();
        }
        AbstractC3332ly0.b(emptySet);
        return emptySet;
    }
}
