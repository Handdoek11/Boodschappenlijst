package y6;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class u extends AbstractC6991t {
    public static void n(List list, Comparator comparator) {
        J6.r.e(list, "<this>");
        J6.r.e(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
