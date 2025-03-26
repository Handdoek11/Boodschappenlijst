package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.s1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6003s1 extends AbstractC6023w1 implements InterfaceC5970l2 {

    /* renamed from: h, reason: collision with root package name */
    private final double[] f37784h;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC5970l2
    public final /* synthetic */ void p(Double d8) {
        AbstractC6032y0.e(this, d8);
    }

    C6003s1(Spliterator spliterator, AbstractC5917b abstractC5917b, double[] dArr) {
        super(spliterator, abstractC5917b, dArr.length);
        this.f37784h = dArr;
    }

    C6003s1(C6003s1 c6003s1, Spliterator spliterator, long j8, long j9) {
        super(c6003s1, spliterator, j8, j9, c6003s1.f37784h.length);
        this.f37784h = c6003s1.f37784h;
    }

    @Override // j$.util.stream.AbstractC6023w1
    final AbstractC6023w1 b(Spliterator spliterator, long j8, long j9) {
        return new C6003s1(this, spliterator, j8, j9);
    }

    @Override // j$.util.stream.AbstractC6023w1, j$.util.stream.InterfaceC5985o2
    public final void accept(double d8) {
        int i8 = this.f37816f;
        if (i8 >= this.f37817g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f37816f));
        }
        double[] dArr = this.f37784h;
        this.f37816f = i8 + 1;
        dArr[i8] = d8;
    }
}
