package j$.util.stream;

import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.h3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5951h3 extends AbstractC5961j3 implements IntConsumer {

    /* renamed from: c, reason: collision with root package name */
    final int[] f37709c;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }

    C5951h3(int i8) {
        this.f37709c = new int[i8];
    }

    @Override // j$.util.stream.AbstractC5961j3
    public final void b(Object obj, long j8) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i8 = 0; i8 < j8; i8++) {
            intConsumer.accept(this.f37709c[i8]);
        }
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i8) {
        int i9 = this.f37721b;
        this.f37721b = i9 + 1;
        this.f37709c[i9] = i8;
    }
}
