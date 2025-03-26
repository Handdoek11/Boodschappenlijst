package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class Z2 {

    /* renamed from: a, reason: collision with root package name */
    private final Z2 f29127a;

    /* renamed from: b, reason: collision with root package name */
    private E f29128b;

    /* renamed from: c, reason: collision with root package name */
    private Map f29129c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private Map f29130d = new HashMap();

    public Z2(Z2 z22, E e8) {
        this.f29127a = z22;
        this.f29128b = e8;
    }

    public final InterfaceC5013s a(C4914g c4914g) {
        InterfaceC5013s interfaceC5013s = InterfaceC5013s.f29548h;
        Iterator F7 = c4914g.F();
        while (F7.hasNext()) {
            interfaceC5013s = this.f29128b.a(this, c4914g.q(((Integer) F7.next()).intValue()));
            if (interfaceC5013s instanceof C4958l) {
                break;
            }
        }
        return interfaceC5013s;
    }

    public final InterfaceC5013s b(InterfaceC5013s interfaceC5013s) {
        return this.f29128b.a(this, interfaceC5013s);
    }

    public final InterfaceC5013s c(String str) {
        Z2 z22 = this;
        while (!z22.f29129c.containsKey(str)) {
            z22 = z22.f29127a;
            if (z22 == null) {
                throw new IllegalArgumentException(String.format("%s is not defined", str));
            }
        }
        return (InterfaceC5013s) z22.f29129c.get(str);
    }

    public final Z2 d() {
        return new Z2(this, this.f29128b);
    }

    public final void e(String str, InterfaceC5013s interfaceC5013s) {
        if (this.f29130d.containsKey(str)) {
            return;
        }
        if (interfaceC5013s == null) {
            this.f29129c.remove(str);
        } else {
            this.f29129c.put(str, interfaceC5013s);
        }
    }

    public final void f(String str, InterfaceC5013s interfaceC5013s) {
        e(str, interfaceC5013s);
        this.f29130d.put(str, Boolean.TRUE);
    }

    public final boolean g(String str) {
        Z2 z22 = this;
        while (!z22.f29129c.containsKey(str)) {
            z22 = z22.f29127a;
            if (z22 == null) {
                return false;
            }
        }
        return true;
    }

    public final void h(String str, InterfaceC5013s interfaceC5013s) {
        Z2 z22;
        Z2 z23 = this;
        while (!z23.f29129c.containsKey(str) && (z22 = z23.f29127a) != null && z22.g(str)) {
            z23 = z23.f29127a;
        }
        if (z23.f29130d.containsKey(str)) {
            return;
        }
        if (interfaceC5013s == null) {
            z23.f29129c.remove(str);
        } else {
            z23.f29129c.put(str, interfaceC5013s);
        }
    }
}
