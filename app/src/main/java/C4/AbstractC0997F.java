package c4;

/* renamed from: c4.F, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0997F {
    static Object a(Object obj, int i8) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append("at index ");
        sb.append(i8);
        throw new NullPointerException(sb.toString());
    }

    static Object[] b(Object... objArr) {
        c(objArr, objArr.length);
        return objArr;
    }

    static Object[] c(Object[] objArr, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            a(objArr[i9], i9);
        }
        return objArr;
    }

    public static Object[] d(Object[] objArr, int i8) {
        return H.b(objArr, i8);
    }
}
