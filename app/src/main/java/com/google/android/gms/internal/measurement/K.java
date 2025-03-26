package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
final class K implements Comparator {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ AbstractC4974n f28928o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ Z2 f28929s;

    K(AbstractC4974n abstractC4974n, Z2 z22) {
        this.f28928o = abstractC4974n;
        this.f28929s = z22;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        InterfaceC5013s interfaceC5013s = (InterfaceC5013s) obj;
        InterfaceC5013s interfaceC5013s2 = (InterfaceC5013s) obj2;
        AbstractC4974n abstractC4974n = this.f28928o;
        Z2 z22 = this.f28929s;
        if (interfaceC5013s instanceof C5069z) {
            return !(interfaceC5013s2 instanceof C5069z) ? 1 : 0;
        }
        if (interfaceC5013s2 instanceof C5069z) {
            return -1;
        }
        return abstractC4974n == null ? interfaceC5013s.c().compareTo(interfaceC5013s2.c()) : (int) AbstractC5048w2.a(abstractC4974n.f(z22, Arrays.asList(interfaceC5013s, interfaceC5013s2)).b().doubleValue());
    }
}
