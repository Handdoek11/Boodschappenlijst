package y0;

import android.util.LongSparseArray;
import y6.AbstractC6969H;

/* loaded from: classes.dex */
public abstract class c {

    public static final class a extends AbstractC6969H {

        /* renamed from: o, reason: collision with root package name */
        private int f44523o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ LongSparseArray f44524s;

        a(LongSparseArray longSparseArray) {
            this.f44524s = longSparseArray;
        }

        @Override // y6.AbstractC6969H
        public long a() {
            LongSparseArray longSparseArray = this.f44524s;
            int i8 = this.f44523o;
            this.f44523o = i8 + 1;
            return longSparseArray.keyAt(i8);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f44523o < this.f44524s.size();
        }
    }

    public static final AbstractC6969H a(LongSparseArray longSparseArray) {
        return new a(longSparseArray);
    }
}
