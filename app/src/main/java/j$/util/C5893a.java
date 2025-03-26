package j$.util;

import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5893a implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.List f37273a;

    /* renamed from: b, reason: collision with root package name */
    private int f37274b;

    /* renamed from: c, reason: collision with root package name */
    private int f37275c;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
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

    C5893a(java.util.List list) {
        this.f37273a = list;
        this.f37274b = 0;
        this.f37275c = -1;
    }

    private C5893a(C5893a c5893a, int i8, int i9) {
        this.f37273a = c5893a.f37273a;
        this.f37274b = i8;
        this.f37275c = i9;
    }

    private int a() {
        int i8 = this.f37275c;
        if (i8 >= 0) {
            return i8;
        }
        int size = this.f37273a.size();
        this.f37275c = size;
        return size;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int a8 = a();
        int i8 = this.f37274b;
        int i9 = (a8 + i8) >>> 1;
        if (i8 >= i9) {
            return null;
        }
        this.f37274b = i9;
        return new C5893a(this, i8, i9);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        int a8 = a();
        int i8 = this.f37274b;
        if (i8 >= a8) {
            return false;
        }
        this.f37274b = i8 + 1;
        try {
            consumer.accept(this.f37273a.get(i8));
            return true;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int a8 = a();
        this.f37274b = a8;
        for (int i8 = this.f37274b; i8 < a8; i8++) {
            try {
                consumer.accept(this.f37273a.get(i8));
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return a() - this.f37274b;
    }
}
