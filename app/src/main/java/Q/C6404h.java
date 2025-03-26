package q;

import J6.AbstractC0650j;
import J6.r;
import java.util.Arrays;
import r.AbstractC6640a;
import y6.AbstractC6980h;

/* renamed from: q.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6404h implements Cloneable {

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ boolean f40873o;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ long[] f40874s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object[] f40875t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ int f40876u;

    public C6404h() {
        this(0, 1, null);
    }

    public void b(long j8, Object obj) {
        int i8 = this.f40876u;
        if (i8 != 0 && j8 <= this.f40874s[i8 - 1]) {
            m(j8, obj);
            return;
        }
        if (this.f40873o) {
            long[] jArr = this.f40874s;
            if (i8 >= jArr.length) {
                Object[] objArr = this.f40875t;
                int i9 = 0;
                for (int i10 = 0; i10 < i8; i10++) {
                    Object obj2 = objArr[i10];
                    if (obj2 != AbstractC6405i.f40877a) {
                        if (i10 != i9) {
                            jArr[i9] = jArr[i10];
                            objArr[i9] = obj2;
                            objArr[i10] = null;
                        }
                        i9++;
                    }
                }
                this.f40873o = false;
                this.f40876u = i9;
            }
        }
        int i11 = this.f40876u;
        if (i11 >= this.f40874s.length) {
            int f8 = AbstractC6640a.f(i11 + 1);
            long[] copyOf = Arrays.copyOf(this.f40874s, f8);
            r.d(copyOf, "copyOf(this, newSize)");
            this.f40874s = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f40875t, f8);
            r.d(copyOf2, "copyOf(this, newSize)");
            this.f40875t = copyOf2;
        }
        this.f40874s[i11] = j8;
        this.f40875t[i11] = obj;
        this.f40876u = i11 + 1;
    }

    public void c() {
        int i8 = this.f40876u;
        Object[] objArr = this.f40875t;
        for (int i9 = 0; i9 < i8; i9++) {
            objArr[i9] = null;
        }
        this.f40876u = 0;
        this.f40873o = false;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C6404h clone() {
        Object clone = super.clone();
        r.c(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C6404h c6404h = (C6404h) clone;
        c6404h.f40874s = (long[]) this.f40874s.clone();
        c6404h.f40875t = (Object[]) this.f40875t.clone();
        return c6404h;
    }

    public Object h(long j8) {
        int b8 = AbstractC6640a.b(this.f40874s, this.f40876u, j8);
        if (b8 < 0 || this.f40875t[b8] == AbstractC6405i.f40877a) {
            return null;
        }
        return this.f40875t[b8];
    }

    public Object i(long j8, Object obj) {
        int b8 = AbstractC6640a.b(this.f40874s, this.f40876u, j8);
        return (b8 < 0 || this.f40875t[b8] == AbstractC6405i.f40877a) ? obj : this.f40875t[b8];
    }

    public int k(long j8) {
        if (this.f40873o) {
            int i8 = this.f40876u;
            long[] jArr = this.f40874s;
            Object[] objArr = this.f40875t;
            int i9 = 0;
            for (int i10 = 0; i10 < i8; i10++) {
                Object obj = objArr[i10];
                if (obj != AbstractC6405i.f40877a) {
                    if (i10 != i9) {
                        jArr[i9] = jArr[i10];
                        objArr[i9] = obj;
                        objArr[i10] = null;
                    }
                    i9++;
                }
            }
            this.f40873o = false;
            this.f40876u = i9;
        }
        return AbstractC6640a.b(this.f40874s, this.f40876u, j8);
    }

    public long l(int i8) {
        int i9;
        if (i8 < 0 || i8 >= (i9 = this.f40876u)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i8).toString());
        }
        if (this.f40873o) {
            long[] jArr = this.f40874s;
            Object[] objArr = this.f40875t;
            int i10 = 0;
            for (int i11 = 0; i11 < i9; i11++) {
                Object obj = objArr[i11];
                if (obj != AbstractC6405i.f40877a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.f40873o = false;
            this.f40876u = i10;
        }
        return this.f40874s[i8];
    }

    public void m(long j8, Object obj) {
        int b8 = AbstractC6640a.b(this.f40874s, this.f40876u, j8);
        if (b8 >= 0) {
            this.f40875t[b8] = obj;
            return;
        }
        int i8 = ~b8;
        if (i8 < this.f40876u && this.f40875t[i8] == AbstractC6405i.f40877a) {
            this.f40874s[i8] = j8;
            this.f40875t[i8] = obj;
            return;
        }
        if (this.f40873o) {
            int i9 = this.f40876u;
            long[] jArr = this.f40874s;
            if (i9 >= jArr.length) {
                Object[] objArr = this.f40875t;
                int i10 = 0;
                for (int i11 = 0; i11 < i9; i11++) {
                    Object obj2 = objArr[i11];
                    if (obj2 != AbstractC6405i.f40877a) {
                        if (i11 != i10) {
                            jArr[i10] = jArr[i11];
                            objArr[i10] = obj2;
                            objArr[i11] = null;
                        }
                        i10++;
                    }
                }
                this.f40873o = false;
                this.f40876u = i10;
                i8 = ~AbstractC6640a.b(this.f40874s, i10, j8);
            }
        }
        int i12 = this.f40876u;
        if (i12 >= this.f40874s.length) {
            int f8 = AbstractC6640a.f(i12 + 1);
            long[] copyOf = Arrays.copyOf(this.f40874s, f8);
            r.d(copyOf, "copyOf(this, newSize)");
            this.f40874s = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f40875t, f8);
            r.d(copyOf2, "copyOf(this, newSize)");
            this.f40875t = copyOf2;
        }
        int i13 = this.f40876u;
        if (i13 - i8 != 0) {
            long[] jArr2 = this.f40874s;
            int i14 = i8 + 1;
            AbstractC6980h.f(jArr2, jArr2, i14, i8, i13);
            Object[] objArr2 = this.f40875t;
            AbstractC6980h.g(objArr2, objArr2, i14, i8, this.f40876u);
        }
        this.f40874s[i8] = j8;
        this.f40875t[i8] = obj;
        this.f40876u++;
    }

    public void p(long j8) {
        int b8 = AbstractC6640a.b(this.f40874s, this.f40876u, j8);
        if (b8 < 0 || this.f40875t[b8] == AbstractC6405i.f40877a) {
            return;
        }
        this.f40875t[b8] = AbstractC6405i.f40877a;
        this.f40873o = true;
    }

    public void q(int i8) {
        if (this.f40875t[i8] != AbstractC6405i.f40877a) {
            this.f40875t[i8] = AbstractC6405i.f40877a;
            this.f40873o = true;
        }
    }

    public int r() {
        if (this.f40873o) {
            int i8 = this.f40876u;
            long[] jArr = this.f40874s;
            Object[] objArr = this.f40875t;
            int i9 = 0;
            for (int i10 = 0; i10 < i8; i10++) {
                Object obj = objArr[i10];
                if (obj != AbstractC6405i.f40877a) {
                    if (i10 != i9) {
                        jArr[i9] = jArr[i10];
                        objArr[i9] = obj;
                        objArr[i10] = null;
                    }
                    i9++;
                }
            }
            this.f40873o = false;
            this.f40876u = i9;
        }
        return this.f40876u;
    }

    public Object s(int i8) {
        int i9;
        if (i8 < 0 || i8 >= (i9 = this.f40876u)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i8).toString());
        }
        if (this.f40873o) {
            long[] jArr = this.f40874s;
            Object[] objArr = this.f40875t;
            int i10 = 0;
            for (int i11 = 0; i11 < i9; i11++) {
                Object obj = objArr[i11];
                if (obj != AbstractC6405i.f40877a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.f40873o = false;
            this.f40876u = i10;
        }
        return this.f40875t[i8];
    }

    public String toString() {
        if (r() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f40876u * 28);
        sb.append('{');
        int i8 = this.f40876u;
        for (int i9 = 0; i9 < i8; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            sb.append(l(i9));
            sb.append('=');
            Object s8 = s(i9);
            if (s8 != sb) {
                sb.append(s8);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        r.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public C6404h(int i8) {
        if (i8 == 0) {
            this.f40874s = AbstractC6640a.f42381b;
            this.f40875t = AbstractC6640a.f42382c;
        } else {
            int f8 = AbstractC6640a.f(i8);
            this.f40874s = new long[f8];
            this.f40875t = new Object[f8];
        }
    }

    public /* synthetic */ C6404h(int i8, int i9, AbstractC0650j abstractC0650j) {
        this((i9 & 1) != 0 ? 10 : i8);
    }
}
