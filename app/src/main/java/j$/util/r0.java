package j$.util;

import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
class r0 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.Collection f37414a;

    /* renamed from: b, reason: collision with root package name */
    private Iterator f37415b = null;

    /* renamed from: c, reason: collision with root package name */
    private final int f37416c;

    /* renamed from: d, reason: collision with root package name */
    private long f37417d;

    /* renamed from: e, reason: collision with root package name */
    private int f37418e;

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC5897d.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i8) {
        return AbstractC5897d.e(this, i8);
    }

    public r0(java.util.Collection collection, int i8) {
        this.f37414a = collection;
        this.f37416c = (i8 & 4096) == 0 ? i8 | 16448 : i8;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        long j8;
        Iterator it = this.f37415b;
        if (it == null) {
            java.util.Collection collection = this.f37414a;
            Iterator it2 = collection.iterator();
            this.f37415b = it2;
            j8 = collection.size();
            this.f37417d = j8;
            it = it2;
        } else {
            j8 = this.f37417d;
        }
        if (j8 <= 1 || !it.hasNext()) {
            return null;
        }
        int i8 = this.f37418e + 1024;
        if (i8 > j8) {
            i8 = (int) j8;
        }
        if (i8 > 33554432) {
            i8 = 33554432;
        }
        Object[] objArr = new Object[i8];
        int i9 = 0;
        do {
            objArr[i9] = it.next();
            i9++;
            if (i9 >= i8) {
                break;
            }
        } while (it.hasNext());
        this.f37418e = i9;
        long j9 = this.f37417d;
        if (j9 != Long.MAX_VALUE) {
            this.f37417d = j9 - i9;
        }
        return new k0(objArr, 0, i9, this.f37416c);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        Iterator it = this.f37415b;
        if (it == null) {
            Iterator it2 = this.f37414a.iterator();
            this.f37415b = it2;
            this.f37417d = r0.size();
            it = it2;
        }
        AbstractC5897d.q(it, consumer);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        if (this.f37415b == null) {
            this.f37415b = this.f37414a.iterator();
            this.f37417d = r0.size();
        }
        if (!this.f37415b.hasNext()) {
            return false;
        }
        consumer.accept(this.f37415b.next());
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        if (this.f37415b == null) {
            java.util.Collection collection = this.f37414a;
            this.f37415b = collection.iterator();
            long size = collection.size();
            this.f37417d = size;
            return size;
        }
        return this.f37417d;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f37416c;
    }

    @Override // j$.util.Spliterator
    public Comparator getComparator() {
        if (AbstractC5897d.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
