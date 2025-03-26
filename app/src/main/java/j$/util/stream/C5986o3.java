package j$.util.stream;

import j$.util.AbstractC5897d;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.o3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5986o3 extends AbstractC5941f3 implements j$.util.V {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5897d.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5897d.f(this, consumer);
    }

    @Override // j$.util.stream.AbstractC5941f3
    final AbstractC5941f3 e(Spliterator spliterator) {
        return new C5986o3(this.f37685b, spliterator, this.f37684a);
    }

    @Override // j$.util.stream.AbstractC5941f3
    final void d() {
        R2 r22 = new R2();
        this.f37691h = r22;
        Objects.requireNonNull(r22);
        this.f37688e = this.f37685b.V(new C5981n3(r22, 0));
        this.f37689f = new C5912a(2, this);
    }

    @Override // j$.util.stream.AbstractC5941f3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.V) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC5941f3, j$.util.Spliterator
    public final j$.util.V trySplit() {
        return (j$.util.V) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC5941f3, j$.util.Spliterator
    public final j$.util.e0 trySplit() {
        return (j$.util.V) super.trySplit();
    }

    @Override // j$.util.e0
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        double d8;
        Objects.requireNonNull(doubleConsumer);
        boolean a8 = a();
        if (a8) {
            R2 r22 = (R2) this.f37691h;
            long j8 = this.f37690g;
            int u7 = r22.u(j8);
            if (r22.f37641c == 0 && u7 == 0) {
                d8 = ((double[]) r22.f37603e)[(int) j8];
            } else {
                d8 = ((double[][]) r22.f37604f)[u7][(int) (j8 - r22.f37642d[u7])];
            }
            doubleConsumer.accept(d8);
        }
        return a8;
    }

    @Override // j$.util.e0
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        if (this.f37691h == null && !this.f37692i) {
            Objects.requireNonNull(doubleConsumer);
            c();
            Objects.requireNonNull(doubleConsumer);
            C5981n3 c5981n3 = new C5981n3(doubleConsumer, 1);
            this.f37685b.U(this.f37687d, c5981n3);
            this.f37692i = true;
            return;
        }
        while (tryAdvance(doubleConsumer)) {
        }
    }
}
