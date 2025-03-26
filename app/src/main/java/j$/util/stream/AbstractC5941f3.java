package j$.util.stream;

import j$.util.AbstractC5897d;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.f3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC5941f3 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    final boolean f37684a;

    /* renamed from: b, reason: collision with root package name */
    final AbstractC5917b f37685b;

    /* renamed from: c, reason: collision with root package name */
    private Supplier f37686c;

    /* renamed from: d, reason: collision with root package name */
    Spliterator f37687d;

    /* renamed from: e, reason: collision with root package name */
    InterfaceC5985o2 f37688e;

    /* renamed from: f, reason: collision with root package name */
    BooleanSupplier f37689f;

    /* renamed from: g, reason: collision with root package name */
    long f37690g;

    /* renamed from: h, reason: collision with root package name */
    AbstractC5927d f37691h;

    /* renamed from: i, reason: collision with root package name */
    boolean f37692i;

    abstract void d();

    abstract AbstractC5941f3 e(Spliterator spliterator);

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i8) {
        return AbstractC5897d.e(this, i8);
    }

    AbstractC5941f3(AbstractC5917b abstractC5917b, Supplier supplier, boolean z7) {
        this.f37685b = abstractC5917b;
        this.f37686c = supplier;
        this.f37687d = null;
        this.f37684a = z7;
    }

    AbstractC5941f3(AbstractC5917b abstractC5917b, Spliterator spliterator, boolean z7) {
        this.f37685b = abstractC5917b;
        this.f37686c = null;
        this.f37687d = spliterator;
        this.f37684a = z7;
    }

    final void c() {
        if (this.f37687d == null) {
            this.f37687d = (Spliterator) this.f37686c.get();
            this.f37686c = null;
        }
    }

    final boolean a() {
        AbstractC5927d abstractC5927d = this.f37691h;
        if (abstractC5927d == null) {
            if (this.f37692i) {
                return false;
            }
            c();
            d();
            this.f37690g = 0L;
            this.f37688e.l(this.f37687d.getExactSizeIfKnown());
            return b();
        }
        long j8 = this.f37690g + 1;
        this.f37690g = j8;
        boolean z7 = j8 < abstractC5927d.count();
        if (z7) {
            return z7;
        }
        this.f37690g = 0L;
        this.f37691h.clear();
        return b();
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        if (!this.f37684a || this.f37691h != null || this.f37692i) {
            return null;
        }
        c();
        Spliterator trySplit = this.f37687d.trySplit();
        if (trySplit == null) {
            return null;
        }
        return e(trySplit);
    }

    private boolean b() {
        while (this.f37691h.count() == 0) {
            if (this.f37688e.n() || !this.f37689f.getAsBoolean()) {
                if (this.f37692i) {
                    return false;
                }
                this.f37688e.k();
                this.f37692i = true;
            }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        c();
        return this.f37687d.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        c();
        if (EnumC5931d3.SIZED.n(this.f37685b.J())) {
            return this.f37687d.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        c();
        int w7 = EnumC5931d3.w(this.f37685b.J()) & EnumC5931d3.f37644f;
        return (w7 & 64) != 0 ? (w7 & (-16449)) | (this.f37687d.characteristics() & 16448) : w7;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC5897d.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.f37687d);
    }
}
