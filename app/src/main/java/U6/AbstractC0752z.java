package U6;

import x6.C6934p;

/* renamed from: U6.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0752z {
    public static final InterfaceC0748x a(InterfaceC0745v0 interfaceC0745v0) {
        return new C0750y(interfaceC0745v0);
    }

    public static /* synthetic */ InterfaceC0748x b(InterfaceC0745v0 interfaceC0745v0, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            interfaceC0745v0 = null;
        }
        return a(interfaceC0745v0);
    }

    public static final boolean c(InterfaceC0748x interfaceC0748x, Object obj) {
        Throwable e8 = C6934p.e(obj);
        return e8 == null ? interfaceC0748x.b0(obj) : interfaceC0748x.i(e8);
    }
}
