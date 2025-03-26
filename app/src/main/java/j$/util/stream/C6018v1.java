package j$.util.stream;

import j$.util.Spliterator;

/* renamed from: j$.util.stream.v1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6018v1 extends AbstractC6023w1 {

    /* renamed from: h, reason: collision with root package name */
    private final Object[] f37804h;

    C6018v1(Spliterator spliterator, AbstractC5917b abstractC5917b, Object[] objArr) {
        super(spliterator, abstractC5917b, objArr.length);
        this.f37804h = objArr;
    }

    C6018v1(C6018v1 c6018v1, Spliterator spliterator, long j8, long j9) {
        super(c6018v1, spliterator, j8, j9, c6018v1.f37804h.length);
        this.f37804h = c6018v1.f37804h;
    }

    @Override // j$.util.stream.AbstractC6023w1
    final AbstractC6023w1 b(Spliterator spliterator, long j8, long j9) {
        return new C6018v1(this, spliterator, j8, j9);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i8 = this.f37816f;
        if (i8 >= this.f37817g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f37816f));
        }
        Object[] objArr = this.f37804h;
        this.f37816f = i8 + 1;
        objArr[i8] = obj;
    }
}
