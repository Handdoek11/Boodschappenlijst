package r2;

import l2.InterfaceC6171b;
import t2.InterfaceC6791a;
import w6.InterfaceC6894a;

/* loaded from: classes.dex */
public final class N implements InterfaceC6171b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6894a f42480a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6894a f42481b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6894a f42482c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6894a f42483d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC6894a f42484e;

    public N(InterfaceC6894a interfaceC6894a, InterfaceC6894a interfaceC6894a2, InterfaceC6894a interfaceC6894a3, InterfaceC6894a interfaceC6894a4, InterfaceC6894a interfaceC6894a5) {
        this.f42480a = interfaceC6894a;
        this.f42481b = interfaceC6894a2;
        this.f42482c = interfaceC6894a3;
        this.f42483d = interfaceC6894a4;
        this.f42484e = interfaceC6894a5;
    }

    public static N a(InterfaceC6894a interfaceC6894a, InterfaceC6894a interfaceC6894a2, InterfaceC6894a interfaceC6894a3, InterfaceC6894a interfaceC6894a4, InterfaceC6894a interfaceC6894a5) {
        return new N(interfaceC6894a, interfaceC6894a2, interfaceC6894a3, interfaceC6894a4, interfaceC6894a5);
    }

    public static M c(InterfaceC6791a interfaceC6791a, InterfaceC6791a interfaceC6791a2, Object obj, Object obj2, InterfaceC6894a interfaceC6894a) {
        return new M(interfaceC6791a, interfaceC6791a2, (AbstractC6663e) obj, (W) obj2, interfaceC6894a);
    }

    @Override // w6.InterfaceC6894a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public M get() {
        return c((InterfaceC6791a) this.f42480a.get(), (InterfaceC6791a) this.f42481b.get(), this.f42482c.get(), this.f42483d.get(), this.f42484e);
    }
}
