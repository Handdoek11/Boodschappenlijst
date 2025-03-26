package j$.util.stream;

import j$.util.AbstractC5897d;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.z3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6040z3 extends C3 implements j$.util.V, DoubleConsumer {

    /* renamed from: f, reason: collision with root package name */
    double f37851f;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5897d.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5897d.f(this, consumer);
    }

    @Override // j$.util.stream.F3
    protected final Spliterator c(Spliterator spliterator) {
        return new C6040z3((j$.util.V) spliterator, this);
    }

    @Override // j$.util.stream.C3
    protected final void e(Object obj) {
        ((DoubleConsumer) obj).accept(this.f37851f);
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d8) {
        this.f37851f = d8;
    }

    @Override // j$.util.stream.C3
    protected final AbstractC5961j3 h(int i8) {
        return new C5946g3(i8);
    }
}
