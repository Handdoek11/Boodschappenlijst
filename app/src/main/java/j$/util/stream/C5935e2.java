package j$.util.stream;

import java.util.function.Consumer;

/* renamed from: j$.util.stream.e2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5935e2 extends AbstractC5945g2 {
    @Override // j$.util.stream.InterfaceC5947h
    public final InterfaceC5947h unordered() {
        return !K() ? this : new C5930d2(this, EnumC5931d3.f37656r, 1);
    }

    @Override // j$.util.stream.AbstractC5917b
    final boolean P() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC5917b
    final InterfaceC5985o2 Q(int i8, InterfaceC5985o2 interfaceC5985o2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC5945g2, j$.util.stream.Stream
    public final void forEach(Consumer consumer) {
        if (!isParallel()) {
            S().forEachRemaining(consumer);
        } else {
            super.forEach(consumer);
        }
    }

    @Override // j$.util.stream.AbstractC5945g2, j$.util.stream.Stream
    public final void forEachOrdered(Consumer consumer) {
        if (!isParallel()) {
            S().forEachRemaining(consumer);
        } else {
            super.forEachOrdered(consumer);
        }
    }
}
