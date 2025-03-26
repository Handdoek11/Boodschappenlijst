package j$.util.stream;

import java.util.function.IntFunction;

/* renamed from: j$.util.stream.e1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC5934e1 implements K0 {
    @Override // j$.util.stream.K0
    public final long count() {
        return 0L;
    }

    public final void e(Object obj) {
    }

    @Override // j$.util.stream.K0
    public /* synthetic */ K0 h(long j8, long j9, IntFunction intFunction) {
        return AbstractC6032y0.w(this, j8, j9, intFunction);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.K0
    public K0 b(int i8) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.K0
    public final Object[] o(IntFunction intFunction) {
        return (Object[]) intFunction.apply(0);
    }

    public final void r(int i8, Object obj) {
    }
}
