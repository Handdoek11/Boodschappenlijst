package q;

import J6.r;
import java.util.LinkedHashMap;
import java.util.Map;
import x6.C6916E;

/* renamed from: q.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6406j {

    /* renamed from: a, reason: collision with root package name */
    private int f40878a;

    /* renamed from: b, reason: collision with root package name */
    private final r.c f40879b;

    /* renamed from: c, reason: collision with root package name */
    private final r.b f40880c;

    /* renamed from: d, reason: collision with root package name */
    private int f40881d;

    /* renamed from: e, reason: collision with root package name */
    private int f40882e;

    /* renamed from: f, reason: collision with root package name */
    private int f40883f;

    /* renamed from: g, reason: collision with root package name */
    private int f40884g;

    /* renamed from: h, reason: collision with root package name */
    private int f40885h;

    /* renamed from: i, reason: collision with root package name */
    private int f40886i;

    public C6406j(int i8) {
        this.f40878a = i8;
        if (i8 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f40879b = new r.c(0, 0.75f);
        this.f40880c = new r.b();
    }

    private final int f(Object obj, Object obj2) {
        int g8 = g(obj, obj2);
        if (g8 >= 0) {
            return g8;
        }
        throw new IllegalStateException(("Negative size: " + obj + '=' + obj2).toString());
    }

    protected Object a(Object obj) {
        r.e(obj, "key");
        return null;
    }

    protected void b(boolean z7, Object obj, Object obj2, Object obj3) {
        r.e(obj, "key");
        r.e(obj2, "oldValue");
    }

    public final Object c(Object obj) {
        Object d8;
        r.e(obj, "key");
        synchronized (this.f40880c) {
            Object a8 = this.f40879b.a(obj);
            if (a8 != null) {
                this.f40885h++;
                return a8;
            }
            this.f40886i++;
            Object a9 = a(obj);
            if (a9 == null) {
                return null;
            }
            synchronized (this.f40880c) {
                try {
                    this.f40883f++;
                    d8 = this.f40879b.d(obj, a9);
                    if (d8 != null) {
                        this.f40879b.d(obj, d8);
                    } else {
                        this.f40881d += f(obj, a9);
                        C6916E c6916e = C6916E.f44463a;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (d8 != null) {
                b(false, obj, a9, d8);
                return d8;
            }
            i(this.f40878a);
            return a9;
        }
    }

    public final Object d(Object obj, Object obj2) {
        Object d8;
        r.e(obj, "key");
        r.e(obj2, "value");
        synchronized (this.f40880c) {
            try {
                this.f40882e++;
                this.f40881d += f(obj, obj2);
                d8 = this.f40879b.d(obj, obj2);
                if (d8 != null) {
                    this.f40881d -= f(obj, d8);
                }
                C6916E c6916e = C6916E.f44463a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (d8 != null) {
            b(false, obj, d8, obj2);
        }
        i(this.f40878a);
        return d8;
    }

    public final Object e(Object obj) {
        Object e8;
        r.e(obj, "key");
        synchronized (this.f40880c) {
            try {
                e8 = this.f40879b.e(obj);
                if (e8 != null) {
                    this.f40881d -= f(obj, e8);
                }
                C6916E c6916e = C6916E.f44463a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (e8 != null) {
            b(false, obj, e8, null);
        }
        return e8;
    }

    protected int g(Object obj, Object obj2) {
        r.e(obj, "key");
        r.e(obj2, "value");
        return 1;
    }

    public final Map h() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (this.f40880c) {
            try {
                for (Map.Entry entry : this.f40879b.b()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                C6916E c6916e = C6916E.f44463a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i(int r6) {
        /*
            r5 = this;
        L0:
            r.b r0 = r5.f40880c
            monitor-enter(r0)
            int r1 = r5.f40881d     // Catch: java.lang.Throwable -> L14
            if (r1 < 0) goto L57
            r.c r1 = r5.f40879b     // Catch: java.lang.Throwable -> L14
            boolean r1 = r1.c()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            int r1 = r5.f40881d     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L57
            goto L16
        L14:
            r6 = move-exception
            goto L5f
        L16:
            int r1 = r5.f40881d     // Catch: java.lang.Throwable -> L14
            if (r1 <= r6) goto L55
            r.c r1 = r5.f40879b     // Catch: java.lang.Throwable -> L14
            boolean r1 = r1.c()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L23
            goto L55
        L23:
            r.c r1 = r5.f40879b     // Catch: java.lang.Throwable -> L14
            java.util.Set r1 = r1.b()     // Catch: java.lang.Throwable -> L14
            java.lang.Object r1 = y6.AbstractC6987o.C(r1)     // Catch: java.lang.Throwable -> L14
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L33
            monitor-exit(r0)
            return
        L33:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L14
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L14
            r.c r3 = r5.f40879b     // Catch: java.lang.Throwable -> L14
            r3.e(r2)     // Catch: java.lang.Throwable -> L14
            int r3 = r5.f40881d     // Catch: java.lang.Throwable -> L14
            int r4 = r5.f(r2, r1)     // Catch: java.lang.Throwable -> L14
            int r3 = r3 - r4
            r5.f40881d = r3     // Catch: java.lang.Throwable -> L14
            int r3 = r5.f40884g     // Catch: java.lang.Throwable -> L14
            r4 = 1
            int r3 = r3 + r4
            r5.f40884g = r3     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)
            r0 = 0
            r5.b(r4, r2, r1, r0)
            goto L0
        L55:
            monitor-exit(r0)
            return
        L57:
            java.lang.String r6 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L14
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L14
            throw r1     // Catch: java.lang.Throwable -> L14
        L5f:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: q.C6406j.i(int):void");
    }

    public String toString() {
        String str;
        synchronized (this.f40880c) {
            try {
                int i8 = this.f40885h;
                int i9 = this.f40886i + i8;
                str = "LruCache[maxSize=" + this.f40878a + ",hits=" + this.f40885h + ",misses=" + this.f40886i + ",hitRate=" + (i9 != 0 ? (i8 * 100) / i9 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
