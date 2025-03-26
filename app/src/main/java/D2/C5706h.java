package d2;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: d2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5706h {

    /* renamed from: a, reason: collision with root package name */
    private final Map f35220a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    private final long f35221b;

    /* renamed from: c, reason: collision with root package name */
    private long f35222c;

    /* renamed from: d, reason: collision with root package name */
    private long f35223d;

    /* renamed from: d2.h$a */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        final Object f35224a;

        /* renamed from: b, reason: collision with root package name */
        final int f35225b;

        a(Object obj, int i8) {
            this.f35224a = obj;
            this.f35225b = i8;
        }
    }

    public C5706h(long j8) {
        this.f35221b = j8;
        this.f35222c = j8;
    }

    private void f() {
        m(this.f35222c);
    }

    public void b() {
        m(0L);
    }

    public synchronized Object g(Object obj) {
        a aVar;
        aVar = (a) this.f35220a.get(obj);
        return aVar != null ? aVar.f35224a : null;
    }

    public synchronized long h() {
        return this.f35222c;
    }

    protected int i(Object obj) {
        return 1;
    }

    public synchronized Object k(Object obj, Object obj2) {
        int i8 = i(obj2);
        long j8 = i8;
        if (j8 >= this.f35222c) {
            j(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f35223d += j8;
        }
        a aVar = (a) this.f35220a.put(obj, obj2 == null ? null : new a(obj2, i8));
        if (aVar != null) {
            this.f35223d -= aVar.f35225b;
            if (!aVar.f35224a.equals(obj2)) {
                j(obj, aVar.f35224a);
            }
        }
        f();
        return aVar != null ? aVar.f35224a : null;
    }

    public synchronized Object l(Object obj) {
        a aVar = (a) this.f35220a.remove(obj);
        if (aVar == null) {
            return null;
        }
        this.f35223d -= aVar.f35225b;
        return aVar.f35224a;
    }

    protected synchronized void m(long j8) {
        while (this.f35223d > j8) {
            Iterator it = this.f35220a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            a aVar = (a) entry.getValue();
            this.f35223d -= aVar.f35225b;
            Object key = entry.getKey();
            it.remove();
            j(key, aVar.f35224a);
        }
    }

    protected void j(Object obj, Object obj2) {
    }
}
