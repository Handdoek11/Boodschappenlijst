package j$.util.stream;

import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
final class X1 extends AbstractC5915a2 implements InterfaceC5975m2 {
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC5975m2
    public final /* synthetic */ void m(Integer num) {
        AbstractC6032y0.g(this, num);
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
    public final void accept(int i8) {
        this.f37616b++;
    }
}
