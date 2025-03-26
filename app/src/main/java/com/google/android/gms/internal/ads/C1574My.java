package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.My, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1574My implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final C1219Cy f17441a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f17442b;

    public C1574My(C1219Cy c1219Cy, InterfaceC4203ty0 interfaceC4203ty0) {
        this.f17441a = c1219Cy;
        this.f17442b = interfaceC4203ty0;
    }

    public static Set a(C1219Cy c1219Cy, C4858zz c4858zz) {
        Set singleton = Collections.singleton(new C3041jG(c4858zz, AbstractC1497Kq.f16650g));
        AbstractC3332ly0.b(singleton);
        return singleton;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return a(this.f17441a, (C4858zz) this.f17442b.zzb());
    }
}
