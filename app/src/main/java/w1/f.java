package W1;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final List f5814a = new ArrayList();

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        final Class f5815a;

        /* renamed from: b, reason: collision with root package name */
        final Class f5816b;

        /* renamed from: c, reason: collision with root package name */
        final e f5817c;

        a(Class cls, Class cls2, e eVar) {
            this.f5815a = cls;
            this.f5816b = cls2;
            this.f5817c = eVar;
        }

        public boolean a(Class cls, Class cls2) {
            return this.f5815a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f5816b);
        }
    }

    public synchronized e a(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return g.b();
        }
        for (a aVar : this.f5814a) {
            if (aVar.a(cls, cls2)) {
                return aVar.f5817c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public synchronized List b(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a aVar : this.f5814a) {
            if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f5816b)) {
                arrayList.add(aVar.f5816b);
            }
        }
        return arrayList;
    }

    public synchronized void c(Class cls, Class cls2, e eVar) {
        this.f5814a.add(new a(cls, cls2, eVar));
    }
}
