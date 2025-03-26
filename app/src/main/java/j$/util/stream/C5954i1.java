package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.i1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5954i1 extends T2 implements G0, A0 {
    @Override // j$.util.stream.A0, j$.util.stream.C0
    public final G0 a() {
        return this;
    }

    @Override // j$.util.stream.C0
    public final K0 a() {
        return this;
    }

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

    @Override // j$.util.stream.K0
    public final /* synthetic */ K0 h(long j8, long j9, IntFunction intFunction) {
        return AbstractC6032y0.u(this, j8, j9);
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final void k() {
    }

    @Override // j$.util.stream.InterfaceC5975m2
    public final /* synthetic */ void m(Integer num) {
        AbstractC6032y0.g(this, num);
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ Object[] o(IntFunction intFunction) {
        return AbstractC6032y0.m(this, intFunction);
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
        AbstractC6032y0.o(this, (Integer[]) objArr, i8);
    }

    @Override // j$.util.stream.X2, j$.util.stream.J0
    public final void e(Object obj) {
        super.e((IntConsumer) obj);
    }

    @Override // j$.util.stream.X2, j$.util.stream.J0
    public final void r(int i8, Object obj) {
        super.r(i8, (int[]) obj);
    }

    @Override // j$.util.stream.T2, j$.util.stream.X2, java.lang.Iterable
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.T2, j$.util.stream.X2, java.lang.Iterable
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
        return (int[]) super.d();
    }
}
