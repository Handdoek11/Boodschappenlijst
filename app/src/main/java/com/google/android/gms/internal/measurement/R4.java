package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class R4 implements O4 {
    R4() {
    }

    @Override // com.google.android.gms.internal.measurement.O4
    public final M4 a(Object obj) {
        androidx.appcompat.app.E.a(obj);
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.measurement.O4
    public final Map b(Object obj) {
        return (P4) obj;
    }

    @Override // com.google.android.gms.internal.measurement.O4
    public final Object c(Object obj) {
        return P4.f().i();
    }

    @Override // com.google.android.gms.internal.measurement.O4
    public final boolean d(Object obj) {
        return !((P4) obj).l();
    }

    @Override // com.google.android.gms.internal.measurement.O4
    public final Map e(Object obj) {
        return (P4) obj;
    }

    @Override // com.google.android.gms.internal.measurement.O4
    public final Object f(Object obj, Object obj2) {
        P4 p42 = (P4) obj;
        P4 p43 = (P4) obj2;
        if (!p43.isEmpty()) {
            if (!p42.l()) {
                p42 = p42.i();
            }
            p42.h(p43);
        }
        return p42;
    }

    @Override // com.google.android.gms.internal.measurement.O4
    public final Object g(Object obj) {
        ((P4) obj).k();
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.O4
    public final int h(int i8, Object obj, Object obj2) {
        P4 p42 = (P4) obj;
        androidx.appcompat.app.E.a(obj2);
        if (p42.isEmpty()) {
            return 0;
        }
        Iterator it = p42.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
