package c4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes2.dex */
abstract class H {
    static Object[] a(Object[] objArr, int i8, int i9, Object[] objArr2) {
        return Arrays.copyOfRange(objArr, i8, i9, objArr2.getClass());
    }

    static Object[] b(Object[] objArr, int i8) {
        return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i8);
    }

    static Map c() {
        return C1006i.s();
    }
}
