package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4974n implements InterfaceC4966m, InterfaceC5013s {

    /* renamed from: o, reason: collision with root package name */
    protected final String f29460o;

    /* renamed from: s, reason: collision with root package name */
    protected final Map f29461s = new HashMap();

    public AbstractC4974n(String str) {
        this.f29460o = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4966m
    public final boolean C(String str) {
        return this.f29461s.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5013s
    public InterfaceC5013s a() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5013s
    public final Double b() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5013s
    public final String c() {
        return this.f29460o;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5013s
    public final Boolean d() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5013s
    public final Iterator e() {
        return AbstractC4990p.b(this.f29461s);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC4974n)) {
            return false;
        }
        AbstractC4974n abstractC4974n = (AbstractC4974n) obj;
        String str = this.f29460o;
        if (str != null) {
            return str.equals(abstractC4974n.f29460o);
        }
        return false;
    }

    public abstract InterfaceC5013s f(Z2 z22, List list);

    public final String g() {
        return this.f29460o;
    }

    public int hashCode() {
        String str = this.f29460o;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5013s
    public final InterfaceC5013s j(String str, Z2 z22, List list) {
        return "toString".equals(str) ? new C5029u(this.f29460o) : AbstractC4990p.a(this, new C5029u(str), z22, list);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4966m
    public final InterfaceC5013s n(String str) {
        return this.f29461s.containsKey(str) ? (InterfaceC5013s) this.f29461s.get(str) : InterfaceC5013s.f29548h;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4966m
    public final void o(String str, InterfaceC5013s interfaceC5013s) {
        if (interfaceC5013s == null) {
            this.f29461s.remove(str);
        } else {
            this.f29461s.put(str, interfaceC5013s);
        }
    }
}
