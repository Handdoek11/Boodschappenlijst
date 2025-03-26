package j$.util.stream;

import j$.util.AbstractC5897d;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
final class B3 extends C3 implements j$.util.b0, LongConsumer {

    /* renamed from: f, reason: collision with root package name */
    long f37433f;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5897d.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5897d.h(this, consumer);
    }

    @Override // j$.util.stream.F3
    protected final Spliterator c(Spliterator spliterator) {
        return new B3((j$.util.b0) spliterator, this);
    }

    @Override // j$.util.stream.C3
    protected final void e(Object obj) {
        ((LongConsumer) obj).accept(this.f37433f);
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j8) {
        this.f37433f = j8;
    }

    @Override // j$.util.stream.C3
    protected final AbstractC5961j3 h(int i8) {
        return new C5956i3(i8);
    }
}
