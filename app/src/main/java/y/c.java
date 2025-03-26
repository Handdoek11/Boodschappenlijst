package y;

import J6.r;
import t.InterfaceC6766d;

/* loaded from: classes.dex */
public abstract class c {
    public static final InterfaceC6935a a(InterfaceC6766d interfaceC6766d, int i8, boolean z7, Object obj) {
        b bVar;
        interfaceC6766d.c(Integer.rotateLeft(i8, 1));
        Object d8 = interfaceC6766d.d();
        if (d8 == InterfaceC6766d.f43762a.a()) {
            bVar = new b(i8, z7, obj);
            interfaceC6766d.j(bVar);
        } else {
            r.c(d8, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            bVar = (b) d8;
            bVar.h(obj);
        }
        interfaceC6766d.k();
        return bVar;
    }

    public static final InterfaceC6935a b(int i8, boolean z7, Object obj) {
        return new b(i8, z7, obj);
    }
}
