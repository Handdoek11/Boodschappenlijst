package U6;

/* renamed from: U6.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC0731o extends A6.d {

    /* renamed from: U6.o$a */
    public static final class a {
        public static /* synthetic */ boolean a(InterfaceC0731o interfaceC0731o, Throwable th, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i8 & 1) != 0) {
                th = null;
            }
            return interfaceC0731o.b(th);
        }
    }

    boolean b(Throwable th);

    boolean j();

    Object l(Object obj, Object obj2, I6.l lVar);

    Object n(Throwable th);

    void o(I i8, Object obj);

    void p(Object obj, I6.l lVar);

    void q(I6.l lVar);

    void r(Object obj);
}
