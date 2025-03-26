package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Rx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1748Rx implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f18721a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f18722b;

    public C1748Rx(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02, InterfaceC4203ty0 interfaceC4203ty03) {
        this.f18721a = interfaceC4203ty0;
        this.f18722b = interfaceC4203ty03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet = ((JSONObject) this.f18722b.zzb()) == null ? Collections.emptySet() : Collections.singleton(new C3041jG((C1643Ox) this.f18721a.zzb(), C3244l80.b()));
        AbstractC3332ly0.b(emptySet);
        return emptySet;
    }
}
