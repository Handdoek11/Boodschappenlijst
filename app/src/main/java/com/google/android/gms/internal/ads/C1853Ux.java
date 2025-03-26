package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Ux, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1853Ux implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f19483a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f19484b;

    public C1853Ux(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02, InterfaceC4203ty0 interfaceC4203ty03) {
        this.f19483a = interfaceC4203ty0;
        this.f19484b = interfaceC4203ty03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet = ((JSONObject) this.f19484b.zzb()) == null ? Collections.emptySet() : Collections.singleton(new C3041jG((C1643Ox) this.f19483a.zzb(), C3244l80.b()));
        AbstractC3332ly0.b(emptySet);
        return emptySet;
    }
}
