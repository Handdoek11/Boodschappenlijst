package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes3.dex */
final class U extends CountedCompleter {

    /* renamed from: a, reason: collision with root package name */
    private Spliterator f37581a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5985o2 f37582b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC5917b f37583c;

    /* renamed from: d, reason: collision with root package name */
    private long f37584d;

    U(AbstractC5917b abstractC5917b, Spliterator spliterator, InterfaceC5985o2 interfaceC5985o2) {
        super(null);
        this.f37582b = interfaceC5985o2;
        this.f37583c = abstractC5917b;
        this.f37581a = spliterator;
        this.f37584d = 0L;
    }

    U(U u7, Spliterator spliterator) {
        super(u7);
        this.f37581a = spliterator;
        this.f37582b = u7.f37582b;
        this.f37584d = u7.f37584d;
        this.f37583c = u7.f37583c;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f37581a;
        long estimateSize = spliterator.estimateSize();
        long j8 = this.f37584d;
        if (j8 == 0) {
            j8 = AbstractC5932e.g(estimateSize);
            this.f37584d = j8;
        }
        boolean n8 = EnumC5931d3.SHORT_CIRCUIT.n(this.f37583c.J());
        InterfaceC5985o2 interfaceC5985o2 = this.f37582b;
        boolean z7 = false;
        U u7 = this;
        while (true) {
            if (n8 && interfaceC5985o2.n()) {
                break;
            }
            if (estimateSize <= j8 || (trySplit = spliterator.trySplit()) == null) {
                break;
            }
            U u8 = new U(u7, trySplit);
            u7.addToPendingCount(1);
            if (z7) {
                spliterator = trySplit;
            } else {
                U u9 = u7;
                u7 = u8;
                u8 = u9;
            }
            z7 = !z7;
            u7.fork();
            u7 = u8;
            estimateSize = spliterator.estimateSize();
        }
        u7.f37583c.z(spliterator, interfaceC5985o2);
        u7.f37581a = null;
        u7.propagateCompletion();
    }
}
