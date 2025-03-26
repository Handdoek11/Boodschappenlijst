package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.s2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6004s2 extends AbstractC5918b0 {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ long f37785m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ long f37786n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6004s2(AbstractC5923c0 abstractC5923c0, int i8, long j8, long j9) {
        super(abstractC5923c0, i8, 0);
        this.f37785m = j8;
        this.f37786n = j9;
    }

    @Override // j$.util.stream.AbstractC5917b
    final Spliterator O(AbstractC5917b abstractC5917b, Spliterator spliterator) {
        long j8;
        long j9;
        long F7 = abstractC5917b.F(spliterator);
        long j10 = this.f37786n;
        if (F7 > 0 && spliterator.hasCharacteristics(16384)) {
            j$.util.Y y7 = (j$.util.Y) abstractC5917b.W(spliterator);
            long j11 = this.f37785m;
            return new C6015u3(y7, j11, AbstractC6032y0.B(j11, j10));
        }
        if (EnumC5931d3.ORDERED.n(abstractC5917b.J())) {
            return ((K0) new C6034y2(this, abstractC5917b, spliterator, new C5933e0(4), this.f37785m, this.f37786n).invoke()).spliterator();
        }
        j$.util.Y y8 = (j$.util.Y) abstractC5917b.W(spliterator);
        long j12 = this.f37785m;
        if (j12 <= F7) {
            long j13 = F7 - j12;
            if (j10 >= 0) {
                j13 = Math.min(j10, j13);
            }
            j9 = 0;
            j8 = j13;
        } else {
            j8 = j10;
            j9 = j12;
        }
        return new A3(y8, j9, j8);
    }

    @Override // j$.util.stream.AbstractC5917b
    final K0 N(AbstractC5917b abstractC5917b, Spliterator spliterator, IntFunction intFunction) {
        long j8;
        long j9;
        long F7 = abstractC5917b.F(spliterator);
        if (F7 > 0 && spliterator.hasCharacteristics(16384)) {
            return AbstractC6032y0.G(abstractC5917b, AbstractC6032y0.C(abstractC5917b.I(), spliterator, this.f37785m, this.f37786n), true);
        }
        if (!EnumC5931d3.ORDERED.n(abstractC5917b.J())) {
            j$.util.Y y7 = (j$.util.Y) abstractC5917b.W(spliterator);
            long j10 = this.f37785m;
            long j11 = this.f37786n;
            if (j10 <= F7) {
                j8 = j11 >= 0 ? Math.min(j11, F7 - j10) : F7 - j10;
                j9 = 0;
            } else {
                j8 = j11;
                j9 = j10;
            }
            return AbstractC6032y0.G(this, new A3(y7, j9, j8), true);
        }
        return (K0) new C6034y2(this, abstractC5917b, spliterator, intFunction, this.f37785m, this.f37786n).invoke();
    }

    @Override // j$.util.stream.AbstractC5917b
    final InterfaceC5985o2 Q(int i8, InterfaceC5985o2 interfaceC5985o2) {
        return new C5999r2(this, interfaceC5985o2);
    }
}
