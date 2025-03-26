package j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;

/* renamed from: j$.util.stream.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6006t extends AbstractC5950h2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f37787b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC5917b f37788c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6006t(AbstractC5917b abstractC5917b, InterfaceC5985o2 interfaceC5985o2, int i8) {
        super(interfaceC5985o2);
        this.f37787b = i8;
        this.f37788c = abstractC5917b;
    }

    @Override // j$.util.stream.AbstractC5950h2, j$.util.stream.InterfaceC5985o2
    public void l(long j8) {
        switch (this.f37787b) {
            case 4:
                this.f37708a.l(-1L);
                break;
            default:
                super.l(j8);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC5970l2, j$.util.stream.InterfaceC5985o2
    public final void accept(double d8) {
        switch (this.f37787b) {
            case 0:
                this.f37708a.accept((InterfaceC5985o2) ((DoubleFunction) ((C6011u) this.f37788c).f37794n).apply(d8));
                return;
            case 1:
                ((C6016v) this.f37788c).getClass();
                DoubleUnaryOperator doubleUnaryOperator = null;
                doubleUnaryOperator.applyAsDouble(d8);
                throw null;
            case 2:
                ((C6021w) this.f37788c).getClass();
                DoubleToIntFunction doubleToIntFunction = null;
                doubleToIntFunction.applyAsInt(d8);
                throw null;
            case 3:
                ((C6026x) this.f37788c).getClass();
                DoubleToLongFunction doubleToLongFunction = null;
                doubleToLongFunction.applyAsLong(d8);
                throw null;
            case 4:
                ((C6016v) this.f37788c).getClass();
                DoublePredicate doublePredicate = null;
                doublePredicate.test(d8);
                throw null;
            default:
                ((DoubleConsumer) ((C6036z) this.f37788c).f37845n).accept(d8);
                this.f37708a.accept(d8);
                return;
        }
    }
}
