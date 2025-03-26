package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    private final C5063y1 f28829a;

    /* renamed from: b, reason: collision with root package name */
    private Z2 f28830b;

    /* renamed from: c, reason: collision with root package name */
    C4887d f28831c;

    /* renamed from: d, reason: collision with root package name */
    private final C4869b f28832d;

    public C() {
        this(new C5063y1());
    }

    public final C4887d a() {
        return this.f28831c;
    }

    public final void b(C2 c22) {
        AbstractC4974n abstractC4974n;
        try {
            this.f28830b = this.f28829a.f29646b.d();
            if (this.f28829a.a(this.f28830b, (D2[]) c22.I().toArray(new D2[0])) instanceof C4958l) {
                throw new IllegalStateException("Program loading failed");
            }
            for (B2 b22 : c22.G().I()) {
                List I7 = b22.I();
                String H7 = b22.H();
                Iterator it = I7.iterator();
                while (it.hasNext()) {
                    InterfaceC5013s a8 = this.f28829a.a(this.f28830b, (D2) it.next());
                    if (!(a8 instanceof r)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    Z2 z22 = this.f28830b;
                    if (z22.g(H7)) {
                        InterfaceC5013s c8 = z22.c(H7);
                        if (!(c8 instanceof AbstractC4974n)) {
                            throw new IllegalStateException("Invalid function name: " + H7);
                        }
                        abstractC4974n = (AbstractC4974n) c8;
                    } else {
                        abstractC4974n = null;
                    }
                    if (abstractC4974n == null) {
                        throw new IllegalStateException("Rule function is undefined: " + H7);
                    }
                    abstractC4974n.f(this.f28830b, Collections.singletonList(a8));
                }
            }
        } catch (Throwable th) {
            throw new zzc(th);
        }
    }

    public final void c(String str, Callable callable) {
        this.f28829a.b(str, callable);
    }

    public final boolean d(C4896e c4896e) {
        try {
            this.f28831c.b(c4896e);
            this.f28829a.f29647c.h("runtime.counter", new C4950k(Double.valueOf(0.0d)));
            this.f28832d.b(this.f28830b.d(), this.f28831c);
            if (g()) {
                return true;
            }
            return f();
        } catch (Throwable th) {
            throw new zzc(th);
        }
    }

    final /* synthetic */ AbstractC4974n e() {
        return new G7(this.f28832d);
    }

    public final boolean f() {
        return !this.f28831c.f().isEmpty();
    }

    public final boolean g() {
        return !this.f28831c.d().equals(this.f28831c.a());
    }

    private C(C5063y1 c5063y1) {
        this.f28829a = c5063y1;
        this.f28830b = c5063y1.f29646b.d();
        this.f28831c = new C4887d();
        this.f28832d = new C4869b();
        c5063y1.b("internal.registerCallback", new Callable() { // from class: com.google.android.gms.internal.measurement.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f29212o.e();
            }
        });
        c5063y1.b("internal.eventLogger", new Callable() { // from class: com.google.android.gms.internal.measurement.E0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new C5066y4(this.f28857o.f28831c);
            }
        });
    }
}
