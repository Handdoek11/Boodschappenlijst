package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
final class O1 implements U1, InterfaceC5975m2 {

    /* renamed from: a, reason: collision with root package name */
    private int f37530a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f37531b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ IntBinaryOperator f37532c;

    @Override // j$.util.stream.InterfaceC5985o2
    public final /* synthetic */ void accept(double d8) {
        AbstractC6032y0.a();
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
        m((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC5975m2
    public final /* synthetic */ void m(Integer num) {
        AbstractC6032y0.g(this, num);
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final /* synthetic */ boolean n() {
        return false;
    }

    O1(int i8, IntBinaryOperator intBinaryOperator) {
        this.f37531b = i8;
        this.f37532c = intBinaryOperator;
    }

    @Override // j$.util.stream.U1
    public final void g(U1 u12) {
        accept(((O1) u12).f37530a);
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final void l(long j8) {
        this.f37530a = this.f37531b;
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final void accept(int i8) {
        this.f37530a = this.f37532c.applyAsInt(this.f37530a, i8);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Integer.valueOf(this.f37530a);
    }
}
