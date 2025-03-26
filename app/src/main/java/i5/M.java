package I5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import y6.AbstractC6987o;

/* loaded from: classes2.dex */
public abstract class M {
    private static final void b(N5.s sVar, N5.s sVar2) {
        for (String str : sVar2.names()) {
            List d8 = sVar2.d(str);
            if (d8 == null) {
                d8 = AbstractC6987o.e();
            }
            String k8 = AbstractC0627a.k(str, 0, 0, false, null, 15, null);
            List list = d8;
            ArrayList arrayList = new ArrayList(AbstractC6987o.l(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC0627a.k((String) it.next(), 0, 0, true, null, 11, null));
            }
            sVar.f(k8, arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(N5.s sVar, N5.r rVar) {
        for (String str : rVar.names()) {
            List d8 = rVar.d(str);
            if (d8 == null) {
                d8 = AbstractC6987o.e();
            }
            String m8 = AbstractC0627a.m(str, false, 1, null);
            List list = d8;
            ArrayList arrayList = new ArrayList(AbstractC6987o.l(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC0627a.n((String) it.next()));
            }
            sVar.f(m8, arrayList);
        }
    }

    public static final x d(N5.s sVar) {
        J6.r.e(sVar, "parameters");
        y b8 = B.b(0, 1, null);
        b(b8, sVar);
        return b8.a();
    }

    public static final y e(N5.r rVar) {
        J6.r.e(rVar, "parameters");
        y b8 = B.b(0, 1, null);
        c(b8, rVar);
        return b8;
    }
}
