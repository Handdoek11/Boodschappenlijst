package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
final class q0 implements Y {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f37409a;

    /* renamed from: b, reason: collision with root package name */
    private int f37410b;

    /* renamed from: c, reason: collision with root package name */
    private final int f37411c;

    /* renamed from: d, reason: collision with root package name */
    private final int f37412d;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5897d.b(this, consumer);
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
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5897d.g(this, consumer);
    }

    public q0(int[] iArr, int i8, int i9, int i10) {
        this.f37409a = iArr;
        this.f37410b = i8;
        this.f37411c = i9;
        this.f37412d = i10 | 16448;
    }

    @Override // j$.util.e0, j$.util.Spliterator
    public final Y trySplit() {
        int i8 = this.f37410b;
        int i9 = (this.f37411c + i8) >>> 1;
        if (i8 >= i9) {
            return null;
        }
        this.f37410b = i9;
        return new q0(this.f37409a, i8, i9, this.f37412d);
    }

    @Override // j$.util.e0
    public final void forEachRemaining(IntConsumer intConsumer) {
        int i8;
        intConsumer.getClass();
        int[] iArr = this.f37409a;
        int length = iArr.length;
        int i9 = this.f37411c;
        if (length < i9 || (i8 = this.f37410b) < 0) {
            return;
        }
        this.f37410b = i9;
        if (i8 < i9) {
            do {
                intConsumer.accept(iArr[i8]);
                i8++;
            } while (i8 < i9);
        }
    }

    @Override // j$.util.e0
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        int i8 = this.f37410b;
        if (i8 < 0 || i8 >= this.f37411c) {
            return false;
        }
        this.f37410b = i8 + 1;
        intConsumer.accept(this.f37409a[i8]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f37411c - this.f37410b;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f37412d;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC5897d.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
