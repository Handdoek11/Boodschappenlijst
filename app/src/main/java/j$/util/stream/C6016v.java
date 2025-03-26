package j$.util.stream;

/* renamed from: j$.util.stream.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6016v extends B {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f37800m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6016v(AbstractC5917b abstractC5917b, int i8, int i9) {
        super(abstractC5917b, i8, 1);
        this.f37800m = i9;
    }

    @Override // j$.util.stream.AbstractC5917b
    final InterfaceC5985o2 Q(int i8, InterfaceC5985o2 interfaceC5985o2) {
        switch (this.f37800m) {
            case 0:
                return new C6006t(this, interfaceC5985o2, 1);
            case 1:
                return interfaceC5985o2;
            case 2:
                return new C6006t(this, interfaceC5985o2, 4);
            case 3:
                return new Y(1, interfaceC5985o2);
            case 4:
                return new W(this, interfaceC5985o2, 4);
            case 5:
                return new C5943g0(interfaceC5985o2);
            default:
                return new C5938f0(this, interfaceC5985o2, 3);
        }
    }
}
