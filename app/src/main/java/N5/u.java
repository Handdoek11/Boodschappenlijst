package N5;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import s.AbstractC6719b;
import y6.AbstractC6987o;

/* loaded from: classes2.dex */
public abstract class u implements r {

    /* renamed from: c, reason: collision with root package name */
    private final boolean f4199c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f4200d;

    public u(boolean z7, Map map) {
        J6.r.e(map, "values");
        this.f4199c = z7;
        Map a8 = z7 ? k.a() : new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i8 = 0; i8 < size; i8++) {
                arrayList.add((String) list.get(i8));
            }
            a8.put(str, arrayList);
        }
        this.f4200d = a8;
    }

    private final List a(String str) {
        return (List) this.f4200d.get(str);
    }

    @Override // N5.r
    public Set b() {
        return j.a(this.f4200d.entrySet());
    }

    @Override // N5.r
    public final boolean c() {
        return this.f4199c;
    }

    @Override // N5.r
    public List d(String str) {
        J6.r.e(str, "name");
        return a(str);
    }

    @Override // N5.r
    public String e(String str) {
        J6.r.e(str, "name");
        List a8 = a(str);
        if (a8 != null) {
            return (String) AbstractC6987o.D(a8);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f4199c != rVar.c()) {
            return false;
        }
        return v.d(b(), rVar.b());
    }

    @Override // N5.r
    public void f(I6.p pVar) {
        J6.r.e(pVar, "body");
        for (Map.Entry entry : this.f4200d.entrySet()) {
            pVar.invoke((String) entry.getKey(), (List) entry.getValue());
        }
    }

    public int hashCode() {
        return v.e(b(), AbstractC6719b.a(this.f4199c) * 31);
    }

    @Override // N5.r
    public boolean isEmpty() {
        return this.f4200d.isEmpty();
    }

    @Override // N5.r
    public Set names() {
        return j.a(this.f4200d.keySet());
    }
}
