package W6;

import J6.H;
import U6.W0;
import Z6.w;
import kotlinx.coroutines.internal.UndeliveredElementException;
import x6.C6916E;

/* loaded from: classes2.dex */
public class i extends b {

    /* renamed from: n, reason: collision with root package name */
    private final int f5877n;

    /* renamed from: o, reason: collision with root package name */
    private final a f5878o;

    public i(int i8, a aVar, I6.l lVar) {
        super(i8, lVar);
        this.f5877n = i8;
        this.f5878o = aVar;
        if (aVar == a.SUSPEND) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + H.b(b.class).a() + " instead").toString());
        }
        if (i8 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i8 + " was specified").toString());
    }

    private final Object A0(Object obj, boolean z7) {
        return this.f5878o == a.DROP_LATEST ? y0(obj, z7) : z0(obj);
    }

    private final Object y0(Object obj, boolean z7) {
        I6.l lVar;
        UndeliveredElementException d8;
        Object d9 = super.d(obj);
        if (g.f(d9) || g.e(d9)) {
            return d9;
        }
        if (!z7 || (lVar = this.f5841c) == null || (d8 = w.d(lVar, obj, null, 2, null)) == null) {
            return g.f5872a.c(C6916E.f44463a);
        }
        throw d8;
    }

    private final Object z0(Object obj) {
        h hVar;
        Object obj2 = c.f5852d;
        h hVar2 = (h) b.f5835i.get(this);
        while (true) {
            long andIncrement = b.f5831e.getAndIncrement(this);
            long j8 = andIncrement & 1152921504606846975L;
            boolean S7 = S(andIncrement);
            int i8 = c.f5850b;
            long j9 = j8 / i8;
            int i9 = (int) (j8 % i8);
            if (hVar2.f6448t != j9) {
                h C7 = C(j9, hVar2);
                if (C7 != null) {
                    hVar = C7;
                } else if (S7) {
                    return g.f5872a.a(H());
                }
            } else {
                hVar = hVar2;
            }
            int t02 = t0(hVar, i9, obj, j8, obj2, S7);
            if (t02 == 0) {
                hVar.b();
                return g.f5872a.c(C6916E.f44463a);
            }
            if (t02 == 1) {
                return g.f5872a.c(C6916E.f44463a);
            }
            if (t02 == 2) {
                if (S7) {
                    hVar.p();
                    return g.f5872a.a(H());
                }
                W0 w02 = obj2 instanceof W0 ? (W0) obj2 : null;
                if (w02 != null) {
                    f0(w02, hVar, i9);
                }
                y((hVar.f6448t * i8) + i9);
                return g.f5872a.c(C6916E.f44463a);
            }
            if (t02 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (t02 == 4) {
                if (j8 < G()) {
                    hVar.b();
                }
                return g.f5872a.a(H());
            }
            if (t02 == 5) {
                hVar.b();
            }
            hVar2 = hVar;
        }
    }

    @Override // W6.b
    protected boolean T() {
        return this.f5878o == a.DROP_OLDEST;
    }

    @Override // W6.b, W6.k
    public Object d(Object obj) {
        return A0(obj, false);
    }
}
