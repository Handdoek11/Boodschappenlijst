package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes3.dex */
final class Y0 extends X0 implements InterfaceC6037z0 {
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
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC5970l2
    public final /* synthetic */ void p(Double d8) {
        AbstractC6032y0.e(this, d8);
    }

    @Override // j$.util.stream.C0
    public final /* bridge */ /* synthetic */ K0 a() {
        a();
        return this;
    }

    @Override // j$.util.stream.InterfaceC6037z0, j$.util.stream.C0
    public final E0 a() {
        int i8 = this.f37602b;
        double[] dArr = this.f37601a;
        if (i8 >= dArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f37602b), Integer.valueOf(dArr.length)));
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final void l(long j8) {
        double[] dArr = this.f37601a;
        if (j8 != dArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j8), Integer.valueOf(dArr.length)));
        }
        this.f37602b = 0;
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final void accept(double d8) {
        int i8 = this.f37602b;
        double[] dArr = this.f37601a;
        if (i8 < dArr.length) {
            this.f37602b = 1 + i8;
            dArr[i8] = d8;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(dArr.length)));
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final void k() {
        int i8 = this.f37602b;
        double[] dArr = this.f37601a;
        if (i8 < dArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f37602b), Integer.valueOf(dArr.length)));
        }
    }

    @Override // j$.util.stream.X0
    public final String toString() {
        double[] dArr = this.f37601a;
        return String.format("DoubleFixedNodeBuilder[%d][%s]", Integer.valueOf(dArr.length - this.f37602b), Arrays.toString(dArr));
    }
}
