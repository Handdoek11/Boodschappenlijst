package r2;

import android.content.Context;
import l2.InterfaceC6171b;
import w6.InterfaceC6894a;

/* renamed from: r2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6666h implements InterfaceC6171b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6894a f42515a;

    public C6666h(InterfaceC6894a interfaceC6894a) {
        this.f42515a = interfaceC6894a;
    }

    public static C6666h a(InterfaceC6894a interfaceC6894a) {
        return new C6666h(interfaceC6894a);
    }

    public static String c(Context context) {
        return (String) l2.d.d(AbstractC6664f.b(context));
    }

    @Override // w6.InterfaceC6894a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c((Context) this.f42515a.get());
    }
}
