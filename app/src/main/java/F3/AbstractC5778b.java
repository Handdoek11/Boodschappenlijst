package f3;

import Z2.AbstractC0777p;

/* renamed from: f3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5778b {
    public static boolean a(int[] iArr, int i8) {
        if (iArr != null) {
            for (int i9 : iArr) {
                if (i9 == i8) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b(Object[] objArr, Object obj) {
        int length = objArr != null ? objArr.length : 0;
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                break;
            }
            if (!AbstractC0777p.a(objArr[i8], obj)) {
                i8++;
            } else if (i8 >= 0) {
                return true;
            }
        }
        return false;
    }
}
