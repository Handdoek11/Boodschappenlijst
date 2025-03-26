package y6;

import java.util.Collection;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class r extends AbstractC6989q {
    public static int l(Iterable iterable, int i8) {
        J6.r.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i8;
    }

    public static final Integer m(Iterable iterable) {
        J6.r.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }
}
