package j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;

/* renamed from: j$.util.stream.f0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5938f0 extends AbstractC5960j2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f37681b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC5917b f37682c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5938f0(AbstractC5917b abstractC5917b, InterfaceC5985o2 interfaceC5985o2, int i8) {
        super(interfaceC5985o2);
        this.f37681b = i8;
        this.f37682c = abstractC5917b;
    }

    @Override // j$.util.stream.AbstractC5960j2, j$.util.stream.InterfaceC5985o2
    public void l(long j8) {
        switch (this.f37681b) {
            case 4:
                this.f37720a.l(-1L);
                break;
            default:
                super.l(j8);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC5980n2, java.util.function.LongConsumer
    public final void accept(long j8) {
        switch (this.f37681b) {
            case 0:
                this.f37720a.accept((InterfaceC5985o2) ((LongFunction) ((C6011u) this.f37682c).f37794n).apply(j8));
                return;
            case 1:
                ((C6026x) this.f37682c).getClass();
                LongUnaryOperator longUnaryOperator = null;
                longUnaryOperator.applyAsLong(j8);
                throw null;
            case 2:
                ((C6021w) this.f37682c).getClass();
                LongToIntFunction longToIntFunction = null;
                longToIntFunction.applyAsInt(j8);
                throw null;
            case 3:
                ((C6016v) this.f37682c).getClass();
                LongToDoubleFunction longToDoubleFunction = null;
                longToDoubleFunction.applyAsDouble(j8);
                throw null;
            case 4:
                ((C6026x) this.f37682c).getClass();
                LongPredicate longPredicate = null;
                longPredicate.test(j8);
                throw null;
            default:
                ((LongConsumer) ((C5953i0) this.f37682c).f37714n).accept(j8);
                this.f37720a.accept(j8);
                return;
        }
    }
}
