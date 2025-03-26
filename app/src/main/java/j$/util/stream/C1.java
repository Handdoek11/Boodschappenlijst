package j$.util.stream;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

/* loaded from: classes3.dex */
final class C1 extends AbstractC6032y0 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f37434h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Object f37435i;

    public /* synthetic */ C1(EnumC5936e3 enumC5936e3, Object obj, int i8) {
        this.f37434h = i8;
        this.f37435i = obj;
    }

    @Override // j$.util.stream.AbstractC6032y0
    public final U1 e0() {
        switch (this.f37434h) {
            case 0:
                return new T1((LongBinaryOperator) this.f37435i);
            case 1:
                return new F1((DoubleBinaryOperator) this.f37435i);
            case 2:
                return new K1((BinaryOperator) this.f37435i);
            default:
                return new Q1((IntBinaryOperator) this.f37435i);
        }
    }
}
