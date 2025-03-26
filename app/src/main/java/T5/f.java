package T5;

import J6.r;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class f {
    public static final e a(Object obj, List list, Object obj2, A6.g gVar, boolean z7) {
        r.e(obj, "context");
        r.e(list, "interceptors");
        r.e(obj2, "subject");
        r.e(gVar, "coroutineContext");
        return (g.a() || z7) ? new a(obj, list, obj2, gVar) : new n(obj2, obj, list);
    }
}
