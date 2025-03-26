package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Tz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1820Tz implements InterfaceC4149tV {

    /* renamed from: a, reason: collision with root package name */
    public final List f19204a;

    public C1820Tz(List list) {
        this.f19204a = list;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4149tV
    public final void r() {
        Iterator it = this.f19204a.iterator();
        while (it.hasNext()) {
            AbstractC2326ck0.r((com.google.common.util.concurrent.d) it.next(), new C1785Sz(this), AbstractC4284uk0.c());
        }
    }

    public C1820Tz(AbstractC1506Kz abstractC1506Kz) {
        this.f19204a = Collections.singletonList(AbstractC2326ck0.h(abstractC1506Kz));
    }
}
