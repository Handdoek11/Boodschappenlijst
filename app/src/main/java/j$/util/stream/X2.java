package j$.util.stream;

import j$.util.Spliterator;
import java.util.Arrays;

/* loaded from: classes3.dex */
abstract class X2 extends AbstractC5927d implements Iterable, j$.lang.a {

    /* renamed from: e, reason: collision with root package name */
    Object f37603e;

    /* renamed from: f, reason: collision with root package name */
    Object[] f37604f;

    public abstract Object c(int i8);

    protected abstract void s(Object obj, int i8, int i9, Object obj2);

    public abstract Spliterator spliterator();

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    protected abstract int t(Object obj);

    protected abstract Object[] w();

    X2(int i8) {
        super(i8);
        this.f37603e = c(1 << this.f37639a);
    }

    X2() {
        this.f37603e = c(16);
    }

    protected final void v(long j8) {
        long t7;
        int i8 = this.f37641c;
        if (i8 == 0) {
            t7 = t(this.f37603e);
        } else {
            t7 = t(this.f37604f[i8]) + this.f37642d[i8];
        }
        if (j8 > t7) {
            if (this.f37604f == null) {
                Object[] w7 = w();
                this.f37604f = w7;
                this.f37642d = new long[8];
                w7[0] = this.f37603e;
            }
            int i9 = this.f37641c + 1;
            while (j8 > t7) {
                Object[] objArr = this.f37604f;
                if (i9 >= objArr.length) {
                    int length = objArr.length * 2;
                    this.f37604f = Arrays.copyOf(objArr, length);
                    this.f37642d = Arrays.copyOf(this.f37642d, length);
                }
                int i10 = this.f37639a;
                if (i9 != 0 && i9 != 1) {
                    i10 = Math.min((i10 + i9) - 1, 30);
                }
                int i11 = 1 << i10;
                this.f37604f[i9] = c(i11);
                long[] jArr = this.f37642d;
                jArr[i9] = jArr[i9 - 1] + t(this.f37604f[r6]);
                t7 += i11;
                i9++;
            }
        }
    }

    protected final int u(long j8) {
        if (this.f37641c == 0) {
            if (j8 < this.f37640b) {
                return 0;
            }
            throw new IndexOutOfBoundsException(Long.toString(j8));
        }
        if (j8 >= count()) {
            throw new IndexOutOfBoundsException(Long.toString(j8));
        }
        for (int i8 = 0; i8 <= this.f37641c; i8++) {
            if (j8 < this.f37642d[i8] + t(this.f37604f[i8])) {
                return i8;
            }
        }
        throw new IndexOutOfBoundsException(Long.toString(j8));
    }

    public void r(int i8, Object obj) {
        long j8 = i8;
        long count = count() + j8;
        if (count > t(obj) || count < j8) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.f37641c == 0) {
            System.arraycopy(this.f37603e, 0, obj, i8, this.f37640b);
            return;
        }
        for (int i9 = 0; i9 < this.f37641c; i9++) {
            Object obj2 = this.f37604f[i9];
            System.arraycopy(obj2, 0, obj, i8, t(obj2));
            i8 += t(this.f37604f[i9]);
        }
        int i10 = this.f37640b;
        if (i10 > 0) {
            System.arraycopy(this.f37603e, 0, obj, i8, i10);
        }
    }

    public Object d() {
        long count = count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object c8 = c((int) count);
        r(0, c8);
        return c8;
    }

    protected final void x() {
        long t7;
        if (this.f37640b == t(this.f37603e)) {
            if (this.f37604f == null) {
                Object[] w7 = w();
                this.f37604f = w7;
                this.f37642d = new long[8];
                w7[0] = this.f37603e;
            }
            int i8 = this.f37641c;
            int i9 = i8 + 1;
            Object[] objArr = this.f37604f;
            if (i9 >= objArr.length || objArr[i9] == null) {
                if (i8 == 0) {
                    t7 = t(this.f37603e);
                } else {
                    t7 = t(objArr[i8]) + this.f37642d[i8];
                }
                v(t7 + 1);
            }
            this.f37640b = 0;
            int i10 = this.f37641c + 1;
            this.f37641c = i10;
            this.f37603e = this.f37604f[i10];
        }
    }

    @Override // j$.util.stream.AbstractC5927d
    public final void clear() {
        Object[] objArr = this.f37604f;
        if (objArr != null) {
            this.f37603e = objArr[0];
            this.f37604f = null;
            this.f37642d = null;
        }
        this.f37640b = 0;
        this.f37641c = 0;
    }

    public void e(Object obj) {
        for (int i8 = 0; i8 < this.f37641c; i8++) {
            Object obj2 = this.f37604f[i8];
            s(obj2, 0, t(obj2), obj);
        }
        s(this.f37603e, 0, this.f37640b, obj);
    }
}
