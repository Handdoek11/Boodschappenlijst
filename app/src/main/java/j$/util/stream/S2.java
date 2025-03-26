package j$.util.stream;

import j$.util.AbstractC5897d;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
final class S2 extends W2 implements j$.util.Y {

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ T2 f37568g;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5897d.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5897d.g(this, consumer);
    }

    @Override // j$.util.stream.W2
    final void a(int i8, Object obj, Object obj2) {
        ((IntConsumer) obj2).accept(((int[]) obj)[i8]);
    }

    @Override // j$.util.stream.W2
    final j$.util.e0 b(Object obj, int i8, int i9) {
        return Spliterators.k((int[]) obj, i8, i9 + i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    S2(T2 t22, int i8, int i9, int i10, int i11) {
        super(t22, i8, i9, i10, i11);
        this.f37568g = t22;
    }

    @Override // j$.util.stream.W2
    final j$.util.e0 c(int i8, int i9, int i10, int i11) {
        return new S2(this.f37568g, i8, i9, i10, i11);
    }
}
