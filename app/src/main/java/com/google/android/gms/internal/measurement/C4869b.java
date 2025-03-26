package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4869b {

    /* renamed from: a, reason: collision with root package name */
    private final TreeMap f29220a = new TreeMap();

    /* renamed from: b, reason: collision with root package name */
    private final TreeMap f29221b = new TreeMap();

    private static int a(Z2 z22, C5021t c5021t, InterfaceC5013s interfaceC5013s) {
        InterfaceC5013s f8 = c5021t.f(z22, Collections.singletonList(interfaceC5013s));
        if (f8 instanceof C4950k) {
            return AbstractC5048w2.i(f8.b().doubleValue());
        }
        return -1;
    }

    public final void b(Z2 z22, C4887d c4887d) {
        Q5 q52 = new Q5(c4887d);
        for (Integer num : this.f29220a.keySet()) {
            C4896e c4896e = (C4896e) c4887d.d().clone();
            int a8 = a(z22, (C5021t) this.f29220a.get(num), q52);
            if (a8 == 2 || a8 == -1) {
                c4887d.e(c4896e);
            }
        }
        Iterator it = this.f29221b.keySet().iterator();
        while (it.hasNext()) {
            a(z22, (C5021t) this.f29221b.get((Integer) it.next()), q52);
        }
    }

    public final void c(String str, int i8, C5021t c5021t, String str2) {
        TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f29221b;
        } else {
            if (!"edit".equals(str2)) {
                throw new IllegalStateException("Unknown callback type: " + str2);
            }
            treeMap = this.f29220a;
        }
        if (treeMap.containsKey(Integer.valueOf(i8))) {
            i8 = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i8), c5021t);
    }
}
