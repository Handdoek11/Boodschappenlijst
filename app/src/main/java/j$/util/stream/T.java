package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes3.dex */
final class T extends CountedCompleter {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC5917b f37571a;

    /* renamed from: b, reason: collision with root package name */
    private Spliterator f37572b;

    /* renamed from: c, reason: collision with root package name */
    private final long f37573c;

    /* renamed from: d, reason: collision with root package name */
    private final ConcurrentHashMap f37574d;

    /* renamed from: e, reason: collision with root package name */
    private final S f37575e;

    /* renamed from: f, reason: collision with root package name */
    private final T f37576f;

    /* renamed from: g, reason: collision with root package name */
    private K0 f37577g;

    protected T(AbstractC5917b abstractC5917b, Spliterator spliterator, S s8) {
        super(null);
        this.f37571a = abstractC5917b;
        this.f37572b = spliterator;
        this.f37573c = AbstractC5932e.g(spliterator.estimateSize());
        this.f37574d = new ConcurrentHashMap(Math.max(16, AbstractC5932e.b() << 1));
        this.f37575e = s8;
        this.f37576f = null;
    }

    T(T t7, Spliterator spliterator, T t8) {
        super(t7);
        this.f37571a = t7.f37571a;
        this.f37572b = spliterator;
        this.f37573c = t7.f37573c;
        this.f37574d = t7.f37574d;
        this.f37575e = t7.f37575e;
        this.f37576f = t8;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f37572b;
        long j8 = this.f37573c;
        boolean z7 = false;
        T t7 = this;
        while (spliterator.estimateSize() > j8 && (trySplit = spliterator.trySplit()) != null) {
            T t8 = new T(t7, trySplit, t7.f37576f);
            T t9 = new T(t7, spliterator, t8);
            t7.addToPendingCount(1);
            t9.addToPendingCount(1);
            t7.f37574d.put(t8, t9);
            if (t7.f37576f != null) {
                t8.addToPendingCount(1);
                if (t7.f37574d.replace(t7.f37576f, t7, t8)) {
                    t7.addToPendingCount(-1);
                } else {
                    t8.addToPendingCount(-1);
                }
            }
            if (z7) {
                spliterator = trySplit;
                t7 = t8;
                t8 = t9;
            } else {
                t7 = t9;
            }
            z7 = !z7;
            t8.fork();
        }
        if (t7.getPendingCount() > 0) {
            r rVar = new r(8);
            AbstractC5917b abstractC5917b = t7.f37571a;
            C0 M7 = abstractC5917b.M(abstractC5917b.F(spliterator), rVar);
            t7.f37571a.U(spliterator, M7);
            t7.f37577g = M7.a();
            t7.f37572b = null;
        }
        t7.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        K0 k02 = this.f37577g;
        if (k02 != null) {
            k02.forEach(this.f37575e);
            this.f37577g = null;
        } else {
            Spliterator spliterator = this.f37572b;
            if (spliterator != null) {
                this.f37571a.U(spliterator, this.f37575e);
                this.f37572b = null;
            }
        }
        T t7 = (T) this.f37574d.remove(this);
        if (t7 != null) {
            t7.tryComplete();
        }
    }
}
