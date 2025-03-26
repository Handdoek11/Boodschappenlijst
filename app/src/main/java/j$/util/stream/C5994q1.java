package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.q1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5994q1 extends C5989p1 implements B0 {
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

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC5980n2
    public final /* synthetic */ void j(Long l8) {
        AbstractC6032y0.i(this, l8);
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

    @Override // j$.util.stream.B0, j$.util.stream.C0
    public final I0 a() {
        int i8 = this.f37765b;
        long[] jArr = this.f37764a;
        if (i8 >= jArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f37765b), Integer.valueOf(jArr.length)));
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final void l(long j8) {
        long[] jArr = this.f37764a;
        if (j8 != jArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j8), Integer.valueOf(jArr.length)));
        }
        this.f37765b = 0;
    }

    @Override // j$.util.stream.InterfaceC5985o2, j$.util.stream.InterfaceC5980n2, java.util.function.LongConsumer
    public final void accept(long j8) {
        int i8 = this.f37765b;
        long[] jArr = this.f37764a;
        if (i8 < jArr.length) {
            this.f37765b = 1 + i8;
            jArr[i8] = j8;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(jArr.length)));
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final void k() {
        int i8 = this.f37765b;
        long[] jArr = this.f37764a;
        if (i8 < jArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f37765b), Integer.valueOf(jArr.length)));
        }
    }

    @Override // j$.util.stream.C5989p1
    public final String toString() {
        long[] jArr = this.f37764a;
        return String.format("LongFixedNodeBuilder[%d][%s]", Integer.valueOf(jArr.length - this.f37765b), Arrays.toString(jArr));
    }
}
