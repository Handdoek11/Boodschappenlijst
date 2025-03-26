package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* loaded from: classes3.dex */
final class Z0 extends R2 implements E0, InterfaceC6037z0 {
    @Override // j$.util.stream.InterfaceC6037z0, j$.util.stream.C0
    public final E0 a() {
        return this;
    }

    @Override // j$.util.stream.C0
    public final K0 a() {
        return this;
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

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ K0 h(long j8, long j9, IntFunction intFunction) {
        return AbstractC6032y0.t(this, j8, j9);
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final void k() {
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ Object[] o(IntFunction intFunction) {
        return AbstractC6032y0.m(this, intFunction);
    }

    @Override // j$.util.stream.InterfaceC5970l2
    public final /* synthetic */ void p(Double d8) {
        AbstractC6032y0.e(this, d8);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.K0
    public final /* bridge */ /* synthetic */ K0 b(int i8) {
        b(i8);
        throw null;
    }

    @Override // j$.util.stream.J0, j$.util.stream.K0
    public final J0 b(int i8) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void i(Object[] objArr, int i8) {
        AbstractC6032y0.n(this, (Double[]) objArr, i8);
    }

    @Override // j$.util.stream.X2, j$.util.stream.J0
    public final void e(Object obj) {
        super.e((DoubleConsumer) obj);
    }

    @Override // j$.util.stream.X2, j$.util.stream.J0
    public final void r(int i8, Object obj) {
        super.r(i8, (double[]) obj);
    }

    @Override // j$.util.stream.R2, j$.util.stream.X2, java.lang.Iterable
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.R2, j$.util.stream.X2, java.lang.Iterable
    public final j$.util.e0 spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final void l(long j8) {
        clear();
        v(j8);
    }

    @Override // j$.util.stream.X2, j$.util.stream.J0
    public final Object d() {
        return (double[]) super.d();
    }
}
