package R6;

import J6.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import y6.AbstractC6987o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class l extends k {

    public static final class a implements Iterable, K6.a {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ d f4958o;

        public a(d dVar) {
            this.f4958o = dVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f4958o.iterator();
        }
    }

    public static Iterable g(d dVar) {
        r.e(dVar, "<this>");
        return new a(dVar);
    }

    public static int h(d dVar) {
        r.e(dVar, "<this>");
        Iterator it = dVar.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            it.next();
            i8++;
            if (i8 < 0) {
                AbstractC6987o.j();
            }
        }
        return i8;
    }

    public static Object i(d dVar) {
        r.e(dVar, "<this>");
        Iterator it = dVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static d j(d dVar, I6.l lVar) {
        r.e(dVar, "<this>");
        r.e(lVar, "transform");
        return new m(dVar, lVar);
    }

    public static List k(d dVar) {
        r.e(dVar, "<this>");
        Iterator it = dVar.iterator();
        if (!it.hasNext()) {
            return AbstractC6987o.e();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC6987o.b(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
