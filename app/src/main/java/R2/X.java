package r2;

import android.content.Context;
import l2.InterfaceC6171b;
import w6.InterfaceC6894a;

/* loaded from: classes.dex */
public final class X implements InterfaceC6171b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6894a f42497a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6894a f42498b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6894a f42499c;

    public X(InterfaceC6894a interfaceC6894a, InterfaceC6894a interfaceC6894a2, InterfaceC6894a interfaceC6894a3) {
        this.f42497a = interfaceC6894a;
        this.f42498b = interfaceC6894a2;
        this.f42499c = interfaceC6894a3;
    }

    public static X a(InterfaceC6894a interfaceC6894a, InterfaceC6894a interfaceC6894a2, InterfaceC6894a interfaceC6894a3) {
        return new X(interfaceC6894a, interfaceC6894a2, interfaceC6894a3);
    }

    public static W c(Context context, String str, int i8) {
        return new W(context, str, i8);
    }

    @Override // w6.InterfaceC6894a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public W get() {
        return c((Context) this.f42497a.get(), (String) this.f42498b.get(), ((Integer) this.f42499c.get()).intValue());
    }
}
