package j$.util.stream;

import java.util.HashSet;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* renamed from: j$.util.stream.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5982o extends AbstractC5965k2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f37755b;

    /* renamed from: c, reason: collision with root package name */
    Object f37756c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5982o(AbstractC5917b abstractC5917b, InterfaceC5985o2 interfaceC5985o2, int i8) {
        super(interfaceC5985o2);
        this.f37755b = i8;
        this.f37756c = abstractC5917b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5982o(InterfaceC5985o2 interfaceC5985o2) {
        super(interfaceC5985o2);
        this.f37755b = 0;
    }

    @Override // j$.util.stream.AbstractC5965k2, j$.util.stream.InterfaceC5985o2
    public void k() {
        switch (this.f37755b) {
            case 0:
                this.f37756c = null;
                this.f37727a.k();
                break;
            default:
                super.k();
                break;
        }
    }

    @Override // j$.util.stream.AbstractC5965k2, j$.util.stream.InterfaceC5985o2
    public void l(long j8) {
        switch (this.f37755b) {
            case 0:
                this.f37756c = new HashSet();
                this.f37727a.l(-1L);
                break;
            case 1:
            default:
                super.l(j8);
                break;
            case 2:
                this.f37727a.l(-1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f37755b) {
            case 0:
                if (!((HashSet) this.f37756c).contains(obj)) {
                    ((HashSet) this.f37756c).add(obj);
                    this.f37727a.accept((InterfaceC5985o2) obj);
                    break;
                }
                break;
            case 1:
                ((Consumer) ((C6011u) this.f37756c).f37794n).accept(obj);
                this.f37727a.accept((InterfaceC5985o2) obj);
                break;
            case 2:
                if (((Predicate) ((C6011u) this.f37756c).f37794n).test(obj)) {
                    this.f37727a.accept((InterfaceC5985o2) obj);
                    break;
                }
                break;
            case 3:
                this.f37727a.accept((InterfaceC5985o2) ((Function) ((C6011u) this.f37756c).f37794n).apply(obj));
                break;
            case 4:
                this.f37727a.accept(((ToIntFunction) ((X) this.f37756c).f37600n).applyAsInt(obj));
                break;
            case 5:
                this.f37727a.accept(((ToLongFunction) ((C5953i0) this.f37756c).f37714n).applyAsLong(obj));
                break;
            default:
                this.f37727a.accept(((ToDoubleFunction) ((C6036z) this.f37756c).f37845n).applyAsDouble(obj));
                break;
        }
    }
}
