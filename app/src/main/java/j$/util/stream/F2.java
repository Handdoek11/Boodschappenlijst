package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class F2 extends B2 {

    /* renamed from: c, reason: collision with root package name */
    private V2 f37459c;

    @Override // j$.util.stream.AbstractC5960j2, j$.util.stream.InterfaceC5985o2
    public final void l(long j8) {
        V2 v22;
        if (j8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j8 <= 0) {
            v22 = new V2();
        } else {
            v22 = new V2((int) j8);
        }
        this.f37459c = v22;
    }

    @Override // j$.util.stream.AbstractC5960j2, j$.util.stream.InterfaceC5985o2
    public final void k() {
        long[] jArr = (long[]) this.f37459c.d();
        Arrays.sort(jArr);
        long length = jArr.length;
        InterfaceC5985o2 interfaceC5985o2 = this.f37720a;
        interfaceC5985o2.l(length);
        int i8 = 0;
        if (!this.f37432b) {
            int length2 = jArr.length;
            while (i8 < length2) {
                interfaceC5985o2.accept(jArr[i8]);
                i8++;
            }
        } else {
            int length3 = jArr.length;
            while (i8 < length3) {
                long j8 = jArr[i8];
                if (interfaceC5985o2.n()) {
                    break;
                }
                interfaceC5985o2.accept(j8);
                i8++;
            }
        }
        interfaceC5985o2.k();
    }

    @Override // j$.util.stream.InterfaceC5980n2, java.util.function.LongConsumer
    public final void accept(long j8) {
        this.f37459c.accept(j8);
    }
}
