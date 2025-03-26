package g7;

import J6.H;
import J6.r;
import k7.AbstractC6117b;
import k7.AbstractC6119c;
import kotlin.KotlinNothingValueException;

/* loaded from: classes2.dex */
public abstract class e {
    public static final a a(AbstractC6117b abstractC6117b, j7.c cVar, String str) {
        r.e(abstractC6117b, "<this>");
        r.e(cVar, "decoder");
        a c8 = abstractC6117b.c(cVar, str);
        if (c8 != null) {
            return c8;
        }
        AbstractC6119c.b(str, abstractC6117b.e());
        throw new KotlinNothingValueException();
    }

    public static final h b(AbstractC6117b abstractC6117b, j7.f fVar, Object obj) {
        r.e(abstractC6117b, "<this>");
        r.e(fVar, "encoder");
        r.e(obj, "value");
        h d8 = abstractC6117b.d(fVar, obj);
        if (d8 != null) {
            return d8;
        }
        AbstractC6119c.a(H.b(obj.getClass()), abstractC6117b.e());
        throw new KotlinNothingValueException();
    }
}
