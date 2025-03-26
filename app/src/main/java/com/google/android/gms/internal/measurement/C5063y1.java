package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.y1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5063y1 {

    /* renamed from: a, reason: collision with root package name */
    private final E f29645a;

    /* renamed from: b, reason: collision with root package name */
    final Z2 f29646b;

    /* renamed from: c, reason: collision with root package name */
    final Z2 f29647c;

    /* renamed from: d, reason: collision with root package name */
    private final T4 f29648d;

    public C5063y1() {
        E e8 = new E();
        this.f29645a = e8;
        Z2 z22 = new Z2(null, e8);
        this.f29647c = z22;
        this.f29646b = z22.d();
        T4 t42 = new T4();
        this.f29648d = t42;
        z22.h("require", new J7(t42));
        t42.b("internal.platform", new Callable() { // from class: com.google.android.gms.internal.measurement.f1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new I7();
            }
        });
        z22.h("runtime.counter", new C4950k(Double.valueOf(0.0d)));
    }

    public final InterfaceC5013s a(Z2 z22, D2... d2Arr) {
        InterfaceC5013s interfaceC5013s = InterfaceC5013s.f29548h;
        for (D2 d22 : d2Arr) {
            interfaceC5013s = AbstractC4865a4.a(d22);
            AbstractC5048w2.b(this.f29647c);
            if ((interfaceC5013s instanceof C5037v) || (interfaceC5013s instanceof C5021t)) {
                interfaceC5013s = this.f29645a.a(z22, interfaceC5013s);
            }
        }
        return interfaceC5013s;
    }

    public final void b(String str, Callable callable) {
        this.f29648d.b(str, callable);
    }
}
