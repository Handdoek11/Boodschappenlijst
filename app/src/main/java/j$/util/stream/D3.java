package j$.util.stream;

import j$.util.AbstractC5897d;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class D3 extends F3 implements Spliterator, Consumer {

    /* renamed from: f, reason: collision with root package name */
    Object f37447f;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC5897d.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i8) {
        return AbstractC5897d.e(this, i8);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f37447f = obj;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        while (d() != E3.NO_MORE && this.f37460a.tryAdvance(this)) {
            if (b(1L) == 1) {
                consumer.accept(this.f37447f);
                this.f37447f = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        C5966k3 c5966k3 = null;
        while (true) {
            E3 d8 = d();
            if (d8 == E3.NO_MORE) {
                return;
            }
            E3 e32 = E3.MAYBE_MORE;
            Spliterator spliterator = this.f37460a;
            if (d8 == e32) {
                int i8 = this.f37462c;
                if (c5966k3 == null) {
                    c5966k3 = new C5966k3(i8);
                } else {
                    c5966k3.f37736a = 0;
                }
                long j8 = 0;
                while (spliterator.tryAdvance(c5966k3)) {
                    j8++;
                    if (j8 >= i8) {
                        break;
                    }
                }
                if (j8 == 0) {
                    return;
                }
                long b8 = b(j8);
                for (int i9 = 0; i9 < b8; i9++) {
                    consumer.accept(c5966k3.f37728b[i9]);
                }
            } else {
                spliterator.forEachRemaining(consumer);
                return;
            }
        }
    }

    @Override // j$.util.stream.F3
    protected final Spliterator c(Spliterator spliterator) {
        return new D3(spliterator, this);
    }
}
