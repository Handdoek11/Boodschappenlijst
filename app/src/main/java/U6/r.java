package U6;

import Z6.C0795i;

/* loaded from: classes2.dex */
public abstract class r {
    public static final void a(InterfaceC0731o interfaceC0731o, InterfaceC0708c0 interfaceC0708c0) {
        interfaceC0731o.q(new C0710d0(interfaceC0708c0));
    }

    public static final C0733p b(A6.d dVar) {
        if (!(dVar instanceof C0795i)) {
            return new C0733p(dVar, 1);
        }
        C0733p k8 = ((C0795i) dVar).k();
        if (k8 != null) {
            if (!k8.L()) {
                k8 = null;
            }
            if (k8 != null) {
                return k8;
            }
        }
        return new C0733p(dVar, 2);
    }
}
