package j$.util.stream;

import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.i3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5956i3 extends AbstractC5961j3 implements LongConsumer {

    /* renamed from: c, reason: collision with root package name */
    final long[] f37716c;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    C5956i3(int i8) {
        this.f37716c = new long[i8];
    }

    @Override // j$.util.stream.AbstractC5961j3
    public final void b(Object obj, long j8) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i8 = 0; i8 < j8; i8++) {
            longConsumer.accept(this.f37716c[i8]);
        }
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j8) {
        int i8 = this.f37721b;
        this.f37721b = i8 + 1;
        this.f37716c[i8] = j8;
    }
}
