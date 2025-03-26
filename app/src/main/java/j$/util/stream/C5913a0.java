package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.a0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5913a0 extends AbstractC5923c0 {
    @Override // j$.util.stream.InterfaceC5947h
    public final InterfaceC5947h unordered() {
        return !K() ? this : new C6021w(this, EnumC5931d3.f37656r, 2);
    }

    @Override // j$.util.stream.AbstractC5917b, j$.util.stream.InterfaceC5947h, j$.util.stream.F
    public final /* bridge */ /* synthetic */ IntStream parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC5917b, j$.util.stream.InterfaceC5947h, j$.util.stream.F
    public final /* bridge */ /* synthetic */ IntStream sequential() {
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

    @Override // j$.util.stream.AbstractC5923c0, j$.util.stream.IntStream
    public final void forEach(IntConsumer intConsumer) {
        if (!isParallel()) {
            AbstractC5923c0.Y(S()).forEachRemaining(intConsumer);
        } else {
            super.forEach(intConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC5923c0, j$.util.stream.IntStream
    public final void forEachOrdered(IntConsumer intConsumer) {
        if (!isParallel()) {
            AbstractC5923c0.Y(S()).forEachRemaining(intConsumer);
        } else {
            super.forEachOrdered(intConsumer);
        }
    }
}
