package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class E2 extends A2 {

    /* renamed from: c, reason: collision with root package name */
    private T2 f37453c;

    @Override // j$.util.stream.AbstractC5955i2, j$.util.stream.InterfaceC5985o2
    public final void l(long j8) {
        T2 t22;
        if (j8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j8 <= 0) {
            t22 = new T2();
        } else {
            t22 = new T2((int) j8);
        }
        this.f37453c = t22;
    }

    @Override // j$.util.stream.AbstractC5955i2, j$.util.stream.InterfaceC5985o2
    public final void k() {
        int[] iArr = (int[]) this.f37453c.d();
        Arrays.sort(iArr);
        long length = iArr.length;
        InterfaceC5985o2 interfaceC5985o2 = this.f37715a;
        interfaceC5985o2.l(length);
        int i8 = 0;
        if (!this.f37426b) {
            int length2 = iArr.length;
            while (i8 < length2) {
                interfaceC5985o2.accept(iArr[i8]);
                i8++;
            }
        } else {
            int length3 = iArr.length;
            while (i8 < length3) {
                int i9 = iArr[i8];
                if (interfaceC5985o2.n()) {
                    break;
                }
                interfaceC5985o2.accept(i9);
                i8++;
            }
        }
        interfaceC5985o2.k();
    }

    @Override // j$.util.stream.InterfaceC5975m2, j$.util.stream.InterfaceC5985o2
    public final void accept(int i8) {
        this.f37453c.accept(i8);
    }
}
