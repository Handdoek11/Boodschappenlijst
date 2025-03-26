package j$.util.stream;

import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6036z extends B {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f37844m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ Object f37845n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6036z(AbstractC5917b abstractC5917b, int i8, Object obj, int i9) {
        super(abstractC5917b, i8, 1);
        this.f37844m = i9;
        this.f37845n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6036z(C c8, DoubleConsumer doubleConsumer) {
        super(c8, 0, 1);
        this.f37844m = 1;
        this.f37845n = doubleConsumer;
    }

    @Override // j$.util.stream.AbstractC5917b
    final InterfaceC5985o2 Q(int i8, InterfaceC5985o2 interfaceC5985o2) {
        switch (this.f37844m) {
            case 0:
                return new C6031y(this, interfaceC5985o2);
            case 1:
                return new C6006t(this, interfaceC5985o2, 5);
            case 2:
                return new C5982o(this, interfaceC5985o2, 6);
            default:
                return new C5925c2(this, interfaceC5985o2);
        }
    }
}
