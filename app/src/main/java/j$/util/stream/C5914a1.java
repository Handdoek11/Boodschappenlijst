package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.a1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5914a1 extends AbstractC5934e1 implements E0 {
    @Override // j$.util.stream.K0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC6032y0.q(this, consumer);
    }

    @Override // j$.util.stream.AbstractC5934e1, j$.util.stream.K0
    public final /* synthetic */ K0 h(long j8, long j9, IntFunction intFunction) {
        return AbstractC6032y0.t(this, j8, j9);
    }

    @Override // j$.util.stream.AbstractC5934e1, j$.util.stream.K0
    public final /* bridge */ /* synthetic */ K0 b(int i8) {
        b(i8);
        throw null;
    }

    @Override // j$.util.stream.AbstractC5934e1, j$.util.stream.K0
    public final J0 b(int i8) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void i(Object[] objArr, int i8) {
        AbstractC6032y0.n(this, (Double[]) objArr, i8);
    }

    @Override // j$.util.stream.K0
    public final Spliterator spliterator() {
        return Spliterators.b();
    }

    @Override // j$.util.stream.K0
    public final j$.util.e0 spliterator() {
        return Spliterators.b();
    }

    @Override // j$.util.stream.J0
    public final Object d() {
        return AbstractC6032y0.f37832g;
    }
}
