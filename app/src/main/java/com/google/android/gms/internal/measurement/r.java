package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class r implements InterfaceC4966m, InterfaceC5013s {

    /* renamed from: o, reason: collision with root package name */
    private final Map f29518o = new HashMap();

    @Override // com.google.android.gms.internal.measurement.InterfaceC4966m
    public final boolean C(String str) {
        return this.f29518o.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5013s
    public final InterfaceC5013s a() {
        r rVar = new r();
        for (Map.Entry entry : this.f29518o.entrySet()) {
            if (entry.getValue() instanceof InterfaceC4966m) {
                rVar.f29518o.put((String) entry.getKey(), (InterfaceC5013s) entry.getValue());
            } else {
                rVar.f29518o.put((String) entry.getKey(), ((InterfaceC5013s) entry.getValue()).a());
            }
        }
        return rVar;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5013s
    public final Double b() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5013s
    public final String c() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5013s
    public final Boolean d() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5013s
    public final Iterator e() {
        return AbstractC4990p.b(this.f29518o);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            return this.f29518o.equals(((r) obj).f29518o);
        }
        return false;
    }

    public final List f() {
        return new ArrayList(this.f29518o.keySet());
    }

    public int hashCode() {
        return this.f29518o.hashCode();
    }

    public InterfaceC5013s j(String str, Z2 z22, List list) {
        return "toString".equals(str) ? new C5029u(toString()) : AbstractC4990p.a(this, new C5029u(str), z22, list);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4966m
    public final InterfaceC5013s n(String str) {
        return this.f29518o.containsKey(str) ? (InterfaceC5013s) this.f29518o.get(str) : InterfaceC5013s.f29548h;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4966m
    public final void o(String str, InterfaceC5013s interfaceC5013s) {
        if (interfaceC5013s == null) {
            this.f29518o.remove(str);
        } else {
            this.f29518o.put(str, interfaceC5013s);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (!this.f29518o.isEmpty()) {
            for (String str : this.f29518o.keySet()) {
                sb.append(String.format("%s: %s,", str, this.f29518o.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }
}
