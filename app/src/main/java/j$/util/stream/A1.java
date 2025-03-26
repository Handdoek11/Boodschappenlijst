package j$.util.stream;

import java.util.function.LongBinaryOperator;

/* loaded from: classes3.dex */
final class A1 extends AbstractC6032y0 {

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ LongBinaryOperator f37424h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ long f37425i;

    @Override // j$.util.stream.AbstractC6032y0
    public final U1 e0() {
        return new S1(this.f37425i, this.f37424h);
    }

    A1(EnumC5936e3 enumC5936e3, LongBinaryOperator longBinaryOperator, long j8) {
        this.f37424h = longBinaryOperator;
        this.f37425i = j8;
    }
}
