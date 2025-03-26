package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes3.dex */
abstract class B extends C {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f37428l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B(AbstractC5917b abstractC5917b, int i8, int i9) {
        super(abstractC5917b, i8);
        this.f37428l = i9;
    }

    @Override // j$.util.stream.AbstractC5917b
    final boolean P() {
        switch (this.f37428l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.InterfaceC5947h
    public final InterfaceC5947h unordered() {
        switch (this.f37428l) {
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
        return new C6016v(this, EnumC5931d3.f37656r, 1);
    }

    @Override // j$.util.stream.AbstractC5917b, j$.util.stream.InterfaceC5947h, j$.util.stream.F
    public final /* bridge */ /* synthetic */ F parallel() {
        switch (this.f37428l) {
            case 0:
                parallel();
                break;
            default:
                parallel();
                break;
        }
        return this;
    }

    @Override // j$.util.stream.AbstractC5917b, j$.util.stream.InterfaceC5947h, j$.util.stream.F
    public final /* bridge */ /* synthetic */ F sequential() {
        switch (this.f37428l) {
            case 0:
                sequential();
                break;
            default:
                sequential();
                break;
        }
        return this;
    }

    @Override // j$.util.stream.AbstractC5917b, j$.util.stream.InterfaceC5947h
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        switch (this.f37428l) {
        }
        return spliterator();
    }
}
