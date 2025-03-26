package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC4990p {
    public static InterfaceC5013s a(InterfaceC4966m interfaceC4966m, InterfaceC5013s interfaceC5013s, Z2 z22, List list) {
        if (interfaceC4966m.C(interfaceC5013s.c())) {
            InterfaceC5013s n8 = interfaceC4966m.n(interfaceC5013s.c());
            if (n8 instanceof AbstractC4974n) {
                return ((AbstractC4974n) n8).f(z22, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", interfaceC5013s.c()));
        }
        if (!"hasOwnProperty".equals(interfaceC5013s.c())) {
            throw new IllegalArgumentException(String.format("Object has no function %s", interfaceC5013s.c()));
        }
        AbstractC5048w2.g("hasOwnProperty", 1, list);
        return interfaceC4966m.C(z22.b((InterfaceC5013s) list.get(0)).c()) ? InterfaceC5013s.f29553m : InterfaceC5013s.f29554n;
    }

    public static Iterator b(Map map) {
        return new C4982o(map.keySet().iterator());
    }
}
