package Z6;

/* renamed from: Z6.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0790d {

    /* renamed from: a, reason: collision with root package name */
    private static final E f6470a = new E("CLOSED");

    public static final AbstractC0791e b(AbstractC0791e abstractC0791e) {
        while (true) {
            Object f8 = abstractC0791e.f();
            if (f8 == f6470a) {
                return abstractC0791e;
            }
            AbstractC0791e abstractC0791e2 = (AbstractC0791e) f8;
            if (abstractC0791e2 != null) {
                abstractC0791e = abstractC0791e2;
            } else if (abstractC0791e.j()) {
                return abstractC0791e;
            }
        }
    }

    public static final Object c(B b8, long j8, I6.p pVar) {
        while (true) {
            if (b8.f6448t >= j8 && !b8.h()) {
                return C.a(b8);
            }
            Object f8 = b8.f();
            if (f8 == f6470a) {
                return C.a(f6470a);
            }
            B b9 = (B) ((AbstractC0791e) f8);
            if (b9 == null) {
                b9 = (B) pVar.invoke(Long.valueOf(b8.f6448t + 1), b8);
                if (b8.l(b9)) {
                    if (b8.h()) {
                        b8.k();
                    }
                }
            }
            b8 = b9;
        }
    }
}
