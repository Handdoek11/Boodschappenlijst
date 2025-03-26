package j$.util.stream;

import j$.util.AbstractC5897d;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.q3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5996q3 extends AbstractC5941f3 implements j$.util.Y {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5897d.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5897d.g(this, consumer);
    }

    @Override // j$.util.stream.AbstractC5941f3
    final AbstractC5941f3 e(Spliterator spliterator) {
        return new C5996q3(this.f37685b, spliterator, this.f37684a);
    }

    @Override // j$.util.stream.AbstractC5941f3
    final void d() {
        T2 t22 = new T2();
        this.f37691h = t22;
        Objects.requireNonNull(t22);
        this.f37688e = this.f37685b.V(new C5991p3(t22, 0));
        this.f37689f = new C5912a(3, this);
    }

    @Override // j$.util.stream.AbstractC5941f3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.Y) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC5941f3, j$.util.Spliterator
    public final j$.util.Y trySplit() {
        return (j$.util.Y) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC5941f3, j$.util.Spliterator
    public final j$.util.e0 trySplit() {
        return (j$.util.Y) super.trySplit();
    }

    @Override // j$.util.e0
    public final boolean tryAdvance(IntConsumer intConsumer) {
        int i8;
        Objects.requireNonNull(intConsumer);
        boolean a8 = a();
        if (a8) {
            T2 t22 = (T2) this.f37691h;
            long j8 = this.f37690g;
            int u7 = t22.u(j8);
            if (t22.f37641c == 0 && u7 == 0) {
                i8 = ((int[]) t22.f37603e)[(int) j8];
            } else {
                i8 = ((int[][]) t22.f37604f)[u7][(int) (j8 - t22.f37642d[u7])];
            }
            intConsumer.accept(i8);
        }
        return a8;
    }

    @Override // j$.util.e0
    public final void forEachRemaining(IntConsumer intConsumer) {
        if (this.f37691h == null && !this.f37692i) {
            Objects.requireNonNull(intConsumer);
            c();
            Objects.requireNonNull(intConsumer);
            C5991p3 c5991p3 = new C5991p3(intConsumer, 1);
            this.f37685b.U(this.f37687d, c5991p3);
            this.f37692i = true;
            return;
        }
        while (tryAdvance(intConsumer)) {
        }
    }
}
