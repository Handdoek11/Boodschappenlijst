package j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;

/* renamed from: j$.util.stream.t0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6007t0 extends AbstractC6012u0 implements InterfaceC5970l2 {
    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC5970l2
    public final /* synthetic */ void p(Double d8) {
        AbstractC6032y0.e(this, d8);
    }

    @Override // j$.util.stream.AbstractC6012u0, j$.util.stream.InterfaceC5985o2
    public final void accept(double d8) {
        if (this.f37795a) {
            return;
        }
        DoublePredicate doublePredicate = null;
        doublePredicate.test(d8);
        throw null;
    }
}
