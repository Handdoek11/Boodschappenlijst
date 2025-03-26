package j$.util.stream;

import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.g3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5946g3 extends AbstractC5961j3 implements DoubleConsumer {

    /* renamed from: c, reason: collision with root package name */
    final double[] f37702c;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }

    C5946g3(int i8) {
        this.f37702c = new double[i8];
    }

    @Override // j$.util.stream.AbstractC5961j3
    final void b(Object obj, long j8) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i8 = 0; i8 < j8; i8++) {
            doubleConsumer.accept(this.f37702c[i8]);
        }
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d8) {
        int i8 = this.f37721b;
        this.f37721b = i8 + 1;
        this.f37702c[i8] = d8;
    }
}
