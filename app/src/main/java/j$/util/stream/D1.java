package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;

/* loaded from: classes3.dex */
final class D1 implements U1, InterfaceC5970l2 {

    /* renamed from: a, reason: collision with root package name */
    private double f37443a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ double f37444b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ DoubleBinaryOperator f37445c;

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

    D1(double d8, DoubleBinaryOperator doubleBinaryOperator) {
        this.f37444b = d8;
        this.f37445c = doubleBinaryOperator;
    }

    @Override // j$.util.stream.U1
    public final void g(U1 u12) {
        accept(((D1) u12).f37443a);
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final void l(long j8) {
        this.f37443a = this.f37444b;
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final void accept(double d8) {
        this.f37443a = this.f37445c.applyAsDouble(this.f37443a, d8);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Double.valueOf(this.f37443a);
    }
}
