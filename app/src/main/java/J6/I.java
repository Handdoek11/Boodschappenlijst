package J6;

import java.util.List;

/* loaded from: classes2.dex */
public class I {
    public Q6.b b(Class cls) {
        return new C0648h(cls);
    }

    public Q6.d c(Class cls, String str) {
        return new x(cls, str);
    }

    public String g(InterfaceC0653m interfaceC0653m) {
        String obj = interfaceC0653m.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public String h(s sVar) {
        return g(sVar);
    }

    public Q6.k i(Q6.c cVar, List list, boolean z7) {
        return new M(cVar, list, z7);
    }

    public Q6.e a(n nVar) {
        return nVar;
    }

    public Q6.f d(u uVar) {
        return uVar;
    }

    public Q6.g e(y yVar) {
        return yVar;
    }

    public Q6.i f(A a8) {
        return a8;
    }
}
