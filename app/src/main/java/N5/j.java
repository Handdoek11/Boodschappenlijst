package N5;

import j$.util.DesugarCollections;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class j {
    public static final Set a(Set set) {
        J6.r.e(set, "<this>");
        Set unmodifiableSet = DesugarCollections.unmodifiableSet(set);
        J6.r.d(unmodifiableSet, "unmodifiableSet(this)");
        return unmodifiableSet;
    }
}
