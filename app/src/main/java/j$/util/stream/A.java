package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* loaded from: classes3.dex */
final class A extends C {
    @Override // j$.util.stream.InterfaceC5947h
    public final InterfaceC5947h unordered() {
        return !K() ? this : new C6016v(this, EnumC5931d3.f37656r, 1);
    }

    @Override // j$.util.stream.AbstractC5917b, j$.util.stream.InterfaceC5947h, j$.util.stream.F
    public final /* bridge */ /* synthetic */ F parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC5917b, j$.util.stream.InterfaceC5947h, j$.util.stream.F
    public final /* bridge */ /* synthetic */ F sequential() {
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

    @Override // j$.util.stream.C, j$.util.stream.F
    public final void forEach(DoubleConsumer doubleConsumer) {
        if (!isParallel()) {
            C.Y(S()).forEachRemaining(doubleConsumer);
        } else {
            super.forEach(doubleConsumer);
        }
    }

    @Override // j$.util.stream.C, j$.util.stream.F
    public final void forEachOrdered(DoubleConsumer doubleConsumer) {
        if (!isParallel()) {
            C.Y(S()).forEachRemaining(doubleConsumer);
        } else {
            super.forEachOrdered(doubleConsumer);
        }
    }
}
