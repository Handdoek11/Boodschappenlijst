package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class Dv0 extends AbstractC2781gu0 {

    /* renamed from: o, reason: collision with root package name */
    final Fv0 f14588o;

    /* renamed from: s, reason: collision with root package name */
    InterfaceC2997iu0 f14589s = a();

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ Hv0 f14590t;

    Dv0(Hv0 hv0) {
        this.f14590t = hv0;
        this.f14588o = new Fv0(hv0, null);
    }

    private final InterfaceC2997iu0 a() {
        Fv0 fv0 = this.f14588o;
        if (fv0.hasNext()) {
            return fv0.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14589s != null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2997iu0
    public final byte zza() {
        InterfaceC2997iu0 interfaceC2997iu0 = this.f14589s;
        if (interfaceC2997iu0 == null) {
            throw new NoSuchElementException();
        }
        byte zza = interfaceC2997iu0.zza();
        if (!this.f14589s.hasNext()) {
            this.f14589s = a();
        }
        return zza;
    }
}
