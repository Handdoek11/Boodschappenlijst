package g4;

import X2.D;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import g4.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import z4.InterfaceC7082a;

/* loaded from: classes2.dex */
public class o implements e, InterfaceC7082a {

    /* renamed from: i, reason: collision with root package name */
    private static final H4.b f36051i = new H4.b() { // from class: g4.k
        @Override // H4.b
        public final Object get() {
            return Collections.emptySet();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final Map f36052a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f36053b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f36054c;

    /* renamed from: d, reason: collision with root package name */
    private final List f36055d;

    /* renamed from: e, reason: collision with root package name */
    private Set f36056e;

    /* renamed from: f, reason: collision with root package name */
    private final t f36057f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference f36058g;

    /* renamed from: h, reason: collision with root package name */
    private final j f36059h;

    public static b m(Executor executor) {
        return new b(executor);
    }

    private void n(List list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.f36055d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((H4.b) it.next()).get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f36059h.a(componentRegistrar));
                        it.remove();
                    }
                } catch (InvalidRegistrarException e8) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e8);
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Object[] array = ((C5807c) it2.next()).j().toArray();
                int length = array.length;
                int i8 = 0;
                while (true) {
                    if (i8 < length) {
                        Object obj = array[i8];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f36056e.contains(obj.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f36056e.add(obj.toString());
                        }
                        i8++;
                    }
                }
            }
            if (this.f36052a.isEmpty()) {
                q.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f36052a.keySet());
                arrayList2.addAll(list);
                q.a(arrayList2);
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                final C5807c c5807c = (C5807c) it3.next();
                this.f36052a.put(c5807c, new u(new H4.b() { // from class: g4.l
                    @Override // H4.b
                    public final Object get() {
                        return this.f36045a.r(c5807c);
                    }
                }));
            }
            arrayList.addAll(w(list));
            arrayList.addAll(x());
            v();
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            ((Runnable) it4.next()).run();
        }
        u();
    }

    private void o(Map map, boolean z7) {
        for (Map.Entry entry : map.entrySet()) {
            C5807c c5807c = (C5807c) entry.getKey();
            H4.b bVar = (H4.b) entry.getValue();
            if (c5807c.n() || (c5807c.o() && z7)) {
                bVar.get();
            }
        }
        this.f36057f.d();
    }

    private static List q(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object r(C5807c c5807c) {
        return c5807c.h().a(new C(c5807c, this));
    }

    private void u() {
        Boolean bool = (Boolean) this.f36058g.get();
        if (bool != null) {
            o(this.f36052a, bool.booleanValue());
        }
    }

    private void v() {
        for (C5807c c5807c : this.f36052a.keySet()) {
            for (r rVar : c5807c.g()) {
                if (rVar.g() && !this.f36054c.containsKey(rVar.c())) {
                    this.f36054c.put(rVar.c(), v.b(Collections.emptySet()));
                } else if (this.f36053b.containsKey(rVar.c())) {
                    continue;
                } else {
                    if (rVar.f()) {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", c5807c, rVar.c()));
                    }
                    if (!rVar.g()) {
                        this.f36053b.put(rVar.c(), z.e());
                    }
                }
            }
        }
    }

    private List w(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5807c c5807c = (C5807c) it.next();
            if (c5807c.p()) {
                final H4.b bVar = (H4.b) this.f36052a.get(c5807c);
                for (B b8 : c5807c.j()) {
                    if (this.f36053b.containsKey(b8)) {
                        final z zVar = (z) ((H4.b) this.f36053b.get(b8));
                        arrayList.add(new Runnable() { // from class: g4.m
                            @Override // java.lang.Runnable
                            public final void run() {
                                zVar.j(bVar);
                            }
                        });
                    } else {
                        this.f36053b.put(b8, bVar);
                    }
                }
            }
        }
        return arrayList;
    }

    private List x() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f36052a.entrySet()) {
            C5807c c5807c = (C5807c) entry.getKey();
            if (!c5807c.p()) {
                H4.b bVar = (H4.b) entry.getValue();
                for (B b8 : c5807c.j()) {
                    if (!hashMap.containsKey(b8)) {
                        hashMap.put(b8, new HashSet());
                    }
                    ((Set) hashMap.get(b8)).add(bVar);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (this.f36054c.containsKey(entry2.getKey())) {
                final v vVar = (v) this.f36054c.get(entry2.getKey());
                for (final H4.b bVar2 : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: g4.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            vVar.a(bVar2);
                        }
                    });
                }
            } else {
                this.f36054c.put((B) entry2.getKey(), v.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    @Override // g4.e
    public /* synthetic */ Object a(Class cls) {
        return d.b(this, cls);
    }

    @Override // g4.e
    public /* synthetic */ Set b(B b8) {
        return d.e(this, b8);
    }

    @Override // g4.e
    public synchronized H4.b c(B b8) {
        AbstractC5804A.c(b8, "Null interface requested.");
        return (H4.b) this.f36053b.get(b8);
    }

    @Override // g4.e
    public /* synthetic */ H4.b d(Class cls) {
        return d.d(this, cls);
    }

    @Override // g4.e
    public H4.a e(B b8) {
        H4.b c8 = c(b8);
        return c8 == null ? z.e() : c8 instanceof z ? (z) c8 : z.i(c8);
    }

    @Override // g4.e
    public /* synthetic */ Object f(B b8) {
        return d.a(this, b8);
    }

    @Override // g4.e
    public /* synthetic */ Set g(Class cls) {
        return d.f(this, cls);
    }

    @Override // g4.e
    public synchronized H4.b h(B b8) {
        v vVar = (v) this.f36054c.get(b8);
        if (vVar != null) {
            return vVar;
        }
        return f36051i;
    }

    @Override // g4.e
    public /* synthetic */ H4.a i(Class cls) {
        return d.c(this, cls);
    }

    public void p(boolean z7) {
        HashMap hashMap;
        if (D.a(this.f36058g, null, Boolean.valueOf(z7))) {
            synchronized (this) {
                hashMap = new HashMap(this.f36052a);
            }
            o(hashMap, z7);
        }
    }

    private o(Executor executor, Iterable iterable, Collection collection, j jVar) {
        this.f36052a = new HashMap();
        this.f36053b = new HashMap();
        this.f36054c = new HashMap();
        this.f36056e = new HashSet();
        this.f36058g = new AtomicReference();
        t tVar = new t(executor);
        this.f36057f = tVar;
        this.f36059h = jVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C5807c.s(tVar, t.class, E4.d.class, E4.c.class));
        arrayList.add(C5807c.s(this, InterfaceC7082a.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C5807c c5807c = (C5807c) it.next();
            if (c5807c != null) {
                arrayList.add(c5807c);
            }
        }
        this.f36055d = q(iterable);
        n(arrayList);
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Executor f36060a;

        /* renamed from: b, reason: collision with root package name */
        private final List f36061b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final List f36062c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        private j f36063d = j.f36044a;

        b(Executor executor) {
            this.f36060a = executor;
        }

        public b b(C5807c c5807c) {
            this.f36062c.add(c5807c);
            return this;
        }

        public b c(final ComponentRegistrar componentRegistrar) {
            this.f36061b.add(new H4.b() { // from class: g4.p
                @Override // H4.b
                public final Object get() {
                    return o.b.f(componentRegistrar);
                }
            });
            return this;
        }

        public b d(Collection collection) {
            this.f36061b.addAll(collection);
            return this;
        }

        public o e() {
            return new o(this.f36060a, this.f36061b, this.f36062c, this.f36063d);
        }

        public b g(j jVar) {
            this.f36063d = jVar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ ComponentRegistrar f(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }
    }
}
