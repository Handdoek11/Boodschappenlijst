package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class GA0 {

    /* renamed from: a, reason: collision with root package name */
    private final Zy0 f15321a;

    public GA0(Context context, C2126at c2126at) {
        this.f15321a = new Zy0(context, c2126at);
    }

    public final GA0 a(final Vz0 vz0) {
        Zy0 zy0 = this.f15321a;
        AbstractC3796qC.f(!zy0.f20597r);
        vz0.getClass();
        zy0.f20585f = new InterfaceC3296lg0() { // from class: com.google.android.gms.internal.ads.Ry0
            @Override // com.google.android.gms.internal.ads.InterfaceC3296lg0
            public final Object zza() {
                return vz0;
            }
        };
        return this;
    }

    public final GA0 b(final II0 ii0) {
        Zy0 zy0 = this.f15321a;
        AbstractC3796qC.f(!zy0.f20597r);
        ii0.getClass();
        zy0.f20584e = new InterfaceC3296lg0() { // from class: com.google.android.gms.internal.ads.Yy0
            @Override // com.google.android.gms.internal.ads.InterfaceC3296lg0
            public final Object zza() {
                return ii0;
            }
        };
        return this;
    }

    public final HA0 c() {
        Zy0 zy0 = this.f15321a;
        AbstractC3796qC.f(!zy0.f20597r);
        zy0.f20597r = true;
        return new HA0(zy0);
    }
}
