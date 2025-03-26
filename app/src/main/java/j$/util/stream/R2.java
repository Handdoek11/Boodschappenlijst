package j$.util.stream;

import j$.util.AbstractC5897d;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes3.dex */
class R2 extends X2 implements DoubleConsumer {
    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }

    @Override // j$.util.stream.X2
    protected final void s(Object obj, int i8, int i9, Object obj2) {
        double[] dArr = (double[]) obj;
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj2;
        while (i8 < i9) {
            doubleConsumer.accept(dArr[i8]);
            i8++;
        }
    }

    @Override // j$.util.stream.X2
    protected final int t(Object obj) {
        return ((double[]) obj).length;
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            e((DoubleConsumer) consumer);
        } else {
            if (M3.f37518a) {
                M3.a(getClass(), "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
                throw null;
            }
            AbstractC5897d.a((Q2) spliterator(), consumer);
        }
    }

    @Override // j$.util.stream.X2
    protected final Object[] w() {
        return new double[8][];
    }

    @Override // j$.util.stream.X2
    public final Object c(int i8) {
        return new double[i8];
    }

    @Override // java.util.function.DoubleConsumer
    public void accept(double d8) {
        x();
        double[] dArr = (double[]) this.f37603e;
        int i8 = this.f37640b;
        this.f37640b = i8 + 1;
        dArr[i8] = d8;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Spliterators.f(spliterator());
    }

    @Override // j$.util.stream.X2, java.lang.Iterable
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public j$.util.V spliterator() {
        return new Q2(this, 0, this.f37641c, 0, this.f37640b);
    }

    public final String toString() {
        double[] dArr = (double[]) d();
        if (dArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f37641c), Arrays.toString(dArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f37641c), Arrays.toString(Arrays.copyOf(dArr, 200)));
    }
}
