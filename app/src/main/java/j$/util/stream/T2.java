package j$.util.stream;

import j$.util.AbstractC5897d;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
class T2 extends X2 implements IntConsumer {
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }

    @Override // j$.util.stream.X2
    protected final void s(Object obj, int i8, int i9, Object obj2) {
        int[] iArr = (int[]) obj;
        IntConsumer intConsumer = (IntConsumer) obj2;
        while (i8 < i9) {
            intConsumer.accept(iArr[i8]);
            i8++;
        }
    }

    @Override // j$.util.stream.X2
    protected final int t(Object obj) {
        return ((int[]) obj).length;
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            e((IntConsumer) consumer);
        } else {
            if (M3.f37518a) {
                M3.a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
                throw null;
            }
            AbstractC5897d.b((S2) spliterator(), consumer);
        }
    }

    @Override // j$.util.stream.X2
    protected final Object[] w() {
        return new int[8][];
    }

    @Override // j$.util.stream.X2
    public final Object c(int i8) {
        return new int[i8];
    }

    @Override // java.util.function.IntConsumer
    public void accept(int i8) {
        x();
        int[] iArr = (int[]) this.f37603e;
        int i9 = this.f37640b;
        this.f37640b = i9 + 1;
        iArr[i9] = i8;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Spliterators.g(spliterator());
    }

    @Override // j$.util.stream.X2, java.lang.Iterable
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public j$.util.Y spliterator() {
        return new S2(this, 0, this.f37641c, 0, this.f37640b);
    }

    public final String toString() {
        int[] iArr = (int[]) d();
        if (iArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f37641c), Arrays.toString(iArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f37641c), Arrays.toString(Arrays.copyOf(iArr, 200)));
    }
}
