package Z6;

import J6.AbstractC0650j;
import java.util.ArrayList;

/* renamed from: Z6.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0797k {
    public static /* synthetic */ Object b(Object obj, int i8, AbstractC0650j abstractC0650j) {
        if ((i8 & 1) != 0) {
            obj = null;
        }
        return a(obj);
    }

    public static final Object c(Object obj, Object obj2) {
        if (obj == null) {
            return a(obj2);
        }
        if (obj instanceof ArrayList) {
            J6.r.c(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ((ArrayList) obj).add(obj2);
            return a(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return a(arrayList);
    }

    public static Object a(Object obj) {
        return obj;
    }
}
