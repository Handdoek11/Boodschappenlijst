package k2;

import android.content.Context;
import l2.InterfaceC6171b;
import w6.InterfaceC6894a;

/* loaded from: classes.dex */
public final class l implements InterfaceC6171b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6894a f38516a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6894a f38517b;

    public l(InterfaceC6894a interfaceC6894a, InterfaceC6894a interfaceC6894a2) {
        this.f38516a = interfaceC6894a;
        this.f38517b = interfaceC6894a2;
    }

    public static l a(InterfaceC6894a interfaceC6894a, InterfaceC6894a interfaceC6894a2) {
        return new l(interfaceC6894a, interfaceC6894a2);
    }

    public static k c(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    @Override // w6.InterfaceC6894a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c((Context) this.f38516a.get(), this.f38517b.get());
    }
}
