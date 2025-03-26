package androidx.room;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import g1.C5798a;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import m.C6182b;

/* loaded from: classes.dex */
public class e {

    /* renamed from: m, reason: collision with root package name */
    private static final String[] f11312m = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: b, reason: collision with root package name */
    final String[] f11314b;

    /* renamed from: c, reason: collision with root package name */
    private Map f11315c;

    /* renamed from: d, reason: collision with root package name */
    final h f11316d;

    /* renamed from: g, reason: collision with root package name */
    volatile g1.f f11319g;

    /* renamed from: h, reason: collision with root package name */
    private b f11320h;

    /* renamed from: i, reason: collision with root package name */
    private final androidx.room.d f11321i;

    /* renamed from: k, reason: collision with root package name */
    private f f11323k;

    /* renamed from: e, reason: collision with root package name */
    AtomicBoolean f11317e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f11318f = false;

    /* renamed from: j, reason: collision with root package name */
    final C6182b f11322j = new C6182b();

    /* renamed from: l, reason: collision with root package name */
    Runnable f11324l = new a();

    /* renamed from: a, reason: collision with root package name */
    final HashMap f11313a = new HashMap();

    class a implements Runnable {
        a() {
        }

        private Set a() {
            HashSet hashSet = new HashSet();
            Cursor p8 = e.this.f11316d.p(new C5798a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (p8.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(p8.getInt(0)));
                } catch (Throwable th) {
                    p8.close();
                    throw th;
                }
            }
            p8.close();
            if (!hashSet.isEmpty()) {
                e.this.f11319g.x();
            }
            return hashSet;
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00a0 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r5 = this;
                androidx.room.e r0 = androidx.room.e.this
                androidx.room.h r0 = r0.f11316d
                java.util.concurrent.locks.Lock r0 = r0.h()
                r1 = 0
                r0.lock()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                androidx.room.e r2 = androidx.room.e.this     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                boolean r2 = r2.c()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                if (r2 != 0) goto L18
                r0.unlock()
                return
            L18:
                androidx.room.e r2 = androidx.room.e.this     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                java.util.concurrent.atomic.AtomicBoolean r2 = r2.f11317e     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                r3 = 1
                r4 = 0
                boolean r2 = r2.compareAndSet(r3, r4)     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                if (r2 != 0) goto L28
                r0.unlock()
                return
            L28:
                androidx.room.e r2 = androidx.room.e.this     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                androidx.room.h r2 = r2.f11316d     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                boolean r2 = r2.k()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                if (r2 == 0) goto L36
                r0.unlock()
                return
            L36:
                androidx.room.e r2 = androidx.room.e.this     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                androidx.room.h r2 = r2.f11316d     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                boolean r3 = r2.f11363g     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                if (r3 == 0) goto L5f
                g1.c r2 = r2.i()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                g1.b r2 = r2.U()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                r2.n()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                java.util.Set r1 = r5.a()     // Catch: java.lang.Throwable -> L5a
                r2.P()     // Catch: java.lang.Throwable -> L5a
                r2.Y()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                goto L63
            L54:
                r1 = move-exception
                goto La1
            L56:
                r2 = move-exception
                goto L67
            L58:
                r2 = move-exception
                goto L67
            L5a:
                r3 = move-exception
                r2.Y()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                throw r3     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
            L5f:
                java.util.Set r1 = r5.a()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
            L63:
                r0.unlock()
                goto L6f
            L67:
                java.lang.String r3 = "ROOM"
                java.lang.String r4 = "Cannot run invalidation tracker. Is the db closed?"
                android.util.Log.e(r3, r4, r2)     // Catch: java.lang.Throwable -> L54
                goto L63
            L6f:
                if (r1 == 0) goto La0
                boolean r0 = r1.isEmpty()
                if (r0 != 0) goto La0
                androidx.room.e r0 = androidx.room.e.this
                m.b r0 = r0.f11322j
                monitor-enter(r0)
                androidx.room.e r2 = androidx.room.e.this     // Catch: java.lang.Throwable -> L9a
                m.b r2 = r2.f11322j     // Catch: java.lang.Throwable -> L9a
                java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L9a
            L84:
                boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L9a
                if (r3 == 0) goto L9c
                java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L9a
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L9a
                java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L9a
                androidx.room.e$d r3 = (androidx.room.e.d) r3     // Catch: java.lang.Throwable -> L9a
                r3.a(r1)     // Catch: java.lang.Throwable -> L9a
                goto L84
            L9a:
                r1 = move-exception
                goto L9e
            L9c:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9a
                goto La0
            L9e:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9a
                throw r1
            La0:
                return
            La1:
                r0.unlock()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.e.a.run():void");
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        final long[] f11326a;

