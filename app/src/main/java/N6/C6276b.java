package n6;

import i6.InterfaceC5879d;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import r6.AbstractC6717i;

/* renamed from: n6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6276b implements InterfaceC5879d {

    /* renamed from: s, reason: collision with root package name */
    int f39785s;

    /* renamed from: t, reason: collision with root package name */
    long f39786t;

    /* renamed from: u, reason: collision with root package name */
    final int f39787u;

    /* renamed from: v, reason: collision with root package name */
    AtomicReferenceArray f39788v;

    /* renamed from: w, reason: collision with root package name */
    final int f39789w;

    /* renamed from: x, reason: collision with root package name */
    AtomicReferenceArray f39790x;

    /* renamed from: z, reason: collision with root package name */
    static final int f39783z = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: A, reason: collision with root package name */
    private static final Object f39782A = new Object();

    /* renamed from: o, reason: collision with root package name */
    final AtomicLong f39784o = new AtomicLong();

    /* renamed from: y, reason: collision with root package name */
    final AtomicLong f39791y = new AtomicLong();

    public C6276b(int i8) {
        int a8 = AbstractC6717i.a(Math.max(8, i8));
        int i9 = a8 - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(a8 + 1);
        this.f39788v = atomicReferenceArray;
        this.f39787u = i9;
        a(a8);
        this.f39790x = atomicReferenceArray;
        this.f39789w = i9;
        this.f39786t = a8 - 2;
        r(0L);
    }

    private void a(int i8) {
        this.f39785s = Math.min(i8 / 4, f39783z);
    }

    private static int c(long j8, int i8) {
        return b(((int) j8) & i8);
    }

    private long d() {
        return this.f39791y.get();
    }

    private long e() {
        return this.f39784o.get();
    }

    private long h() {
        return this.f39791y.get();
    }

    private static Object j(AtomicReferenceArray atomicReferenceArray, int i8) {
        return atomicReferenceArray.get(i8);
    }

    private AtomicReferenceArray k(AtomicReferenceArray atomicReferenceArray, int i8) {
        int b8 = b(i8);
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) j(atomicReferenceArray, b8);
        p(atomicReferenceArray, b8, null);
        return atomicReferenceArray2;
    }

    private long l() {
        return this.f39784o.get();
    }

    private Object m(AtomicReferenceArray atomicReferenceArray, long j8, int i8) {
        this.f39790x = atomicReferenceArray;
        int c8 = c(j8, i8);
        Object j9 = j(atomicReferenceArray, c8);
        if (j9 != null) {
            p(atomicReferenceArray, c8, null);
            o(j8 + 1);
        }
        return j9;
    }

    private void n(AtomicReferenceArray atomicReferenceArray, long j8, int i8, Object obj, long j9) {
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.f39788v = atomicReferenceArray2;
        this.f39786t = (j9 + j8) - 1;
        p(atomicReferenceArray2, i8, obj);
        q(atomicReferenceArray, atomicReferenceArray2);
        p(atomicReferenceArray, i8, f39782A);
        r(j8 + 1);
    }

    private void o(long j8) {
        this.f39791y.lazySet(j8);
    }

    private static void p(AtomicReferenceArray atomicReferenceArray, int i8, Object obj) {
        atomicReferenceArray.lazySet(i8, obj);
    }

    private void q(AtomicReferenceArray atomicReferenceArray, AtomicReferenceArray atomicReferenceArray2) {
        p(atomicReferenceArray, b(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    private void r(long j8) {
        this.f39784o.lazySet(j8);
    }

    private boolean s(AtomicReferenceArray atomicReferenceArray, Object obj, long j8, int i8) {
        p(atomicReferenceArray, i8, obj);
        r(j8 + 1);
        return true;
    }

    @Override // i6.InterfaceC5880e
    public void clear() {
        while (true) {
            if (f() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // i6.InterfaceC5879d, i6.InterfaceC5880e
    public Object f() {
        AtomicReferenceArray atomicReferenceArray = this.f39790x;
        long d8 = d();
        int i8 = this.f39789w;
        int c8 = c(d8, i8);
        Object j8 = j(atomicReferenceArray, c8);
        boolean z7 = j8 == f39782A;
        if (j8 == null || z7) {
            if (z7) {
                return m(k(atomicReferenceArray, i8 + 1), d8, i8);
            }
            return null;
        }
        p(atomicReferenceArray, c8, null);
        o(d8 + 1);
        return j8;
    }

    @Override // i6.InterfaceC5880e
    public boolean g(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray atomicReferenceArray = this.f39788v;
        long e8 = e();
        int i8 = this.f39787u;
        int c8 = c(e8, i8);
        if (e8 < this.f39786t) {
            return s(atomicReferenceArray, obj, e8, c8);
        }
        long j8 = this.f39785s + e8;
        if (j(atomicReferenceArray, c(j8, i8)) == null) {
            this.f39786t = j8 - 1;
            return s(atomicReferenceArray, obj, e8, c8);
        }
        if (j(atomicReferenceArray, c(1 + e8, i8)) == null) {
            return s(atomicReferenceArray, obj, e8, c8);
        }
        n(atomicReferenceArray, e8, c8, obj, i8);
        return true;
    }

    @Override // i6.InterfaceC5880e
    public boolean isEmpty() {
        return l() == h();
    }

    private static int b(int i8) {
        return i8;
    }
}
