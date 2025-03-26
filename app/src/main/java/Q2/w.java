package q2;

import java.util.concurrent.Executor;
import l2.InterfaceC6171b;
import r2.InterfaceC6662d;
import s2.InterfaceC6723a;
import w6.InterfaceC6894a;

/* loaded from: classes.dex */
public final class w implements InterfaceC6171b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6894a f41001a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6894a f41002b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6894a f41003c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6894a f41004d;

    public w(InterfaceC6894a interfaceC6894a, InterfaceC6894a interfaceC6894a2, InterfaceC6894a interfaceC6894a3, InterfaceC6894a interfaceC6894a4) {
        this.f41001a = interfaceC6894a;
        this.f41002b = interfaceC6894a2;
        this.f41003c = interfaceC6894a3;
        this.f41004d = interfaceC6894a4;
    }

    public static w a(InterfaceC6894a interfaceC6894a, InterfaceC6894a interfaceC6894a2, InterfaceC6894a interfaceC6894a3, InterfaceC6894a interfaceC6894a4) {
        return new w(interfaceC6894a, interfaceC6894a2, interfaceC6894a3, interfaceC6894a4);
    }

    public static v c(Executor executor, InterfaceC6662d interfaceC6662d, x xVar, InterfaceC6723a interfaceC6723a) {
        return new v(executor, interfaceC6662d, xVar, interfaceC6723a);
    }

    @Override // w6.InterfaceC6894a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c((Executor) this.f41001a.get(), (InterfaceC6662d) this.f41002b.get(), (x) this.f41003c.get(), (InterfaceC6723a) this.f41004d.get());
    }
}
