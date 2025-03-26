package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.y4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5066y4 extends AbstractC4974n {

    /* renamed from: t, reason: collision with root package name */
    private final C4887d f29651t;

    public C5066y4(C4887d c4887d) {
        super("internal.eventLogger");
        this.f29651t = c4887d;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4974n
    public final InterfaceC5013s f(Z2 z22, List list) {
        AbstractC5048w2.g(this.f29460o, 3, list);
        String c8 = z22.b((InterfaceC5013s) list.get(0)).c();
        long a8 = (long) AbstractC5048w2.a(z22.b((InterfaceC5013s) list.get(1)).b().doubleValue());
        InterfaceC5013s b8 = z22.b((InterfaceC5013s) list.get(2));
        this.f29651t.c(c8, a8, b8 instanceof r ? AbstractC5048w2.e((r) b8) : new HashMap());
        return InterfaceC5013s.f29548h;
    }
}
