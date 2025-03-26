package q;

import java.lang.reflect.Array;

/* renamed from: q.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC6399c {
    static Object[] a(Object[] objArr, int i8) {
        if (objArr.length < i8) {
            return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i8);
        }
        if (objArr.length > i8) {
            objArr[i8] = null;
        }
        return objArr;
    }
}
