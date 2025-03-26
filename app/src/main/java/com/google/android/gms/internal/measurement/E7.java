package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class E7 extends AbstractC4974n {

    /* renamed from: t, reason: collision with root package name */
    private boolean f28862t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f28863u;

    /* renamed from: v, reason: collision with root package name */
    private final /* synthetic */ B7 f28864v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E7(B7 b72, boolean z7, boolean z8) {
        super("log");
        this.f28864v = b72;
        this.f28862t = z7;
        this.f28863u = z8;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4974n
    public final InterfaceC5013s f(Z2 z22, List list) {
        AbstractC5048w2.k("log", 1, list);
        if (list.size() == 1) {
            this.f28864v.f28828t.a(C7.INFO, z22.b((InterfaceC5013s) list.get(0)).c(), Collections.emptyList(), this.f28862t, this.f28863u);
            return InterfaceC5013s.f29548h;
        }
        C7 a8 = C7.a(AbstractC5048w2.i(z22.b((InterfaceC5013s) list.get(0)).b().doubleValue()));
        String c8 = z22.b((InterfaceC5013s) list.get(1)).c();
        if (list.size() == 2) {
            this.f28864v.f28828t.a(a8, c8, Collections.emptyList(), this.f28862t, this.f28863u);
            return InterfaceC5013s.f29548h;
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 2; i8 < Math.min(list.size(), 5); i8++) {
            arrayList.add(z22.b((InterfaceC5013s) list.get(i8)).c());
        }
        this.f28864v.f28828t.a(a8, c8, arrayList, this.f28862t, this.f28863u);
        return InterfaceC5013s.f29548h;
    }
}
