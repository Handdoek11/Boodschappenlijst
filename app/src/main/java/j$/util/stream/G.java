package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* loaded from: classes3.dex */
final class G implements J3 {

    /* renamed from: a, reason: collision with root package name */
    final int f37465a;

    /* renamed from: b, reason: collision with root package name */
    final Object f37466b;

    /* renamed from: c, reason: collision with root package name */
    final Predicate f37467c;

    /* renamed from: d, reason: collision with root package name */
    final Supplier f37468d;

    G(boolean z7, EnumC5936e3 enumC5936e3, Object obj, Predicate predicate, Supplier supplier) {
        this.f37465a = (z7 ? 0 : EnumC5931d3.f37656r) | EnumC5931d3.f37659u;
        this.f37466b = obj;
        this.f37467c = predicate;
        this.f37468d = supplier;
    }

    @Override // j$.util.stream.J3
    public final int d() {
        return this.f37465a;
    }

    @Override // j$.util.stream.J3
    public final Object b(AbstractC5917b abstractC5917b, Spliterator spliterator) {
        K3 k32 = (K3) this.f37468d.get();
        abstractC5917b.U(spliterator, k32);
        Object obj = k32.get();
        return obj != null ? obj : this.f37466b;
    }

    @Override // j$.util.stream.J3
    public final Object c(AbstractC5917b abstractC5917b, Spliterator spliterator) {
        return new M(this, EnumC5931d3.ORDERED.n(abstractC5917b.J()), abstractC5917b, spliterator).invoke();
    }
}
