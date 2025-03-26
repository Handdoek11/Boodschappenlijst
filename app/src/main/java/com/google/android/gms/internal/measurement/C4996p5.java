package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.p5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4996p5 extends AbstractC4972m5 {
    C4996p5() {
        super();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4972m5
    public final void m() {
        if (!o()) {
            if (a() > 0) {
                androidx.appcompat.app.E.a(g(0).getKey());
                throw null;
            }
            Iterator it = h().iterator();
            if (it.hasNext()) {
                androidx.appcompat.app.E.a(((Map.Entry) it.next()).getKey());
                throw null;
            }
        }
        super.m();
    }
}
