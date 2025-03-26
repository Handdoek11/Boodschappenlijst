package j$.util.stream;

import j$.util.AbstractC5897d;
import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import java.util.Comparator;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.m3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5976m3 implements Spliterator, Consumer {

    /* renamed from: d, reason: collision with root package name */
    private static final Object f37745d = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final Spliterator f37746a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f37747b;

    /* renamed from: c, reason: collision with root package name */
    private Object f37748c;

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

    C5976m3(Spliterator spliterator) {
        this(spliterator, new ConcurrentHashMap());
    }

    private C5976m3(Spliterator spliterator, ConcurrentHashMap concurrentHashMap) {
        this.f37746a = spliterator;
        this.f37747b = concurrentHashMap;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f37748c = obj;
    }

    final void b(Consumer consumer, Object obj) {
        if (this.f37747b.putIfAbsent(obj != null ? obj : f37745d, Boolean.TRUE) == null) {
            consumer.accept(obj);
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        while (this.f37746a.tryAdvance(this)) {
            Object obj = this.f37748c;
            if (obj == null) {
                obj = f37745d;
            }
            if (this.f37747b.putIfAbsent(obj, Boolean.TRUE) == null) {
                consumer.accept(this.f37748c);
                this.f37748c = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        this.f37746a.forEachRemaining(new C5967l(2, this, consumer));
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator trySplit = this.f37746a.trySplit();
        if (trySplit != null) {
            return new C5976m3(trySplit, this.f37747b);
        }
        return null;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f37746a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return (this.f37746a.characteristics() & (-16469)) | 1;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f37746a.getComparator();
    }
}
