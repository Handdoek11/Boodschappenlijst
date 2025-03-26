package j$.util.stream;

import java.util.function.IntFunction;

/* loaded from: classes3.dex */
abstract class V0 extends M0 implements J0 {
    @Override // j$.util.stream.K0
    public final /* synthetic */ Object[] o(IntFunction intFunction) {
        return AbstractC6032y0.m(this, intFunction);
    }

    @Override // j$.util.stream.J0
    public final void e(Object obj) {
        ((J0) this.f37510a).e(obj);
        ((J0) this.f37511b).e(obj);
    }

    @Override // j$.util.stream.J0
    public final void r(int i8, Object obj) {
        K0 k02 = this.f37510a;
        ((J0) k02).r(i8, obj);
        ((J0) this.f37511b).r(i8 + ((int) ((J0) k02).count()), obj);
    }

    @Override // j$.util.stream.J0
    public final Object d() {
        long count = count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object c8 = c((int) count);
        r(0, c8);
        return c8;
    }

    public final String toString() {
        return count() < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.f37510a, this.f37511b) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(count()));
    }
}
