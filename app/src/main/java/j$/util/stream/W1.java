package j$.util.stream;

import java.util.function.DoubleConsumer;

/* loaded from: classes3.dex */
final class W1 extends AbstractC5915a2 implements InterfaceC5970l2 {
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC5970l2
    public final /* synthetic */ void p(Double d8) {
        AbstractC6032y0.e(this, d8);
    }

    @Override // j$.util.stream.V1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f37616b);
    }

    @Override // j$.util.stream.U1
    public final void g(U1 u12) {
        this.f37616b += ((AbstractC5915a2) u12).f37616b;
    }

    @Override // j$.util.stream.AbstractC5915a2, j$.util.stream.InterfaceC5985o2
    public final void accept(double d8) {
        this.f37616b++;
    }
}
