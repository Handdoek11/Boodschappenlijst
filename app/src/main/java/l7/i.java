package l7;

import J6.H;
import kotlin.KotlinNothingValueException;
import m7.K;

/* loaded from: classes2.dex */
public abstract class i {
    public static final v a(Number number) {
        return number == null ? r.f38869t : new o(number, false);
    }

    public static final v b(String str) {
        return str == null ? r.f38869t : new o(str, true);
    }

    private static final Void c(h hVar, String str) {
        throw new IllegalArgumentException("Element " + H.b(hVar.getClass()) + " is not a " + str);
    }

    public static final Boolean d(v vVar) {
        J6.r.e(vVar, "<this>");
        return K.d(vVar.b());
    }

    public static final String e(v vVar) {
        J6.r.e(vVar, "<this>");
        if (vVar instanceof r) {
            return null;
        }
        return vVar.b();
    }

    public static final double f(v vVar) {
        J6.r.e(vVar, "<this>");
        return Double.parseDouble(vVar.b());
    }

    public static final Double g(v vVar) {
        J6.r.e(vVar, "<this>");
        return S6.h.i(vVar.b());
    }

    public static final float h(v vVar) {
        J6.r.e(vVar, "<this>");
        return Float.parseFloat(vVar.b());
    }

    public static final int i(v vVar) {
        J6.r.e(vVar, "<this>");
        return Integer.parseInt(vVar.b());
    }

    public static final v j(h hVar) {
        J6.r.e(hVar, "<this>");
        v vVar = hVar instanceof v ? (v) hVar : null;
        if (vVar != null) {
            return vVar;
        }
        c(hVar, "JsonPrimitive");
        throw new KotlinNothingValueException();
    }

    public static final long k(v vVar) {
        J6.r.e(vVar, "<this>");
        return Long.parseLong(vVar.b());
    }

    public static final Long l(v vVar) {
        J6.r.e(vVar, "<this>");
        return S6.h.m(vVar.b());
    }
}
