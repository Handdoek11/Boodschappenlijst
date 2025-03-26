package Z6;

import J6.AbstractC0650j;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: e, reason: collision with root package name */
    public static final a f6497e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f6498f = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "_next");

    /* renamed from: g, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f6499g = AtomicLongFieldUpdater.newUpdater(r.class, "_state");

    /* renamed from: h, reason: collision with root package name */
    public static final E f6500h = new E("REMOVE_FROZEN");
    private volatile Object _next;
    private volatile long _state;

    /* renamed from: a, reason: collision with root package name */
    private final int f6501a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f6502b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6503c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReferenceArray f6504d;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        public final int a(long j8) {
            return (j8 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long b(long j8, int i8) {
            return d(j8, 1073741823L) | i8;
        }

        public final long c(long j8, int i8) {
            return d(j8, 1152921503533105152L) | (i8 << 30);
        }

        public final long d(long j8, long j9) {
            return j8 & (~j9);
        }

        private a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f6505a;

        public b(int i8) {
            this.f6505a = i8;
        }
    }

    public r(int i8, boolean z7) {
        this.f6501a = i8;
        this.f6502b = z7;
        int i9 = i8 - 1;
        this.f6503c = i9;
        this.f6504d = new AtomicReferenceArray(i8);
        if (i9 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i8 & i9) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    private final r b(long j8) {
        r rVar = new r(this.f6501a * 2, this.f6502b);
        int i8 = (int) (1073741823 & j8);
        int i9 = (int) ((1152921503533105152L & j8) >> 30);
        while (true) {
            int i10 = this.f6503c;
            if ((i8 & i10) == (i9 & i10)) {
                f6499g.set(rVar, f6497e.d(j8, 1152921504606846976L));
                return rVar;
            }
            Object obj = this.f6504d.get(i10 & i8);
            if (obj == null) {
                obj = new b(i8);
            }
            rVar.f6504d.set(rVar.f6503c & i8, obj);
            i8++;
        }
    }

    private final r c(long j8) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6498f;
        while (true) {
            r rVar = (r) atomicReferenceFieldUpdater.get(this);
            if (rVar != null) {
                return rVar;
            }
            androidx.concurrent.futures.b.a(f6498f, this, null, b(j8));
        }
    }

    private final r e(int i8, Object obj) {
        Object obj2 = this.f6504d.get(this.f6503c & i8);
        if (!(obj2 instanceof b) || ((b) obj2).f6505a != i8) {
            return null;
        }
        this.f6504d.set(i8 & this.f6503c, obj);
        return this;
    }

    private final long h() {
        long j8;
        long j9;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f6499g;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            if ((j8 & 1152921504606846976L) != 0) {
                return j8;
            }
            j9 = j8 | 1152921504606846976L;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j8, j9));
        return j9;
    }

    private final r k(int i8, int i9) {
        long j8;
        int i10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f6499g;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            i10 = (int) (1073741823 & j8);
            if ((1152921504606846976L & j8) != 0) {
                return i();
            }
        } while (!f6499g.compareAndSet(this, j8, f6497e.b(j8, i9)));
        this.f6504d.set(this.f6503c & i10, null);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Object r13) {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = Z6.r.f6499g
        L2:
            long r3 = r0.get(r12)
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r3
            r7 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L16
            Z6.r$a r13 = Z6.r.f6497e
            int r13 = r13.a(r3)
            return r13
        L16:
            r1 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r1 = r1 & r3
            int r1 = (int) r1
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r2 = 30
            long r5 = r5 >> r2
            int r9 = (int) r5
            int r10 = r12.f6503c
            int r2 = r9 + 2
            r2 = r2 & r10
            r5 = r1 & r10
            r6 = 1
            if (r2 != r5) goto L30
            return r6
        L30:
            boolean r2 = r12.f6502b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r2 != 0) goto L4f
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r12.f6504d
            r11 = r9 & r10
            java.lang.Object r2 = r2.get(r11)
            if (r2 == 0) goto L4f
            int r2 = r12.f6501a
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L4e
            int r9 = r9 - r1
            r1 = r9 & r5
            int r2 = r2 >> 1
            if (r1 <= r2) goto L2
        L4e:
            return r6
        L4f:
            int r1 = r9 + 1
            r1 = r1 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = Z6.r.f6499g
            Z6.r$a r5 = Z6.r.f6497e
            long r5 = r5.c(r3, r1)
            r1 = r2
            r2 = r12
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L2
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r12.f6504d
            r1 = r9 & r10
            r0.set(r1, r13)
            r0 = r12
        L6a:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = Z6.r.f6499g
            long r1 = r1.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L81
            Z6.r r0 = r0.i()
            Z6.r r0 = r0.e(r9, r13)
            if (r0 != 0) goto L6a
        L81:
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: Z6.r.a(java.lang.Object):int");
    }

    public final boolean d() {
        long j8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f6499g;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            if ((j8 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j8) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j8, j8 | 2305843009213693952L));
        return true;
    }

    public final int f() {
        long j8 = f6499g.get(this);
        return (((int) ((j8 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j8))) & 1073741823;
    }

    public final boolean g() {
        long j8 = f6499g.get(this);
        return ((int) (1073741823 & j8)) == ((int) ((j8 & 1152921503533105152L) >> 30));
    }

    public final r i() {
        return c(h());
    }

    public final Object j() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f6499g;
        while (true) {
            long j8 = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j8) != 0) {
                return f6500h;
            }
            int i8 = (int) (1073741823 & j8);
            int i9 = this.f6503c;
            if ((((int) ((1152921503533105152L & j8) >> 30)) & i9) == (i8 & i9)) {
                return null;
            }
            Object obj = this.f6504d.get(i9 & i8);
            if (obj == null) {
                if (this.f6502b) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i10 = (i8 + 1) & 1073741823;
                if (f6499g.compareAndSet(this, j8, f6497e.b(j8, i10))) {
                    this.f6504d.set(this.f6503c & i8, null);
                    return obj;
                }
                if (this.f6502b) {
                    r rVar = this;
                    do {
                        rVar = rVar.k(i8, i10);
                    } while (rVar != null);
                    return obj;
                }
            }
        }
    }
}
