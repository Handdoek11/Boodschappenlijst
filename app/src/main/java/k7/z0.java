package k7;

import J6.C0643c;
import J6.C0644d;
import J6.C0646f;
import J6.C0651k;
import J6.C0652l;
import java.util.Iterator;
import java.util.Map;
import x6.C6912A;
import x6.C6914C;
import x6.C6915D;
import x6.C6916E;
import y6.AbstractC6971J;

/* loaded from: classes2.dex */
public abstract class z0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f38751a = AbstractC6971J.g(x6.u.a(J6.H.b(String.class), h7.a.C(J6.K.f3551a)), x6.u.a(J6.H.b(Character.TYPE), h7.a.w(C0646f.f3570a)), x6.u.a(J6.H.b(char[].class), h7.a.d()), x6.u.a(J6.H.b(Double.TYPE), h7.a.x(C0651k.f3579a)), x6.u.a(J6.H.b(double[].class), h7.a.e()), x6.u.a(J6.H.b(Float.TYPE), h7.a.y(C0652l.f3580a)), x6.u.a(J6.H.b(float[].class), h7.a.f()), x6.u.a(J6.H.b(Long.TYPE), h7.a.A(J6.t.f3584a)), x6.u.a(J6.H.b(long[].class), h7.a.i()), x6.u.a(J6.H.b(x6.z.class), h7.a.G(x6.z.f44511s)), x6.u.a(J6.H.b(C6912A.class), h7.a.r()), x6.u.a(J6.H.b(Integer.TYPE), h7.a.z(J6.q.f3583a)), x6.u.a(J6.H.b(int[].class), h7.a.g()), x6.u.a(J6.H.b(x6.x.class), h7.a.F(x6.x.f44506s)), x6.u.a(J6.H.b(x6.y.class), h7.a.q()), x6.u.a(J6.H.b(Short.TYPE), h7.a.B(J6.J.f3550a)), x6.u.a(J6.H.b(short[].class), h7.a.n()), x6.u.a(J6.H.b(C6914C.class), h7.a.H(C6914C.f44458s)), x6.u.a(J6.H.b(C6915D.class), h7.a.s()), x6.u.a(J6.H.b(Byte.TYPE), h7.a.v(C0644d.f3561a)), x6.u.a(J6.H.b(byte[].class), h7.a.c()), x6.u.a(J6.H.b(x6.v.class), h7.a.E(x6.v.f44501s)), x6.u.a(J6.H.b(x6.w.class), h7.a.p()), x6.u.a(J6.H.b(Boolean.TYPE), h7.a.u(C0643c.f3560a)), x6.u.a(J6.H.b(boolean[].class), h7.a.b()), x6.u.a(J6.H.b(C6916E.class), h7.a.I(C6916E.f44463a)), x6.u.a(J6.H.b(T6.a.class), h7.a.D(T6.a.f5296s)));

    public static final i7.f a(String str, i7.e eVar) {
        J6.r.e(str, "serialName");
        J6.r.e(eVar, "kind");
        d(str);
        return new y0(str, eVar);
    }

    public static final g7.b b(Q6.b bVar) {
        J6.r.e(bVar, "<this>");
        return (g7.b) f38751a.get(bVar);
    }

    private static final String c(String str) {
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char charAt = str.charAt(0);
        sb.append((Object) (Character.isLowerCase(charAt) ? S6.a.f(charAt) : String.valueOf(charAt)));
        String substring = str.substring(1);
        J6.r.d(substring, "this as java.lang.String).substring(startIndex)");
        sb.append(substring);
        return sb.toString();
    }

    private static final void d(String str) {
        Iterator it = f38751a.keySet().iterator();
        while (it.hasNext()) {
            String a8 = ((Q6.b) it.next()).a();
            J6.r.b(a8);
            String c8 = c(a8);
            if (S6.h.s(str, "kotlin." + c8, true) || S6.h.s(str, c8, true)) {
                throw new IllegalArgumentException(S6.h.f("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + str + " there already exist " + c(c8) + "Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
    }
}
