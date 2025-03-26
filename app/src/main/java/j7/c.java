package j7;

import J6.r;

/* loaded from: classes2.dex */
public interface c {

    public static final class a {
        public static int a(c cVar, i7.f fVar) {
            r.e(fVar, "descriptor");
            return -1;
        }

        public static boolean b(c cVar) {
            return false;
        }

        public static /* synthetic */ Object c(c cVar, i7.f fVar, int i8, g7.a aVar, Object obj, int i9, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
            }
            if ((i9 & 8) != 0) {
                obj = null;
            }
            return cVar.i(fVar, i8, aVar, obj);
        }
    }

    boolean A(i7.f fVar, int i8);

    int D(i7.f fVar);

    n7.b a();

    void c(i7.f fVar);

    int e(i7.f fVar);

    int g(i7.f fVar, int i8);

    Object i(i7.f fVar, int i8, g7.a aVar, Object obj);

    char k(i7.f fVar, int i8);

    short l(i7.f fVar, int i8);

    byte o(i7.f fVar, int i8);

    e p(i7.f fVar, int i8);

    float s(i7.f fVar, int i8);

    double u(i7.f fVar, int i8);

    boolean x();

    long y(i7.f fVar, int i8);

    String z(i7.f fVar, int i8);
}
