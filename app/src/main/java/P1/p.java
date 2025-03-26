package P1;

import com.bumptech.glide.Registry;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private final r f4354a;

    /* renamed from: b, reason: collision with root package name */
    private final a f4355b;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Map f4356a = new HashMap();

        /* renamed from: P1.p$a$a, reason: collision with other inner class name */
        private static class C0087a {

            /* renamed from: a, reason: collision with root package name */
            final List f4357a;

            public C0087a(List list) {
                this.f4357a = list;
            }
        }

        a() {
        }

        public void a() {
            this.f4356a.clear();
        }

        public List b(Class cls) {
            C0087a c0087a = (C0087a) this.f4356a.get(cls);
            if (c0087a == null) {
                return null;
            }
            return c0087a.f4357a;
        }

        public void c(Class cls, List list) {
            if (((C0087a) this.f4356a.put(cls, new C0087a(list))) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public p(y0.f fVar) {
        this(new r(fVar));
    }

    private static Class b(Object obj) {
        return obj.getClass();
    }

    private synchronized List e(Class cls) {
        List b8;
        b8 = this.f4355b.b(cls);
        if (b8 == null) {
            b8 = DesugarCollections.unmodifiableList(this.f4354a.e(cls));
            this.f4355b.c(cls, b8);
        }
        return b8;
    }

    public synchronized void a(Class cls, Class cls2, o oVar) {
        this.f4354a.b(cls, cls2, oVar);
        this.f4355b.a();
    }

    public synchronized List c(Class cls) {
        return this.f4354a.g(cls);
    }

    public List d(Object obj) {
        List e8 = e(b(obj));
        if (e8.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(obj);
        }
        int size = e8.size();
        List emptyList = Collections.emptyList();
        boolean z7 = true;
        for (int i8 = 0; i8 < size; i8++) {
            n nVar = (n) e8.get(i8);
            if (nVar.b(obj)) {
                if (z7) {
                    emptyList = new ArrayList(size - i8);
                    z7 = false;
                }
                emptyList.add(nVar);
            }
        }
        if (emptyList.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(obj, e8);
        }
        return emptyList;
    }

    private p(r rVar) {
        this.f4355b = new a();
        this.f4354a = rVar;
    }
}
