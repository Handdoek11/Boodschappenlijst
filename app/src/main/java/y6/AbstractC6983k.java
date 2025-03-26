package y6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: y6.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6983k extends AbstractC6982j {
    public static List c(Object[] objArr) {
        J6.r.e(objArr, "<this>");
        List a8 = AbstractC6985m.a(objArr);
        J6.r.d(a8, "asList(...)");
        return a8;
    }

    public static float[] d(float[] fArr, float[] fArr2, int i8, int i9, int i10) {
        J6.r.e(fArr, "<this>");
        J6.r.e(fArr2, "destination");
        System.arraycopy(fArr, i9, fArr2, i8, i10 - i9);
        return fArr2;
    }

    public static int[] e(int[] iArr, int[] iArr2, int i8, int i9, int i10) {
        J6.r.e(iArr, "<this>");
        J6.r.e(iArr2, "destination");
        System.arraycopy(iArr, i9, iArr2, i8, i10 - i9);
        return iArr2;
    }

    public static long[] f(long[] jArr, long[] jArr2, int i8, int i9, int i10) {
        J6.r.e(jArr, "<this>");
        J6.r.e(jArr2, "destination");
        System.arraycopy(jArr, i9, jArr2, i8, i10 - i9);
        return jArr2;
    }

    public static Object[] g(Object[] objArr, Object[] objArr2, int i8, int i9, int i10) {
        J6.r.e(objArr, "<this>");
        J6.r.e(objArr2, "destination");
        System.arraycopy(objArr, i9, objArr2, i8, i10 - i9);
        return objArr2;
    }

    public static /* synthetic */ float[] h(float[] fArr, float[] fArr2, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i8 = 0;
        }
        if ((i11 & 4) != 0) {
            i9 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = fArr.length;
        }
        return AbstractC6980h.d(fArr, fArr2, i8, i9, i10);
    }

    public static /* synthetic */ int[] i(int[] iArr, int[] iArr2, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i8 = 0;
        }
        if ((i11 & 4) != 0) {
            i9 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = iArr.length;
        }
        return AbstractC6980h.e(iArr, iArr2, i8, i9, i10);
    }

    public static /* synthetic */ Object[] j(Object[] objArr, Object[] objArr2, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i8 = 0;
        }
        if ((i11 & 4) != 0) {
            i9 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = objArr.length;
        }
        return AbstractC6980h.g(objArr, objArr2, i8, i9, i10);
    }

    public static Object[] k(Object[] objArr, int i8, int i9) {
        J6.r.e(objArr, "<this>");
        AbstractC6981i.b(i9, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i8, i9);
        J6.r.d(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static final void l(Object[] objArr, Object obj, int i8, int i9) {
        J6.r.e(objArr, "<this>");
        Arrays.fill(objArr, i8, i9, obj);
    }

    public static /* synthetic */ void m(Object[] objArr, Object obj, int i8, int i9, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = objArr.length;
        }
        l(objArr, obj, i8, i9);
    }

    public static final void n(Object[] objArr, Comparator comparator) {
        J6.r.e(objArr, "<this>");
        J6.r.e(comparator, "comparator");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }

    public static void o(Object[] objArr, Comparator comparator, int i8, int i9) {
        J6.r.e(objArr, "<this>");
        J6.r.e(comparator, "comparator");
        Arrays.sort(objArr, i8, i9, comparator);
    }
}
