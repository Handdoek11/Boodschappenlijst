package j$.util.stream;

import j$.util.AbstractC5897d;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
class V2 extends X2 implements LongConsumer {
    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // j$.util.stream.X2
    protected final void s(Object obj, int i8, int i9, Object obj2) {
        long[] jArr = (long[]) obj;
        LongConsumer longConsumer = (LongConsumer) obj2;
        while (i8 < i9) {
            longConsumer.accept(jArr[i8]);
            i8++;
        }
    }

    @Override // j$.util.stream.X2
    protected final int t(Object obj) {
        return ((long[]) obj).length;
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            e((LongConsumer) consumer);
        } else {
            if (M3.f37518a) {
                M3.a(getClass(), "{0} calling SpinedBuffer.OfLong.forEach(Consumer)");
                throw null;
            }
            AbstractC5897d.c((U2) spliterator(), consumer);
        }
    }

    @Override // j$.util.stream.X2
    protected final Object[] w() {
        return new long[8][];
    }

    @Override // j$.util.stream.X2
    public final Object c(int i8) {
        return new long[i8];
    }

    @Override // java.util.function.LongConsumer
    public void accept(long j8) {
        x();
        long[] jArr = (long[]) this.f37603e;
        int i8 = this.f37640b;
        this.f37640b = i8 + 1;
        jArr[i8] = j8;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Spliterators.h(spliterator());
    }

    @Override // j$.util.stream.X2, java.lang.Iterable
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public j$.util.b0 spliterator() {
        return new U2(this, 0, this.f37641c, 0, this.f37640b);
    }

    public final String toString() {
        long[] jArr = (long[]) d();
        if (jArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f37641c), Arrays.toString(jArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f37641c), Arrays.toString(Arrays.copyOf(jArr, 200)));
    }
}
