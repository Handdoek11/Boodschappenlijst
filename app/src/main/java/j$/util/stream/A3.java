package j$.util.stream;

import j$.util.AbstractC5897d;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
final class A3 extends C3 implements j$.util.Y, IntConsumer {

    /* renamed from: f, reason: collision with root package name */
    int f37427f;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5897d.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5897d.g(this, consumer);
    }

    @Override // j$.util.stream.F3
    protected final Spliterator c(Spliterator spliterator) {
        return new A3((j$.util.Y) spliterator, this);
    }

    @Override // j$.util.stream.C3
    protected final void e(Object obj) {
        ((IntConsumer) obj).accept(this.f37427f);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i8) {
        this.f37427f = i8;
    }

    @Override // j$.util.stream.C3
    protected final AbstractC5961j3 h(int i8) {
        return new C5951h3(i8);
    }
}
