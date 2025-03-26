package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes3.dex */
final class T0 extends V0 implements G0 {
    @Override // j$.util.stream.K0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC6032y0.r(this, consumer);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ K0 h(long j8, long j9, IntFunction intFunction) {
        return AbstractC6032y0.u(this, j8, j9);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void i(Object[] objArr, int i8) {
        AbstractC6032y0.o(this, (Integer[]) objArr, i8);
    }

    @Override // j$.util.stream.J0
    public final Object c(int i8) {
        return new int[i8];
    }

    @Override // j$.util.stream.K0
    public final Spliterator spliterator() {
        return new C5964k1(this);
    }

    @Override // j$.util.stream.K0
    public final j$.util.e0 spliterator() {
        return new C5964k1(this);
    }
}
