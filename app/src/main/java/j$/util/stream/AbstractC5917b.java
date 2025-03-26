package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC5917b implements InterfaceC5947h {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC5917b f37618a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC5917b f37619b;

    /* renamed from: c, reason: collision with root package name */
    protected final int f37620c;

    /* renamed from: d, reason: collision with root package name */
    private AbstractC5917b f37621d;

    /* renamed from: e, reason: collision with root package name */
    private int f37622e;

    /* renamed from: f, reason: collision with root package name */
    private int f37623f;

    /* renamed from: g, reason: collision with root package name */
    private Spliterator f37624g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f37625h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f37626i;

    /* renamed from: j, reason: collision with root package name */
    private Runnable f37627j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f37628k;

    abstract K0 E(AbstractC5917b abstractC5917b, Spliterator spliterator, boolean z7, IntFunction intFunction);

    abstract boolean G(Spliterator spliterator, InterfaceC5985o2 interfaceC5985o2);

    abstract EnumC5936e3 H();

    abstract C0 M(long j8, IntFunction intFunction);

    abstract boolean P();

    abstract InterfaceC5985o2 Q(int i8, InterfaceC5985o2 interfaceC5985o2);

    abstract Spliterator T(AbstractC5917b abstractC5917b, Supplier supplier, boolean z7);

    AbstractC5917b(Spliterator spliterator, int i8, boolean z7) {
        this.f37619b = null;
        this.f37624g = spliterator;
        this.f37618a = this;
        int i9 = EnumC5931d3.f37645g & i8;
        this.f37620c = i9;
        this.f37623f = (~(i9 << 1)) & EnumC5931d3.f37650l;
        this.f37622e = 0;
        this.f37628k = z7;
    }

    AbstractC5917b(AbstractC5917b abstractC5917b, int i8) {
        if (abstractC5917b.f37625h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        abstractC5917b.f37625h = true;
        abstractC5917b.f37621d = this;
        this.f37619b = abstractC5917b;
        this.f37620c = EnumC5931d3.f37646h & i8;
        this.f37623f = EnumC5931d3.j(i8, abstractC5917b.f37623f);
        AbstractC5917b abstractC5917b2 = abstractC5917b.f37618a;
        this.f37618a = abstractC5917b2;
        if (P()) {
            abstractC5917b2.f37626i = true;
        }
        this.f37622e = abstractC5917b.f37622e + 1;
    }

    final Object C(J3 j32) {
        if (this.f37625h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f37625h = true;
        if (this.f37618a.f37628k) {
            return j32.c(this, R(j32.d()));
        }
        return j32.b(this, R(j32.d()));
    }

    final K0 D(IntFunction intFunction) {
        AbstractC5917b abstractC5917b;
        if (this.f37625h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f37625h = true;
        if (this.f37618a.f37628k && (abstractC5917b = this.f37619b) != null && P()) {
            this.f37622e = 0;
            return N(abstractC5917b, abstractC5917b.R(0), intFunction);
        }
        return B(R(0), true, intFunction);
    }

    final Spliterator S() {
        AbstractC5917b abstractC5917b = this.f37618a;
        if (this != abstractC5917b) {
            throw new IllegalStateException();
        }
        if (this.f37625h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f37625h = true;
        Spliterator spliterator = abstractC5917b.f37624g;
        if (spliterator != null) {
            abstractC5917b.f37624g = null;
            return spliterator;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    @Override // j$.util.stream.InterfaceC5947h, j$.util.stream.F
    public final InterfaceC5947h sequential() {
        this.f37618a.f37628k = false;
        return this;
    }

    @Override // j$.util.stream.InterfaceC5947h, j$.util.stream.F
    public final InterfaceC5947h parallel() {
        this.f37618a.f37628k = true;
        return this;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f37625h = true;
        this.f37624g = null;
        AbstractC5917b abstractC5917b = this.f37618a;
        Runnable runnable = abstractC5917b.f37627j;
        if (runnable != null) {
            abstractC5917b.f37627j = null;
            runnable.run();
        }
    }

    @Override // j$.util.stream.InterfaceC5947h
    public final InterfaceC5947h onClose(Runnable runnable) {
        if (this.f37625h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        Objects.requireNonNull(runnable);
        AbstractC5917b abstractC5917b = this.f37618a;
        Runnable runnable2 = abstractC5917b.f37627j;
        if (runnable2 != null) {
            runnable = new I3(runnable2, runnable);
        }
        abstractC5917b.f37627j = runnable;
        return this;
    }

    @Override // j$.util.stream.InterfaceC5947h
    public Spliterator spliterator() {
        if (this.f37625h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f37625h = true;
        AbstractC5917b abstractC5917b = this.f37618a;
        if (this == abstractC5917b) {
            Spliterator spliterator = abstractC5917b.f37624g;
            if (spliterator != null) {
                abstractC5917b.f37624g = null;
                return spliterator;
            }
            throw new IllegalStateException("source already consumed or closed");
        }
        return T(this, new C5912a(0, this), abstractC5917b.f37628k);
    }

    final /* synthetic */ Spliterator L() {
        return R(0);
    }

    final K0 B(Spliterator spliterator, boolean z7, IntFunction intFunction) {
        if (this.f37618a.f37628k) {
            return E(this, spliterator, z7, intFunction);
        }
        C0 M7 = M(F(spliterator), intFunction);
        U(spliterator, M7);
        return M7.a();
    }

    @Override // j$.util.stream.InterfaceC5947h
    public final boolean isParallel() {
        return this.f37618a.f37628k;
    }

    private Spliterator R(int i8) {
        int i9;
        int i10;
        AbstractC5917b abstractC5917b = this.f37618a;
        Spliterator spliterator = abstractC5917b.f37624g;
        if (spliterator != null) {
            abstractC5917b.f37624g = null;
            if (abstractC5917b.f37628k && abstractC5917b.f37626i) {
                AbstractC5917b abstractC5917b2 = abstractC5917b.f37621d;
                int i11 = 1;
                while (abstractC5917b != this) {
                    int i12 = abstractC5917b2.f37620c;
                    if (abstractC5917b2.P()) {
                        if (EnumC5931d3.SHORT_CIRCUIT.n(i12)) {
                            i12 &= ~EnumC5931d3.f37659u;
                        }
                        spliterator = abstractC5917b2.O(abstractC5917b, spliterator);
                        if (spliterator.hasCharacteristics(64)) {
                            i9 = (~EnumC5931d3.f37658t) & i12;
                            i10 = EnumC5931d3.f37657s;
                        } else {
                            i9 = (~EnumC5931d3.f37657s) & i12;
                            i10 = EnumC5931d3.f37658t;
                        }
                        i12 = i9 | i10;
                        i11 = 0;
                    }
                    abstractC5917b2.f37622e = i11;
                    abstractC5917b2.f37623f = EnumC5931d3.j(i12, abstractC5917b.f37623f);
                    i11++;
                    AbstractC5917b abstractC5917b3 = abstractC5917b2;
                    abstractC5917b2 = abstractC5917b2.f37621d;
                    abstractC5917b = abstractC5917b3;
                }
            }
            if (i8 != 0) {
                this.f37623f = EnumC5931d3.j(i8, this.f37623f);
            }
            return spliterator;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    final EnumC5936e3 I() {
        AbstractC5917b abstractC5917b = this;
        while (abstractC5917b.f37622e > 0) {
            abstractC5917b = abstractC5917b.f37619b;
        }
        return abstractC5917b.H();
    }

    final long F(Spliterator spliterator) {
        if (EnumC5931d3.SIZED.n(this.f37623f)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    final InterfaceC5985o2 U(Spliterator spliterator, InterfaceC5985o2 interfaceC5985o2) {
        z(spliterator, V((InterfaceC5985o2) Objects.requireNonNull(interfaceC5985o2)));
        return interfaceC5985o2;
    }

    final void z(Spliterator spliterator, InterfaceC5985o2 interfaceC5985o2) {
        Objects.requireNonNull(interfaceC5985o2);
        if (!EnumC5931d3.SHORT_CIRCUIT.n(this.f37623f)) {
            interfaceC5985o2.l(spliterator.getExactSizeIfKnown());
            spliterator.forEachRemaining(interfaceC5985o2);
            interfaceC5985o2.k();
            return;
        }
        A(spliterator, interfaceC5985o2);
    }

    final boolean A(Spliterator spliterator, InterfaceC5985o2 interfaceC5985o2) {
        AbstractC5917b abstractC5917b = this;
        while (abstractC5917b.f37622e > 0) {
            abstractC5917b = abstractC5917b.f37619b;
        }
        interfaceC5985o2.l(spliterator.getExactSizeIfKnown());
        boolean G7 = abstractC5917b.G(spliterator, interfaceC5985o2);
        interfaceC5985o2.k();
        return G7;
    }

    final int J() {
        return this.f37623f;
    }

    final boolean K() {
        return EnumC5931d3.ORDERED.n(this.f37623f);
    }

    final InterfaceC5985o2 V(InterfaceC5985o2 interfaceC5985o2) {
        Objects.requireNonNull(interfaceC5985o2);
        AbstractC5917b abstractC5917b = this;
        while (abstractC5917b.f37622e > 0) {
            AbstractC5917b abstractC5917b2 = abstractC5917b.f37619b;
            interfaceC5985o2 = abstractC5917b.Q(abstractC5917b2.f37623f, interfaceC5985o2);
            abstractC5917b = abstractC5917b2;
        }
        return interfaceC5985o2;
    }

    final Spliterator W(Spliterator spliterator) {
        return this.f37622e == 0 ? spliterator : T(this, new C5912a(6, spliterator), this.f37618a.f37628k);
    }

    K0 N(AbstractC5917b abstractC5917b, Spliterator spliterator, IntFunction intFunction) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    Spliterator O(AbstractC5917b abstractC5917b, Spliterator spliterator) {
        return N(abstractC5917b, spliterator, new C5962k(17)).spliterator();
    }
}
