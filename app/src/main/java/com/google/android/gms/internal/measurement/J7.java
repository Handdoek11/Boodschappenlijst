package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class J7 extends AbstractC4974n {

    /* renamed from: t, reason: collision with root package name */
    private final T4 f28926t;

    /* renamed from: u, reason: collision with root package name */
    private final Map f28927u;

    public J7(T4 t42) {
        super("require");
        this.f28927u = new HashMap();
        this.f28926t = t42;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4974n
    public final InterfaceC5013s f(Z2 z22, List list) {
        AbstractC5048w2.g("require", 1, list);
        String c8 = z22.b((InterfaceC5013s) list.get(0)).c();
        if (this.f28927u.containsKey(c8)) {
            return (InterfaceC5013s) this.f28927u.get(c8);
        }
        InterfaceC5013s a8 = this.f28926t.a(c8);
        if (a8 instanceof AbstractC4974n) {
            this.f28927u.put(c8, (AbstractC4974n) a8);
        }
        return a8;
    }
}
