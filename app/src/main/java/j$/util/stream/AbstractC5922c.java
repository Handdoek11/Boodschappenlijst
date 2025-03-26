package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: j$.util.stream.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC5922c extends AbstractC5932e {

    /* renamed from: h, reason: collision with root package name */
    protected final AtomicReference f37632h;

    /* renamed from: i, reason: collision with root package name */
    protected volatile boolean f37633i;

    protected abstract Object j();

    protected AbstractC5922c(AbstractC5917b abstractC5917b, Spliterator spliterator) {
        super(abstractC5917b, spliterator);
        this.f37632h = new AtomicReference(null);
    }

    protected AbstractC5922c(AbstractC5922c abstractC5922c, Spliterator spliterator) {
        super(abstractC5922c, spliterator);
        this.f37632h = abstractC5922c.f37632h;
    }

    @Override // j$.util.stream.AbstractC5932e, java.util.concurrent.CountedCompleter
    public final void compute() {
        Object obj;
        Spliterator trySplit;
        Spliterator spliterator = this.f37668b;
        long estimateSize = spliterator.estimateSize();
        long j8 = this.f37669c;
        if (j8 == 0) {
            j8 = AbstractC5932e.g(estimateSize);
            this.f37669c = j8;
        }
        AtomicReference atomicReference = this.f37632h;
        boolean z7 = false;
        AbstractC5922c abstractC5922c = this;
        while (true) {
            obj = atomicReference.get();
            if (obj != null) {
                break;
            }
            boolean z8 = abstractC5922c.f37633i;
            if (!z8) {
                CountedCompleter<?> completer = abstractC5922c.getCompleter();
                while (true) {
                    AbstractC5922c abstractC5922c2 = (AbstractC5922c) ((AbstractC5932e) completer);
                    if (z8 || abstractC5922c2 == null) {
                        break;
                    }
                    z8 = abstractC5922c2.f37633i;
                    completer = abstractC5922c2.getCompleter();
                }
            }
            if (z8) {
                obj = abstractC5922c.j();
                break;
            }
            if (estimateSize <= j8 || (trySplit = spliterator.trySplit()) == null) {
                break;
            }
            AbstractC5922c abstractC5922c3 = (AbstractC5922c) abstractC5922c.e(trySplit);
            abstractC5922c.f37670d = abstractC5922c3;
            AbstractC5922c abstractC5922c4 = (AbstractC5922c) abstractC5922c.e(spliterator);
            abstractC5922c.f37671e = abstractC5922c4;
            abstractC5922c.setPendingCount(1);
            if (z7) {
                spliterator = trySplit;
                abstractC5922c = abstractC5922c3;
                abstractC5922c3 = abstractC5922c4;
            } else {
                abstractC5922c = abstractC5922c4;
            }
            z7 = !z7;
            abstractC5922c3.fork();
            estimateSize = spliterator.estimateSize();
        }
        obj = abstractC5922c.a();
        abstractC5922c.f(obj);
        abstractC5922c.tryComplete();
    }

    @Override // j$.util.stream.AbstractC5932e
    protected final void f(Object obj) {
        if (!d()) {
            super.f(obj);
        } else if (obj != null) {
            AtomicReference atomicReference = this.f37632h;
            while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
            }
        }
    }

    @Override // j$.util.stream.AbstractC5932e, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return c();
    }

    @Override // j$.util.stream.AbstractC5932e
    public final Object c() {
        if (d()) {
            Object obj = this.f37632h.get();
            return obj == null ? j() : obj;
        }
        return super.c();
    }

    protected void h() {
        this.f37633i = true;
    }

    protected final void i() {
        AbstractC5922c abstractC5922c = this;
        for (AbstractC5922c abstractC5922c2 = (AbstractC5922c) ((AbstractC5932e) getCompleter()); abstractC5922c2 != null; abstractC5922c2 = (AbstractC5922c) ((AbstractC5932e) abstractC5922c2.getCompleter())) {
            if (abstractC5922c2.f37670d == abstractC5922c) {
                AbstractC5922c abstractC5922c3 = (AbstractC5922c) abstractC5922c2.f37671e;
                if (!abstractC5922c3.f37633i) {
                    abstractC5922c3.h();
                }
            }
            abstractC5922c = abstractC5922c2;
        }
    }
}
