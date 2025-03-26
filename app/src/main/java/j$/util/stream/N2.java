package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class N2 extends B2 {

    /* renamed from: c, reason: collision with root package name */
    private long[] f37525c;

    /* renamed from: d, reason: collision with root package name */
    private int f37526d;

    @Override // j$.util.stream.AbstractC5960j2, j$.util.stream.InterfaceC5985o2
    public final void l(long j8) {
        if (j8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f37525c = new long[(int) j8];
    }

    @Override // j$.util.stream.AbstractC5960j2, j$.util.stream.InterfaceC5985o2
    public final void k() {
        int i8 = 0;
        Arrays.sort(this.f37525c, 0, this.f37526d);
        long j8 = this.f37526d;
        InterfaceC5985o2 interfaceC5985o2 = this.f37720a;
        interfaceC5985o2.l(j8);
        if (!this.f37432b) {
            while (i8 < this.f37526d) {
                interfaceC5985o2.accept(this.f37525c[i8]);
                i8++;
            }
        } else {
            while (i8 < this.f37526d && !interfaceC5985o2.n()) {
                interfaceC5985o2.accept(this.f37525c[i8]);
                i8++;
            }
        }
        interfaceC5985o2.k();
        this.f37525c = null;
    }

    @Override // j$.util.stream.InterfaceC5980n2, java.util.function.LongConsumer
    public final void accept(long j8) {
        long[] jArr = this.f37525c;
        int i8 = this.f37526d;
        this.f37526d = i8 + 1;
        jArr[i8] = j8;
    }
}
