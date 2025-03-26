package Z5;

import J6.AbstractC0650j;
import J6.r;
import J6.v;
import Z5.g;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes2.dex */
public abstract class d implements g {

    /* renamed from: w, reason: collision with root package name */
    public static final b f6437w = new b(null);

    /* renamed from: x, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f6438x;

    /* renamed from: o, reason: collision with root package name */
    private final int f6439o;

    /* renamed from: s, reason: collision with root package name */
    private final int f6440s;

    /* renamed from: t, reason: collision with root package name */
    private final int f6441t;
    private volatile long top;

    /* renamed from: u, reason: collision with root package name */
    private final AtomicReferenceArray f6442u;

    /* renamed from: v, reason: collision with root package name */
    private final int[] f6443v;

    public static final class b {
        public /* synthetic */ b(AbstractC0650j abstractC0650j) {
            this();
        }

        private b() {
        }
    }

    static {
        AtomicLongFieldUpdater newUpdater = AtomicLongFieldUpdater.newUpdater(d.class, new v() { // from class: Z5.d.a
            @Override // J6.v, Q6.h
            public Object get(Object obj) {
                return Long.valueOf(((d) obj).top);
            }
        }.getName());
        r.d(newUpdater, "newUpdater(Owner::class.java, p.name)");
        f6438x = newUpdater;
    }

    public d(int i8) {
        this.f6439o = i8;
        if (i8 <= 0) {
            throw new IllegalArgumentException(("capacity should be positive but it is " + i8).toString());
        }
        if (i8 > 536870911) {
            throw new IllegalArgumentException(("capacity should be less or equal to 536870911 but it is " + i8).toString());
        }
        int highestOneBit = Integer.highestOneBit((i8 * 4) - 1) * 2;
        this.f6440s = highestOneBit;
        this.f6441t = Integer.numberOfLeadingZeros(highestOneBit) + 1;
        this.f6442u = new AtomicReferenceArray(highestOneBit + 1);
        this.f6443v = new int[highestOneBit + 1];
    }

    private final int g() {
        long j8;
        long j9;
        int i8;
        do {
            j8 = this.top;
            if (j8 == 0) {
                return 0;
            }
            j9 = ((j8 >> 32) & 4294967295L) + 1;
            i8 = (int) (4294967295L & j8);
            if (i8 == 0) {
                return 0;
            }
        } while (!f6438x.compareAndSet(this, j8, (j9 << 32) | this.f6443v[i8]));
        return i8;
    }

    private final void i(int i8) {
        long j8;
        if (i8 <= 0) {
            throw new IllegalArgumentException("index should be positive");
        }
        do {
            j8 = this.top;
            this.f6443v[i8] = (int) (4294967295L & j8);
        } while (!f6438x.compareAndSet(this, j8, ((((j8 >> 32) & 4294967295L) + 1) << 32) | i8));
    }

    private final Object j() {
        int g8 = g();
        if (g8 == 0) {
            return null;
        }
        return this.f6442u.getAndSet(g8, null);
    }

    private final boolean k(Object obj) {
        int identityHashCode = ((System.identityHashCode(obj) * (-1640531527)) >>> this.f6441t) + 1;
        for (int i8 = 0; i8 < 8; i8++) {
            if (c.a(this.f6442u, identityHashCode, null, obj)) {
                i(identityHashCode);
                return true;
            }
            identityHashCode--;
            if (identityHashCode == 0) {
                identityHashCode = this.f6440s;
            }
        }
        return false;
    }

    @Override // Z5.g
    public final Object C() {
        Object e8;
        Object j8 = j();
        return (j8 == null || (e8 = e(j8)) == null) ? h() : e8;
    }

    @Override // Z5.g
    public final void c() {
        while (true) {
            Object j8 = j();
            if (j8 == null) {
                return;
            } else {
                f(j8);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        g.a.a(this);
    }

    protected Object e(Object obj) {
        r.e(obj, "instance");
        return obj;
    }

    protected void f(Object obj) {
        r.e(obj, "instance");
    }

    protected abstract Object h();

    protected void l(Object obj) {
        r.e(obj, "instance");
    }

    @Override // Z5.g
    public final void o0(Object obj) {
        r.e(obj, "instance");
        l(obj);
        if (k(obj)) {
            return;
        }
        f(obj);
    }
}
