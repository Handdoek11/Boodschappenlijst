package j$.util.stream;

import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
final class X extends AbstractC5918b0 {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f37599m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ Object f37600n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X(AbstractC5917b abstractC5917b, int i8, Object obj, int i9) {
        super(abstractC5917b, i8, 1);
        this.f37599m = i9;
        this.f37600n = obj;
    }

    @Override // j$.util.stream.AbstractC5917b
    final InterfaceC5985o2 Q(int i8, InterfaceC5985o2 interfaceC5985o2) {
        switch (this.f37599m) {
            case 0:
                return new W(this, interfaceC5985o2, 1);
            case 1:
                return new Z(this, interfaceC5985o2);
            case 2:
                return new C5982o(this, interfaceC5985o2, 4);
            default:
                return new C5925c2(this, interfaceC5985o2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(AbstractC5923c0 abstractC5923c0, IntConsumer intConsumer) {
        super(abstractC5923c0, 0, 1);
        this.f37599m = 0;
        this.f37600n = intConsumer;
    }
}
