package y6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: y6.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6989q extends AbstractC6988p {
    public static final Collection d(Object[] objArr) {
        J6.r.e(objArr, "<this>");
        return new C6978f(objArr, false);
    }

    public static List e() {
        return C6962A.f44633o;
    }

    public static int f(List list) {
        J6.r.e(list, "<this>");
        return list.size() - 1;
    }

    public static List g(Object... objArr) {
        J6.r.e(objArr, "elements");
        return objArr.length > 0 ? AbstractC6980h.c(objArr) : AbstractC6987o.e();
    }

    public static List h(Object... objArr) {
        J6.r.e(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C6978f(objArr, true));
    }

    public static final List i(List list) {
        J6.r.e(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : AbstractC6987o.b(list.get(0)) : AbstractC6987o.e();
    }

    public static void j() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void k() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
