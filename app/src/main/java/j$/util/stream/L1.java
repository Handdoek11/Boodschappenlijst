package j$.util.stream;

import j$.util.stream.Collector;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

/* loaded from: classes3.dex */
final class L1 extends AbstractC6032y0 {

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ BinaryOperator f37502h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ BiConsumer f37503i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ Supplier f37504j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ Collector f37505k;

    @Override // j$.util.stream.AbstractC6032y0
    public final U1 e0() {
        return new M1(this.f37504j, this.f37503i, this.f37502h);
    }

    @Override // j$.util.stream.AbstractC6032y0, j$.util.stream.J3
    public final int d() {
        if (this.f37505k.characteristics().contains(Collector.Characteristics.UNORDERED)) {
            return EnumC5931d3.f37656r;
        }
        return 0;
    }

    L1(EnumC5936e3 enumC5936e3, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, Collector collector) {
        this.f37502h = binaryOperator;
        this.f37503i = biConsumer;
        this.f37504j = supplier;
        this.f37505k = collector;
    }
}
