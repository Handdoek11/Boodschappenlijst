package O;

import J6.r;
import Q.w;

/* loaded from: classes.dex */
public abstract class j {
    public static final w a(w wVar) {
        Q.p T7 = wVar.T();
        while (true) {
            Q.p E7 = T7.E();
            if ((E7 != null ? E7.v() : null) == null) {
                w q02 = T7.C().q0();
                r.b(q02);
                return q02;
            }
            Q.p E8 = T7.E();
            Q.p v7 = E8 != null ? E8.v() : null;
            r.b(v7);
            if (v7.T()) {
                T7 = T7.E();
                r.b(T7);
            } else {
                Q.p E9 = T7.E();
                r.b(E9);
                T7 = E9.v();
                r.b(T7);
            }
        }
    }
}
