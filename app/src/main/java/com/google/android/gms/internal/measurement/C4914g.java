package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4914g implements InterfaceC4966m, InterfaceC5013s, Iterable {

    /* renamed from: o, reason: collision with root package name */
    private final SortedMap f29300o;

    /* renamed from: s, reason: collision with root package name */
    private final Map f29301s;

    public C4914g() {
        this.f29300o = new TreeMap();
        this.f29301s = new TreeMap();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4966m
    public final boolean C(String str) {
        return "length".equals(str) || this.f29301s.containsKey(str);
    }

    public final Iterator F() {
        return this.f29300o.keySet().iterator();
    }

    public final List H() {
        ArrayList arrayList = new ArrayList(t());
        for (int i8 = 0; i8 < t(); i8++) {
            arrayList.add(q(i8));
        }
        return arrayList;
    }

    public final void I() {
        this.f29300o.clear();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5013s
    public final InterfaceC5013s a() {
        C4914g c4914g = new C4914g();
        for (Map.Entry entry : this.f29300o.entrySet()) {
            if (entry.getValue() instanceof InterfaceC4966m) {
                c4914g.f29300o.put((Integer) entry.getKey(), (InterfaceC5013s) entry.getValue());
            } else {
                c4914g.f29300o.put((Integer) entry.getKey(), ((InterfaceC5013s) entry.getValue()).a());
            }
        }
        return c4914g;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5013s
    public final Double b() {
        return this.f29300o.size() == 1 ? q(0).b() : this.f29300o.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5013s
    public final String c() {
        return toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5013s
    public final Boolean d() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5013s
    public final Iterator e() {
        return new C4905f(this, this.f29300o.keySet().iterator(), this.f29301s.keySet().iterator());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4914g)) {
            return false;
        }
        C4914g c4914g = (C4914g) obj;
        if (t() != c4914g.t()) {
            return false;
        }
        if (this.f29300o.isEmpty()) {
            return c4914g.f29300o.isEmpty();
        }
        for (int intValue = ((Integer) this.f29300o.firstKey()).intValue(); intValue <= ((Integer) this.f29300o.lastKey()).intValue(); intValue++) {
            if (!q(intValue).equals(c4914g.q(intValue))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f29300o.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C4932i(this);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5013s
    public final InterfaceC5013s j(String str, Z2 z22, List list) {
        return ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) ? H.d(str, this, z22, list) : AbstractC4990p.a(this, new C5029u(str), z22, list);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4966m
    public final InterfaceC5013s n(String str) {
        InterfaceC5013s interfaceC5013s;
        return "length".equals(str) ? new C4950k(Double.valueOf(t())) : (!C(str) || (interfaceC5013s = (InterfaceC5013s) this.f29301s.get(str)) == null) ? InterfaceC5013s.f29548h : interfaceC5013s;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4966m
    public final void o(String str, InterfaceC5013s interfaceC5013s) {
        if (interfaceC5013s == null) {
            this.f29301s.remove(str);
        } else {
            this.f29301s.put(str, interfaceC5013s);
        }
    }

    public final int p() {
        return this.f29300o.size();
    }

    public final InterfaceC5013s q(int i8) {
        InterfaceC5013s interfaceC5013s;
        if (i8 < t()) {
            return (!y(i8) || (interfaceC5013s = (InterfaceC5013s) this.f29300o.get(Integer.valueOf(i8))) == null) ? InterfaceC5013s.f29548h : interfaceC5013s;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final void r(int i8, InterfaceC5013s interfaceC5013s) {
        if (i8 < 0) {
            throw new IllegalArgumentException("Invalid value index: " + i8);
        }
        if (i8 >= t()) {
            x(i8, interfaceC5013s);
            return;
        }
        for (int intValue = ((Integer) this.f29300o.lastKey()).intValue(); intValue >= i8; intValue--) {
            InterfaceC5013s interfaceC5013s2 = (InterfaceC5013s) this.f29300o.get(Integer.valueOf(intValue));
            if (interfaceC5013s2 != null) {
                x(intValue + 1, interfaceC5013s2);
                this.f29300o.remove(Integer.valueOf(intValue));
            }
        }
        x(i8, interfaceC5013s);
    }

    public final void s(InterfaceC5013s interfaceC5013s) {
        x(t(), interfaceC5013s);
    }

    public final int t() {
        if (this.f29300o.isEmpty()) {
            return 0;
        }
        return ((Integer) this.f29300o.lastKey()).intValue() + 1;
    }

    public final String toString() {
        return v(",");
    }

    public final String v(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.f29300o.isEmpty()) {
            for (int i8 = 0; i8 < t(); i8++) {
                InterfaceC5013s q8 = q(i8);
                sb.append(str);
                if (!(q8 instanceof C5069z) && !(q8 instanceof C4998q)) {
                    sb.append(q8.c());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    public final void w(int i8) {
        int intValue = ((Integer) this.f29300o.lastKey()).intValue();
        if (i8 > intValue || i8 < 0) {
            return;
        }
        this.f29300o.remove(Integer.valueOf(i8));
        if (i8 == intValue) {
            int i9 = i8 - 1;
            if (this.f29300o.containsKey(Integer.valueOf(i9)) || i9 < 0) {
                return;
            }
            this.f29300o.put(Integer.valueOf(i9), InterfaceC5013s.f29548h);
            return;
        }
        while (true) {
            i8++;
            if (i8 > ((Integer) this.f29300o.lastKey()).intValue()) {
                return;
            }
            InterfaceC5013s interfaceC5013s = (InterfaceC5013s) this.f29300o.get(Integer.valueOf(i8));
            if (interfaceC5013s != null) {
                this.f29300o.put(Integer.valueOf(i8 - 1), interfaceC5013s);
                this.f29300o.remove(Integer.valueOf(i8));
            }
        }
    }

    public final void x(int i8, InterfaceC5013s interfaceC5013s) {
        if (i8 > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i8 < 0) {
            throw new IndexOutOfBoundsException("Out of bounds index: " + i8);
        }
        if (interfaceC5013s == null) {
            this.f29300o.remove(Integer.valueOf(i8));
        } else {
            this.f29300o.put(Integer.valueOf(i8), interfaceC5013s);
        }
    }

    public final boolean y(int i8) {
        if (i8 >= 0 && i8 <= ((Integer) this.f29300o.lastKey()).intValue()) {
            return this.f29300o.containsKey(Integer.valueOf(i8));
        }
        throw new IndexOutOfBoundsException("Out of bounds index: " + i8);
    }

    public C4914g(List list) {
        this();
        if (list != null) {
            for (int i8 = 0; i8 < list.size(); i8++) {
                x(i8, (InterfaceC5013s) list.get(i8));
            }
        }
    }

    public C4914g(InterfaceC5013s... interfaceC5013sArr) {
        this(Arrays.asList(interfaceC5013sArr));
    }
}
