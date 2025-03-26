package j$.util.stream;

import java.util.function.DoubleBinaryOperator;

/* loaded from: classes3.dex */
final class I1 extends AbstractC6032y0 {

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ DoubleBinaryOperator f37480h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ double f37481i;

    @Override // j$.util.stream.AbstractC6032y0
    public final U1 e0() {
        return new D1(this.f37481i, this.f37480h);
    }

    I1(EnumC5936e3 enumC5936e3, DoubleBinaryOperator doubleBinaryOperator, double d8) {
        this.f37480h = doubleBinaryOperator;
        this.f37481i = d8;
    }
}
