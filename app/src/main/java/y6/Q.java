package y6;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class Q {
    public static Set a(Object obj) {
        Set singleton = Collections.singleton(obj);
        J6.r.d(singleton, "singleton(...)");
        return singleton;
    }
}
