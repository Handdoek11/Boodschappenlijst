package j$.util.stream;

import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.i0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5953i0 extends AbstractC5963k0 {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f37713m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ Object f37714n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5953i0(AbstractC5917b abstractC5917b, int i8, Object obj, int i9) {
        super(abstractC5917b, i8, 1);
        this.f37713m = i9;
        this.f37714n = obj;
    }

    @Override // j$.util.stream.AbstractC5917b
    final InterfaceC5985o2 Q(int i8, InterfaceC5985o2 interfaceC5985o2) {
        switch (this.f37713m) {
            case 0:
                return new C5948h0(this, interfaceC5985o2);
            case 1:
                return new C5938f0(this, interfaceC5985o2, 5);
            case 2:
                return new C5925c2(this, interfaceC5985o2);
            default:
                return new C5982o(this, interfaceC5985o2, 5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5953i0(AbstractC5968l0 abstractC5968l0, LongConsumer longConsumer) {
        super(abstractC5968l0, 0, 1);
        this.f37713m = 1;
        this.f37714n = longConsumer;
    }
}
