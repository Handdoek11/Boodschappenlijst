package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* loaded from: classes3.dex */
final class B1 extends V1 implements U1, InterfaceC5980n2 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Supplier f37429b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ObjLongConsumer f37430c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C6001s f37431d;

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

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC5980n2
    public final /* synthetic */ void j(Long l8) {
        AbstractC6032y0.i(this, l8);
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
        this.f37589a = this.f37431d.apply(this.f37589a, ((B1) u12).f37589a);
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final void l(long j8) {
        this.f37589a = this.f37429b.get();
    }

    @Override // j$.util.stream.InterfaceC5985o2, j$.util.stream.InterfaceC5980n2, java.util.function.LongConsumer
    public final void accept(long j8) {
        this.f37430c.accept(this.f37589a, j8);
    }

    B1(Supplier supplier, ObjLongConsumer objLongConsumer, C6001s c6001s) {
        this.f37429b = supplier;
        this.f37430c = objLongConsumer;
        this.f37431d = c6001s;
    }
}
