package y6;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class S extends Q {
    public static Set b() {
        return C6964C.f44635o;
    }

    public static Set c(Object... objArr) {
        J6.r.e(objArr, "elements");
        return (Set) AbstractC6984l.L(objArr, new LinkedHashSet(AbstractC6971J.b(objArr.length)));
    }

    public static final Set d(Set set) {
        J6.r.e(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : P.a(set.iterator().next()) : P.b();
    }

    public static Set e(Object... objArr) {
        J6.r.e(objArr, "elements");
        return objArr.length > 0 ? AbstractC6984l.O(objArr) : P.b();
    }
}
