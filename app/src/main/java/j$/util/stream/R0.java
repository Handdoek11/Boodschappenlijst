package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* loaded from: classes3.dex */
class R0 extends AbstractC5932e {

    /* renamed from: h, reason: collision with root package name */
    protected final AbstractC5917b f37558h;

    /* renamed from: i, reason: collision with root package name */
    protected final LongFunction f37559i;

    /* renamed from: j, reason: collision with root package name */
    protected final BinaryOperator f37560j;

    @Override // j$.util.stream.AbstractC5932e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC5932e abstractC5932e = this.f37670d;
        if (abstractC5932e != null) {
            f((K0) this.f37560j.apply((K0) ((R0) abstractC5932e).c(), (K0) ((R0) this.f37671e).c()));
        }
        super.onCompletion(countedCompleter);
    }

    R0(AbstractC5917b abstractC5917b, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator) {
        super(abstractC5917b, spliterator);
        this.f37558h = abstractC5917b;
        this.f37559i = longFunction;
        this.f37560j = binaryOperator;
    }

    R0(R0 r02, Spliterator spliterator) {
        super(r02, spliterator);
        this.f37558h = r02.f37558h;
        this.f37559i = r02.f37559i;
        this.f37560j = r02.f37560j;
    }

    @Override // j$.util.stream.AbstractC5932e
    protected AbstractC5932e e(Spliterator spliterator) {
        return new R0(this, spliterator);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC5932e
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final K0 a() {
        C0 c02 = (C0) this.f37559i.apply(this.f37558h.F(this.f37668b));
        this.f37558h.U(this.f37668b, c02);
        return c02.a();
    }
}
