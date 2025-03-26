package j$.util.stream;

import j$.util.AbstractC5897d;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.l1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5969l1 extends AbstractC5974m1 implements j$.util.b0 {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5897d.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5897d.h(this, consumer);
    }
}
