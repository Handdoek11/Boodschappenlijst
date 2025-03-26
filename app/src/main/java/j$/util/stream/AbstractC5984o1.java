package j$.util.stream;

import j$.util.AbstractC5897d;
import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.Comparator;

/* renamed from: j$.util.stream.o1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC5984o1 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    K0 f37757a;

    /* renamed from: b, reason: collision with root package name */
    int f37758b;

    /* renamed from: c, reason: collision with root package name */
    Spliterator f37759c;

    /* renamed from: d, reason: collision with root package name */
    Spliterator f37760d;

    /* renamed from: e, reason: collision with root package name */
    ArrayDeque f37761e;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 64;
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

    AbstractC5984o1(K0 k02) {
        this.f37757a = k02;
    }

    protected final ArrayDeque b() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int q8 = this.f37757a.q();
        while (true) {
            q8--;
            if (q8 < this.f37758b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.f37757a.b(q8));
        }
    }

    protected static K0 a(ArrayDeque arrayDeque) {
        while (true) {
            K0 k02 = (K0) arrayDeque.pollFirst();
            if (k02 == null) {
                return null;
            }
            if (k02.q() != 0) {
                for (int q8 = k02.q() - 1; q8 >= 0; q8--) {
                    arrayDeque.addFirst(k02.b(q8));
                }
            } else if (k02.count() > 0) {
                return k02;
            }
        }
    }

    protected final boolean c() {
        if (this.f37757a == null) {
            return false;
        }
        if (this.f37760d != null) {
            return true;
        }
        Spliterator spliterator = this.f37759c;
        if (spliterator == null) {
            ArrayDeque b8 = b();
            this.f37761e = b8;
            K0 a8 = a(b8);
            if (a8 != null) {
                this.f37760d = a8.spliterator();
                return true;
            }
            this.f37757a = null;
            return false;
        }
        this.f37760d = spliterator;
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        K0 k02 = this.f37757a;
        if (k02 == null || this.f37760d != null) {
            return null;
        }
        Spliterator spliterator = this.f37759c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        if (this.f37758b < k02.q() - 1) {
            K0 k03 = this.f37757a;
            int i8 = this.f37758b;
            this.f37758b = i8 + 1;
            return k03.b(i8).spliterator();
        }
        K0 b8 = this.f37757a.b(this.f37758b);
        this.f37757a = b8;
        if (b8.q() == 0) {
            Spliterator spliterator2 = this.f37757a.spliterator();
            this.f37759c = spliterator2;
            return spliterator2.trySplit();
        }
        K0 k04 = this.f37757a;
        this.f37758b = 1;
        return k04.b(0).spliterator();
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        long j8 = 0;
        if (this.f37757a == null) {
            return 0L;
        }
        Spliterator spliterator = this.f37759c;
        if (spliterator != null) {
            return spliterator.estimateSize();
        }
        for (int i8 = this.f37758b; i8 < this.f37757a.q(); i8++) {
            j8 += this.f37757a.b(i8).count();
        }
        return j8;
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.e0 trySplit() {
        return (j$.util.e0) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.Y trySplit() {
        return (j$.util.Y) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.b0 trySplit() {
        return (j$.util.b0) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.V trySplit() {
        return (j$.util.V) trySplit();
    }
}
