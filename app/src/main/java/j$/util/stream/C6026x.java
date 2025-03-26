package j$.util.stream;

/* renamed from: j$.util.stream.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6026x extends AbstractC5963k0 {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f37820m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6026x(AbstractC5917b abstractC5917b, int i8, int i9) {
        super(abstractC5917b, i8, 1);
        this.f37820m = i9;
    }

    @Override // j$.util.stream.AbstractC5917b
    final InterfaceC5985o2 Q(int i8, InterfaceC5985o2 interfaceC5985o2) {
        switch (this.f37820m) {
            case 0:
                return new C6006t(this, interfaceC5985o2, 3);
            case 1:
                return new Y(0, interfaceC5985o2);
            case 2:
                return new W(this, interfaceC5985o2, 3);
            case 3:
                return new C5938f0(this, interfaceC5985o2, 1);
            case 4:
                return interfaceC5985o2;
            default:
                return new C5938f0(this, interfaceC5985o2, 4);
        }
    }
}
