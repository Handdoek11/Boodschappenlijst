package j$.util.stream;

import java.util.function.IntPredicate;

/* loaded from: classes3.dex */
final class Q3 extends AbstractC5955i2 {

    /* renamed from: b, reason: collision with root package name */
    boolean f37556b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ R3 f37557c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Q3(R3 r32, InterfaceC5985o2 interfaceC5985o2) {
        super(interfaceC5985o2);
        this.f37557c = r32;
        this.f37556b = true;
    }

    @Override // j$.util.stream.AbstractC5955i2, j$.util.stream.InterfaceC5985o2
    public final void l(long j8) {
        this.f37715a.l(-1L);
    }

    @Override // j$.util.stream.InterfaceC5975m2, j$.util.stream.InterfaceC5985o2
    public final void accept(int i8) {
        if (this.f37556b) {
            this.f37557c.getClass();
            IntPredicate intPredicate = null;
            intPredicate.test(i8);
            throw null;
        }
    }

    @Override // j$.util.stream.AbstractC5955i2, j$.util.stream.InterfaceC5985o2
    public final boolean n() {
        return !this.f37556b || this.f37715a.n();
    }
}
