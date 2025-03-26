package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class G7 extends AbstractC4974n {

    /* renamed from: t, reason: collision with root package name */
    private C4869b f28877t;

    public G7(C4869b c4869b) {
        super("internal.registerCallback");
        this.f28877t = c4869b;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4974n
    public final InterfaceC5013s f(Z2 z22, List list) {
        AbstractC5048w2.g(this.f29460o, 3, list);
        String c8 = z22.b((InterfaceC5013s) list.get(0)).c();
        InterfaceC5013s b8 = z22.b((InterfaceC5013s) list.get(1));
        if (!(b8 instanceof C5021t)) {
            throw new IllegalArgumentException("Invalid callback type");
        }
        InterfaceC5013s b9 = z22.b((InterfaceC5013s) list.get(2));
        if (!(b9 instanceof r)) {
            throw new IllegalArgumentException("Invalid callback params");
        }
        r rVar = (r) b9;
        if (!rVar.C("type")) {
            throw new IllegalArgumentException("Undefined rule type");
        }
        this.f28877t.c(c8, rVar.C("priority") ? AbstractC5048w2.i(rVar.n("priority").b().doubleValue()) : 1000, (C5021t) b8, rVar.n("type").c());
        return InterfaceC5013s.f29548h;
    }
}
