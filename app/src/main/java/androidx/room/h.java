package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import d1.AbstractC5698a;
import g1.c;
import h1.C5825c;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    protected volatile g1.b f11357a;

    /* renamed from: b, reason: collision with root package name */
    private Executor f11358b;

    /* renamed from: c, reason: collision with root package name */
    private Executor f11359c;

    /* renamed from: d, reason: collision with root package name */
    private g1.c f11360d;

    /* renamed from: f, reason: collision with root package name */
    private boolean f11362f;

    /* renamed from: g, reason: collision with root package name */
    boolean f11363g;

    /* renamed from: h, reason: collision with root package name */
    protected List f11364h;

    /* renamed from: i, reason: collision with root package name */
    private final ReentrantReadWriteLock f11365i = new ReentrantReadWriteLock();

    /* renamed from: j, reason: collision with root package name */
    private final ThreadLocal f11366j = new ThreadLocal();

    /* renamed from: k, reason: collision with root package name */
    private final Map f11367k = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    private final e f11361e = e();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Class f11368a;

        /* renamed from: b, reason: collision with root package name */
        private final String f11369b;

        /* renamed from: c, reason: collision with root package name */
        private final Context f11370c;

        /* renamed from: d, reason: collision with root package name */
        private ArrayList f11371d;

        /* renamed from: e, reason: collision with root package name */
        private Executor f11372e;

        /* renamed from: f, reason: collision with root package name */
        private Executor f11373f;

        /* renamed from: g, reason: collision with root package name */
        private c.InterfaceC0258c f11374g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f11375h;

        /* renamed from: j, reason: collision with root package name */
        private boolean f11377j;

        /* renamed from: l, reason: collision with root package name */
        private boolean f11379l;

        /* renamed from: n, reason: collision with root package name */
        private Set f11381n;

        /* renamed from: o, reason: collision with root package name */
        private Set f11382o;

        /* renamed from: p, reason: collision with root package name */
        private String f11383p;

        /* renamed from: q, reason: collision with root package name */
        private File f11384q;

        /* renamed from: i, reason: collision with root package name */
        private c f11376i = c.AUTOMATIC;

        /* renamed from: k, reason: collision with root package name */
        private boolean f11378k = true;

        /* renamed from: m, reason: collision with root package name */
        private final d f11380m = new d();

        a(Context context, Class cls, String str) {
            this.f11370c = context;
            this.f11368a = cls;
            this.f11369b = str;
        }

        public a a(b bVar) {
            if (this.f11371d == null) {
                this.f11371d = new ArrayList();
            }
            this.f11371d.add(bVar);
            return this;
        }

        public a b(AbstractC5698a... abstractC5698aArr) {
            if (this.f11382o == null) {
                this.f11382o = new HashSet();
            }
            for (AbstractC5698a abstractC5698a : abstractC5698aArr) {
                this.f11382o.add(Integer.valueOf(abstractC5698a.f35201a));
                this.f11382o.add(Integer.valueOf(abstractC5698a.f35202b));
            }
            this.f11380m.b(abstractC5698aArr);
            return this;
        }

        public a c() {
            this.f11375h = true;
            return this;
        }

        public h d() {
            Executor executor;
            if (this.f11370c == null) {
                throw new IllegalArgumentException("Cannot provide null context for the database.");
            }
            if (this.f11368a == null) {
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
            Executor executor2 = this.f11372e;
            if (executor2 == null && this.f11373f == null) {
                Executor f8 = l.c.f();
                this.f11373f = f8;
                this.f11372e = f8;
            } else if (executor2 != null && this.f11373f == null) {
                this.f11373f = executor2;
            } else if (executor2 == null && (executor = this.f11373f) != null) {
                this.f11372e = executor;
            }
            Set<Integer> set = this.f11382o;
            if (set != null && this.f11381n != null) {
                for (Integer num : set) {
                    if (this.f11381n.contains(num)) {
                        throw new IllegalArgumentException("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + num);
                    }
                }
            }
            if (this.f11374g == null) {
                this.f11374g = new C5825c();
            }
            String str = this.f11383p;
            if (str != null || this.f11384q != null) {
                if (this.f11369b == null) {
                    throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                }
                if (str != null && this.f11384q != null) {
                    throw new IllegalArgumentException("Both createFromAsset() and createFromFile() was called on this Builder but the database can only be created using one of the two configurations.");
                }
                this.f11374g = new k(str, this.f11384q, this.f11374g);
            }
            Context context = this.f11370c;
            androidx.room.a aVar = new androidx.room.a(context, this.f11369b, this.f11374g, this.f11380m, this.f11371d, this.f11375h, this.f11376i.c(context), this.f11372e, this.f11373f, this.f11377j, this.f11378k, this.f11379l, this.f11381n, this.f11383p, this.f11384q);
            h hVar = (h) g.b(this.f11368a, "_Impl");
            hVar.l(aVar);
            return hVar;
        }

        public a e() {
            this.f11378k = false;
            this.f11379l = true;
            return this;
        }

        public a f(c.InterfaceC0258c interfaceC0258c) {
            this.f11374g = interfaceC0258c;
            return this;
        }

        public a g(Executor executor) {
            this.f11372e = executor;
            return this;
        }
    }

    public enum c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private static boolean a(ActivityManager activityManager) {
            return activityManager.isLowRamDevice();
        }

        c c(Context context) {
            if (this != AUTOMATIC) {
                return this;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            return (activityManager == null || a(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private HashMap f11389a = new HashMap();

        private void a(AbstractC5698a abstractC5698a) {
            int i8 = abstractC5698a.f35201a;
            int i9 = abstractC5698a.f35202b;
            TreeMap treeMap = (TreeMap) this.f11389a.get(Integer.valueOf(i8));
            if (treeMap == null) {
                treeMap = new TreeMap();
                this.f11389a.put(Integer.valueOf(i8), treeMap);
            }
            AbstractC5698a abstractC5698a2 = (AbstractC5698a) treeMap.get(Integer.valueOf(i9));
            if (abstractC5698a2 != null) {
                Log.w("ROOM", "Overriding migration " + abstractC5698a2 + " with " + abstractC5698a);
            }
            treeMap.put(Integer.valueOf(i9), abstractC5698a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
        
            return r6;
         */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0016 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private java.util.List d(java.util.List r6, boolean r7, int r8, int r9) {
            /*
                r5 = this;
            L0:
                if (r7 == 0) goto L5
                if (r8 >= r9) goto L52
                goto L7
            L5:
                if (r8 <= r9) goto L52
            L7:
                java.util.HashMap r0 = r5.f11389a
                java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
                java.lang.Object r0 = r0.get(r1)
                java.util.TreeMap r0 = (java.util.TreeMap) r0
                r1 = 0
                if (r0 != 0) goto L17
                return r1
            L17:
                if (r7 == 0) goto L1e
                java.util.NavigableSet r2 = r0.descendingKeySet()
                goto L22
            L1e:
                java.util.Set r2 = r0.keySet()
            L22:
                java.util.Iterator r2 = r2.iterator()
            L26:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L4a
                java.lang.Object r3 = r2.next()
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r4 = r3.intValue()
                if (r7 == 0) goto L3d
                if (r4 > r9) goto L26
                if (r4 <= r8) goto L26
                goto L41
            L3d:
                if (r4 < r9) goto L26
                if (r4 >= r8) goto L26
            L41:
                java.lang.Object r8 = r0.get(r3)
                r6.add(r8)
                r8 = 1
                goto L4d
            L4a:
                r0 = 0
                r4 = r8
                r8 = r0
            L4d:
                if (r8 != 0) goto L50
                return r1
            L50:
                r8 = r4
                goto L0
            L52:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.h.d.d(java.util.List, boolean, int, int):java.util.List");
        }

        public void b(AbstractC5698a... abstractC5698aArr) {
            for (AbstractC5698a abstractC5698a : abstractC5698aArr) {
                a(abstractC5698a);
            }
        }

        public List c(int i8, int i9) {
            if (i8 == i9) {
                return Collections.emptyList();
            }
            return d(new ArrayList(), i9 > i8, i8, i9);
        }
    }

    private static boolean n() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public void a() {
        if (!this.f11362f && n()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void b() {
        if (!k() && this.f11366j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public void c() {
        a();
        g1.b U7 = this.f11360d.U();
        this.f11361e.m(U7);
        U7.n();
    }

    public g1.f d(String str) {
        a();
        b();
        return this.f11360d.U().y(str);
    }

    protected abstract e e();

    protected abstract g1.c f(androidx.room.a aVar);

    public void g() {
        this.f11360d.U().Y();
        if (k()) {
            return;
        }
        this.f11361e.f();
    }

    Lock h() {
        return this.f11365i.readLock();
    }

    public g1.c i() {
        return this.f11360d;
    }

    public Executor j() {
        return this.f11358b;
    }

    public boolean k() {
        return this.f11360d.U().k0();
    }

    public void l(androidx.room.a aVar) {
        g1.c f8 = f(aVar);
        this.f11360d = f8;
        if (f8 instanceof j) {
            ((j) f8).e(aVar);
        }
        boolean z7 = aVar.f11299g == c.WRITE_AHEAD_LOGGING;
        this.f11360d.setWriteAheadLoggingEnabled(z7);
        this.f11364h = aVar.f11297e;
        this.f11358b = aVar.f11300h;
        this.f11359c = new l(aVar.f11301i);
        this.f11362f = aVar.f11298f;
        this.f11363g = z7;
        if (aVar.f11302j) {
            this.f11361e.i(aVar.f11294b, aVar.f11295c);
        }
    }

    protected void m(g1.b bVar) {
        this.f11361e.d(bVar);
    }

    public boolean o() {
        g1.b bVar = this.f11357a;
        return bVar != null && bVar.s();
    }

    public Cursor p(g1.e eVar) {
        return q(eVar, null);
    }

    public Cursor q(g1.e eVar, CancellationSignal cancellationSignal) {
        a();
        b();
        return cancellationSignal != null ? this.f11360d.U().p(eVar, cancellationSignal) : this.f11360d.U().d0(eVar);
    }

    public void r() {
        this.f11360d.U().P();
    }

    public static abstract class b {
        public void a(g1.b bVar) {
        }

        public void b(g1.b bVar) {
        }

        public void c(g1.b bVar) {
        }
    }
}
