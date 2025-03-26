package j$.util.stream;

import java.util.function.IntFunction;

/* renamed from: j$.util.stream.x1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6028x1 extends Y2 implements K0, C0 {
    @Override // j$.util.stream.C0
    public final K0 a() {
        return this;
    }

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

    @Override // j$.util.stream.K0
    public final /* synthetic */ K0 h(long j8, long j9, IntFunction intFunction) {
        return AbstractC6032y0.w(this, j8, j9, intFunction);
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final void k() {
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.K0
    public final K0 b(int i8) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.K0
    public final void i(Object[] objArr, int i8) {
        long j8 = i8;
        long count = count() + j8;
        if (count > objArr.length || count < j8) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.f37641c == 0) {
            System.arraycopy(this.f37606e, 0, objArr, i8, this.f37640b);
            return;
        }
        for (int i9 = 0; i9 < this.f37641c; i9++) {
            Object[] objArr2 = this.f37607f[i9];
            System.arraycopy(objArr2, 0, objArr, i8, objArr2.length);
            i8 += this.f37607f[i9].length;
        }
        int i10 = this.f37640b;
        if (i10 > 0) {
            System.arraycopy(this.f37606e, 0, objArr, i8, i10);
        }
    }

    @Override // j$.util.stream.K0
    public final Object[] o(IntFunction intFunction) {
        long count = count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) count);
        i(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final void l(long j8) {
        clear();
        s(j8);
    }
}
