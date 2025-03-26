package k2;

import android.content.Context;
import l2.InterfaceC6171b;
import t2.InterfaceC6791a;
import w6.InterfaceC6894a;

/* loaded from: classes.dex */
public final class j implements InterfaceC6171b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6894a f38508a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6894a f38509b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6894a f38510c;

    public j(InterfaceC6894a interfaceC6894a, InterfaceC6894a interfaceC6894a2, InterfaceC6894a interfaceC6894a3) {
        this.f38508a = interfaceC6894a;
        this.f38509b = interfaceC6894a2;
        this.f38510c = interfaceC6894a3;
    }

    public static j a(InterfaceC6894a interfaceC6894a, InterfaceC6894a interfaceC6894a2, InterfaceC6894a interfaceC6894a3) {
        return new j(interfaceC6894a, interfaceC6894a2, interfaceC6894a3);
    }

    public static i c(Context context, InterfaceC6791a interfaceC6791a, InterfaceC6791a interfaceC6791a2) {
        return new i(context, interfaceC6791a, interfaceC6791a2);
    }

    @Override // w6.InterfaceC6894a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c((Context) this.f38508a.get(), (InterfaceC6791a) this.f38509b.get(), (InterfaceC6791a) this.f38510c.get());
    }
}
