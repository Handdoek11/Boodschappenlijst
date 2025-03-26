package n6;

import i6.InterfaceC5879d;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import r6.AbstractC6717i;

/* renamed from: n6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6275a extends AtomicReferenceArray implements InterfaceC5879d {

    /* renamed from: w, reason: collision with root package name */
    private static final Integer f39776w = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* renamed from: o, reason: collision with root package name */
    final int f39777o;

    /* renamed from: s, reason: collision with root package name */
    final AtomicLong f39778s;

    /* renamed from: t, reason: collision with root package name */
    long f39779t;

    /* renamed from: u, reason: collision with root package name */
    final AtomicLong f39780u;

    /* renamed from: v, reason: collision with root package name */
    final int f39781v;

    public C6275a(int i8) {
        super(AbstractC6717i.a(i8));
        this.f39777o = length() - 1;
        this.f39778s = new AtomicLong();
        this.f39780u = new AtomicLong();
        this.f39781v = Math.min(i8 / 4, f39776w.intValue());
    }

    int a(long j8) {
        return ((int) j8) & this.f39777o;
    }

    int b(long j8, int i8) {
        return ((int) j8) & i8;
    }

    Object c(int i8) {
        return get(i8);
    }

    @Override // i6.InterfaceC5880e
    public void clear() {
        while (true) {
            if (f() == null && isEmpty()) {
                return;
            }
        }
    }

    void d(long j8) {
        this.f39780u.lazySet(j8);
    }

    void e(int i8, Object obj) {
        lazySet(i8, obj);
    }

    @Override // i6.InterfaceC5879d, i6.InterfaceC5880e
    public Object f() {
        long j8 = this.f39780u.get();
        int a8 = a(j8);
        Object c8 = c(a8);
        if (c8 == null) {
            return null;
        }
        d(j8 + 1);
        e(a8, null);
        return c8;
    }

    @Override // i6.InterfaceC5880e
    public boolean g(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        int i8 = this.f39777o;
        long j8 = this.f39778s.get();
        int b8 = b(j8, i8);
        if (j8 >= this.f39779t) {
            long j9 = this.f39781v + j8;
            if (c(b(j9, i8)) == null) {
                this.f39779t = j9;
            } else if (c(b8) != null) {
                return false;
            }
        }
        e(b8, obj);
        h(j8 + 1);
        return true;
    }

    void h(long j8) {
        this.f39778s.lazySet(j8);
    }

    @Override // i6.InterfaceC5880e
    public boolean isEmpty() {
        return this.f39778s.get() == this.f39780u.get();
    }
}
