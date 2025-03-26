package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class k0 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f37395a;

    /* renamed from: b, reason: collision with root package name */
    private int f37396b;

    /* renamed from: c, reason: collision with root package name */
    private final int f37397c;

    /* renamed from: d, reason: collision with root package name */
    private final int f37398d;

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC5897d.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i8) {
        return AbstractC5897d.e(this, i8);
    }

    public k0(Object[] objArr, int i8, int i9, int i10) {
        this.f37395a = objArr;
        this.f37396b = i8;
        this.f37397c = i9;
        this.f37398d = i10 | 16448;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i8 = this.f37396b;
        int i9 = (this.f37397c + i8) >>> 1;
        if (i8 >= i9) {
            return null;
        }
        this.f37396b = i9;
        return new k0(this.f37395a, i8, i9, this.f37398d);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        int i8;
        consumer.getClass();
        Object[] objArr = this.f37395a;
        int length = objArr.length;
        int i9 = this.f37397c;
        if (length < i9 || (i8 = this.f37396b) < 0) {
            return;
        }
        this.f37396b = i9;
        if (i8 < i9) {
            do {
                consumer.accept(objArr[i8]);
                i8++;
            } while (i8 < i9);
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        int i8 = this.f37396b;
        if (i8 < 0 || i8 >= this.f37397c) {
            return false;
        }
        this.f37396b = i8 + 1;
        consumer.accept(this.f37395a[i8]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f37397c - this.f37396b;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f37398d;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC5897d.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
