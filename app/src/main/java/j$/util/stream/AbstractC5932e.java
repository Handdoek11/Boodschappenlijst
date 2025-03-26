package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;

/* renamed from: j$.util.stream.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC5932e extends CountedCompleter {

    /* renamed from: g, reason: collision with root package name */
    private static final int f37666g = ForkJoinPool.getCommonPoolParallelism() << 2;

    /* renamed from: a, reason: collision with root package name */
    protected final AbstractC5917b f37667a;

    /* renamed from: b, reason: collision with root package name */
    protected Spliterator f37668b;

    /* renamed from: c, reason: collision with root package name */
    protected long f37669c;

    /* renamed from: d, reason: collision with root package name */
    protected AbstractC5932e f37670d;

    /* renamed from: e, reason: collision with root package name */
    protected AbstractC5932e f37671e;

    /* renamed from: f, reason: collision with root package name */
    private Object f37672f;

    protected abstract Object a();

    protected abstract AbstractC5932e e(Spliterator spliterator);

    protected AbstractC5932e(AbstractC5917b abstractC5917b, Spliterator spliterator) {
        super(null);
        this.f37667a = abstractC5917b;
        this.f37668b = spliterator;
        this.f37669c = 0L;
    }

    protected AbstractC5932e(AbstractC5932e abstractC5932e, Spliterator spliterator) {
        super(abstractC5932e);
        this.f37668b = spliterator;
        this.f37667a = abstractC5932e.f37667a;
        this.f37669c = abstractC5932e.f37669c;
    }

    public static int b() {
        return f37666g;
    }

    public static long g(long j8) {
        long j9 = j8 / f37666g;
        if (j9 > 0) {
            return j9;
        }
        return 1L;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f37672f;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    protected final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }

    protected Object c() {
        return this.f37672f;
    }

    protected void f(Object obj) {
        this.f37672f = obj;
    }

    protected final boolean d() {
        return ((AbstractC5932e) getCompleter()) == null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f37668b;
        long estimateSize = spliterator.estimateSize();
        long j8 = this.f37669c;
        if (j8 == 0) {
            j8 = g(estimateSize);
            this.f37669c = j8;
        }
        boolean z7 = false;
        AbstractC5932e abstractC5932e = this;
        while (estimateSize > j8 && (trySplit = spliterator.trySplit()) != null) {
            AbstractC5932e e8 = abstractC5932e.e(trySplit);
            abstractC5932e.f37670d = e8;
            AbstractC5932e e9 = abstractC5932e.e(spliterator);
            abstractC5932e.f37671e = e9;
            abstractC5932e.setPendingCount(1);
            if (z7) {
                spliterator = trySplit;
                abstractC5932e = e8;
                e8 = e9;
            } else {
                abstractC5932e = e9;
            }
            z7 = !z7;
            e8.fork();
            estimateSize = spliterator.estimateSize();
        }
        abstractC5932e.f(abstractC5932e.a());
        abstractC5932e.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.f37668b = null;
        this.f37671e = null;
        this.f37670d = null;
    }
}
