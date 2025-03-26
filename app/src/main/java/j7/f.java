package j7;

import J6.r;
import g7.h;

/* loaded from: classes2.dex */
public interface f {
    void C(long j8);

    f D(i7.f fVar);

    void E(String str);

    n7.b a();

    d d(i7.f fVar);

    void f();

    void i(double d8);

    void j(short s8);

    void k(i7.f fVar, int i8);

    void l(byte b8);

    void m(boolean z7);

    void n(h hVar, Object obj);

    void o(float f8);

    void q(char c8);

    void s();

    d x(i7.f fVar, int i8);

    void z(int i8);

    public static final class a {
        public static d a(f fVar, i7.f fVar2, int i8) {
            r.e(fVar2, "descriptor");
            return fVar.d(fVar2);
        }

        public static void c(f fVar, h hVar, Object obj) {
            r.e(hVar, "serializer");
            hVar.serialize(fVar, obj);
        }

        public static void b(f fVar) {
        }
    }
}
