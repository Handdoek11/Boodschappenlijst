package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.u1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6013u1 extends AbstractC6023w1 implements InterfaceC5980n2 {

    /* renamed from: h, reason: collision with root package name */
    private final long[] f37797h;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC5980n2
    public final /* synthetic */ void j(Long l8) {
        AbstractC6032y0.i(this, l8);
    }

    C6013u1(Spliterator spliterator, AbstractC5917b abstractC5917b, long[] jArr) {
        super(spliterator, abstractC5917b, jArr.length);
        this.f37797h = jArr;
    }

    C6013u1(C6013u1 c6013u1, Spliterator spliterator, long j8, long j9) {
        super(c6013u1, spliterator, j8, j9, c6013u1.f37797h.length);
        this.f37797h = c6013u1.f37797h;
    }

    @Override // j$.util.stream.AbstractC6023w1
    final AbstractC6023w1 b(Spliterator spliterator, long j8, long j9) {
        return new C6013u1(this, spliterator, j8, j9);
    }

    @Override // j$.util.stream.AbstractC6023w1, j$.util.stream.InterfaceC5985o2, j$.util.stream.InterfaceC5980n2, java.util.function.LongConsumer
    public final void accept(long j8) {
        int i8 = this.f37816f;
        if (i8 >= this.f37817g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f37816f));
        }
        long[] jArr = this.f37797h;
        this.f37816f = i8 + 1;
        jArr[i8] = j8;
    }
}
