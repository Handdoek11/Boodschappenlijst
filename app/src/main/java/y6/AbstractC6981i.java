package y6;

import java.lang.reflect.Array;

/* renamed from: y6.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC6981i {
    public static final Object[] a(Object[] objArr, int i8) {
        J6.r.e(objArr, "reference");
        Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i8);
        J6.r.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (Object[]) newInstance;
    }

    public static final void b(int i8, int i9) {
        if (i8 <= i9) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i8 + ") is greater than size (" + i9 + ").");
    }
}
