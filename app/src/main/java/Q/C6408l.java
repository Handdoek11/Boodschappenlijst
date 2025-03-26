package q;

import J6.AbstractC0650j;
import J6.r;
import java.util.Arrays;
import r.AbstractC6640a;
import y6.AbstractC6980h;

/* renamed from: q.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6408l implements Cloneable {

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ boolean f40890o;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ int[] f40891s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object[] f40892t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ int f40893u;

    public C6408l() {
        this(0, 1, null);
    }

    public void b(int i8, Object obj) {
        int i9 = this.f40893u;
        if (i9 != 0 && i8 <= this.f40891s[i9 - 1]) {
            p(i8, obj);
            return;
        }
        if (this.f40890o && i9 >= this.f40891s.length) {
            AbstractC6409m.e(this);
        }
        int i10 = this.f40893u;
        if (i10 >= this.f40891s.length) {
            int e8 = AbstractC6640a.e(i10 + 1);
            int[] copyOf = Arrays.copyOf(this.f40891s, e8);
            r.d(copyOf, "copyOf(this, newSize)");
            this.f40891s = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f40892t, e8);
            r.d(copyOf2, "copyOf(this, newSize)");
            this.f40892t = copyOf2;
        }
        this.f40891s[i10] = i8;
        this.f40892t[i10] = obj;
        this.f40893u = i10 + 1;
    }

    public void c() {
        int i8 = this.f40893u;
        Object[] objArr = this.f40892t;
        for (int i9 = 0; i9 < i8; i9++) {
            objArr[i9] = null;
        }
        this.f40893u = 0;
        this.f40890o = false;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C6408l clone() {
        Object clone = super.clone();
        r.c(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        C6408l c6408l = (C6408l) clone;
        c6408l.f40891s = (int[]) this.f40891s.clone();
        c6408l.f40892t = (Object[]) this.f40892t.clone();
        return c6408l;
    }

    public Object h(int i8) {
        return AbstractC6409m.c(this, i8);
    }

    public Object i(int i8, Object obj) {
        return AbstractC6409m.d(this, i8, obj);
    }

    public int k(int i8) {
        if (this.f40890o) {
            AbstractC6409m.e(this);
        }
        return AbstractC6640a.a(this.f40891s, this.f40893u, i8);
    }

    public int l(Object obj) {
        if (this.f40890o) {
            AbstractC6409m.e(this);
        }
        int i8 = this.f40893u;
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.f40892t[i9] == obj) {
                return i9;
            }
        }
        return -1;
    }

    public int m(int i8) {
        if (this.f40890o) {
            AbstractC6409m.e(this);
        }
        return this.f40891s[i8];
    }

    public void p(int i8, Object obj) {
        int a8 = AbstractC6640a.a(this.f40891s, this.f40893u, i8);
        if (a8 >= 0) {
            this.f40892t[a8] = obj;
            return;
        }
        int i9 = ~a8;
        if (i9 < this.f40893u && this.f40892t[i9] == AbstractC6409m.f40894a) {
            this.f40891s[i9] = i8;
            this.f40892t[i9] = obj;
            return;
        }
        if (this.f40890o && this.f40893u >= this.f40891s.length) {
            AbstractC6409m.e(this);
            i9 = ~AbstractC6640a.a(this.f40891s, this.f40893u, i8);
        }
        int i10 = this.f40893u;
        if (i10 >= this.f40891s.length) {
            int e8 = AbstractC6640a.e(i10 + 1);
            int[] copyOf = Arrays.copyOf(this.f40891s, e8);
            r.d(copyOf, "copyOf(this, newSize)");
            this.f40891s = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f40892t, e8);
            r.d(copyOf2, "copyOf(this, newSize)");
            this.f40892t = copyOf2;
        }
        int i11 = this.f40893u;
        if (i11 - i9 != 0) {
            int[] iArr = this.f40891s;
            int i12 = i9 + 1;
            AbstractC6980h.e(iArr, iArr, i12, i9, i11);
            Object[] objArr = this.f40892t;
            AbstractC6980h.g(objArr, objArr, i12, i9, this.f40893u);
        }
        this.f40891s[i9] = i8;
        this.f40892t[i9] = obj;
        this.f40893u++;
    }

    public int q() {
        if (this.f40890o) {
            AbstractC6409m.e(this);
        }
        return this.f40893u;
    }

    public Object r(int i8) {
        if (this.f40890o) {
            AbstractC6409m.e(this);
        }
        return this.f40892t[i8];
    }

    public String toString() {
        if (q() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f40893u * 28);
        sb.append('{');
        int i8 = this.f40893u;
        for (int i9 = 0; i9 < i8; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            sb.append(m(i9));
            sb.append('=');
            Object r8 = r(i9);
            if (r8 != this) {
                sb.append(r8);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        r.d(sb2, "buffer.toString()");
        return sb2;
    }

    public C6408l(int i8) {
        if (i8 == 0) {
            this.f40891s = AbstractC6640a.f42380a;
            this.f40892t = AbstractC6640a.f42382c;
        } else {
            int e8 = AbstractC6640a.e(i8);
            this.f40891s = new int[e8];
            this.f40892t = new Object[e8];
        }
    }

    public /* synthetic */ C6408l(int i8, int i9, AbstractC0650j abstractC0650j) {
        this((i9 & 1) != 0 ? 10 : i8);
    }
}
