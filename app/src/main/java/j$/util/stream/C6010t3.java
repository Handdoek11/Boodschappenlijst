package j$.util.stream;

import j$.util.AbstractC5897d;
import j$.util.Spliterator;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.t3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6010t3 extends AbstractC6025w3 implements j$.util.V {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5897d.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5897d.f(this, consumer);
    }

    @Override // j$.util.stream.AbstractC6035y3
    protected final Spliterator a(Spliterator spliterator, long j8, long j9, long j10, long j11) {
        return new C6010t3((j$.util.V) spliterator, j8, j9, j10, j11);
    }

    @Override // j$.util.stream.AbstractC6025w3
    protected final Object b() {
        return new D0(1);
    }
}
