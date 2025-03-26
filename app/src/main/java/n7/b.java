package n7;

import J6.AbstractC0650j;
import g7.h;
import java.util.List;
import y6.AbstractC6987o;

/* loaded from: classes2.dex */
public abstract class b {
    public /* synthetic */ b(AbstractC0650j abstractC0650j) {
        this();
    }

    public static /* synthetic */ g7.b c(b bVar, Q6.b bVar2, List list, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
        }
        if ((i8 & 2) != 0) {
            list = AbstractC6987o.e();
        }
        return bVar.b(bVar2, list);
    }

    public abstract void a(d dVar);

    public abstract g7.b b(Q6.b bVar, List list);

    public abstract g7.a d(Q6.b bVar, String str);

    public abstract h e(Q6.b bVar, Object obj);

    private b() {
    }
}
