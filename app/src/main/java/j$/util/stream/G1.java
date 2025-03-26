package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes3.dex */
final class G1 extends AbstractC6032y0 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f37469h;

    public /* synthetic */ G1(int i8) {
        this.f37469h = i8;
    }

    @Override // j$.util.stream.AbstractC6032y0
    public final U1 e0() {
        switch (this.f37469h) {
            case 0:
                return new Y1();
            case 1:
                return new W1();
            case 2:
                return new Z1();
            default:
                return new X1();
        }
    }

    @Override // j$.util.stream.AbstractC6032y0, j$.util.stream.J3
    public final Object b(AbstractC5917b abstractC5917b, Spliterator spliterator) {
        switch (this.f37469h) {
            case 0:
                if (!EnumC5931d3.SIZED.n(abstractC5917b.J())) {
                    break;
                } else {
                    break;
                }
            case 1:
                if (!EnumC5931d3.SIZED.n(abstractC5917b.J())) {
                    break;
                } else {
                    break;
                }
            case 2:
                if (!EnumC5931d3.SIZED.n(abstractC5917b.J())) {
                    break;
                } else {
                    break;
                }
            default:
                if (!EnumC5931d3.SIZED.n(abstractC5917b.J())) {
                    break;
                } else {
                    break;
                }
        }
        return (Long) super.b(abstractC5917b, spliterator);
    }

    @Override // j$.util.stream.AbstractC6032y0, j$.util.stream.J3
    public final Object c(AbstractC5917b abstractC5917b, Spliterator spliterator) {
        switch (this.f37469h) {
            case 0:
                if (!EnumC5931d3.SIZED.n(abstractC5917b.J())) {
                    break;
                } else {
                    break;
                }
            case 1:
                if (!EnumC5931d3.SIZED.n(abstractC5917b.J())) {
                    break;
                } else {
                    break;
                }
            case 2:
                if (!EnumC5931d3.SIZED.n(abstractC5917b.J())) {
                    break;
                } else {
                    break;
                }
            default:
                if (!EnumC5931d3.SIZED.n(abstractC5917b.J())) {
                    break;
                } else {
                    break;
                }
        }
        return (Long) super.c(abstractC5917b, spliterator);
    }

    @Override // j$.util.stream.AbstractC6032y0, j$.util.stream.J3
    public final int d() {
        switch (this.f37469h) {
        }
        return EnumC5931d3.f37656r;
    }
}
