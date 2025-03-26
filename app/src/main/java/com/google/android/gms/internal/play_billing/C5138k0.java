package com.google.android.gms.internal.play_billing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.play_billing.k0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5138k0 {

    /* renamed from: a, reason: collision with root package name */
    private final List f29926a = new ArrayList();

    public final C5138k0 a(A0 a02) {
        if (a02.d()) {
            throw new IllegalArgumentException(AbstractC5208w.a("range must not be empty, but was %s", a02));
        }
        this.f29926a.add(a02);
        return this;
    }

    final C5138k0 b(C5138k0 c5138k0) {
        Iterator it = c5138k0.f29926a.iterator();
        while (it.hasNext()) {
            a((A0) it.next());
        }
        return this;
    }

    public final C5144l0 c() {
        C5090c0 c5090c0 = new C5090c0(this.f29926a.size());
        Collections.sort(this.f29926a, C5224z0.f30039o);
        Iterator it = this.f29926a.iterator();
        C5174q0 c5174q0 = it instanceof C5174q0 ? (C5174q0) it : new C5174q0(it);
        while (c5174q0.hasNext()) {
            A0 a02 = (A0) c5174q0.next();
            while (c5174q0.hasNext()) {
                A0 a03 = (A0) c5174q0.zza();
                if (a02.f29676o.a(a03.f29677s) > 0 || a03.f29676o.a(a02.f29677s) > 0) {
                    break;
                }
                AbstractC5202v.d(a02.b(a03).d(), "Overlapping ranges not permitted but found %s overlapping %s", a02, a03);
                a02 = a02.c((A0) c5174q0.next());
            }
            c5090c0.e(a02);
        }
        AbstractC5114g0 f8 = c5090c0.f();
        if (f8.isEmpty()) {
            return C5144l0.c();
        }
        if (f8.size() == 1) {
            Q0 listIterator = f8.listIterator(0);
            Object next = listIterator.next();
            if (listIterator.hasNext()) {
                StringBuilder sb = new StringBuilder();
                sb.append("expected one element but was: <");
                sb.append(next);
                for (int i8 = 0; i8 < 4 && listIterator.hasNext(); i8++) {
                    sb.append(", ");
                    sb.append(listIterator.next());
                }
                if (listIterator.hasNext()) {
                    sb.append(", ...");
                }
                sb.append('>');
                throw new IllegalArgumentException(sb.toString());
            }
            if (((A0) next).equals(A0.a())) {
                return C5144l0.b();
            }
        }
        return new C5144l0(f8);
    }
}
