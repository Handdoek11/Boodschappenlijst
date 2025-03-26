package r3;

/* loaded from: classes.dex */
public abstract class r {
    static Object[] a(Object[] objArr, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            if (objArr[i9] == null) {
                throw new NullPointerException("at index " + i9);
            }
        }
        return objArr;
    }
}
