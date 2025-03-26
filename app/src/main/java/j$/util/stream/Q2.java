package j$.util.stream;

import j$.util.AbstractC5897d;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes3.dex */
final class Q2 extends W2 implements j$.util.V {

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ R2 f37555g;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5897d.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5897d.f(this, consumer);
    }

    @Override // j$.util.stream.W2
    final void a(int i8, Object obj, Object obj2) {
        ((DoubleConsumer) obj2).accept(((double[]) obj)[i8]);
    }

    @Override // j$.util.stream.W2
    final j$.util.e0 b(Object obj, int i8, int i9) {
        return Spliterators.j((double[]) obj, i8, i9 + i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Q2(R2 r22, int i8, int i9, int i10, int i11) {
        super(r22, i8, i9, i10, i11);
        this.f37555g = r22;
    }

    @Override // j$.util.stream.W2
    final j$.util.e0 c(int i8, int i9, int i10, int i11) {
        return new Q2(this.f37555g, i8, i9, i10, i11);
    }
}
