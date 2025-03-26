package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.kj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3192kj implements InterfaceC1662Pi {

    /* renamed from: a, reason: collision with root package name */
    private final C3490nP f24080a;

    public C3192kj(C3490nP c3490nP) {
        Z2.r.m(c3490nP, "The Inspector Manager must not be null");
        this.f24080a = c3490nP;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
    public final void a(Object obj, Map map) {
        if (map == null || !map.containsKey("extras")) {
            return;
        }
        long j8 = Long.MAX_VALUE;
        if (map.containsKey("expires")) {
            try {
                j8 = Long.parseLong((String) map.get("expires"));
            } catch (NumberFormatException unused) {
            }
        }
        this.f24080a.j((String) map.get("extras"), j8);
    }
}
