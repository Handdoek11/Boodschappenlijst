package j$.util;

import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
public interface b0 extends e0 {
    void forEachRemaining(LongConsumer longConsumer);

    boolean tryAdvance(LongConsumer longConsumer);

    @Override // j$.util.e0, j$.util.Spliterator
    b0 trySplit();
}
