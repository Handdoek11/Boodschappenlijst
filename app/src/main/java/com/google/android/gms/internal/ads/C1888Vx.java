package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Vx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1888Vx implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f19681a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f19682b;

    public C1888Vx(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02, InterfaceC4203ty0 interfaceC4203ty03) {
        this.f19681a = interfaceC4203ty0;
        this.f19682b = interfaceC4203ty03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet = ((JSONObject) this.f19682b.zzb()) == null ? Collections.emptySet() : Collections.singleton(new C3041jG((C1643Ox) this.f19681a.zzb(), C3244l80.b()));
        AbstractC3332ly0.b(emptySet);
        return emptySet;
    }
}
