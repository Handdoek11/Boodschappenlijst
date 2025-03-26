package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Nz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1610Nz implements InterfaceC1645Oz {

    /* renamed from: a, reason: collision with root package name */
    private final Map f17802a;

    C1610Nz(Map map) {
        this.f17802a = map;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1645Oz
    public final InterfaceC4474wT g(int i8, String str) {
        return (InterfaceC4474wT) this.f17802a.get(str);
    }
}
