package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.hy0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2898hy0 extends Zx0 {
    static {
        C2571ey0.a(Collections.emptyMap());
    }

    /* synthetic */ C2898hy0(Map map, AbstractC2680fy0 abstractC2680fy0) {
        super(map);
    }

    public static C2789gy0 b(int i8) {
        return new C2789gy0(i8, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Map zzb() {
        LinkedHashMap b8 = AbstractC2137ay0.b(a().size());
        for (Map.Entry entry : a().entrySet()) {
            b8.put(entry.getKey(), ((InterfaceC3441my0) entry.getValue()).zzb());
        }
        return DesugarCollections.unmodifiableMap(b8);
    }
}
