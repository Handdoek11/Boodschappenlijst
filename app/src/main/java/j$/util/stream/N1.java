package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* loaded from: classes3.dex */
final class N1 extends V1 implements U1 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Supplier f37522b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BiConsumer f37523c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ BiConsumer f37524d;

    @Override // j$.util.stream.InterfaceC5985o2
    public final /* synthetic */ void accept(double d8) {
        AbstractC6032y0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final /* synthetic */ void accept(int i8) {
        AbstractC6032y0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC5985o2, j$.util.stream.InterfaceC5980n2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j8) {
        AbstractC6032y0.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.U1
    public final void g(U1 u12) {
        this.f37524d.accept(this.f37589a, ((N1) u12).f37589a);
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final void l(long j8) {
        this.f37589a = this.f37522b.get();
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void p(Object obj) {
        this.f37523c.accept(this.f37589a, obj);
    }

    N1(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        this.f37522b = supplier;
        this.f37523c = biConsumer;
        this.f37524d = biConsumer2;
    }
}
