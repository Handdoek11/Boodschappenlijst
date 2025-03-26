package j$.util.stream;

import j$.util.AbstractC5897d;
import j$.util.Objects;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
abstract class W2 implements j$.util.e0 {

    /* renamed from: a, reason: collision with root package name */
    int f37592a;

    /* renamed from: b, reason: collision with root package name */
    final int f37593b;

    /* renamed from: c, reason: collision with root package name */
    int f37594c;

    /* renamed from: d, reason: collision with root package name */
    final int f37595d;

    /* renamed from: e, reason: collision with root package name */
    Object f37596e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ X2 f37597f;

    abstract void a(int i8, Object obj, Object obj2);

    abstract j$.util.e0 b(Object obj, int i8, int i9);

    abstract j$.util.e0 c(int i8, int i9, int i10, int i11);

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

    W2(X2 x22, int i8, int i9, int i10, int i11) {
        this.f37597f = x22;
        this.f37592a = i8;
        this.f37593b = i9;
        this.f37594c = i10;
        this.f37595d = i11;
        Object[] objArr = x22.f37604f;
        this.f37596e = objArr == null ? x22.f37603e : objArr[i8];
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i8 = this.f37592a;
        int i9 = this.f37595d;
        int i10 = this.f37593b;
        if (i8 == i10) {
            return i9 - this.f37594c;
        }
        long[] jArr = this.f37597f.f37642d;
        return ((jArr[i10] + i9) - jArr[i8]) - this.f37594c;
    }

    @Override // j$.util.e0
    public final boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        int i8 = this.f37592a;
        int i9 = this.f37593b;
        if (i8 >= i9 && (i8 != i9 || this.f37594c >= this.f37595d)) {
            return false;
        }
        Object obj2 = this.f37596e;
        int i10 = this.f37594c;
        this.f37594c = i10 + 1;
        a(i10, obj2, obj);
        int i11 = this.f37594c;
        Object obj3 = this.f37596e;
        X2 x22 = this.f37597f;
        if (i11 == x22.t(obj3)) {
            this.f37594c = 0;
            int i12 = this.f37592a + 1;
            this.f37592a = i12;
            Object[] objArr = x22.f37604f;
            if (objArr != null && i12 <= i9) {
                this.f37596e = objArr[i12];
            }
        }
        return true;
    }

    @Override // j$.util.e0
    public final void forEachRemaining(Object obj) {
        X2 x22;
        Objects.requireNonNull(obj);
        int i8 = this.f37592a;
        int i9 = this.f37595d;
        int i10 = this.f37593b;
        if (i8 < i10 || (i8 == i10 && this.f37594c < i9)) {
            int i11 = this.f37594c;
            while (true) {
                x22 = this.f37597f;
                if (i8 >= i10) {
                    break;
                }
                Object obj2 = x22.f37604f[i8];
                x22.s(obj2, i11, x22.t(obj2), obj);
                i8++;
                i11 = 0;
            }
            x22.s(this.f37592a == i10 ? this.f37596e : x22.f37604f[i10], i11, i9, obj);
            this.f37592a = i10;
            this.f37594c = i9;
        }
    }

    @Override // j$.util.Spliterator
    public final j$.util.e0 trySplit() {
        int i8 = this.f37592a;
        int i9 = this.f37593b;
        if (i8 < i9) {
            int i10 = i9 - 1;
            int i11 = this.f37594c;
            X2 x22 = this.f37597f;
            j$.util.e0 c8 = c(i8, i10, i11, x22.t(x22.f37604f[i10]));
            this.f37592a = i9;
            this.f37594c = 0;
            this.f37596e = x22.f37604f[i9];
            return c8;
        }
        if (i8 != i9) {
            return null;
        }
        int i12 = this.f37594c;
        int i13 = (this.f37595d - i12) / 2;
        if (i13 == 0) {
            return null;
        }
        j$.util.e0 b8 = b(this.f37596e, i12, i13);
        this.f37594c += i13;
        return b8;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    @Override // j$.util.e0, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.Y trySplit() {
        return (j$.util.Y) trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    @Override // j$.util.e0, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.b0 trySplit() {
        return (j$.util.b0) trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    @Override // j$.util.e0, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.V trySplit() {
        return (j$.util.V) trySplit();
    }
}
