package j$.util.stream;

import j$.util.AbstractC5897d;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
abstract class k4 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    final Spliterator f37729a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicBoolean f37730b;

    /* renamed from: c, reason: collision with root package name */
    boolean f37731c;

    /* renamed from: d, reason: collision with root package name */
    int f37732d;

    abstract Spliterator c(Spliterator spliterator);

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i8) {
        return AbstractC5897d.e(this, i8);
    }

    @Override // j$.util.Spliterator
    public void forEachRemaining(Consumer consumer) {
        while (tryAdvance(consumer)) {
        }
    }

    k4(Spliterator spliterator) {
        this.f37731c = true;
        this.f37729a = spliterator;
        this.f37730b = new AtomicBoolean();
    }

    k4(Spliterator spliterator, k4 k4Var) {
        this.f37731c = true;
        this.f37729a = spliterator;
        k4Var.getClass();
        this.f37730b = k4Var.f37730b;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f37729a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f37729a.characteristics() & (-16449);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f37729a.getComparator();
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        Spliterator trySplit = this.f37729a.trySplit();
        if (trySplit != null) {
            return c(trySplit);
        }
        return null;
    }

    final boolean b() {
        return (this.f37732d == 0 && this.f37730b.get()) ? false : true;
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

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.e0 trySplit() {
        return (j$.util.e0) trySplit();
    }
}
