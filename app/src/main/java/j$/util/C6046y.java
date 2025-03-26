package j$.util;

import java.util.function.IntConsumer;

/* renamed from: j$.util.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6046y implements IntConsumer {
    private long count;
    private long sum;
    private int min = Integer.MAX_VALUE;
    private int max = Integer.MIN_VALUE;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i8) {
        this.count++;
        this.sum += i8;
        this.min = Math.min(this.min, i8);
        this.max = Math.max(this.max, i8);
    }

    public final void b(C6046y c6046y) {
        this.count += c6046y.count;
        this.sum += c6046y.sum;
        this.min = Math.min(this.min, c6046y.min);
        this.max = Math.max(this.max, c6046y.max);
    }

    public final String toString() {
        String simpleName = C6046y.class.getSimpleName();
        Long valueOf = Long.valueOf(this.count);
        Long valueOf2 = Long.valueOf(this.sum);
        Integer valueOf3 = Integer.valueOf(this.min);
        long j8 = this.count;
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", simpleName, valueOf, valueOf2, valueOf3, Double.valueOf(j8 > 0 ? this.sum / j8 : 0.0d), Integer.valueOf(this.max));
    }
}
