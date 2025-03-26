package j$.util.stream;

import j$.util.AbstractC5897d;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
final class U2 extends W2 implements j$.util.b0 {

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ V2 f37585g;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5897d.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5897d.h(this, consumer);
    }

    @Override // j$.util.stream.W2
    final void a(int i8, Object obj, Object obj2) {
        ((LongConsumer) obj2).accept(((long[]) obj)[i8]);
    }

    @Override // j$.util.stream.W2
    final j$.util.e0 b(Object obj, int i8, int i9) {
        return Spliterators.l((long[]) obj, i8, i9 + i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    U2(V2 v22, int i8, int i9, int i10, int i11) {
        super(v22, i8, i9, i10, i11);
        this.f37585g = v22;
    }

    @Override // j$.util.stream.W2
    final j$.util.e0 c(int i8, int i9, int i10, int i11) {
        return new U2(this.f37585g, i8, i9, i10, i11);
    }
}
