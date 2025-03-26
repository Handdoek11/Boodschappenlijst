package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
abstract class F3 {

    /* renamed from: a, reason: collision with root package name */
    protected final Spliterator f37460a;

    /* renamed from: b, reason: collision with root package name */
    protected final boolean f37461b;

    /* renamed from: c, reason: collision with root package name */
    protected final int f37462c;

    /* renamed from: d, reason: collision with root package name */
    private final long f37463d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicLong f37464e;

    protected abstract Spliterator c(Spliterator spliterator);

    F3(Spliterator spliterator, long j8, long j9) {
        this.f37460a = spliterator;
        this.f37461b = j9 < 0;
        this.f37463d = j9 >= 0 ? j9 : 0L;
        this.f37462c = 128;
        this.f37464e = new AtomicLong(j9 >= 0 ? j8 + j9 : j8);
    }

    F3(Spliterator spliterator, F3 f32) {
        this.f37460a = spliterator;
        this.f37461b = f32.f37461b;
        this.f37464e = f32.f37464e;
        this.f37463d = f32.f37463d;
        this.f37462c = f32.f37462c;
    }

    protected final long b(long j8) {
        AtomicLong atomicLong;
        long j9;
        boolean z7;
        long min;
        do {
            atomicLong = this.f37464e;
            j9 = atomicLong.get();
            z7 = this.f37461b;
            if (j9 != 0) {
                min = Math.min(j9, j8);
                if (min <= 0) {
                    break;
                }
            } else {
                if (z7) {
                    return j8;
                }
                return 0L;
            }
        } while (!atomicLong.compareAndSet(j9, j9 - min));
        if (z7) {
            return Math.max(j8 - min, 0L);
        }
        long j10 = this.f37463d;
        return j9 > j10 ? Math.max(min - (j9 - j10), 0L) : min;
    }

    protected final E3 d() {
        if (this.f37464e.get() > 0) {
            return E3.MAYBE_MORE;
        }
        return this.f37461b ? E3.UNLIMITED : E3.NO_MORE;
    }

    public final Spliterator trySplit() {
        Spliterator trySplit;
        if (this.f37464e.get() == 0 || (trySplit = this.f37460a.trySplit()) == null) {
            return null;
        }
        return c(trySplit);
    }

    public final long estimateSize() {
        return this.f37460a.estimateSize();
    }

    public final int characteristics() {
        return this.f37460a.characteristics() & (-16465);
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.e0 m25trySplit() {
        return (j$.util.e0) trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.Y m23trySplit() {
        return (j$.util.Y) trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.b0 m24trySplit() {
        return (j$.util.b0) trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.V m22trySplit() {
        return (j$.util.V) trySplit();
    }
}