        /* renamed from: b, reason: collision with root package name */
        final boolean[] f11327b;

        /* renamed from: c, reason: collision with root package name */
        final int[] f11328c;

        /* renamed from: d, reason: collision with root package name */
        boolean f11329d;

        /* renamed from: e, reason: collision with root package name */
        boolean f11330e;

        b(int i8) {
            long[] jArr = new long[i8];
            this.f11326a = jArr;
            boolean[] zArr = new boolean[i8];
            this.f11327b = zArr;
            this.f11328c = new int[i8];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        int[] a() {
            synchronized (this) {
                try {
                    if (this.f11329d && !this.f11330e) {
                        int length = this.f11326a.length;
                        int i8 = 0;
                        while (true) {
                            int i9 = 1;
                            if (i8 >= length) {
                                this.f11330e = true;
                                this.f11329d = false;
                                return this.f11328c;
                            }
                            boolean z7 = this.f11326a[i8] > 0;
                            boolean[] zArr = this.f11327b;
                            if (z7 != zArr[i8]) {
                                int[] iArr = this.f11328c;
                                if (!z7) {
                                    i9 = 2;
                                }
                                iArr[i8] = i9;
                            } else {
                                this.f11328c[i8] = 0;
                            }
                            zArr[i8] = z7;
                            i8++;
                        }
                    }
                    return null;
                } finally {
                }
            }
        }

        boolean b(int... iArr) {
            boolean z7;
            synchronized (this) {
                try {
                    z7 = false;
                    for (int i8 : iArr) {
                        long[] jArr = this.f11326a;
                        long j8 = jArr[i8];
                        jArr[i8] = 1 + j8;
                        if (j8 == 0) {
                            z7 = true;
                            this.f11329d = true;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z7;
        }

        boolean c(int... iArr) {
            boolean z7;
            synchronized (this) {
                try {
                    z7 = false;
                    for (int i8 : iArr) {
                        long[] jArr = this.f11326a;
                        long j8 = jArr[i8];
                        jArr[i8] = j8 - 1;
                        if (j8 == 1) {
                            z7 = true;
                            this.f11329d = true;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z7;
        }

        void d() {
            synchronized (this) {
                this.f11330e = false;
            }
        }
    }

    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        final String[] f11331a;

        public c(String[] strArr) {
            this.f11331a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        abstract boolean a();

        public abstract void b(Set set);
    }

    static class d {

        /* renamed from: a, reason: collision with root package name */
        final int[] f11332a;

        /* renamed from: b, reason: collision with root package name */
        private final String[] f11333b;

        /* renamed from: c, reason: collision with root package name */
        final c f11334c;

        /* renamed from: d, reason: collision with root package name */
        private final Set f11335d;

        d(c cVar, int[] iArr, String[] strArr) {
            this.f11334c = cVar;
            this.f11332a = iArr;
            this.f11333b = strArr;
            if (iArr.length != 1) {
                this.f11335d = null;
                return;
            }
            HashSet hashSet = new HashSet();
            hashSet.add(strArr[0]);
            this.f11335d = DesugarCollections.unmodifiableSet(hashSet);
        }

        void a(Set set) {
            int length = this.f11332a.length;
            Set set2 = null;
            for (int i8 = 0; i8 < length; i8++) {
                if (set.contains(Integer.valueOf(this.f11332a[i8]))) {
                    if (length == 1) {
                        set2 = this.f11335d;
                    } else {
                        if (set2 == null) {
                            set2 = new HashSet(length);
                        }
                        set2.add(this.f11333b[i8]);
                    }
                }
            }
            if (set2 != null) {
                this.f11334c.b(set2);
            }
        }

        void b(String[] strArr) {
            Set set = null;
            if (this.f11333b.length == 1) {
                int length = strArr.length;
                int i8 = 0;
                while (true) {
                    if (i8 >= length) {
                        break;
                    }
                    if (strArr[i8].equalsIgnoreCase(this.f11333b[0])) {
                        set = this.f11335d;
                        break;
                    }
                    i8++;
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str : strArr) {
                    String[] strArr2 = this.f11333b;
                    int length2 = strArr2.length;
                    int i9 = 0;
                    while (true) {
                        if (i9 < length2) {
                            String str2 = strArr2[i9];
                            if (str2.equalsIgnoreCase(str)) {
                                hashSet.add(str2);
                                break;
                            }
                            i9++;
                        }
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.f11334c.b(set);
            }
        }
    }

    public e(h hVar, Map map, Map map2, String... strArr) {
        this.f11316d = hVar;
        this.f11320h = new b(strArr.length);
        this.f11315c = map2;
        this.f11321i = new androidx.room.d(hVar);
        int length = strArr.length;
        this.f11314b = new String[length];
        for (int i8 = 0; i8 < length; i8++) {
            String str = strArr[i8];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f11313a.put(lowerCase, Integer.valueOf(i8));
            String str2 = (String) map.get(strArr[i8]);
            if (str2 != null) {
                this.f11314b[i8] = str2.toLowerCase(locale);
            } else {
                this.f11314b[i8] = lowerCase;
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = str3.toLowerCase(locale2);
            if (this.f11313a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                HashMap hashMap = this.f11313a;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    private static void b(StringBuilder sb, String str, String str2) {
        sb.append("`");
        sb.append("room_table_modification_trigger_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("`");
    }

    private String[] h(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f11315c.containsKey(lowerCase)) {
                hashSet.addAll((Collection) this.f11315c.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    private void j(g1.b bVar, int i8) {
        bVar.v("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i8 + ", 0)");
        String str = this.f11314b[i8];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f11312m) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            b(sb, str, str2);
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append("room_table_modification_log");
            sb.append(" SET ");
            sb.append("invalidated");
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append("table_id");
            sb.append(" = ");
            sb.append(i8);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            bVar.v(sb.toString());
        }
    }

    private void k(g1.b bVar, int i8) {
        String str = this.f11314b[i8];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f11312m) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            b(sb, str, str2);
            bVar.v(sb.toString());
        }
    }

    public void a(c cVar) {
        d dVar;
        String[] h8 = h(cVar.f11331a);
        int[] iArr = new int[h8.length];
        int length = h8.length;
        for (int i8 = 0; i8 < length; i8++) {
            Integer num = (Integer) this.f11313a.get(h8[i8].toLowerCase(Locale.US));
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + h8[i8]);
            }
            iArr[i8] = num.intValue();
        }
        d dVar2 = new d(cVar, iArr, h8);
        synchronized (this.f11322j) {
            dVar = (d) this.f11322j.n(cVar, dVar2);
        }
        if (dVar == null && this.f11320h.b(iArr)) {
            l();
        }
    }

    boolean c() {
        if (!this.f11316d.o()) {
            return false;
        }
        if (!this.f11318f) {
            this.f11316d.i().U();
        }
        if (this.f11318f) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    void d(g1.b bVar) {
        synchronized (this) {
            try {
                if (this.f11318f) {
                    Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                    return;
                }
                bVar.v("PRAGMA temp_store = MEMORY;");
                bVar.v("PRAGMA recursive_triggers='ON';");
                bVar.v("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                m(bVar);
                this.f11319g = bVar.y("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
                this.f11318f = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(String... strArr) {
        synchronized (this.f11322j) {
            try {
                Iterator it = this.f11322j.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!((c) entry.getKey()).a()) {
                        ((d) entry.getValue()).b(strArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f() {
        if (this.f11317e.compareAndSet(false, true)) {
            this.f11316d.j().execute(this.f11324l);
        }
    }

    public void g(c cVar) {
        d dVar;
        synchronized (this.f11322j) {
            dVar = (d) this.f11322j.o(cVar);
        }
        if (dVar == null || !this.f11320h.c(dVar.f11332a)) {
            return;
        }
        l();
    }

    void i(Context context, String str) {
        this.f11323k = new f(context, str, this, this.f11316d.j());
    }

    void l() {
        if (this.f11316d.o()) {
            m(this.f11316d.i().U());
        }
    }

    void m(g1.b bVar) {
        if (bVar.k0()) {
            return;
        }
        while (true) {
            try {
                Lock h8 = this.f11316d.h();
                h8.lock();
                try {
                    int[] a8 = this.f11320h.a();
                    if (a8 == null) {
                        return;
                    }
                    int length = a8.length;
                    bVar.n();
                    for (int i8 = 0; i8 < length; i8++) {
                        try {
                            int i9 = a8[i8];
                            if (i9 == 1) {
                                j(bVar, i8);
                            } else if (i9 == 2) {
                                k(bVar, i8);
                            }
                        } finally {
                        }
                    }
                    bVar.P();
                    bVar.Y();
                    this.f11320h.d();
                } finally {
                    h8.unlock();
                }
            } catch (SQLiteException | IllegalStateException e8) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e8);
                return;
            }
        }
    }
}
