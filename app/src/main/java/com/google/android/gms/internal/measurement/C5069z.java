package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5069z implements InterfaceC5013s {
    @Override // com.google.android.gms.internal.measurement.InterfaceC5013s
    public final InterfaceC5013s a() {
        return InterfaceC5013s.f29548h;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5013s
    public final Double b() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5013s
    public final String c() {
        return "undefined";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5013s
    public final Boolean d() {
        return Boolean.FALSE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5013s
    public final Iterator e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof C5069z;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5013s
    public final InterfaceC5013s j(String str, Z2 z22, List list) {
        throw new IllegalStateException(String.format("Undefined has no function %s", str));
    }
}
