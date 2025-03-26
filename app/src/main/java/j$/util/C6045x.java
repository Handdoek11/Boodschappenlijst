package j$.util;

import java.util.function.DoubleConsumer;

/* renamed from: j$.util.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6045x implements DoubleConsumer {

    /* renamed from: a, reason: collision with root package name */
    private double f37857a;

    /* renamed from: b, reason: collision with root package name */
    private double f37858b;
    private long count;
    private double sum;
    private double min = Double.POSITIVE_INFINITY;
    private double max = Double.NEGATIVE_INFINITY;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d8) {
        this.count++;
        this.f37858b += d8;
        c(d8);
        this.min = Math.min(this.min, d8);
        this.max = Math.max(this.max, d8);
    }

    public final void b(C6045x c6045x) {
        this.count += c6045x.count;
        this.f37858b += c6045x.f37858b;
        c(c6045x.sum);
        c(c6045x.f37857a);
        this.min = Math.min(this.min, c6045x.min);
        this.max = Math.max(this.max, c6045x.max);
    }

    private void c(double d8) {
        double d9 = d8 - this.f37857a;
        double d10 = this.sum;
        double d11 = d10 + d9;
        this.f37857a = (d11 - d10) - d9;
        this.sum = d11;
    }

    public final String toString() {
        double d8;
        String simpleName = C6045x.class.getSimpleName();
        Long valueOf = Long.valueOf(this.count);
        double d9 = this.sum + this.f37857a;
        if (Double.isNaN(d9) && Double.isInfinite(this.f37858b)) {
            d9 = this.f37858b;
        }
        Double valueOf2 = Double.valueOf(d9);
        Double valueOf3 = Double.valueOf(this.min);
        if (this.count > 0) {
            double d10 = this.sum + this.f37857a;
            if (Double.isNaN(d10) && Double.isInfinite(this.f37858b)) {
                d10 = this.f37858b;
            }
            d8 = d10 / this.count;
        } else {
            d8 = 0.0d;
        }
        return String.format("%s{count=%d, sum=%f, min=%f, average=%f, max=%f}", simpleName, valueOf, valueOf2, valueOf3, Double.valueOf(d8), Double.valueOf(this.max));
    }
}
