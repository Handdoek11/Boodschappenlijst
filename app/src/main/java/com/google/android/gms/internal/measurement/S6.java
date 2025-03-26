package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
final class S6 extends AbstractC4974n {

    /* renamed from: t, reason: collision with root package name */
    private final /* synthetic */ InterfaceC5012r6 f29016t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    S6(C5011r5 c5011r5, String str, InterfaceC5012r6 interfaceC5012r6) {
        super(str);
        this.f29016t = interfaceC5012r6;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4974n
    public final InterfaceC5013s f(Z2 z22, List list) {
        AbstractC5048w2.g("getValue", 2, list);
        InterfaceC5013s b8 = z22.b((InterfaceC5013s) list.get(0));
        InterfaceC5013s b9 = z22.b((InterfaceC5013s) list.get(1));
        String n8 = this.f29016t.n(b8.c());
        return n8 != null ? new C5029u(n8) : b9;
    }
}
