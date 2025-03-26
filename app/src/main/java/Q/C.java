package Q;

import B.e;

/* loaded from: classes.dex */
public abstract class C {
    /* JADX INFO: Access modifiers changed from: private */
    public static final e.c b(InterfaceC0681c interfaceC0681c, int i8, int i9) {
        e.c k8 = interfaceC0681c.f().k();
        if (k8 == null || (k8.j() & i8) == 0) {
            return null;
        }
        while (k8 != null) {
            int m8 = k8.m();
            if ((m8 & i9) != 0) {
                return null;
            }
            if ((m8 & i8) != 0) {
                return k8;
            }
            k8 = k8.k();
        }
        return null;
    }
}
