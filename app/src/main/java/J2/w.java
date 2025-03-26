package j2;

import l2.InterfaceC6171b;
import p2.InterfaceC6326e;
import t2.InterfaceC6791a;
import w6.InterfaceC6894a;

/* loaded from: classes.dex */
public final class w implements InterfaceC6171b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6894a f38225a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6894a f38226b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6894a f38227c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6894a f38228d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC6894a f38229e;

    public w(InterfaceC6894a interfaceC6894a, InterfaceC6894a interfaceC6894a2, InterfaceC6894a interfaceC6894a3, InterfaceC6894a interfaceC6894a4, InterfaceC6894a interfaceC6894a5) {
        this.f38225a = interfaceC6894a;
        this.f38226b = interfaceC6894a2;
        this.f38227c = interfaceC6894a3;
        this.f38228d = interfaceC6894a4;
        this.f38229e = interfaceC6894a5;
    }

    public static w a(InterfaceC6894a interfaceC6894a, InterfaceC6894a interfaceC6894a2, InterfaceC6894a interfaceC6894a3, InterfaceC6894a interfaceC6894a4, InterfaceC6894a interfaceC6894a5) {
        return new w(interfaceC6894a, interfaceC6894a2, interfaceC6894a3, interfaceC6894a4, interfaceC6894a5);
    }

    public static u c(InterfaceC6791a interfaceC6791a, InterfaceC6791a interfaceC6791a2, InterfaceC6326e interfaceC6326e, q2.r rVar, q2.v vVar) {
        return new u(interfaceC6791a, interfaceC6791a2, interfaceC6326e, rVar, vVar);
    }

    @Override // w6.InterfaceC6894a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public u get() {
        return c((InterfaceC6791a) this.f38225a.get(), (InterfaceC6791a) this.f38226b.get(), (InterfaceC6326e) this.f38227c.get(), (q2.r) this.f38228d.get(), (q2.v) this.f38229e.get());
    }
}
