package Q;

import B.e;
import u.C6807b;

/* renamed from: Q.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0682d {
    public static final boolean b(InterfaceC0681c interfaceC0681c, int i8) {
        return (interfaceC0681c.f().j() & i8) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e.c c(C6807b c6807b) {
        if (c6807b == null || c6807b.s()) {
            return null;
        }
        return (e.c) c6807b.x(c6807b.q() - 1);
    }

    public static final B d(InterfaceC0681c interfaceC0681c, int i8) {
        B l8 = interfaceC0681c.f().l();
        J6.r.b(l8);
        if (l8.w0() != interfaceC0681c || !E.a(i8)) {
            return l8;
        }
        B x02 = l8.x0();
        J6.r.b(x02);
        return x02;
    }

    public static final p e(InterfaceC0681c interfaceC0681c) {
        B l8 = interfaceC0681c.f().l();
        if (l8 != null) {
            return l8.p0();
        }
        throw new IllegalStateException("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }
}
