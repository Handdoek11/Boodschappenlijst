package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.t1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6008t1 extends AbstractC6023w1 implements InterfaceC5975m2 {

    /* renamed from: h, reason: collision with root package name */
    private final int[] f37789h;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC5975m2
    public final /* synthetic */ void m(Integer num) {
        AbstractC6032y0.g(this, num);
    }

    C6008t1(Spliterator spliterator, AbstractC5917b abstractC5917b, int[] iArr) {
        super(spliterator, abstractC5917b, iArr.length);
        this.f37789h = iArr;
    }

    C6008t1(C6008t1 c6008t1, Spliterator spliterator, long j8, long j9) {
        super(c6008t1, spliterator, j8, j9, c6008t1.f37789h.length);
        this.f37789h = c6008t1.f37789h;
    }

    @Override // j$.util.stream.AbstractC6023w1
    final AbstractC6023w1 b(Spliterator spliterator, long j8, long j9) {
        return new C6008t1(this, spliterator, j8, j9);
    }

    @Override // j$.util.stream.AbstractC6023w1, j$.util.stream.InterfaceC5985o2
    public final void accept(int i8) {
        int i9 = this.f37816f;
        if (i9 >= this.f37817g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f37816f));
        }
        int[] iArr = this.f37789h;
        this.f37816f = i9 + 1;
        iArr[i9] = i8;
    }
}
