package Y1;

import J1.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final List f6054a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final Map f6055b = new HashMap();

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Class f6056a;

        /* renamed from: b, reason: collision with root package name */
        final Class f6057b;

        /* renamed from: c, reason: collision with root package name */
        final j f6058c;

        public a(Class cls, Class cls2, j jVar) {
            this.f6056a = cls;
            this.f6057b = cls2;
            this.f6058c = jVar;
        }

        public boolean a(Class cls, Class cls2) {
            return this.f6056a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f6057b);
        }
    }

    private synchronized List c(String str) {
        List list;
        try {
            if (!this.f6054a.contains(str)) {
                this.f6054a.add(str);
            }
            list = (List) this.f6055b.get(str);
            if (list == null) {
                list = new ArrayList();
                this.f6055b.put(str, list);
            }
        } catch (Throwable th) {
            throw th;
        }
        return list;
    }

    public synchronized void a(String str, j jVar, Class cls, Class cls2) {
        c(str).add(new a(cls, cls2, jVar));
    }

    public synchronized List b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f6054a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f6055b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.a(cls, cls2)) {
                        arrayList.add(aVar.f6058c);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized List d(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f6054a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f6055b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f6057b)) {
                        arrayList.add(aVar.f6057b);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized void e(List list) {
        try {
            ArrayList<String> arrayList = new ArrayList(this.f6054a);
            this.f6054a.clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f6054a.add((String) it.next());
            }
            for (String str : arrayList) {
                if (!list.contains(str)) {
                    this.f6054a.add(str);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
