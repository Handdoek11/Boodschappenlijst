package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes3.dex */
final class S0 extends V0 implements E0 {
    @Override // j$.util.stream.K0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC6032y0.q(this, consumer);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ K0 h(long j8, long j9, IntFunction intFunction) {
        return AbstractC6032y0.t(this, j8, j9);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void i(Object[] objArr, int i8) {
        AbstractC6032y0.n(this, (Double[]) objArr, i8);
    }

    @Override // j$.util.stream.J0
    public final Object c(int i8) {
        return new double[i8];
    }

    @Override // j$.util.stream.K0
    public final Spliterator spliterator() {
        return new C5959j1(this);
    }

    @Override // j$.util.stream.K0
    public final j$.util.e0 spliterator() {
        return new C5959j1(this);
    }
}
