package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.m1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC5974m1 extends AbstractC5984o1 implements j$.util.e0 {
    @Override // j$.util.e0
    public final boolean tryAdvance(Object obj) {
        J0 j02;
        if (!c()) {
            return false;
        }
        boolean tryAdvance = ((j$.util.e0) this.f37760d).tryAdvance(obj);
        if (!tryAdvance) {
            if (this.f37759c == null && (j02 = (J0) AbstractC5984o1.a(this.f37761e)) != null) {
                j$.util.e0 spliterator = j02.spliterator();
                this.f37760d = spliterator;
                return spliterator.tryAdvance(obj);
            }
            this.f37757a = null;
        }
        return tryAdvance;
    }

    @Override // j$.util.e0
    public final void forEachRemaining(Object obj) {
        if (this.f37757a == null) {
            return;
        }
        if (this.f37760d == null) {
            Spliterator spliterator = this.f37759c;
            if (spliterator == null) {
                ArrayDeque b8 = b();
                while (true) {
                    J0 j02 = (J0) AbstractC5984o1.a(b8);
                    if (j02 != null) {
                        j02.e(obj);
                    } else {
                        this.f37757a = null;
                        return;
                    }
                }
            } else {
                ((j$.util.e0) spliterator).forEachRemaining(obj);
            }
        } else {
            while (tryAdvance(obj)) {
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
