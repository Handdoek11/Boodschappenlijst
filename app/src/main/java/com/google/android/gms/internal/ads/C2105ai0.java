package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.ai0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2105ai0 extends AbstractC4167tg0 {

    /* renamed from: w, reason: collision with root package name */
    final transient InterfaceC3296lg0 f20751w;

    C2105ai0(Map map, InterfaceC3296lg0 interfaceC3296lg0) {
        super(map);
        this.f20751w = interfaceC3296lg0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1624Og0
    final Map e() {
        return n();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1624Og0
    final Set f() {
        return o();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1520Lg0
    protected final /* bridge */ /* synthetic */ Collection h() {
        return (List) this.f20751w.zza();
    }
}
