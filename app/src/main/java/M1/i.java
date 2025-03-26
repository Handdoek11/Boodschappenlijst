package M1;

import android.util.Log;
import d2.AbstractC5709k;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class i implements M1.b {

    /* renamed from: a, reason: collision with root package name */
    private final g f3740a = new g();

    /* renamed from: b, reason: collision with root package name */
    private final b f3741b = new b();

    /* renamed from: c, reason: collision with root package name */
    private final Map f3742c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map f3743d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final int f3744e;

    /* renamed from: f, reason: collision with root package name */
    private int f3745f;

    private static final class a implements m {

        /* renamed from: a, reason: collision with root package name */
        private final b f3746a;

        /* renamed from: b, reason: collision with root package name */
        int f3747b;

        /* renamed from: c, reason: collision with root package name */
        private Class f3748c;

        a(b bVar) {
            this.f3746a = bVar;
        }

        @Override // M1.m
        public void a() {
            this.f3746a.c(this);
        }

        void b(int i8, Class cls) {
            this.f3747b = i8;
            this.f3748c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f3747b == aVar.f3747b && this.f3748c == aVar.f3748c;
        }

        public int hashCode() {
            int i8 = this.f3747b * 31;
            Class cls = this.f3748c;
            return i8 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f3747b + "array=" + this.f3748c + '}';
        }
    }

    private static final class b extends c {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // M1.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a(this);
        }

        a e(int i8, Class cls) {
            a aVar = (a) b();
            aVar.b(i8, cls);
            return aVar;
        }
    }

    public i(int i8) {
        this.f3744e = i8;
    }

    private void f(int i8, Class cls) {
        NavigableMap m8 = m(cls);
        Integer num = (Integer) m8.get(Integer.valueOf(i8));
        if (num != null) {
            if (num.intValue() == 1) {
                m8.remove(Integer.valueOf(i8));
                return;
            } else {
                m8.put(Integer.valueOf(i8), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i8 + ", this: " + this);
    }

    private void g() {
        h(this.f3744e);
    }

    private void h(int i8) {
        while (this.f3745f > i8) {
            Object f8 = this.f3740a.f();
            AbstractC5709k.d(f8);
            M1.a i9 = i(f8);
            this.f3745f -= i9.c(f8) * i9.b();
            f(i9.c(f8), f8.getClass());
            if (Log.isLoggable(i9.a(), 2)) {
                Log.v(i9.a(), "evicted: " + i9.c(f8));
            }
        }
    }

    private M1.a i(Object obj) {
        return j(obj.getClass());
    }

    private M1.a j(Class cls) {
        M1.a aVar = (M1.a) this.f3743d.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new h();
            } else {
                if (!cls.equals(byte[].class)) {
                    throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
                }
                aVar = new f();
            }
            this.f3743d.put(cls, aVar);
        }
        return aVar;
    }

    private Object k(a aVar) {
        return this.f3740a.a(aVar);
    }

    private Object l(a aVar, Class cls) {
        M1.a j8 = j(cls);
        Object k8 = k(aVar);
        if (k8 != null) {
            this.f3745f -= j8.c(k8) * j8.b();
            f(j8.c(k8), cls);
        }
        if (k8 != null) {
            return k8;
        }
        if (Log.isLoggable(j8.a(), 2)) {
            Log.v(j8.a(), "Allocated " + aVar.f3747b + " bytes");
        }
        return j8.newArray(aVar.f3747b);
    }

    private NavigableMap m(Class cls) {
        NavigableMap navigableMap = (NavigableMap) this.f3742c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f3742c.put(cls, treeMap);
        return treeMap;
    }

    private boolean n() {
        int i8 = this.f3745f;
        return i8 == 0 || this.f3744e / i8 >= 2;
    }

    private boolean o(int i8) {
        return i8 <= this.f3744e / 2;
    }

    private boolean p(int i8, Integer num) {
        return num != null && (n() || num.intValue() <= i8 * 8);
    }

    @Override // M1.b
    public synchronized void a(int i8) {
        try {
            if (i8 >= 40) {
                b();
            } else if (i8 >= 20 || i8 == 15) {
                h(this.f3744e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // M1.b
    public synchronized void b() {
        h(0);
    }

    @Override // M1.b
    public synchronized Object c(int i8, Class cls) {
        return l(this.f3741b.e(i8, cls), cls);
    }

    @Override // M1.b
    public synchronized void d(Object obj) {
        Class<?> cls = obj.getClass();
        M1.a j8 = j(cls);
        int c8 = j8.c(obj);
        int b8 = j8.b() * c8;
        if (o(b8)) {
            a e8 = this.f3741b.e(c8, cls);
            this.f3740a.d(e8, obj);
            NavigableMap m8 = m(cls);
            Integer num = (Integer) m8.get(Integer.valueOf(e8.f3747b));
            Integer valueOf = Integer.valueOf(e8.f3747b);
            int i8 = 1;
            if (num != null) {
                i8 = 1 + num.intValue();
            }
            m8.put(valueOf, Integer.valueOf(i8));
            this.f3745f += b8;
            g();
        }
    }

    @Override // M1.b
    public synchronized Object e(int i8, Class cls) {
        Integer num;
        try {
            num = (Integer) m(cls).ceilingKey(Integer.valueOf(i8));
        } catch (Throwable th) {
            throw th;
        }
        return l(p(i8, num) ? this.f3741b.e(num.intValue(), cls) : this.f3741b.e(i8, cls), cls);
    }
}
