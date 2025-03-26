package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
final class S1 implements U1, InterfaceC5980n2 {

    /* renamed from: a, reason: collision with root package name */
    private long f37565a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f37566b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ LongBinaryOperator f37567c;

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

    S1(long j8, LongBinaryOperator longBinaryOperator) {
        this.f37566b = j8;
        this.f37567c = longBinaryOperator;
    }

    @Override // j$.util.stream.U1
    public final void g(U1 u12) {
        accept(((S1) u12).f37565a);
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final void l(long j8) {
        this.f37565a = this.f37566b;
    }

    @Override // j$.util.stream.InterfaceC5985o2, j$.util.stream.InterfaceC5980n2, java.util.function.LongConsumer
    public final void accept(long j8) {
        this.f37565a = this.f37567c.applyAsLong(this.f37565a, j8);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f37565a);
    }
}
