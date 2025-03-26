package p2;

import java.util.concurrent.Executor;
import l2.InterfaceC6171b;
import q2.x;
import r2.InterfaceC6662d;
import s2.InterfaceC6723a;
import w6.InterfaceC6894a;

/* renamed from: p2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6325d implements InterfaceC6171b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6894a f40140a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6894a f40141b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6894a f40142c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6894a f40143d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC6894a f40144e;

    public C6325d(InterfaceC6894a interfaceC6894a, InterfaceC6894a interfaceC6894a2, InterfaceC6894a interfaceC6894a3, InterfaceC6894a interfaceC6894a4, InterfaceC6894a interfaceC6894a5) {
        this.f40140a = interfaceC6894a;
        this.f40141b = interfaceC6894a2;
        this.f40142c = interfaceC6894a3;
        this.f40143d = interfaceC6894a4;
        this.f40144e = interfaceC6894a5;
    }

    public static C6325d a(InterfaceC6894a interfaceC6894a, InterfaceC6894a interfaceC6894a2, InterfaceC6894a interfaceC6894a3, InterfaceC6894a interfaceC6894a4, InterfaceC6894a interfaceC6894a5) {
        return new C6325d(interfaceC6894a, interfaceC6894a2, interfaceC6894a3, interfaceC6894a4, interfaceC6894a5);
    }

    public static C6324c c(Executor executor, k2.e eVar, x xVar, InterfaceC6662d interfaceC6662d, InterfaceC6723a interfaceC6723a) {
        return new C6324c(executor, eVar, xVar, interfaceC6662d, interfaceC6723a);
    }

    @Override // w6.InterfaceC6894a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6324c get() {
        return c((Executor) this.f40140a.get(), (k2.e) this.f40141b.get(), (x) this.f40142c.get(), (InterfaceC6662d) this.f40143d.get(), (InterfaceC6723a) this.f40144e.get());
    }
}
