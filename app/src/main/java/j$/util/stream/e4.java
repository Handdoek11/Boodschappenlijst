package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* loaded from: classes3.dex */
final class e4 extends AbstractC5932e {

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC5917b f37675h;

    /* renamed from: i, reason: collision with root package name */
    private final IntFunction f37676i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f37677j;

    /* renamed from: k, reason: collision with root package name */
    private long f37678k;

    /* renamed from: l, reason: collision with root package name */
    private long f37679l;

    @Override // j$.util.stream.AbstractC5932e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        K0 I7;
        AbstractC5932e abstractC5932e = this.f37670d;
        if (abstractC5932e != null) {
            if (this.f37677j) {
                e4 e4Var = (e4) abstractC5932e;
                long j8 = e4Var.f37679l;
                this.f37679l = j8;
                if (j8 == e4Var.f37678k) {
                    this.f37679l = j8 + ((e4) this.f37671e).f37679l;
                }
            }
            e4 e4Var2 = (e4) abstractC5932e;
            long j9 = e4Var2.f37678k;
            e4 e4Var3 = (e4) this.f37671e;
            this.f37678k = j9 + e4Var3.f37678k;
            if (e4Var2.f37678k == 0) {
                I7 = (K0) e4Var3.c();
            } else if (e4Var3.f37678k == 0) {
                I7 = (K0) e4Var2.c();
            } else {
                I7 = AbstractC6032y0.I(this.f37675h.H(), (K0) ((e4) this.f37670d).c(), (K0) ((e4) this.f37671e).c());
            }
            K0 k02 = I7;
            if (d() && this.f37677j) {
                k02 = k02.h(this.f37679l, k02.count(), this.f37676i);
            }
            f(k02);
        }
        super.onCompletion(countedCompleter);
    }

    e4(AbstractC5917b abstractC5917b, AbstractC5917b abstractC5917b2, Spliterator spliterator, IntFunction intFunction) {
        super(abstractC5917b2, spliterator);
        this.f37675h = abstractC5917b;
        this.f37676i = intFunction;
        this.f37677j = EnumC5931d3.ORDERED.n(abstractC5917b2.J());
    }

    e4(e4 e4Var, Spliterator spliterator) {
        super(e4Var, spliterator);
        this.f37675h = e4Var.f37675h;
        this.f37676i = e4Var.f37676i;
        this.f37677j = e4Var.f37677j;
    }

    @Override // j$.util.stream.AbstractC5932e
    protected final AbstractC5932e e(Spliterator spliterator) {
        return new e4(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC5932e
    protected final Object a() {
        boolean d8 = d();
        C0 M7 = this.f37667a.M((!d8 && this.f37677j && EnumC5931d3.SIZED.s(this.f37675h.f37620c)) ? this.f37675h.F(this.f37668b) : -1L, this.f37676i);
        d4 j8 = ((c4) this.f37675h).j(M7, this.f37677j && !d8);
        this.f37667a.U(this.f37668b, j8);
        K0 a8 = M7.a();
        this.f37678k = a8.count();
        this.f37679l = j8.f();
        return a8;
    }
}
