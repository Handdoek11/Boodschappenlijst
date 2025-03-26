package j$.util.stream;

import j$.util.AbstractC5897d;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.s3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6005s3 extends AbstractC5941f3 implements j$.util.b0 {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5897d.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5897d.h(this, consumer);
    }

    @Override // j$.util.stream.AbstractC5941f3
    final AbstractC5941f3 e(Spliterator spliterator) {
        return new C6005s3(this.f37685b, spliterator, this.f37684a);
    }

    @Override // j$.util.stream.AbstractC5941f3
    final void d() {
        V2 v22 = new V2();
        this.f37691h = v22;
        Objects.requireNonNull(v22);
        this.f37688e = this.f37685b.V(new C6000r3(v22, 0));
        this.f37689f = new C5912a(4, this);
    }

    @Override // j$.util.stream.AbstractC5941f3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.b0) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC5941f3, j$.util.Spliterator
    public final j$.util.b0 trySplit() {
        return (j$.util.b0) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC5941f3, j$.util.Spliterator
    public final j$.util.e0 trySplit() {
        return (j$.util.b0) super.trySplit();
    }

    @Override // j$.util.e0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        long j8;
        Objects.requireNonNull(longConsumer);
        boolean a8 = a();
        if (a8) {
            V2 v22 = (V2) this.f37691h;
            long j9 = this.f37690g;
            int u7 = v22.u(j9);
            if (v22.f37641c == 0 && u7 == 0) {
                j8 = ((long[]) v22.f37603e)[(int) j9];
            } else {
                j8 = ((long[][]) v22.f37604f)[u7][(int) (j9 - v22.f37642d[u7])];
            }
            longConsumer.accept(j8);
        }
        return a8;
    }

    @Override // j$.util.e0
    public final void forEachRemaining(LongConsumer longConsumer) {
        if (this.f37691h == null && !this.f37692i) {
            Objects.requireNonNull(longConsumer);
            c();
            Objects.requireNonNull(longConsumer);
            C6000r3 c6000r3 = new C6000r3(longConsumer, 1);
            this.f37685b.U(this.f37687d, c6000r3);
            this.f37692i = true;
            return;
        }
        while (tryAdvance(longConsumer)) {
        }
    }
}
