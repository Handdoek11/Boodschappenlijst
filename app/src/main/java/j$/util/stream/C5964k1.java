package j$.util.stream;

import j$.util.AbstractC5897d;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.k1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5964k1 extends AbstractC5974m1 implements j$.util.Y {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5897d.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5897d.g(this, consumer);
    }
}
