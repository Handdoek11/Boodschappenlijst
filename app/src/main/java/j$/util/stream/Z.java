package j$.util.stream;

import j$.util.Objects;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
final class Z extends AbstractC5955i2 {

    /* renamed from: b, reason: collision with root package name */
    boolean f37610b;

    /* renamed from: c, reason: collision with root package name */
    V f37611c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ X f37612d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Z(X x7, InterfaceC5985o2 interfaceC5985o2) {
        super(interfaceC5985o2);
        this.f37612d = x7;
        InterfaceC5985o2 interfaceC5985o22 = this.f37715a;
        Objects.requireNonNull(interfaceC5985o22);
        this.f37611c = new V(interfaceC5985o22);
    }

    @Override // j$.util.stream.AbstractC5955i2, j$.util.stream.InterfaceC5985o2
    public final void l(long j8) {
        this.f37715a.l(-1L);
    }

    @Override // j$.util.stream.InterfaceC5975m2, j$.util.stream.InterfaceC5985o2
    public final void accept(int i8) {
        IntStream intStream = (IntStream) ((Q0) this.f37612d.f37600n).apply(i8);
        if (intStream != null) {
            try {
                boolean z7 = this.f37610b;
                V v7 = this.f37611c;
                if (!z7) {
                    intStream.sequential().forEach(v7);
                } else {
                    j$.util.Y spliterator = intStream.sequential().spliterator();
                    while (!this.f37715a.n() && spliterator.tryAdvance((IntConsumer) v7)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    intStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (intStream != null) {
            intStream.close();
        }
    }

    @Override // j$.util.stream.AbstractC5955i2, j$.util.stream.InterfaceC5985o2
    public final boolean n() {
        this.f37610b = true;
        return this.f37715a.n();
    }
}
