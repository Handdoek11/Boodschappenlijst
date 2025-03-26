package j$.util.stream;

import j$.util.AbstractC5897d;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
abstract class C3 extends F3 implements j$.util.e0 {
    protected abstract void e(Object obj);

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC5897d.d(this);
    }

    protected abstract AbstractC5961j3 h(int i8);

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i8) {
        return AbstractC5897d.e(this, i8);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.e0
    public final boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        while (d() != E3.NO_MORE && ((j$.util.e0) this.f37460a).tryAdvance(this)) {
            if (b(1L) == 1) {
                e(obj);
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.e0
    public final void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
        AbstractC5961j3 abstractC5961j3 = null;
        while (true) {
            E3 d8 = d();
            if (d8 == E3.NO_MORE) {
                return;
            }
            E3 e32 = E3.MAYBE_MORE;
            Spliterator spliterator = this.f37460a;
            if (d8 == e32) {
                int i8 = this.f37462c;
                if (abstractC5961j3 == null) {
                    abstractC5961j3 = h(i8);
                } else {
                    abstractC5961j3.f37721b = 0;
                }
                long j8 = 0;
                while (((j$.util.e0) spliterator).tryAdvance(abstractC5961j3)) {
                    j8++;
                    if (j8 >= i8) {
                        break;
                    }
                }
                if (j8 == 0) {
                    return;
                } else {
                    abstractC5961j3.b(obj, b(j8));
                }
            } else {
                ((j$.util.e0) spliterator).forEachRemaining(obj);
                return;
            }
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }
}
