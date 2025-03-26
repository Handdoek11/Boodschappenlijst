package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* loaded from: classes3.dex */
final class H1 extends V1 implements U1, InterfaceC5970l2 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Supplier f37475b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ObjDoubleConsumer f37476c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C6001s f37477d;

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

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC5970l2
    public final /* synthetic */ void p(Double d8) {
        AbstractC6032y0.e(this, d8);
    }

    @Override // j$.util.stream.U1
    public final void g(U1 u12) {
        this.f37589a = this.f37477d.apply(this.f37589a, ((H1) u12).f37589a);
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final void l(long j8) {
        this.f37589a = this.f37475b.get();
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final void accept(double d8) {
        this.f37476c.accept(this.f37589a, d8);
    }

    H1(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, C6001s c6001s) {
        this.f37475b = supplier;
        this.f37476c = objDoubleConsumer;
        this.f37477d = c6001s;
    }
}
