package com.google.android.gms.internal.measurement;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.measurement.i5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4938i5 {

    /* renamed from: c, reason: collision with root package name */
    private static final C4938i5 f29338c = new C4938i5();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f29340b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4956k5 f29339a = new J4();

    private C4938i5() {
    }

    public static C4938i5 a() {
        return f29338c;
    }

    public final InterfaceC4964l5 b(Class cls) {
        AbstractC5026t4.f(cls, "messageType");
        InterfaceC4964l5 interfaceC4964l5 = (InterfaceC4964l5) this.f29340b.get(cls);
        if (interfaceC4964l5 != null) {
            return interfaceC4964l5;
        }
        InterfaceC4964l5 a8 = this.f29339a.a(cls);
        AbstractC5026t4.f(cls, "messageType");
        AbstractC5026t4.f(a8, "schema");
        InterfaceC4964l5 interfaceC4964l52 = (InterfaceC4964l5) this.f29340b.putIfAbsent(cls, a8);
        return interfaceC4964l52 != null ? interfaceC4964l52 : a8;
    }

    public final InterfaceC4964l5 c(Object obj) {
        return b(obj.getClass());
    }
}
