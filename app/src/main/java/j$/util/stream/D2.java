package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class D2 extends AbstractC6039z2 {

    /* renamed from: c, reason: collision with root package name */
    private R2 f37446c;

    @Override // j$.util.stream.AbstractC5950h2, j$.util.stream.InterfaceC5985o2
    public final void l(long j8) {
        R2 r22;
        if (j8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j8 <= 0) {
            r22 = new R2();
        } else {
            r22 = new R2((int) j8);
        }
        this.f37446c = r22;
    }

    @Override // j$.util.stream.AbstractC5950h2, j$.util.stream.InterfaceC5985o2
    public final void k() {
        double[] dArr = (double[]) this.f37446c.d();
        Arrays.sort(dArr);
        long length = dArr.length;
        InterfaceC5985o2 interfaceC5985o2 = this.f37708a;
        interfaceC5985o2.l(length);
        int i8 = 0;
        if (!this.f37850b) {
            int length2 = dArr.length;
            while (i8 < length2) {
                interfaceC5985o2.accept(dArr[i8]);
                i8++;
            }
        } else {
            int length3 = dArr.length;
            while (i8 < length3) {
                double d8 = dArr[i8];
                if (interfaceC5985o2.n()) {
                    break;
                }
                interfaceC5985o2.accept(d8);
                i8++;
            }
        }
        interfaceC5985o2.k();
    }

    @Override // j$.util.stream.InterfaceC5970l2, j$.util.stream.InterfaceC5985o2
    public final void accept(double d8) {
        this.f37446c.accept(d8);
    }
}
