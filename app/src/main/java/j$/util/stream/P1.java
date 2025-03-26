package j$.util.stream;

import java.util.function.IntBinaryOperator;

/* loaded from: classes3.dex */
final class P1 extends AbstractC6032y0 {

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ IntBinaryOperator f37541h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f37542i;

    @Override // j$.util.stream.AbstractC6032y0
    public final U1 e0() {
        return new O1(this.f37542i, this.f37541h);
    }

    P1(EnumC5936e3 enumC5936e3, IntBinaryOperator intBinaryOperator, int i8) {
        this.f37541h = intBinaryOperator;
        this.f37542i = i8;
    }
}
