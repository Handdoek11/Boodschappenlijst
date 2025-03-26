package j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* renamed from: j$.util.stream.r0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5997r0 extends AbstractC6012u0 implements InterfaceC5975m2 {
    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC5975m2
    public final /* synthetic */ void m(Integer num) {
        AbstractC6032y0.g(this, num);
    }

    @Override // j$.util.stream.AbstractC6012u0, j$.util.stream.InterfaceC5985o2
    public final void accept(int i8) {
        if (this.f37795a) {
            return;
        }
        IntPredicate intPredicate = null;
        intPredicate.test(i8);
        throw null;
    }
}
