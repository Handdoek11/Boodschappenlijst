package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.w1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC6023w1 extends CountedCompleter implements InterfaceC5985o2 {

    /* renamed from: a, reason: collision with root package name */
    protected final Spliterator f37811a;

    /* renamed from: b, reason: collision with root package name */
    protected final AbstractC5917b f37812b;

    /* renamed from: c, reason: collision with root package name */
    protected final long f37813c;

    /* renamed from: d, reason: collision with root package name */
    protected long f37814d;

    /* renamed from: e, reason: collision with root package name */
    protected long f37815e;

    /* renamed from: f, reason: collision with root package name */
    protected int f37816f;

    /* renamed from: g, reason: collision with root package name */
    protected int f37817g;

    public /* synthetic */ void accept(double d8) {
        AbstractC6032y0.a();
        throw null;
    }

    public /* synthetic */ void accept(int i8) {
        AbstractC6032y0.k();
        throw null;
    }

    public /* synthetic */ void accept(long j8) {
        AbstractC6032y0.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    abstract AbstractC6023w1 b(Spliterator spliterator, long j8, long j9);

    @Override // j$.util.stream.InterfaceC5985o2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final /* synthetic */ boolean n() {
        return false;
    }

    AbstractC6023w1(Spliterator spliterator, AbstractC5917b abstractC5917b, int i8) {
        this.f37811a = spliterator;
        this.f37812b = abstractC5917b;
        this.f37813c = AbstractC5932e.g(spliterator.estimateSize());
        this.f37814d = 0L;
        this.f37815e = i8;
    }

    AbstractC6023w1(AbstractC6023w1 abstractC6023w1, Spliterator spliterator, long j8, long j9, int i8) {
        super(abstractC6023w1);
        this.f37811a = spliterator;
        this.f37812b = abstractC6023w1.f37812b;
        this.f37813c = abstractC6023w1.f37813c;
        this.f37814d = j8;
        this.f37815e = j9;
        if (j8 < 0 || j9 < 0 || (j8 + j9) - 1 >= i8) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j8), Long.valueOf(j8), Long.valueOf(j9), Integer.valueOf(i8)));
        }
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f37811a;
        AbstractC6023w1 abstractC6023w1 = this;
        while (spliterator.estimateSize() > abstractC6023w1.f37813c && (trySplit = spliterator.trySplit()) != null) {
            abstractC6023w1.setPendingCount(1);
            long estimateSize = trySplit.estimateSize();
            abstractC6023w1.b(trySplit, abstractC6023w1.f37814d, estimateSize).fork();
            abstractC6023w1 = abstractC6023w1.b(spliterator, abstractC6023w1.f37814d + estimateSize, abstractC6023w1.f37815e - estimateSize);
        }
        abstractC6023w1.f37812b.U(spliterator, abstractC6023w1);
        abstractC6023w1.propagateCompletion();
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final void l(long j8) {
        long j9 = this.f37815e;
        if (j8 > j9) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i8 = (int) this.f37814d;
        this.f37816f = i8;
        this.f37817g = i8 + ((int) j9);
    }
}
