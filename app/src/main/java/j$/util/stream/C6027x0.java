package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: j$.util.stream.x0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6027x0 extends AbstractC5922c {

    /* renamed from: j, reason: collision with root package name */
    private final C6022w0 f37821j;

    C6027x0(C6022w0 c6022w0, AbstractC5917b abstractC5917b, Spliterator spliterator) {
        super(abstractC5917b, spliterator);
        this.f37821j = c6022w0;
    }

    C6027x0(C6027x0 c6027x0, Spliterator spliterator) {
        super(c6027x0, spliterator);
        this.f37821j = c6027x0.f37821j;
    }

    @Override // j$.util.stream.AbstractC5932e
    protected final AbstractC5932e e(Spliterator spliterator) {
        return new C6027x0(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC5932e
    protected final Object a() {
        AbstractC5917b abstractC5917b = this.f37667a;
        AbstractC6012u0 abstractC6012u0 = (AbstractC6012u0) this.f37821j.f37810b.get();
        abstractC5917b.U(this.f37668b, abstractC6012u0);
        boolean z7 = abstractC6012u0.f37796b;
        if (z7 == this.f37821j.f37809a.f37803b) {
            Boolean valueOf = Boolean.valueOf(z7);
            AtomicReference atomicReference = this.f37632h;
            while (!atomicReference.compareAndSet(null, valueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC5922c
    protected final Object j() {
        return Boolean.valueOf(!this.f37821j.f37809a.f37803b);
    }
}
