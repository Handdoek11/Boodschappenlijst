package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* loaded from: classes3.dex */
final class R1 extends V1 implements U1, InterfaceC5975m2 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Supplier f37561b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ObjIntConsumer f37562c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C6001s f37563d;

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

    @Override // j$.util.stream.U1
    public final void g(U1 u12) {
        this.f37589a = this.f37563d.apply(this.f37589a, ((R1) u12).f37589a);
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final void l(long j8) {
        this.f37589a = this.f37561b.get();
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final void accept(int i8) {
        this.f37562c.accept(this.f37589a, i8);
    }

    R1(Supplier supplier, ObjIntConsumer objIntConsumer, C6001s c6001s) {
        this.f37561b = supplier;
        this.f37562c = objIntConsumer;
        this.f37563d = c6001s;
    }
}
