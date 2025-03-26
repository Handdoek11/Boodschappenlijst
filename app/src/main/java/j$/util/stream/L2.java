package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class L2 extends AbstractC6039z2 {

    /* renamed from: c, reason: collision with root package name */
    private double[] f37506c;

    /* renamed from: d, reason: collision with root package name */
    private int f37507d;

    @Override // j$.util.stream.AbstractC5950h2, j$.util.stream.InterfaceC5985o2
    public final void l(long j8) {
        if (j8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f37506c = new double[(int) j8];
    }

    @Override // j$.util.stream.AbstractC5950h2, j$.util.stream.InterfaceC5985o2
    public final void k() {
        int i8 = 0;
        Arrays.sort(this.f37506c, 0, this.f37507d);
        long j8 = this.f37507d;
        InterfaceC5985o2 interfaceC5985o2 = this.f37708a;
        interfaceC5985o2.l(j8);
        if (!this.f37850b) {
            while (i8 < this.f37507d) {
                interfaceC5985o2.accept(this.f37506c[i8]);
                i8++;
            }
        } else {
            while (i8 < this.f37507d && !interfaceC5985o2.n()) {
                interfaceC5985o2.accept(this.f37506c[i8]);
                i8++;
            }
        }
        interfaceC5985o2.k();
        this.f37506c = null;
    }

    @Override // j$.util.stream.InterfaceC5970l2, j$.util.stream.InterfaceC5985o2
    public final void accept(double d8) {
        double[] dArr = this.f37506c;
        int i8 = this.f37507d;
        this.f37507d = i8 + 1;
        dArr[i8] = d8;
    }
}
