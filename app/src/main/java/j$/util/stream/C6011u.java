package j$.util.stream;

import java.util.function.Consumer;

/* renamed from: j$.util.stream.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6011u extends AbstractC5940f2 {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f37793m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ Object f37794n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6011u(AbstractC5917b abstractC5917b, int i8, Object obj, int i9) {
        super(abstractC5917b, i8, 1);
        this.f37793m = i9;
        this.f37794n = obj;
    }

    @Override // j$.util.stream.AbstractC5917b
    final InterfaceC5985o2 Q(int i8, InterfaceC5985o2 interfaceC5985o2) {
        switch (this.f37793m) {
            case 0:
                return new C6006t(this, interfaceC5985o2, 0);
            case 1:
                return new W(this, interfaceC5985o2, 0);
            case 2:
                return new C5938f0(this, interfaceC5985o2, 0);
            case 3:
                return new C5982o(this, interfaceC5985o2, 1);
            case 4:
                return new C5982o(this, interfaceC5985o2, 2);
            case 5:
                return new C5982o(this, interfaceC5985o2, 3);
            default:
                return new C5977n(this, interfaceC5985o2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6011u(AbstractC5945g2 abstractC5945g2, Consumer consumer) {
        super(abstractC5945g2, 0, 1);
        this.f37793m = 3;
        this.f37794n = consumer;
    }
}
