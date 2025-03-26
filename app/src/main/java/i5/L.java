package I5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import y6.AbstractC6987o;

/* loaded from: classes2.dex */
public final class L implements y {

    /* renamed from: a, reason: collision with root package name */
    private final y f3206a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f3207b;

    public L(y yVar) {
        J6.r.e(yVar, "encodedParametersBuilder");
        this.f3206a = yVar;
        this.f3207b = yVar.c();
    }

    @Override // I5.y
    public x a() {
        return M.d(this.f3206a);
    }

    @Override // N5.s
    public Set b() {
        return M.d(this.f3206a).b();
    }

    @Override // N5.s
    public boolean c() {
        return this.f3207b;
    }

    @Override // N5.s
    public void clear() {
        this.f3206a.clear();
    }

    @Override // N5.s
    public List d(String str) {
        J6.r.e(str, "name");
        ArrayList arrayList = null;
        List d8 = this.f3206a.d(AbstractC0627a.m(str, false, 1, null));
        if (d8 != null) {
            List list = d8;
            arrayList = new ArrayList(AbstractC6987o.l(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC0627a.k((String) it.next(), 0, 0, true, null, 11, null));
            }
        }
        return arrayList;
    }

    @Override // N5.s
    public void e(N5.r rVar) {
        J6.r.e(rVar, "stringValues");
        M.c(this.f3206a, rVar);
    }

    @Override // N5.s
    public void f(String str, Iterable iterable) {
        J6.r.e(str, "name");
        J6.r.e(iterable, "values");
        y yVar = this.f3206a;
        String m8 = AbstractC0627a.m(str, false, 1, null);
        ArrayList arrayList = new ArrayList(AbstractC6987o.l(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC0627a.n((String) it.next()));
        }
        yVar.f(m8, arrayList);
    }

    @Override // N5.s
    public void g(String str, String str2) {
        J6.r.e(str, "name");
        J6.r.e(str2, "value");
        this.f3206a.g(AbstractC0627a.m(str, false, 1, null), AbstractC0627a.n(str2));
    }

    @Override // N5.s
    public boolean isEmpty() {
        return this.f3206a.isEmpty();
    }

    @Override // N5.s
    public Set names() {
        Set names = this.f3206a.names();
        ArrayList arrayList = new ArrayList(AbstractC6987o.l(names, 10));
        Iterator it = names.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC0627a.k((String) it.next(), 0, 0, false, null, 15, null));
        }
        return AbstractC6987o.e0(arrayList);
    }
}
