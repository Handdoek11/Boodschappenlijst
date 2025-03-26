package U5;

import J6.r;
import Q6.k;
import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public abstract class b {
    public static final boolean a(Object obj, Q6.b bVar) {
        r.e(obj, "<this>");
        r.e(bVar, "type");
        return H6.a.a(bVar).isInstance(obj);
    }

    public static final a b(Type type, Q6.b bVar, k kVar) {
        r.e(type, "reifiedType");
        r.e(bVar, "kClass");
        return new a(bVar, type, kVar);
    }
}
