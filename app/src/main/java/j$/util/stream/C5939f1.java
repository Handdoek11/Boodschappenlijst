package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.f1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5939f1 extends N0 implements C0 {
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
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.C0
    public final K0 a() {
        int i8 = this.f37521b;
        Object[] objArr = this.f37520a;
        if (i8 >= objArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f37521b), Integer.valueOf(objArr.length)));
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final void l(long j8) {
        Object[] objArr = this.f37520a;
        if (j8 != objArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j8), Integer.valueOf(objArr.length)));
        }
        this.f37521b = 0;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void p(Object obj) {
        int i8 = this.f37521b;
        Object[] objArr = this.f37520a;
        if (i8 < objArr.length) {
            this.f37521b = 1 + i8;
            objArr[i8] = obj;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(objArr.length)));
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final void k() {
        int i8 = this.f37521b;
        Object[] objArr = this.f37520a;
        if (i8 < objArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f37521b), Integer.valueOf(objArr.length)));
        }
    }

    @Override // j$.util.stream.N0
    public final String toString() {
        Object[] objArr = this.f37520a;
        return String.format("FixedNodeBuilder[%d][%s]", Integer.valueOf(objArr.length - this.f37521b), Arrays.toString(objArr));
    }
}
