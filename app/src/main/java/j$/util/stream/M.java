package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
final class M extends AbstractC5922c {

    /* renamed from: j, reason: collision with root package name */
    private final G f37508j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f37509k;

    M(G g8, boolean z7, AbstractC5917b abstractC5917b, Spliterator spliterator) {
        super(abstractC5917b, spliterator);
        this.f37509k = z7;
        this.f37508j = g8;
    }

    M(M m8, Spliterator spliterator) {
        super(m8, spliterator);
        this.f37509k = m8.f37509k;
        this.f37508j = m8.f37508j;
    }

    @Override // j$.util.stream.AbstractC5932e
    protected final AbstractC5932e e(Spliterator spliterator) {
        return new M(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC5922c
    protected final Object j() {
        return this.f37508j.f37466b;
    }

    @Override // j$.util.stream.AbstractC5932e
    protected final Object a() {
        AbstractC5917b abstractC5917b = this.f37667a;
        K3 k32 = (K3) this.f37508j.f37468d.get();
        abstractC5917b.U(this.f37668b, k32);
        Object obj = k32.get();
        if (!this.f37509k) {
            if (obj != null) {
                AtomicReference atomicReference = this.f37632h;
                while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
                }
            }
            return null;
        }
        if (obj == null) {
            return null;
        }
        AbstractC5932e abstractC5932e = this;
        while (true) {
            if (abstractC5932e != null) {
                AbstractC5932e abstractC5932e2 = (AbstractC5932e) abstractC5932e.getCompleter();
                if (abstractC5932e2 != null && abstractC5932e2.f37670d != abstractC5932e) {
                    i();
                    break;
                }
                abstractC5932e = abstractC5932e2;
            } else {
                AtomicReference atomicReference2 = this.f37632h;
                while (!atomicReference2.compareAndSet(null, obj) && atomicReference2.get() == null) {
                }
            }
        }
        return obj;
    }

    @Override // j$.util.stream.AbstractC5932e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        if (this.f37509k) {
            M m8 = (M) this.f37670d;
            M m9 = null;
            while (true) {
                if (m8 != m9) {
                    Object c8 = m8.c();
                    if (c8 != null && this.f37508j.f37467c.test(c8)) {
                        f(c8);
                        AbstractC5932e abstractC5932e = this;
                        while (true) {
                            if (abstractC5932e != null) {
                                AbstractC5932e abstractC5932e2 = (AbstractC5932e) abstractC5932e.getCompleter();
                                if (abstractC5932e2 != null && abstractC5932e2.f37670d != abstractC5932e) {
                                    i();
                                    break;
                                }
                                abstractC5932e = abstractC5932e2;
                            } else {
                                AtomicReference atomicReference = this.f37632h;
                                while (!atomicReference.compareAndSet(null, c8) && atomicReference.get() == null) {
                                }
                            }
                        }
                    } else {
                        m9 = m8;
                        m8 = (M) this.f37671e;
                    }
                } else {
                    break;
                }
            }
        }
        super.onCompletion(countedCompleter);
    }
}
