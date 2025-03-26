package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
class Y2 extends AbstractC5927d implements Consumer, Iterable, j$.lang.a {

    /* renamed from: e, reason: collision with root package name */
    protected Object[] f37606e = new Object[1 << 4];

    /* renamed from: f, reason: collision with root package name */
    protected Object[][] f37607f;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    Y2() {
    }

    protected final void s(long j8) {
        long length;
        int i8 = this.f37641c;
        if (i8 == 0) {
            length = this.f37606e.length;
        } else {
            length = this.f37642d[i8] + this.f37607f[i8].length;
        }
        if (j8 > length) {
            if (this.f37607f == null) {
                Object[][] objArr = new Object[8][];
                this.f37607f = objArr;
                this.f37642d = new long[8];
                objArr[0] = this.f37606e;
            }
            int i9 = i8 + 1;
            while (j8 > length) {
                Object[][] objArr2 = this.f37607f;
                if (i9 >= objArr2.length) {
                    int length2 = objArr2.length * 2;
                    this.f37607f = (Object[][]) Arrays.copyOf(objArr2, length2);
                    this.f37642d = Arrays.copyOf(this.f37642d, length2);
                }
                int i10 = this.f37639a;
                if (i9 != 0 && i9 != 1) {
                    i10 = Math.min((i10 + i9) - 1, 30);
                }
                int i11 = 1 << i10;
                this.f37607f[i9] = new Object[i11];
                long[] jArr = this.f37642d;
                jArr[i9] = jArr[i9 - 1] + r5[r7].length;
                length += i11;
                i9++;
            }
        }
    }

    @Override // j$.util.stream.AbstractC5927d
    public final void clear() {
        Object[][] objArr = this.f37607f;
        if (objArr != null) {
            this.f37606e = objArr[0];
            int i8 = 0;
            while (true) {
                Object[] objArr2 = this.f37606e;
                if (i8 >= objArr2.length) {
                    break;
                }
                objArr2[i8] = null;
                i8++;
            }
            this.f37607f = null;
            this.f37642d = null;
        } else {
            for (int i9 = 0; i9 < this.f37640b; i9++) {
                this.f37606e[i9] = null;
            }
        }
        this.f37640b = 0;
        this.f37641c = 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Spliterators.i(spliterator());
    }

    @Override // java.lang.Iterable, j$.lang.a
    public void forEach(Consumer consumer) {
        for (int i8 = 0; i8 < this.f37641c; i8++) {
            for (Object obj : this.f37607f[i8]) {
                consumer.accept(obj);
            }
        }
        for (int i9 = 0; i9 < this.f37640b; i9++) {
            consumer.accept(this.f37606e[i9]);
        }
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        long length;
        int i8 = this.f37640b;
        Object[] objArr = this.f37606e;
        if (i8 == objArr.length) {
            if (this.f37607f == null) {
                Object[][] objArr2 = new Object[8][];
                this.f37607f = objArr2;
                this.f37642d = new long[8];
                objArr2[0] = objArr;
            }
            int i9 = this.f37641c;
            int i10 = i9 + 1;
            Object[][] objArr3 = this.f37607f;
            if (i10 >= objArr3.length || objArr3[i10] == null) {
                if (i9 == 0) {
                    length = objArr.length;
                } else {
                    length = objArr3[i9].length + this.f37642d[i9];
                }
                s(length + 1);
            }
            this.f37640b = 0;
            int i11 = this.f37641c + 1;
            this.f37641c = i11;
            this.f37606e = this.f37607f[i11];
        }
        Object[] objArr4 = this.f37606e;
        int i12 = this.f37640b;
        this.f37640b = i12 + 1;
        objArr4[i12] = obj;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Objects.requireNonNull(arrayList);
        forEach(new C5912a(10, arrayList));
        return "SpinedBuffer:" + arrayList.toString();
    }

    @Override // java.lang.Iterable
    public j$.util.Spliterator spliterator() {
        return new P2(this, 0, this.f37641c, 0, this.f37640b);
    }
}
