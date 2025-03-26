package N5;

import java.util.List;

/* loaded from: classes2.dex */
public interface b {

    public static final class a {
        public static Object a(b bVar, N5.a aVar) {
            J6.r.e(aVar, "key");
            Object c8 = bVar.c(aVar);
            if (c8 != null) {
                return c8;
            }
            throw new IllegalStateException("No instance for key " + aVar);
        }
    }

    void a(N5.a aVar);

    boolean b(N5.a aVar);

    Object c(N5.a aVar);

    Object d(N5.a aVar);

    List e();

    void f(N5.a aVar, Object obj);

    Object g(N5.a aVar, I6.a aVar2);
}
