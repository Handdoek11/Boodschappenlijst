package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class M2 extends A2 {

    /* renamed from: c, reason: collision with root package name */
    private int[] f37516c;

    /* renamed from: d, reason: collision with root package name */
    private int f37517d;

    @Override // j$.util.stream.AbstractC5955i2, j$.util.stream.InterfaceC5985o2
    public final void l(long j8) {
        if (j8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f37516c = new int[(int) j8];
    }

    @Override // j$.util.stream.AbstractC5955i2, j$.util.stream.InterfaceC5985o2
    public final void k() {
        int i8 = 0;
        Arrays.sort(this.f37516c, 0, this.f37517d);
        long j8 = this.f37517d;
        InterfaceC5985o2 interfaceC5985o2 = this.f37715a;
        interfaceC5985o2.l(j8);
        if (!this.f37426b) {
            while (i8 < this.f37517d) {
                interfaceC5985o2.accept(this.f37516c[i8]);
                i8++;
            }
        } else {
            while (i8 < this.f37517d && !interfaceC5985o2.n()) {
                interfaceC5985o2.accept(this.f37516c[i8]);
                i8++;
            }
        }
        interfaceC5985o2.k();
        this.f37516c = null;
    }

    @Override // j$.util.stream.InterfaceC5975m2, j$.util.stream.InterfaceC5985o2
    public final void accept(int i8) {
        int[] iArr = this.f37516c;
        int i9 = this.f37517d;
        this.f37517d = i9 + 1;
        iArr[i9] = i8;
    }
}
