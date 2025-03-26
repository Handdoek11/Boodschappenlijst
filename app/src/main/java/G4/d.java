package g4;

import java.util.Set;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class d {
    public static Object a(e eVar, B b8) {
        H4.b c8 = eVar.c(b8);
        if (c8 == null) {
            return null;
        }
        return c8.get();
    }

    public static Object b(e eVar, Class cls) {
        return eVar.f(B.b(cls));
    }

    public static H4.a c(e eVar, Class cls) {
        return eVar.e(B.b(cls));
    }

    public static H4.b d(e eVar, Class cls) {
        return eVar.c(B.b(cls));
    }

    public static Set e(e eVar, B b8) {
        return (Set) eVar.h(b8).get();
    }

    public static Set f(e eVar, Class cls) {
        return eVar.b(B.b(cls));
    }
}
