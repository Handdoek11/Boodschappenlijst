package m7;

import x6.C6916E;
import x6.C6934p;
import y6.C6979g;

/* renamed from: m7.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6230d {

    /* renamed from: a, reason: collision with root package name */
    public static final C6230d f39449a = new C6230d();

    /* renamed from: b, reason: collision with root package name */
    private static final C6979g f39450b = new C6979g();

    /* renamed from: c, reason: collision with root package name */
    private static int f39451c;

    /* renamed from: d, reason: collision with root package name */
    private static final int f39452d;

    static {
        Object b8;
        try {
            C6934p.a aVar = C6934p.f44487s;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            J6.r.d(property, "getProperty(\"kotlinx.ser…lization.json.pool.size\")");
            b8 = C6934p.b(S6.h.k(property));
        } catch (Throwable th) {
            C6934p.a aVar2 = C6934p.f44487s;
            b8 = C6934p.b(x6.q.a(th));
        }
        if (C6934p.g(b8)) {
            b8 = null;
        }
        Integer num = (Integer) b8;
        f39452d = num != null ? num.intValue() : 1048576;
    }

    private C6230d() {
    }

    public final void a(char[] cArr) {
        J6.r.e(cArr, "array");
        synchronized (this) {
            try {
                int i8 = f39451c;
                if (cArr.length + i8 < f39452d) {
                    f39451c = i8 + cArr.length;
                    f39450b.addLast(cArr);
                }
                C6916E c6916e = C6916E.f44463a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final char[] b() {
        char[] cArr;
        synchronized (this) {
            cArr = (char[]) f39450b.t();
            if (cArr != null) {
                f39451c -= cArr.length;
            } else {
                cArr = null;
            }
        }
        return cArr == null ? new char[128] : cArr;
    }
}
