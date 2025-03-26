package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* renamed from: j$.util.stream.b2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5920b2 extends AbstractC5932e {

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC6032y0 f37630h;

    @Override // j$.util.stream.AbstractC5932e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC5932e abstractC5932e = this.f37670d;
        if (abstractC5932e != null) {
            U1 u12 = (U1) ((C5920b2) abstractC5932e).c();
            u12.g((U1) ((C5920b2) this.f37671e).c());
            f(u12);
        }
        super.onCompletion(countedCompleter);
    }

    C5920b2(AbstractC6032y0 abstractC6032y0, AbstractC5917b abstractC5917b, Spliterator spliterator) {
        super(abstractC5917b, spliterator);
        this.f37630h = abstractC6032y0;
    }

    C5920b2(C5920b2 c5920b2, Spliterator spliterator) {
        super(c5920b2, spliterator);
        this.f37630h = c5920b2.f37630h;
    }

    @Override // j$.util.stream.AbstractC5932e
    protected final AbstractC5932e e(Spliterator spliterator) {
        return new C5920b2(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC5932e
    protected final Object a() {
        AbstractC5917b abstractC5917b = this.f37667a;
        U1 e02 = this.f37630h.e0();
        abstractC5917b.U(this.f37668b, e02);
        return e02;
    }
}
