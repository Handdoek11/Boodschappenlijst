package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.a4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4865a4 {
    public static InterfaceC5013s a(D2 d22) {
        if (d22 == null) {
            return InterfaceC5013s.f29548h;
        }
        int i8 = A3.f28797a[d22.H().ordinal()];
        if (i8 == 1) {
            return d22.P() ? new C5029u(d22.K()) : InterfaceC5013s.f29555p;
        }
        if (i8 == 2) {
            return d22.O() ? new C4950k(Double.valueOf(d22.G())) : new C4950k(null);
        }
        if (i8 == 3) {
            return d22.N() ? new C4923h(Boolean.valueOf(d22.M())) : new C4923h(null);
        }
        if (i8 != 4) {
            if (i8 == 5) {
                throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
            }
            throw new IllegalStateException("Invalid entity: " + String.valueOf(d22));
        }
        List L7 = d22.L();
        ArrayList arrayList = new ArrayList();
        Iterator it = L7.iterator();
        while (it.hasNext()) {
            arrayList.add(a((D2) it.next()));
        }
        return new C5037v(d22.J(), arrayList);
    }

    public static InterfaceC5013s b(Object obj) {
        if (obj == null) {
            return InterfaceC5013s.f29549i;
        }
        if (obj instanceof String) {
            return new C5029u((String) obj);
        }
        if (obj instanceof Double) {
            return new C4950k((Double) obj);
        }
        if (obj instanceof Long) {
            return new C4950k(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C4950k(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C4923h((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            C4914g c4914g = new C4914g();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c4914g.s(b(it.next()));
            }
            return c4914g;
        }
        r rVar = new r();
        Map map = (Map) obj;
        for (Object obj2 : map.keySet()) {
            InterfaceC5013s b8 = b(map.get(obj2));
            if (obj2 != null) {
                if (!(obj2 instanceof String)) {
                    obj2 = obj2.toString();
                }
                rVar.o((String) obj2, b8);
            }
        }
        return rVar;
    }
}
