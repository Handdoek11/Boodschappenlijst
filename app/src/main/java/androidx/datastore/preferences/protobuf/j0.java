package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.p0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: f, reason: collision with root package name */
    private static final j0 f9418f = new j0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f9419a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f9420b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f9421c;

    /* renamed from: d, reason: collision with root package name */
    private int f9422d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f9423e;

    private j0() {
        this(0, new int[8], new Object[8], true);
    }

    private void b() {
        int i8 = this.f9419a;
        int[] iArr = this.f9420b;
        if (i8 == iArr.length) {
            int i9 = i8 + (i8 < 4 ? 8 : i8 >> 1);
            this.f9420b = Arrays.copyOf(iArr, i9);
            this.f9421c = Arrays.copyOf(this.f9421c, i9);
        }
    }

    private static boolean c(int[] iArr, int[] iArr2, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            if (iArr[i9] != iArr2[i9]) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(Object[] objArr, Object[] objArr2, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            if (!objArr[i9].equals(objArr2[i9])) {
                return false;
            }
        }
        return true;
    }

    public static j0 e() {
        return f9418f;
    }

    private static int h(int[] iArr, int i8) {
        int i9 = 17;
        for (int i10 = 0; i10 < i8; i10++) {
            i9 = (i9 * 31) + iArr[i10];
        }
        return i9;
    }

    private static int i(Object[] objArr, int i8) {
        int i9 = 17;
        for (int i10 = 0; i10 < i8; i10++) {
            i9 = (i9 * 31) + objArr[i10].hashCode();
        }
        return i9;
    }

    static j0 k(j0 j0Var, j0 j0Var2) {
        int i8 = j0Var.f9419a + j0Var2.f9419a;
        int[] copyOf = Arrays.copyOf(j0Var.f9420b, i8);
        System.arraycopy(j0Var2.f9420b, 0, copyOf, j0Var.f9419a, j0Var2.f9419a);
        Object[] copyOf2 = Arrays.copyOf(j0Var.f9421c, i8);
        System.arraycopy(j0Var2.f9421c, 0, copyOf2, j0Var.f9419a, j0Var2.f9419a);
        return new j0(i8, copyOf, copyOf2, true);
    }

    static j0 l() {
        return new j0();
    }

    private static void p(int i8, Object obj, p0 p0Var) {
        int a8 = o0.a(i8);
        int b8 = o0.b(i8);
        if (b8 == 0) {
            p0Var.p(a8, ((Long) obj).longValue());
            return;
        }
        if (b8 == 1) {
            p0Var.h(a8, ((Long) obj).longValue());
            return;
        }
        if (b8 == 2) {
            p0Var.w(a8, (AbstractC0883g) obj);
            return;
        }
        if (b8 != 3) {
            if (b8 != 5) {
                throw new RuntimeException(InvalidProtocolBufferException.d());
            }
            p0Var.d(a8, ((Integer) obj).intValue());
        } else if (p0Var.i() == p0.a.ASCENDING) {
            p0Var.s(a8);
            ((j0) obj).q(p0Var);
            p0Var.F(a8);
        } else {
            p0Var.F(a8);
            ((j0) obj).q(p0Var);
            p0Var.s(a8);
        }
    }

    void a() {
        if (!this.f9423e) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        int i8 = this.f9419a;
        return i8 == j0Var.f9419a && c(this.f9420b, j0Var.f9420b, i8) && d(this.f9421c, j0Var.f9421c, this.f9419a);
    }

    public int f() {
        int S7;
        int i8 = this.f9422d;
        if (i8 != -1) {
            return i8;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f9419a; i10++) {
            int i11 = this.f9420b[i10];
            int a8 = o0.a(i11);
            int b8 = o0.b(i11);
            if (b8 == 0) {
                S7 = CodedOutputStream.S(a8, ((Long) this.f9421c[i10]).longValue());
            } else if (b8 == 1) {
                S7 = CodedOutputStream.n(a8, ((Long) this.f9421c[i10]).longValue());
            } else if (b8 == 2) {
                S7 = CodedOutputStream.f(a8, (AbstractC0883g) this.f9421c[i10]);
            } else if (b8 == 3) {
                S7 = (CodedOutputStream.P(a8) * 2) + ((j0) this.f9421c[i10]).f();
            } else {
                if (b8 != 5) {
                    throw new IllegalStateException(InvalidProtocolBufferException.d());
                }
                S7 = CodedOutputStream.l(a8, ((Integer) this.f9421c[i10]).intValue());
            }
            i9 += S7;
        }
        this.f9422d = i9;
        return i9;
    }

    public int g() {
        int i8 = this.f9422d;
        if (i8 != -1) {
            return i8;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f9419a; i10++) {
            i9 += CodedOutputStream.D(o0.a(this.f9420b[i10]), (AbstractC0883g) this.f9421c[i10]);
        }
        this.f9422d = i9;
        return i9;
    }

    public int hashCode() {
        int i8 = this.f9419a;
        return ((((527 + i8) * 31) + h(this.f9420b, i8)) * 31) + i(this.f9421c, this.f9419a);
    }

    public void j() {
        this.f9423e = false;
    }

    final void m(StringBuilder sb, int i8) {
        for (int i9 = 0; i9 < this.f9419a; i9++) {
            O.c(sb, i8, String.valueOf(o0.a(this.f9420b[i9])), this.f9421c[i9]);
        }
    }

    void n(int i8, Object obj) {
        a();
        b();
        int[] iArr = this.f9420b;
        int i9 = this.f9419a;
        iArr[i9] = i8;
        this.f9421c[i9] = obj;
        this.f9419a = i9 + 1;
    }

    void o(p0 p0Var) {
        if (p0Var.i() == p0.a.DESCENDING) {
            for (int i8 = this.f9419a - 1; i8 >= 0; i8--) {
                p0Var.c(o0.a(this.f9420b[i8]), this.f9421c[i8]);
            }
            return;
        }
        for (int i9 = 0; i9 < this.f9419a; i9++) {
            p0Var.c(o0.a(this.f9420b[i9]), this.f9421c[i9]);
        }
    }

    public void q(p0 p0Var) {
        if (this.f9419a == 0) {
            return;
        }
        if (p0Var.i() == p0.a.ASCENDING) {
            for (int i8 = 0; i8 < this.f9419a; i8++) {
                p(this.f9420b[i8], this.f9421c[i8], p0Var);
            }
            return;
        }
        for (int i9 = this.f9419a - 1; i9 >= 0; i9--) {
            p(this.f9420b[i9], this.f9421c[i9], p0Var);
        }
    }

    private j0(int i8, int[] iArr, Object[] objArr, boolean z7) {
        this.f9422d = -1;
        this.f9419a = i8;
        this.f9420b = iArr;
        this.f9421c = objArr;
        this.f9423e = z7;
    }
}
