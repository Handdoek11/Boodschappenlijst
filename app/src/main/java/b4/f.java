package b4;

import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class f extends AbstractC0964b {
    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
