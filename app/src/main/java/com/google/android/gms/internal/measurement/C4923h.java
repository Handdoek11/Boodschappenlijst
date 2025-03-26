package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4923h implements InterfaceC5013s {

    /* renamed from: o, reason: collision with root package name */
    private final boolean f29310o;

    public C4923h(Boolean bool) {
        if (bool == null) {
            this.f29310o = false;
        } else {
            this.f29310o = bool.booleanValue();
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5013s
    public final InterfaceC5013s a() {
        return new C4923h(Boolean.valueOf(this.f29310o));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5013s
    public final Double b() {
        return Double.valueOf(this.f29310o ? 1.0d : 0.0d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5013s
    public final String c() {
        return Boolean.toString(this.f29310o);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5013s
    public final Boolean d() {
        return Boolean.valueOf(this.f29310o);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5013s
    public final Iterator e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4923h) && this.f29310o == ((C4923h) obj).f29310o;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f29310o).hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5013s
    public final InterfaceC5013s j(String str, Z2 z22, List list) {
        if ("toString".equals(str)) {
            return new C5029u(Boolean.toString(this.f29310o));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.f29310o), str));
    }

    public final String toString() {
        return String.valueOf(this.f29310o);
    }
}
