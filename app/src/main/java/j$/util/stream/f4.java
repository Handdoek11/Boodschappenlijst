package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* loaded from: classes3.dex */
final class f4 extends AbstractC5922c {

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC5917b f37693j;

    /* renamed from: k, reason: collision with root package name */
    private final IntFunction f37694k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f37695l;

    /* renamed from: m, reason: collision with root package name */
    private long f37696m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f37697n;

    /* renamed from: o, reason: collision with root package name */
    private volatile boolean f37698o;

    @Override // j$.util.stream.AbstractC5922c
    protected final void h() {
        this.f37633i = true;
        if (this.f37695l && this.f37698o) {
            f(AbstractC6032y0.L(this.f37693j.H()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    @Override // j$.util.stream.AbstractC5932e, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCompletion(java.util.concurrent.CountedCompleter r9) {
        /*
            r8 = this;
            j$.util.stream.e r0 = r8.f37670d
            if (r0 != 0) goto L6
            goto L8b
        L6:
            j$.util.stream.f4 r0 = (j$.util.stream.f4) r0
            boolean r0 = r0.f37697n
            j$.util.stream.e r1 = r8.f37671e
            j$.util.stream.f4 r1 = (j$.util.stream.f4) r1
            boolean r1 = r1.f37697n
            r0 = r0 | r1
            r8.f37697n = r0
            boolean r0 = r8.f37695l
            r1 = 0
            if (r0 == 0) goto L2a
            boolean r0 = r8.f37633i
            if (r0 == 0) goto L2a
            r8.f37696m = r1
            j$.util.stream.b r0 = r8.f37693j
            j$.util.stream.e3 r0 = r0.H()
            j$.util.stream.e1 r0 = j$.util.stream.AbstractC6032y0.L(r0)
            goto L88
        L2a:
            boolean r0 = r8.f37695l
            if (r0 == 0) goto L41
            j$.util.stream.e r0 = r8.f37670d
            j$.util.stream.f4 r0 = (j$.util.stream.f4) r0
            boolean r3 = r0.f37697n
            if (r3 == 0) goto L41
            long r1 = r0.f37696m
            r8.f37696m = r1
            java.lang.Object r0 = r0.c()
            j$.util.stream.K0 r0 = (j$.util.stream.K0) r0
            goto L88
        L41:
            j$.util.stream.e r0 = r8.f37670d
            j$.util.stream.f4 r0 = (j$.util.stream.f4) r0
            long r3 = r0.f37696m
            j$.util.stream.e r5 = r8.f37671e
            j$.util.stream.f4 r5 = (j$.util.stream.f4) r5
            long r6 = r5.f37696m
            long r3 = r3 + r6
            r8.f37696m = r3
            long r3 = r0.f37696m
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 != 0) goto L5d
            java.lang.Object r0 = r5.c()
            j$.util.stream.K0 r0 = (j$.util.stream.K0) r0
            goto L88
        L5d:
            long r3 = r5.f37696m
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L6a
            java.lang.Object r0 = r0.c()
            j$.util.stream.K0 r0 = (j$.util.stream.K0) r0
            goto L88
        L6a:
            j$.util.stream.b r0 = r8.f37693j
            j$.util.stream.e3 r0 = r0.H()
            j$.util.stream.e r1 = r8.f37670d
            j$.util.stream.f4 r1 = (j$.util.stream.f4) r1
            java.lang.Object r1 = r1.c()
            j$.util.stream.K0 r1 = (j$.util.stream.K0) r1
            j$.util.stream.e r2 = r8.f37671e
            j$.util.stream.f4 r2 = (j$.util.stream.f4) r2
            java.lang.Object r2 = r2.c()
            j$.util.stream.K0 r2 = (j$.util.stream.K0) r2
            j$.util.stream.M0 r0 = j$.util.stream.AbstractC6032y0.I(r0, r1, r2)
        L88:
            r8.f(r0)
        L8b:
            r0 = 1
            r8.f37698o = r0
            super.onCompletion(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.f4.onCompletion(java.util.concurrent.CountedCompleter):void");
    }

    f4(AbstractC5917b abstractC5917b, AbstractC5917b abstractC5917b2, Spliterator spliterator, IntFunction intFunction) {
        super(abstractC5917b2, spliterator);
        this.f37693j = abstractC5917b;
        this.f37694k = intFunction;
        this.f37695l = EnumC5931d3.ORDERED.n(abstractC5917b2.J());
    }

    f4(f4 f4Var, Spliterator spliterator) {
        super(f4Var, spliterator);
        this.f37693j = f4Var.f37693j;
        this.f37694k = f4Var.f37694k;
        this.f37695l = f4Var.f37695l;
    }

    @Override // j$.util.stream.AbstractC5932e
    protected final AbstractC5932e e(Spliterator spliterator) {
        return new f4(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC5922c
    protected final Object j() {
        return AbstractC6032y0.L(this.f37693j.H());
    }

    @Override // j$.util.stream.AbstractC5932e
    protected final Object a() {
        C0 M7 = this.f37667a.M(-1L, this.f37694k);
        InterfaceC5985o2 Q7 = this.f37693j.Q(this.f37667a.J(), M7);
        AbstractC5917b abstractC5917b = this.f37667a;
        boolean A7 = abstractC5917b.A(this.f37668b, abstractC5917b.V(Q7));
        this.f37697n = A7;
        if (A7) {
            i();
        }
        K0 a8 = M7.a();
        this.f37696m = a8.count();
        return a8;
    }
}
