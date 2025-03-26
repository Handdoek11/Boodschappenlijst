package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5037v implements InterfaceC5013s {

    /* renamed from: o, reason: collision with root package name */
    private final String f29596o;

    /* renamed from: s, reason: collision with root package name */
    private final ArrayList f29597s;

    public C5037v(String str, List list) {
        this.f29596o = str;
        ArrayList arrayList = new ArrayList();
        this.f29597s = arrayList;
        arrayList.addAll(list);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5013s
    public final InterfaceC5013s a() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5013s
    public final Double b() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5013s
    public final String c() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5013s
    public final Boolean d() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5013s
    public final Iterator e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5037v)) {
            return false;
        }
        C5037v c5037v = (C5037v) obj;
        String str = this.f29596o;
        if (str == null ? c5037v.f29596o != null : !str.equals(c5037v.f29596o)) {
            return false;
        }
        ArrayList arrayList = this.f29597s;
        ArrayList arrayList2 = c5037v.f29597s;
        return arrayList != null ? arrayList.equals(arrayList2) : arrayList2 == null;
    }

    public final String f() {
        return this.f29596o;
    }

    public final ArrayList g() {
        return this.f29597s;
    }

    public final int hashCode() {
        String str = this.f29596o;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        ArrayList arrayList = this.f29597s;
        return hashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5013s
    public final InterfaceC5013s j(String str, Z2 z22, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }
}
