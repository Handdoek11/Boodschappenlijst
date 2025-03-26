package k7;

import J6.AbstractC0650j;
import java.util.Arrays;
import x6.C6912A;

/* loaded from: classes2.dex */
public final class R0 extends AbstractC6157v0 {

    /* renamed from: a, reason: collision with root package name */
    private long[] f38648a;

    /* renamed from: b, reason: collision with root package name */
    private int f38649b;

    public /* synthetic */ R0(long[] jArr, AbstractC0650j abstractC0650j) {
        this(jArr);
    }

    @Override // k7.AbstractC6157v0
    public /* bridge */ /* synthetic */ Object a() {
        return C6912A.b(f());
    }

    @Override // k7.AbstractC6157v0
    public void b(int i8) {
        if (C6912A.s(this.f38648a) < i8) {
            long[] jArr = this.f38648a;
            long[] copyOf = Arrays.copyOf(jArr, P6.m.c(i8, C6912A.s(jArr) * 2));
            J6.r.d(copyOf, "copyOf(this, newSize)");
            this.f38648a = C6912A.e(copyOf);
        }
    }

    @Override // k7.AbstractC6157v0
    public int d() {
        return this.f38649b;
    }

    public final void e(long j8) {
        AbstractC6157v0.c(this, 0, 1, null);
        long[] jArr = this.f38648a;
        int d8 = d();
        this.f38649b = d8 + 1;
        C6912A.x(jArr, d8, j8);
    }

    public long[] f() {
        long[] copyOf = Arrays.copyOf(this.f38648a, d());
        J6.r.d(copyOf, "copyOf(this, newSize)");
        return C6912A.e(copyOf);
    }

    private R0(long[] jArr) {
        this.f38648a = jArr;
        this.f38649b = C6912A.s(jArr);
        b(10);
    }
}
