package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.h1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5949h1 extends C5944g1 implements A0 {
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

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC5975m2
    public final /* synthetic */ void m(Integer num) {
        AbstractC6032y0.g(this, num);
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.C0
    public final /* bridge */ /* synthetic */ K0 a() {
        a();
        return this;
    }

    @Override // j$.util.stream.A0, j$.util.stream.C0
    public final G0 a() {
        int i8 = this.f37701b;
        int[] iArr = this.f37700a;
        if (i8 >= iArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f37701b), Integer.valueOf(iArr.length)));
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final void l(long j8) {
        int[] iArr = this.f37700a;
        if (j8 != iArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j8), Integer.valueOf(iArr.length)));
        }
        this.f37701b = 0;
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final void accept(int i8) {
        int i9 = this.f37701b;
        int[] iArr = this.f37700a;
        if (i9 < iArr.length) {
            this.f37701b = 1 + i9;
            iArr[i9] = i8;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(iArr.length)));
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final void k() {
        int i8 = this.f37701b;
        int[] iArr = this.f37700a;
        if (i8 < iArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f37701b), Integer.valueOf(iArr.length)));
        }
    }

    @Override // j$.util.stream.C5944g1
    public final String toString() {
        int[] iArr = this.f37700a;
        return String.format("IntFixedNodeBuilder[%d][%s]", Integer.valueOf(iArr.length - this.f37701b), Arrays.toString(iArr));
    }
}
