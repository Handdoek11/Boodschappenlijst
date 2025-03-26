package j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;

/* loaded from: classes3.dex */
final class W extends AbstractC5955i2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f37590b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC5917b f37591c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W(AbstractC5917b abstractC5917b, InterfaceC5985o2 interfaceC5985o2, int i8) {
        super(interfaceC5985o2);
        this.f37590b = i8;
        this.f37591c = abstractC5917b;
    }

    @Override // j$.util.stream.AbstractC5955i2, j$.util.stream.InterfaceC5985o2
    public void l(long j8) {
        switch (this.f37590b) {
            case 5:
                this.f37715a.l(-1L);
                break;
            default:
                super.l(j8);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC5975m2, j$.util.stream.InterfaceC5985o2
    public final void accept(int i8) {
        switch (this.f37590b) {
            case 0:
                this.f37715a.accept((InterfaceC5985o2) ((IntFunction) ((C6011u) this.f37591c).f37794n).apply(i8));
                return;
            case 1:
                ((IntConsumer) ((X) this.f37591c).f37600n).accept(i8);
                this.f37715a.accept(i8);
                return;
            case 2:
                ((C6021w) this.f37591c).getClass();
                IntUnaryOperator intUnaryOperator = null;
                intUnaryOperator.applyAsInt(i8);
                throw null;
            case 3:
                ((C6026x) this.f37591c).getClass();
                IntToLongFunction intToLongFunction = null;
                intToLongFunction.applyAsLong(i8);
                throw null;
            case 4:
                ((C6016v) this.f37591c).getClass();
                IntToDoubleFunction intToDoubleFunction = null;
                intToDoubleFunction.applyAsDouble(i8);
                throw null;
            default:
                ((C6021w) this.f37591c).getClass();
                IntPredicate intPredicate = null;
                intPredicate.test(i8);
                throw null;
        }
    }
}
