package j$.util.stream;

import j$.util.AbstractC5897d;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class P2 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    int f37543a;

    /* renamed from: b, reason: collision with root package name */
    final int f37544b;

    /* renamed from: c, reason: collision with root package name */
    int f37545c;

    /* renamed from: d, reason: collision with root package name */
    final int f37546d;

    /* renamed from: e, reason: collision with root package name */
    Object[] f37547e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Y2 f37548f;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC5897d.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i8) {
        return AbstractC5897d.e(this, i8);
    }

    P2(Y2 y22, int i8, int i9, int i10, int i11) {
        this.f37548f = y22;
        this.f37543a = i8;
        this.f37544b = i9;
        this.f37545c = i10;
        this.f37546d = i11;
        Object[][] objArr = y22.f37607f;
        this.f37547e = objArr == null ? y22.f37606e : objArr[i8];
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i8 = this.f37543a;
        int i9 = this.f37546d;
        int i10 = this.f37544b;
        if (i8 == i10) {
            return i9 - this.f37545c;
        }
        long[] jArr = this.f37548f.f37642d;
        return ((jArr[i10] + i9) - jArr[i8]) - this.f37545c;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int i8 = this.f37543a;
        int i9 = this.f37544b;
        if (i8 >= i9 && (i8 != i9 || this.f37545c >= this.f37546d)) {
            return false;
        }
        Object[] objArr = this.f37547e;
        int i10 = this.f37545c;
        this.f37545c = i10 + 1;
        consumer.accept(objArr[i10]);
        if (this.f37545c == this.f37547e.length) {
            this.f37545c = 0;
            int i11 = this.f37543a + 1;
            this.f37543a = i11;
            Object[][] objArr2 = this.f37548f.f37607f;
            if (objArr2 != null && i11 <= i9) {
                this.f37547e = objArr2[i11];
            }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Y2 y22;
        Objects.requireNonNull(consumer);
        int i8 = this.f37543a;
        int i9 = this.f37546d;
        int i10 = this.f37544b;
        if (i8 < i10 || (i8 == i10 && this.f37545c < i9)) {
            int i11 = this.f37545c;
            while (true) {
                y22 = this.f37548f;
                if (i8 >= i10) {
                    break;
                }
                Object[] objArr = y22.f37607f[i8];
                while (i11 < objArr.length) {
                    consumer.accept(objArr[i11]);
                    i11++;
                }
                i8++;
                i11 = 0;
            }
            Object[] objArr2 = this.f37543a == i10 ? this.f37547e : y22.f37607f[i10];
            while (i11 < i9) {
                consumer.accept(objArr2[i11]);
                i11++;
            }
            this.f37543a = i10;
            this.f37545c = i9;
        }
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i8 = this.f37543a;
        int i9 = this.f37544b;
        if (i8 < i9) {
            int i10 = i9 - 1;
            int i11 = this.f37545c;
            Y2 y22 = this.f37548f;
            P2 p22 = new P2(y22, i8, i10, i11, y22.f37607f[i10].length);
            this.f37543a = i9;
            this.f37545c = 0;
            this.f37547e = y22.f37607f[i9];
            return p22;
        }
        if (i8 != i9) {
            return null;
        }
        int i12 = this.f37545c;
        int i13 = (this.f37546d - i12) / 2;
        if (i13 == 0) {
            return null;
        }
        Spliterator m8 = Spliterators.m(this.f37547e, i12, i12 + i13);
        this.f37545c += i13;
        return m8;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }
}
