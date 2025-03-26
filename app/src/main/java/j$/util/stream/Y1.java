package j$.util.stream;

import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
final class Y1 extends AbstractC5915a2 implements InterfaceC5980n2 {
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC5980n2
    public final /* synthetic */ void j(Long l8) {
        AbstractC6032y0.i(this, l8);
    }

    @Override // j$.util.stream.V1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f37616b);
    }

    @Override // j$.util.stream.U1
    public final void g(U1 u12) {
        this.f37616b += ((AbstractC5915a2) u12).f37616b;
    }

    @Override // j$.util.stream.AbstractC5915a2, j$.util.stream.InterfaceC5985o2, j$.util.stream.InterfaceC5980n2, java.util.function.LongConsumer
    public final void accept(long j8) {
        this.f37616b++;
    }
}
