package j$.util.concurrent;

import j$.util.AbstractC5897d;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class j extends p implements Spliterator {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f37316i;

    /* renamed from: j, reason: collision with root package name */
    long f37317j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l[] lVarArr, int i8, int i9, int i10, long j8, int i11) {
        super(lVarArr, i8, i9, i10);
        this.f37316i = i11;
        this.f37317j = j8;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        switch (this.f37316i) {
            case 0:
                return 4353;
            default:
                return 4352;
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        switch (this.f37316i) {
        }
        return AbstractC5897d.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i8) {
        switch (this.f37316i) {
        }
        return AbstractC5897d.e(this, i8);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        switch (this.f37316i) {
            case 0:
                throw new IllegalStateException();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        switch (this.f37316i) {
            case 0:
                int i8 = this.f37334f;
                int i9 = this.f37335g;
                int i10 = (i8 + i9) >>> 1;
                if (i10 <= i8) {
                    return null;
                }
                l[] lVarArr = this.f37329a;
                this.f37335g = i10;
                long j8 = this.f37317j >>> 1;
                this.f37317j = j8;
                return new j(lVarArr, this.f37336h, i10, i9, j8, 0);
            default:
                int i11 = this.f37334f;
                int i12 = this.f37335g;
                int i13 = (i11 + i12) >>> 1;
                if (i13 <= i11) {
                    return null;
                }
                l[] lVarArr2 = this.f37329a;
                this.f37335g = i13;
                long j9 = this.f37317j >>> 1;
                this.f37317j = j9;
                return new j(lVarArr2, this.f37336h, i13, i12, j9, 1);
        }
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        switch (this.f37316i) {
            case 0:
                consumer.getClass();
                while (true) {
                    l a8 = a();
                    if (a8 == null) {
                        break;
                    } else {
                        consumer.accept(a8.f37322b);
                    }
                }
            default:
                consumer.getClass();
                while (true) {
                    l a9 = a();
                    if (a9 == null) {
                        break;
                    } else {
                        consumer.accept(a9.f37323c);
                    }
                }
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        switch (this.f37316i) {
            case 0:
                consumer.getClass();
                l a8 = a();
                if (a8 != null) {
                    consumer.accept(a8.f37322b);
                    break;
                }
                break;
            default:
                consumer.getClass();
                l a9 = a();
                if (a9 != null) {
                    consumer.accept(a9.f37323c);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        switch (this.f37316i) {
        }
        return this.f37317j;
    }
}
