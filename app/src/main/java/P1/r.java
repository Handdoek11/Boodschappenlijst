package P1;

import P1.n;
import com.bumptech.glide.Registry;
import d2.AbstractC5709k;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class r {

    /* renamed from: e, reason: collision with root package name */
    private static final c f4367e = new c();

    /* renamed from: f, reason: collision with root package name */
    private static final n f4368f = new a();

    /* renamed from: a, reason: collision with root package name */
    private final List f4369a;

    /* renamed from: b, reason: collision with root package name */
    private final c f4370b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f4371c;

    /* renamed from: d, reason: collision with root package name */
    private final y0.f f4372d;

    private static class a implements n {
        a() {
        }

        @Override // P1.n
        public n.a a(Object obj, int i8, int i9, J1.h hVar) {
            return null;
        }

        @Override // P1.n
        public boolean b(Object obj) {
            return false;
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Class f4373a;

        /* renamed from: b, reason: collision with root package name */
        final Class f4374b;

        /* renamed from: c, reason: collision with root package name */
        final o f4375c;

        public b(Class cls, Class cls2, o oVar) {
            this.f4373a = cls;
            this.f4374b = cls2;
            this.f4375c = oVar;
        }

        public boolean a(Class cls) {
            return this.f4373a.isAssignableFrom(cls);
        }

        public boolean b(Class cls, Class cls2) {
            return a(cls) && this.f4374b.isAssignableFrom(cls2);
        }
    }

    static class c {
        c() {
        }

        public q a(List list, y0.f fVar) {
            return new q(list, fVar);
        }
    }

    public r(y0.f fVar) {
        this(fVar, f4367e);
    }

    private void a(Class cls, Class cls2, o oVar, boolean z7) {
        b bVar = new b(cls, cls2, oVar);
        List list = this.f4369a;
        list.add(z7 ? list.size() : 0, bVar);
    }

    private n c(b bVar) {
        return (n) AbstractC5709k.d(bVar.f4375c.d(this));
    }

    private static n f() {
        return f4368f;
    }

    synchronized void b(Class cls, Class cls2, o oVar) {
        a(cls, cls2, oVar, true);
    }

    public synchronized n d(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z7 = false;
            for (b bVar : this.f4369a) {
                if (this.f4371c.contains(bVar)) {
                    z7 = true;
                } else if (bVar.b(cls, cls2)) {
                    this.f4371c.add(bVar);
                    arrayList.add(c(bVar));
                    this.f4371c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f4370b.a(arrayList, this.f4372d);
            }
            if (arrayList.size() == 1) {
                return (n) arrayList.get(0);
            }
            if (!z7) {
                throw new Registry.NoModelLoaderAvailableException(cls, cls2);
            }
            return f();
        } catch (Throwable th) {
            this.f4371c.clear();
            throw th;
        }
    }

    synchronized List e(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b bVar : this.f4369a) {
                if (!this.f4371c.contains(bVar) && bVar.a(cls)) {
                    this.f4371c.add(bVar);
                    arrayList.add(c(bVar));
                    this.f4371c.remove(bVar);
                }
            }
        } finally {
        }
        return arrayList;
    }

    synchronized List g(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b bVar : this.f4369a) {
            if (!arrayList.contains(bVar.f4374b) && bVar.a(cls)) {
                arrayList.add(bVar.f4374b);
            }
        }
        return arrayList;
    }

    r(y0.f fVar, c cVar) {
        this.f4369a = new ArrayList();
        this.f4371c = new HashSet();
        this.f4372d = fVar;
        this.f4370b = cVar;
    }
}
