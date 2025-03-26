package Q;

import Q.H;

/* loaded from: classes.dex */
public abstract /* synthetic */ class G {
    static {
        H.a aVar = H.f4504b;
    }

    public static /* synthetic */ void a(H h8, p pVar, boolean z7, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forceMeasureTheSubtree");
        }
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        h8.l(pVar, z7);
    }

    public static /* synthetic */ void b(H h8, boolean z7, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
        }
        if ((i8 & 1) != 0) {
            z7 = true;
        }
        h8.a(z7);
    }

    public static /* synthetic */ void c(H h8, p pVar, boolean z7, boolean z8, boolean z9, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
        }
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        if ((i8 & 4) != 0) {
            z8 = false;
        }
        if ((i8 & 8) != 0) {
            z9 = true;
        }
        h8.k(pVar, z7, z8, z9);
    }

    public static /* synthetic */ void d(H h8, p pVar, boolean z7, boolean z8, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
        }
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        if ((i8 & 4) != 0) {
            z8 = false;
        }
        h8.i(pVar, z7, z8);
    }
}
