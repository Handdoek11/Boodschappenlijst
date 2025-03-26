package j$.util.stream;

/* renamed from: j$.util.stream.f2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC5940f2 extends AbstractC5945g2 {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f37683l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC5940f2(AbstractC5917b abstractC5917b, int i8, int i9) {
        super(abstractC5917b, i8);
        this.f37683l = i9;
    }

    @Override // j$.util.stream.AbstractC5917b
    final boolean P() {
        switch (this.f37683l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.InterfaceC5947h
    public final InterfaceC5947h unordered() {
        switch (this.f37683l) {
            case 0:
                if (!K()) {
                    break;
                } else {
                    break;
                }
            default:
                if (!K()) {
                    break;
                } else {
                    break;
                }
        }
        return new C5930d2(this, EnumC5931d3.f37656r, 1);
    }
}
