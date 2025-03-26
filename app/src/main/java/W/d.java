package W;

import W.o;

/* loaded from: classes.dex */
public abstract class d {
    public static final o a(o.a aVar) {
        return aVar.b();
    }

    public static final int b(boolean z7, boolean z8) {
        if (z8 && z7) {
            return 3;
        }
        if (z7) {
            return 1;
        }
        return z8 ? 2 : 0;
    }

    public static final int c(o oVar, int i8) {
        return b(oVar.compareTo(a(o.f5781s)) >= 0, m.d(i8, m.f5766a.a()));
    }
}
