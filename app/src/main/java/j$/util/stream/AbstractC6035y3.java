package j$.util.stream;

import j$.util.Spliterator;

/* renamed from: j$.util.stream.y3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC6035y3 {

    /* renamed from: a, reason: collision with root package name */
    final long f37839a;

    /* renamed from: b, reason: collision with root package name */
    final long f37840b;

    /* renamed from: c, reason: collision with root package name */
    Spliterator f37841c;

    /* renamed from: d, reason: collision with root package name */
    long f37842d;

    /* renamed from: e, reason: collision with root package name */
    long f37843e;

    protected abstract Spliterator a(Spliterator spliterator, long j8, long j9, long j10, long j11);

    AbstractC6035y3(Spliterator spliterator, long j8, long j9, long j10, long j11) {
        this.f37841c = spliterator;
        this.f37839a = j8;
        this.f37840b = j9;
        this.f37842d = j10;
        this.f37843e = j11;
    }

    public final Spliterator trySplit() {
        long j8 = this.f37843e;
        if (this.f37839a >= j8 || this.f37842d >= j8) {
            return null;
        }
        while (true) {
            Spliterator trySplit = this.f37841c.trySplit();
            if (trySplit == null) {
                return null;
            }
            long estimateSize = trySplit.estimateSize() + this.f37842d;
            long min = Math.min(estimateSize, this.f37840b);
            long j9 = this.f37839a;
            if (j9 >= min) {
                this.f37842d = min;
            } else {
                long j10 = this.f37840b;
                if (min >= j10) {
                    this.f37841c = trySplit;
                    this.f37843e = min;
                } else {
                    long j11 = this.f37842d;
                    if (j11 >= j9 && estimateSize <= j10) {
                        this.f37842d = min;
                        return trySplit;
                    }
                    this.f37842d = min;
                    return a(trySplit, j9, j10, j11, min);
                }
            }
        }
    }

    public final long estimateSize() {
        long j8 = this.f37843e;
        long j9 = this.f37839a;
        if (j9 < j8) {
            return j8 - Math.max(j9, this.f37842d);
        }
        return 0L;
    }

    public final int characteristics() {
        return this.f37841c.characteristics();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.e0 m30trySplit() {
        return (j$.util.e0) trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.Y m28trySplit() {
        return (j$.util.Y) trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.b0 m29trySplit() {
        return (j$.util.b0) trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.V m27trySplit() {
        return (j$.util.V) trySplit();
    }
}
