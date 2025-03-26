package j$.util.stream;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class K1 implements U1 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f37495a;

    /* renamed from: b, reason: collision with root package name */
    private Object f37496b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinaryOperator f37497c;

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

    K1(BinaryOperator binaryOperator) {
        this.f37497c = binaryOperator;
    }

    @Override // j$.util.stream.U1
    public final void g(U1 u12) {
        K1 k12 = (K1) u12;
        if (k12.f37495a) {
            return;
        }
        p(k12.f37496b);
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final void l(long j8) {
        this.f37495a = true;
        this.f37496b = null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void p(Object obj) {
        if (this.f37495a) {
            this.f37495a = false;
            this.f37496b = obj;
        } else {
            this.f37496b = this.f37497c.apply(this.f37496b, obj);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f37495a ? Optional.empty() : Optional.of(this.f37496b);
    }
}
