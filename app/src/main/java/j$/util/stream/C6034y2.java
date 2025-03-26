package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.y2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6034y2 extends AbstractC5922c {

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC5917b f37833j;

    /* renamed from: k, reason: collision with root package name */
    private final IntFunction f37834k;

    /* renamed from: l, reason: collision with root package name */
    private final long f37835l;

    /* renamed from: m, reason: collision with root package name */
    private final long f37836m;

    /* renamed from: n, reason: collision with root package name */
    private long f37837n;

    /* renamed from: o, reason: collision with root package name */
    private volatile boolean f37838o;

    @Override // j$.util.stream.AbstractC5922c
    protected final void h() {
        this.f37633i = true;
        if (this.f37838o) {
            f(AbstractC6032y0.L(this.f37833j.H()));
        }
    }

    @Override // j$.util.stream.AbstractC5932e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        C6034y2 c6034y2;
        K0 L7;
        AbstractC5932e abstractC5932e = this.f37670d;
        if (!(abstractC5932e == null)) {
            this.f37837n = ((C6034y2) abstractC5932e).f37837n + ((C6034y2) this.f37671e).f37837n;
            if (this.f37633i) {
                this.f37837n = 0L;
                L7 = AbstractC6032y0.L(this.f37833j.H());
            } else {
                L7 = this.f37837n == 0 ? AbstractC6032y0.L(this.f37833j.H()) : ((C6034y2) this.f37670d).f37837n == 0 ? (K0) ((C6034y2) this.f37671e).c() : AbstractC6032y0.I(this.f37833j.H(), (K0) ((C6034y2) this.f37670d).c(), (K0) ((C6034y2) this.f37671e).c());
            }
            K0 k02 = L7;
            if (d()) {
                k02 = k02.h(this.f37835l, this.f37836m >= 0 ? Math.min(k02.count(), this.f37835l + this.f37836m) : this.f37837n, this.f37834k);
            }
            f(k02);
            this.f37838o = true;
        }
        if (this.f37836m >= 0 && !d()) {
            long j8 = this.f37835l + this.f37836m;
            long k8 = this.f37838o ? this.f37837n : k(j8);
            if (k8 >= j8) {
                i();
            } else {
                C6034y2 c6034y22 = (C6034y2) ((AbstractC5932e) getCompleter());
                C6034y2 c6034y23 = this;
                while (true) {
                    if (c6034y22 == null) {
                        if (k8 >= j8) {
                            break;
                        }
                    } else {
                        if (c6034y23 == c6034y22.f37671e && (c6034y2 = (C6034y2) c6034y22.f37670d) != null) {
                            k8 += c6034y2.k(j8);
                            if (k8 >= j8) {
                                break;
                            }
                        }
                        c6034y23 = c6034y22;
                        c6034y22 = (C6034y2) ((AbstractC5932e) c6034y22.getCompleter());
                    }
                }
                i();
            }
        }
        super.onCompletion(countedCompleter);
    }

    C6034y2(AbstractC5917b abstractC5917b, AbstractC5917b abstractC5917b2, Spliterator spliterator, IntFunction intFunction, long j8, long j9) {
        super(abstractC5917b2, spliterator);
        this.f37833j = abstractC5917b;
        this.f37834k = intFunction;
        this.f37835l = j8;
        this.f37836m = j9;
    }

    C6034y2(C6034y2 c6034y2, Spliterator spliterator) {
        super(c6034y2, spliterator);
        this.f37833j = c6034y2.f37833j;
        this.f37834k = c6034y2.f37834k;
        this.f37835l = c6034y2.f37835l;
        this.f37836m = c6034y2.f37836m;
    }

    @Override // j$.util.stream.AbstractC5932e
    protected final AbstractC5932e e(Spliterator spliterator) {
        return new C6034y2(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC5922c
    protected final Object j() {
        return AbstractC6032y0.L(this.f37833j.H());
    }

    @Override // j$.util.stream.AbstractC5932e
    protected final Object a() {
        if (d()) {
            C0 M7 = this.f37833j.M(EnumC5931d3.SIZED.s(this.f37833j.f37620c) ? this.f37833j.F(this.f37668b) : -1L, this.f37834k);
            InterfaceC5985o2 Q7 = this.f37833j.Q(this.f37667a.J(), M7);
            AbstractC5917b abstractC5917b = this.f37667a;
            abstractC5917b.A(this.f37668b, abstractC5917b.V(Q7));
            return M7.a();
        }
        C0 M8 = this.f37833j.M(-1L, this.f37834k);
        if (this.f37835l == 0) {
            InterfaceC5985o2 Q8 = this.f37833j.Q(this.f37667a.J(), M8);
            AbstractC5917b abstractC5917b2 = this.f37667a;
            abstractC5917b2.A(this.f37668b, abstractC5917b2.V(Q8));
        } else {
            this.f37667a.U(this.f37668b, M8);
        }
        K0 a8 = M8.a();
        this.f37837n = a8.count();
        this.f37838o = true;
        this.f37668b = null;
        return a8;
    }

    private long k(long j8) {
        if (this.f37838o) {
            return this.f37837n;
        }
        C6034y2 c6034y2 = (C6034y2) this.f37670d;
        C6034y2 c6034y22 = (C6034y2) this.f37671e;
        if (c6034y2 == null || c6034y22 == null) {
            return this.f37837n;
        }
        long k8 = c6034y2.k(j8);
        return k8 >= j8 ? k8 : k8 + c6034y22.k(j8);
    }
}
