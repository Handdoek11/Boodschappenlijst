package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    private Map f28855a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private U f28856b = new U();

    public E() {
        b(new C5061y());
        b(new D());
        b(new F());
        b(new J());
        b(new L());
        b(new S());
        b(new X());
    }

    private final void b(A a8) {
        Iterator it = a8.f28788a.iterator();
        while (it.hasNext()) {
            this.f28855a.put(((Z) it.next()).toString(), a8);
        }
    }

    public final InterfaceC5013s a(Z2 z22, InterfaceC5013s interfaceC5013s) {
        AbstractC5048w2.b(z22);
        if (!(interfaceC5013s instanceof C5037v)) {
            return interfaceC5013s;
        }
        C5037v c5037v = (C5037v) interfaceC5013s;
        ArrayList g8 = c5037v.g();
        String f8 = c5037v.f();
        return (this.f28855a.containsKey(f8) ? (A) this.f28855a.get(f8) : this.f28856b).b(f8, z22, g8);
    }
}
