package androidx.compose.ui.platform;

import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class A {
    public static final String a(Object obj, String str) {
        if (str == null) {
            str = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('@');
        J6.K k8 = J6.K.f3551a;
        String format = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        J6.r.d(format, "format(format, *args)");
        sb.append(format);
        return sb.toString();
    }
}
