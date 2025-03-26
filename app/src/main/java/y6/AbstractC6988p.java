package y6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: y6.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6988p {
    public static final Object[] a(Object[] objArr, boolean z7) {
        J6.r.e(objArr, "<this>");
        if (z7 && J6.r.a(objArr.getClass(), Object[].class)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        J6.r.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static List b(Object obj) {
        List singletonList = Collections.singletonList(obj);
        J6.r.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static Object[] c(int i8, Object[] objArr) {
        J6.r.e(objArr, "array");
        if (i8 < objArr.length) {
            objArr[i8] = null;
        }
        return objArr;
    }
}
