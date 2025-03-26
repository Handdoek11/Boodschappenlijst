package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class O2 extends C2 {

    /* renamed from: d, reason: collision with root package name */
    private Object[] f37533d;

    /* renamed from: e, reason: collision with root package name */
    private int f37534e;

    @Override // j$.util.stream.AbstractC5965k2, j$.util.stream.InterfaceC5985o2
    public final void l(long j8) {
        if (j8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f37533d = new Object[(int) j8];
    }

    @Override // j$.util.stream.AbstractC5965k2, j$.util.stream.InterfaceC5985o2
    public final void k() {
        int i8 = 0;
        Arrays.sort(this.f37533d, 0, this.f37534e, this.f37436b);
        long j8 = this.f37534e;
        InterfaceC5985o2 interfaceC5985o2 = this.f37727a;
        interfaceC5985o2.l(j8);
        if (!this.f37437c) {
            while (i8 < this.f37534e) {
                interfaceC5985o2.accept((InterfaceC5985o2) this.f37533d[i8]);
                i8++;
            }
        } else {
            while (i8 < this.f37534e && !interfaceC5985o2.n()) {
                interfaceC5985o2.accept((InterfaceC5985o2) this.f37533d[i8]);
                i8++;
            }
        }
        interfaceC5985o2.k();
        this.f37533d = null;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.f37533d;
        int i8 = this.f37534e;
        this.f37534e = i8 + 1;
        objArr[i8] = obj;
    }
}
