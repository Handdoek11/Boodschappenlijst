package k7;

import java.util.Arrays;
import java.util.Iterator;

/* renamed from: k7.t0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6153t0 {
    public static final int a(i7.f fVar, i7.f[] fVarArr) {
        J6.r.e(fVar, "<this>");
        J6.r.e(fVarArr, "typeParams");
        int hashCode = (fVar.a().hashCode() * 31) + Arrays.hashCode(fVarArr);
        Iterable a8 = i7.h.a(fVar);
        Iterator it = a8.iterator();
        int i8 = 1;
        int i9 = 1;
        while (true) {
            int i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i11 = i9 * 31;
            String a9 = ((i7.f) it.next()).a();
            if (a9 != null) {
                i10 = a9.hashCode();
            }
            i9 = i11 + i10;
        }
        Iterator it2 = a8.iterator();
        while (it2.hasNext()) {
            int i12 = i8 * 31;
            i7.j e8 = ((i7.f) it2.next()).e();
            i8 = i12 + (e8 != null ? e8.hashCode() : 0);
        }
        return (((hashCode * 31) + i9) * 31) + i8;
    }
}
