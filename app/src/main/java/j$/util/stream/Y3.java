package j$.util.stream;

import java.util.function.DoublePredicate;

/* loaded from: classes3.dex */
final class Y3 extends AbstractC5950h2 {

    /* renamed from: b, reason: collision with root package name */
    boolean f37608b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Z3 f37609c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Y3(Z3 z32, InterfaceC5985o2 interfaceC5985o2) {
        super(interfaceC5985o2);
        this.f37609c = z32;
        this.f37608b = true;
    }

    @Override // j$.util.stream.AbstractC5950h2, j$.util.stream.InterfaceC5985o2
    public final void l(long j8) {
        this.f37708a.l(-1L);
    }

    @Override // j$.util.stream.InterfaceC5970l2, j$.util.stream.InterfaceC5985o2
    public final void accept(double d8) {
        if (this.f37608b) {
            this.f37609c.getClass();
            DoublePredicate doublePredicate = null;
            doublePredicate.test(d8);
            throw null;
        }
    }

    @Override // j$.util.stream.AbstractC5950h2, j$.util.stream.InterfaceC5985o2
    public final boolean n() {
        return !this.f37608b || this.f37708a.n();
    }
}
