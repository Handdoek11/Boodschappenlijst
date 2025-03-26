package j$.util.stream;

import j$.util.AbstractC5897d;
import j$.util.Spliterator;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.u3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6015u3 extends AbstractC6025w3 implements j$.util.Y {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5897d.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5897d.g(this, consumer);
    }

    @Override // j$.util.stream.AbstractC6035y3
    protected final Spliterator a(Spliterator spliterator, long j8, long j9, long j10, long j11) {
        return new C6015u3((j$.util.Y) spliterator, j8, j9, j10, j11);
    }

    @Override // j$.util.stream.AbstractC6025w3
    protected final Object b() {
        return new F0(1);
    }
}
