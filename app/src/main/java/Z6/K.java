package Z6;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public class K {

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f6461b = AtomicIntegerFieldUpdater.newUpdater(K.class, "_size");
    private volatile int _size;

    /* renamed from: a, reason: collision with root package name */
    private L[] f6462a;

    private final L[] f() {
        L[] lArr = this.f6462a;
        if (lArr == null) {
            L[] lArr2 = new L[4];
            this.f6462a = lArr2;
            return lArr2;
        }
        if (c() < lArr.length) {
            return lArr;
        }
        Object[] copyOf = Arrays.copyOf(lArr, c() * 2);
        J6.r.d(copyOf, "copyOf(this, newSize)");
        L[] lArr3 = (L[]) copyOf;
        this.f6462a = lArr3;
        return lArr3;
    }

    private final void j(int i8) {
        f6461b.set(this, i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void k(int r6) {
        /*
            r5 = this;
        L0:
            int r0 = r6 * 2
            int r1 = r0 + 1
            int r2 = r5.c()
            if (r1 < r2) goto Lb
            return
        Lb:
            Z6.L[] r2 = r5.f6462a
            J6.r.b(r2)
            int r0 = r0 + 2
            int r3 = r5.c()
            if (r0 >= r3) goto L2b
            r3 = r2[r0]
            J6.r.b(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r2[r1]
            J6.r.b(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L2b
            goto L2c
        L2b:
            r0 = r1
        L2c:
            r1 = r2[r6]
            J6.r.b(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            r2 = r2[r0]
            J6.r.b(r2)
            int r1 = r1.compareTo(r2)
            if (r1 > 0) goto L3f
            return
        L3f:
            r5.m(r6, r0)
            r6 = r0
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: Z6.K.k(int):void");
    }

    private final void l(int i8) {
        while (i8 > 0) {
            L[] lArr = this.f6462a;
            J6.r.b(lArr);
            int i9 = (i8 - 1) / 2;
            L l8 = lArr[i9];
            J6.r.b(l8);
            L l9 = lArr[i8];
            J6.r.b(l9);
            if (((Comparable) l8).compareTo(l9) <= 0) {
                return;
            }
            m(i8, i9);
            i8 = i9;
        }
    }

    private final void m(int i8, int i9) {
        L[] lArr = this.f6462a;
        J6.r.b(lArr);
        L l8 = lArr[i9];
        J6.r.b(l8);
        L l9 = lArr[i8];
        J6.r.b(l9);
        lArr[i8] = l8;
        lArr[i9] = l9;
        l8.h(i8);
        l9.h(i9);
    }

    public final void a(L l8) {
        l8.a(this);
        L[] f8 = f();
        int c8 = c();
        j(c8 + 1);
        f8[c8] = l8;
        l8.h(c8);
        l(c8);
    }

    public final L b() {
        L[] lArr = this.f6462a;
        if (lArr != null) {
            return lArr[0];
        }
        return null;
    }

    public final int c() {
        return f6461b.get(this);
    }

    public final boolean d() {
        return c() == 0;
    }

    public final L e() {
        L b8;
        synchronized (this) {
            b8 = b();
        }
        return b8;
    }

    public final boolean g(L l8) {
        boolean z7;
        synchronized (this) {
            if (l8.g() == null) {
                z7 = false;
            } else {
                h(l8.i());
                z7 = true;
            }
        }
        return z7;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final Z6.L h(int r6) {
        /*
            r5 = this;
            Z6.L[] r0 = r5.f6462a
            J6.r.b(r0)
            int r1 = r5.c()
            r2 = -1
            int r1 = r1 + r2
            r5.j(r1)
            int r1 = r5.c()
            if (r6 >= r1) goto L3d
            int r1 = r5.c()
            r5.m(r6, r1)
            int r1 = r6 + (-1)
            int r1 = r1 / 2
            if (r6 <= 0) goto L3a
            r3 = r0[r6]
            J6.r.b(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r0[r1]
            J6.r.b(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L3a
            r5.m(r6, r1)
            r5.l(r1)
            goto L3d
        L3a:
            r5.k(r6)
        L3d:
            int r6 = r5.c()
            r6 = r0[r6]
            J6.r.b(r6)
            r1 = 0
            r6.a(r1)
            r6.h(r2)
            int r2 = r5.c()
            r0[r2] = r1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Z6.K.h(int):Z6.L");
    }

    public final L i() {
        L h8;
        synchronized (this) {
            h8 = c() > 0 ? h(0) : null;
        }
        return h8;
    }
}
