package N5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import x6.C6916E;
import y6.AbstractC6987o;

/* loaded from: classes2.dex */
public abstract class t implements s {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f4196a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f4197b;

    static final class a extends J6.s implements I6.p {
        a() {
            super(2);
        }

        public final void b(String str, List list) {
            J6.r.e(str, "name");
            J6.r.e(list, "values");
            t.this.f(str, list);
        }

        @Override // I6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((String) obj, (List) obj2);
            return C6916E.f44463a;
        }
    }

    public t(boolean z7, int i8) {
        this.f4196a = z7;
        this.f4197b = z7 ? k.a() : new LinkedHashMap(i8);
    }

    private final List h(String str) {
        List list = (List) this.f4197b.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        m(str);
        this.f4197b.put(str, arrayList);
        return arrayList;
    }

    @Override // N5.s
    public Set b() {
        return j.a(this.f4197b.entrySet());
    }

    @Override // N5.s
    public final boolean c() {
        return this.f4196a;
    }

    @Override // N5.s
    public void clear() {
        this.f4197b.clear();
    }

    @Override // N5.s
    public List d(String str) {
        J6.r.e(str, "name");
        return (List) this.f4197b.get(str);
    }

    @Override // N5.s
    public void e(r rVar) {
        J6.r.e(rVar, "stringValues");
        rVar.f(new a());
    }

    @Override // N5.s
    public void f(String str, Iterable iterable) {
        J6.r.e(str, "name");
        J6.r.e(iterable, "values");
        List h8 = h(str);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            n(str2);
            h8.add(str2);
        }
    }

    @Override // N5.s
    public void g(String str, String str2) {
        J6.r.e(str, "name");
        J6.r.e(str2, "value");
        n(str2);
        h(str).add(str2);
    }

    public String i(String str) {
        J6.r.e(str, "name");
        List d8 = d(str);
        if (d8 != null) {
            return (String) AbstractC6987o.D(d8);
        }
        return null;
    }

    @Override // N5.s
    public boolean isEmpty() {
        return this.f4197b.isEmpty();
    }

    protected final Map j() {
        return this.f4197b;
    }

    public void k(String str) {
        J6.r.e(str, "name");
        this.f4197b.remove(str);
    }

    public void l(String str, String str2) {
        J6.r.e(str, "name");
        J6.r.e(str2, "value");
        n(str2);
        List h8 = h(str);
        h8.clear();
        h8.add(str2);
    }

    protected void m(String str) {
        J6.r.e(str, "name");
    }

    protected void n(String str) {
        J6.r.e(str, "value");
    }

    @Override // N5.s
    public Set names() {
        return this.f4197b.keySet();
    }
}
