package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* loaded from: classes3.dex */
final class N extends S implements InterfaceC5970l2 {

    /* renamed from: b, reason: collision with root package name */
    final DoubleConsumer f37519b;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.InterfaceC5970l2
    public final /* synthetic */ void p(Double d8) {
        AbstractC6032y0.e(this, d8);
    }

    @Override // j$.util.stream.J3
    public final Object b(AbstractC5917b abstractC5917b, Spliterator spliterator) {
        abstractC5917b.U(spliterator, this);
        return null;
    }

    @Override // j$.util.stream.J3
    public final /* bridge */ /* synthetic */ Object c(AbstractC5917b abstractC5917b, Spliterator spliterator) {
        e(abstractC5917b, spliterator);
        return null;
    }

    N(DoubleConsumer doubleConsumer, boolean z7) {
        super(z7);
        this.f37519b = doubleConsumer;
    }

    @Override // j$.util.stream.S, j$.util.stream.InterfaceC5985o2
    public final void accept(double d8) {
        this.f37519b.accept(d8);
    }
}
