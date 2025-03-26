package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.c1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5924c1 extends AbstractC5934e1 implements I0 {
    @Override // j$.util.stream.K0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC6032y0.s(this, consumer);
    }

    @Override // j$.util.stream.AbstractC5934e1, j$.util.stream.K0
    public final /* synthetic */ K0 h(long j8, long j9, IntFunction intFunction) {
        return AbstractC6032y0.v(this, j8, j9);
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
        AbstractC6032y0.p(this, (Long[]) objArr, i8);
    }

    @Override // j$.util.stream.K0
    public final Spliterator spliterator() {
        return Spliterators.d();
    }

    @Override // j$.util.stream.K0
    public final j$.util.e0 spliterator() {
        return Spliterators.d();
    }

    @Override // j$.util.stream.J0
    public final Object d() {
        return AbstractC6032y0.f37831f;
    }
}
