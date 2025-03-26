package k7;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class A extends AbstractC6157v0 {

    /* renamed from: a, reason: collision with root package name */
    private double[] f38583a;

    /* renamed from: b, reason: collision with root package name */
    private int f38584b;

    public A(double[] dArr) {
        J6.r.e(dArr, "bufferWithData");
        this.f38583a = dArr;
        this.f38584b = dArr.length;
        b(10);
    }

    @Override // k7.AbstractC6157v0
    public void b(int i8) {
        double[] dArr = this.f38583a;
        if (dArr.length < i8) {
            double[] copyOf = Arrays.copyOf(dArr, P6.m.c(i8, dArr.length * 2));
            J6.r.d(copyOf, "copyOf(this, newSize)");
            this.f38583a = copyOf;
        }
    }

    @Override // k7.AbstractC6157v0
    public int d() {
        return this.f38584b;
    }

    public final void e(double d8) {
        AbstractC6157v0.c(this, 0, 1, null);
        double[] dArr = this.f38583a;
        int d9 = d();
        this.f38584b = d9 + 1;
        dArr[d9] = d8;
    }

    @Override // k7.AbstractC6157v0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public double[] a() {
        double[] copyOf = Arrays.copyOf(this.f38583a, d());
        J6.r.d(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
