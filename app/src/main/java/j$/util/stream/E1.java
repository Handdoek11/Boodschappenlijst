package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* loaded from: classes3.dex */
final class E1 extends AbstractC6032y0 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f37449h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Object f37450i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ Object f37451j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ Object f37452k;

    public /* synthetic */ E1(EnumC5936e3 enumC5936e3, Object obj, Object obj2, Object obj3, int i8) {
        this.f37449h = i8;
        this.f37451j = obj;
        this.f37452k = obj2;
        this.f37450i = obj3;
    }

    @Override // j$.util.stream.AbstractC6032y0
    public final U1 e0() {
        switch (this.f37449h) {
            case 0:
                return new B1((Supplier) this.f37450i, (ObjLongConsumer) this.f37452k, (C6001s) this.f37451j);
            case 1:
                return new H1((Supplier) this.f37450i, (ObjDoubleConsumer) this.f37452k, (C6001s) this.f37451j);
            case 2:
                return new J1(this.f37450i, (BiFunction) this.f37452k, (BinaryOperator) this.f37451j);
            case 3:
                return new N1((Supplier) this.f37450i, (BiConsumer) this.f37452k, (BiConsumer) this.f37451j);
            default:
                return new R1((Supplier) this.f37450i, (ObjIntConsumer) this.f37452k, (C6001s) this.f37451j);
        }
    }
}
