package e7;

/* loaded from: classes2.dex */
public interface a {

    /* renamed from: e7.a$a, reason: collision with other inner class name */
    public static final class C0253a {
        public static /* synthetic */ void a(a aVar, Object obj, int i8, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i8 & 1) != 0) {
                obj = null;
            }
            aVar.c(obj);
        }
    }

    Object a(Object obj, A6.d dVar);

    boolean b();

    void c(Object obj);
}
