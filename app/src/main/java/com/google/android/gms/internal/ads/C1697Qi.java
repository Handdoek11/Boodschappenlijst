package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Qi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1697Qi implements InterfaceC1662Pi {

    /* renamed from: a, reason: collision with root package name */
    private final C3490nP f18523a;

    public C1697Qi(C3490nP c3490nP) {
        Z2.r.m(c3490nP, "The Inspector Manager must not be null");
        this.f18523a = c3490nP;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
    public final void a(Object obj, Map map) {
        if (map == null || !map.containsKey("persistentData") || TextUtils.isEmpty((CharSequence) map.get("persistentData"))) {
            return;
        }
        this.f18523a.k((String) map.get("persistentData"));
    }
}
