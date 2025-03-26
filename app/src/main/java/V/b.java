package V;

import Z.d;
import java.util.HashMap;
import java.util.LinkedHashSet;
import x6.C6916E;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final d f5490a = Z.c.a();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f5491b;

    /* renamed from: c, reason: collision with root package name */
    private final LinkedHashSet f5492c;

    /* renamed from: d, reason: collision with root package name */
    private int f5493d;

    /* renamed from: e, reason: collision with root package name */
    private int f5494e;

    /* renamed from: f, reason: collision with root package name */
    private int f5495f;

    /* renamed from: g, reason: collision with root package name */
    private int f5496g;

    /* renamed from: h, reason: collision with root package name */
    private int f5497h;

    /* renamed from: i, reason: collision with root package name */
    private int f5498i;

    /* renamed from: j, reason: collision with root package name */
    private int f5499j;

    public b(int i8) {
        if (i8 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f5494e = i8;
        this.f5491b = new HashMap(0, 0.75f);
        this.f5492c = new LinkedHashSet();
    }

    private final int g(Object obj, Object obj2) {
        int i8 = i(obj, obj2);
        if (i8 >= 0) {
            return i8;
        }
        throw new IllegalStateException(("Negative size: " + obj + '=' + obj2).toString());
    }

    protected Object b(Object obj) {
        return null;
    }

    public final Object d(Object obj) {
        synchronized (this.f5490a) {
            Object obj2 = this.f5491b.get(obj);
            if (obj2 != null) {
                this.f5492c.remove(obj);
                this.f5492c.add(obj);
                this.f5498i++;
                return obj2;
            }
            this.f5499j++;
            Object b8 = b(obj);
            if (b8 == null) {
                return null;
            }
            synchronized (this.f5490a) {
                try {
                    this.f5496g++;
                    Object put = this.f5491b.put(obj, b8);
                    this.f5492c.remove(obj);
                    this.f5492c.add(obj);
                    if (put != null) {
                        this.f5491b.put(obj, put);
                        obj2 = put;
                    } else {
                        this.f5493d = h() + g(obj, b8);
                    }
                    C6916E c6916e = C6916E.f44463a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (obj2 != null) {
                c(false, obj, b8, obj2);
                return obj2;
            }
            j(this.f5494e);
            return b8;
        }
    }

    public final Object e(Object obj, Object obj2) {
        Object put;
        if (obj == null || obj2 == null) {
            throw null;
        }
        synchronized (this.f5490a) {
            try {
                this.f5495f++;
                this.f5493d = h() + g(obj, obj2);
                put = this.f5491b.put(obj, obj2);
                if (put != null) {
                    this.f5493d = h() - g(obj, put);
                }
                if (this.f5492c.contains(obj)) {
                    this.f5492c.remove(obj);
                }
                this.f5492c.add(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (put != null) {
            c(false, obj, put, obj2);
        }
        j(this.f5494e);
        return put;
    }

    public final Object f(Object obj) {
        Object remove;
        obj.getClass();
        synchronized (this.f5490a) {
            try {
                remove = this.f5491b.remove(obj);
                this.f5492c.remove(obj);
                if (remove != null) {
                    this.f5493d = h() - g(obj, remove);
                }
                C6916E c6916e = C6916E.f44463a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (remove != null) {
            c(false, obj, remove, null);
        }
        return remove;
    }

    public final int h() {
        int i8;
        synchronized (this.f5490a) {
            i8 = this.f5493d;
        }
        return i8;
    }

    protected int i(Object obj, Object obj2) {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0094, code lost:
    
        throw new java.lang.IllegalStateException("map/keySet size inconsistency");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j(int r8) {
        /*
            r7 = this;
        L0:
            Z.d r0 = r7.f5490a
            monitor-enter(r0)
            int r1 = r7.h()     // Catch: java.lang.Throwable -> L18
            if (r1 < 0) goto L8d
            java.util.HashMap r1 = r7.f5491b     // Catch: java.lang.Throwable -> L18
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L1b
            int r1 = r7.h()     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L8d
            goto L1b
        L18:
            r8 = move-exception
            goto L95
        L1b:
            java.util.HashMap r1 = r7.f5491b     // Catch: java.lang.Throwable -> L18
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L18
            java.util.LinkedHashSet r2 = r7.f5492c     // Catch: java.lang.Throwable -> L18
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r1 != r2) goto L8d
            int r1 = r7.h()     // Catch: java.lang.Throwable -> L18
            r2 = 1
            r3 = 0
            if (r1 <= r8) goto L78
            java.util.HashMap r1 = r7.f5491b     // Catch: java.lang.Throwable -> L18
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L78
            java.util.LinkedHashSet r1 = r7.f5492c     // Catch: java.lang.Throwable -> L18
            java.lang.Object r1 = y6.AbstractC6987o.A(r1)     // Catch: java.lang.Throwable -> L18
            java.util.HashMap r4 = r7.f5491b     // Catch: java.lang.Throwable -> L18
            java.lang.Object r4 = r4.get(r1)     // Catch: java.lang.Throwable -> L18
            if (r4 == 0) goto L70
            java.util.HashMap r5 = r7.f5491b     // Catch: java.lang.Throwable -> L18
            java.util.Map r5 = J6.L.c(r5)     // Catch: java.lang.Throwable -> L18
            r5.remove(r1)     // Catch: java.lang.Throwable -> L18
            java.util.LinkedHashSet r5 = r7.f5492c     // Catch: java.lang.Throwable -> L18
            java.util.Collection r5 = J6.L.a(r5)     // Catch: java.lang.Throwable -> L18
            r5.remove(r1)     // Catch: java.lang.Throwable -> L18
            int r5 = r7.h()     // Catch: java.lang.Throwable -> L18
            J6.r.b(r1)     // Catch: java.lang.Throwable -> L18
            J6.r.b(r4)     // Catch: java.lang.Throwable -> L18
            int r6 = r7.g(r1, r4)     // Catch: java.lang.Throwable -> L18
            int r5 = r5 - r6
            r7.f5493d = r5     // Catch: java.lang.Throwable -> L18
            int r5 = r7.f5497h     // Catch: java.lang.Throwable -> L18
            int r5 = r5 + r2
            r7.f5497h = r5     // Catch: java.lang.Throwable -> L18
            goto L7a
        L70:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = "inconsistent state"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L18
            throw r8     // Catch: java.lang.Throwable -> L18
        L78:
            r1 = r3
            r4 = r1
        L7a:
            x6.E r5 = x6.C6916E.f44463a     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)
            if (r1 != 0) goto L82
            if (r4 != 0) goto L82
            return
        L82:
            J6.r.b(r1)
            J6.r.b(r4)
            r7.c(r2, r1, r4, r3)
            goto L0
        L8d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = "map/keySet size inconsistency"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L18
            throw r8     // Catch: java.lang.Throwable -> L18
        L95:
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: V.b.j(int):void");
    }

    public String toString() {
        String str;
        synchronized (this.f5490a) {
            try {
                int i8 = this.f5498i;
                int i9 = this.f5499j + i8;
                str = "LruCache[maxSize=" + this.f5494e + ",hits=" + this.f5498i + ",misses=" + this.f5499j + ",hitRate=" + (i9 != 0 ? (i8 * 100) / i9 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    protected void c(boolean z7, Object obj, Object obj2, Object obj3) {
    }
}
