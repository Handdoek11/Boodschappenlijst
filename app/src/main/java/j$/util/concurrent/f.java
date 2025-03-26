package j$.util.concurrent;

import j$.util.AbstractC5897d;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class f extends p implements Spliterator {

    /* renamed from: i, reason: collision with root package name */
    final ConcurrentHashMap f37312i;

    /* renamed from: j, reason: collision with root package name */
    long f37313j;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 4353;
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

    f(l[] lVarArr, int i8, int i9, int i10, long j8, ConcurrentHashMap concurrentHashMap) {
        super(lVarArr, i8, i9, i10);
        this.f37312i = concurrentHashMap;
        this.f37313j = j8;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i8 = this.f37334f;
        int i9 = this.f37335g;
        int i10 = (i8 + i9) >>> 1;
        if (i10 <= i8) {
            return null;
        }
        l[] lVarArr = this.f37329a;
        this.f37335g = i10;
        long j8 = this.f37313j >>> 1;
        this.f37313j = j8;
        return new f(lVarArr, this.f37336h, i10, i9, j8, this.f37312i);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        while (true) {
            l a8 = a();
            if (a8 == null) {
                return;
            } else {
                consumer.accept(new k(a8.f37322b, a8.f37323c, this.f37312i));
            }
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        l a8 = a();
        if (a8 == null) {
            return false;
        }
        consumer.accept(new k(a8.f37322b, a8.f37323c, this.f37312i));
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f37313j;
    }
}
