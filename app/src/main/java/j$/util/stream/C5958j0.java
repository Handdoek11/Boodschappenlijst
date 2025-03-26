package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.j0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5958j0 extends AbstractC5968l0 {
    @Override // j$.util.stream.InterfaceC5947h
    public final InterfaceC5947h unordered() {
        return !K() ? this : new C6026x(this, EnumC5931d3.f37656r, 4);
    }

    @Override // j$.util.stream.AbstractC5917b, j$.util.stream.InterfaceC5947h, j$.util.stream.F
    public final /* bridge */ /* synthetic */ InterfaceC5983o0 parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC5917b, j$.util.stream.InterfaceC5947h, j$.util.stream.F
    public final /* bridge */ /* synthetic */ InterfaceC5983o0 sequential() {
        sequential();
        return this;
    }

    @Override // j$.util.stream.AbstractC5917b, j$.util.stream.InterfaceC5947h
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // j$.util.stream.AbstractC5917b
    final boolean P() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC5917b
    final InterfaceC5985o2 Q(int i8, InterfaceC5985o2 interfaceC5985o2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC5968l0, j$.util.stream.InterfaceC5983o0
    public final void forEach(LongConsumer longConsumer) {
        if (!isParallel()) {
            AbstractC5968l0.Y(S()).forEachRemaining(longConsumer);
        } else {
            super.forEach(longConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC5968l0, j$.util.stream.InterfaceC5983o0
    public final void forEachOrdered(LongConsumer longConsumer) {
        if (!isParallel()) {
            AbstractC5968l0.Y(S()).forEachRemaining(longConsumer);
        } else {
            super.forEachOrdered(longConsumer);
        }
    }
}
