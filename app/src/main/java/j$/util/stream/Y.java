package j$.util.stream;

/* loaded from: classes3.dex */
final class Y extends AbstractC5955i2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f37605b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y(int i8, InterfaceC5985o2 interfaceC5985o2) {
        super(interfaceC5985o2);
        this.f37605b = i8;
    }

    @Override // j$.util.stream.InterfaceC5975m2, j$.util.stream.InterfaceC5985o2
    public final void accept(int i8) {
        switch (this.f37605b) {
            case 0:
                this.f37715a.accept(i8);
                break;
            default:
                this.f37715a.accept(i8);
                break;
        }
    }
}
