package g4;

import com.google.firebase.components.DependencyCycleException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
abstract class q {

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final C5807c f36065a;

        /* renamed from: b, reason: collision with root package name */
        private final Set f36066b = new HashSet();

        /* renamed from: c, reason: collision with root package name */
        private final Set f36067c = new HashSet();

        b(C5807c c5807c) {
            this.f36065a = c5807c;
        }

        void a(b bVar) {
            this.f36066b.add(bVar);
        }

        void b(b bVar) {
            this.f36067c.add(bVar);
        }

        C5807c c() {
            return this.f36065a;
        }

        Set d() {
            return this.f36066b;
        }

        boolean e() {
            return this.f36066b.isEmpty();
        }

        boolean f() {
            return this.f36067c.isEmpty();
        }

        void g(b bVar) {
            this.f36067c.remove(bVar);
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private final B f36068a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f36069b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f36068a.equals(this.f36068a) && cVar.f36069b == this.f36069b;
        }

        public int hashCode() {
            return ((this.f36068a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f36069b).hashCode();
        }

        private c(B b8, boolean z7) {
            this.f36068a = b8;
            this.f36069b = z7;
        }
    }

    static void a(List list) {
        Set<b> c8 = c(list);
        Set b8 = b(c8);
        int i8 = 0;
        while (!b8.isEmpty()) {
            b bVar = (b) b8.iterator().next();
            b8.remove(bVar);
            i8++;
            for (b bVar2 : bVar.d()) {
                bVar2.g(bVar);
                if (bVar2.f()) {
                    b8.add(bVar2);
                }
            }
        }
        if (i8 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar3 : c8) {
            if (!bVar3.f() && !bVar3.e()) {
                arrayList.add(bVar3.c());
            }
        }
        throw new DependencyCycleException(arrayList);
    }

    private static Set b(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    private static Set c(List list) {
        Set<b> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar : (Set) it2.next()) {
                        for (r rVar : bVar.c().g()) {
                            if (rVar.e() && (set = (Set) hashMap.get(new c(rVar.c(), rVar.g()))) != null) {
                                for (b bVar2 : set) {
                                    bVar.a(bVar2);
                                    bVar2.b(bVar);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
            C5807c c5807c = (C5807c) it.next();
            b bVar3 = new b(c5807c);
            for (B b8 : c5807c.j()) {
                c cVar = new c(b8, !c5807c.p());
                if (!hashMap.containsKey(cVar)) {
                    hashMap.put(cVar, new HashSet());
                }
                Set set2 = (Set) hashMap.get(cVar);
                if (!set2.isEmpty() && !cVar.f36069b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", b8));
                }
                set2.add(bVar3);
            }
        }
    }
}
