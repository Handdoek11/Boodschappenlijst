package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Ri, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1732Ri implements InterfaceC1662Pi {

    /* renamed from: a, reason: collision with root package name */
    private final C1767Si f18687a;

    public C1732Ri(C1767Si c1767Si) {
        this.f18687a = c1767Si;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        InterfaceC4410vt interfaceC4410vt = (InterfaceC4410vt) obj;
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        float f8 = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f8 = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e8) {
            H2.p.e("Fail to parse float", e8);
        }
        this.f18687a.c(equals);
        this.f18687a.b(equals2, f8);
        interfaceC4410vt.J0(equals);
    }
}
