package c4;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes2.dex */
public abstract class r extends AbstractC1011n implements Set {

    /* renamed from: s, reason: collision with root package name */
    private transient AbstractC1012o f12227s;

    r() {
    }

    static int o(int i8) {
        int max = Math.max(i8, 2);
        if (max >= 751619276) {
            b4.h.e(max < 1073741824, "collection too large");
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    private static r p(int i8, Object... objArr) {
        if (i8 == 0) {
            return t();
        }
        if (i8 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return v(obj);
        }
        int o8 = o(i8);
        Object[] objArr2 = new Object[o8];
        int i9 = o8 - 1;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < i8; i12++) {
            Object a8 = AbstractC0997F.a(objArr[i12], i12);
            int hashCode = a8.hashCode();
            int b8 = AbstractC1010m.b(hashCode);
            while (true) {
                int i13 = b8 & i9;
                Object obj2 = objArr2[i13];
                if (obj2 == null) {
                    objArr[i11] = a8;
                    objArr2[i13] = a8;
                    i10 += hashCode;
                    i11++;
                    break;
                }
                if (obj2.equals(a8)) {
                    break;
                }
                b8++;
            }
        }
        Arrays.fill(objArr, i11, i8, (Object) null);
        if (i11 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new N(obj3);
        }
        if (o(i11) < o8 / 2) {
            return p(i11, objArr);
        }
        if (y(i11, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i11);
        }
        return new K(objArr, i10, objArr2, i9, i11);
    }

    public static r q(Collection collection) {
        if ((collection instanceof r) && !(collection instanceof SortedSet)) {
            r rVar = (r) collection;
            if (!rVar.j()) {
                return rVar;
            }
        }
        Object[] array = collection.toArray();
        return p(array.length, array);
    }

    public static r t() {
        return K.f12149z;
    }

    public static r v(Object obj) {
        return new N(obj);
    }

    public static r w(Object obj, Object obj2, Object obj3) {
        return p(3, obj, obj2, obj3);
    }

    public static r x(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        b4.h.e(objArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return p(length, objArr2);
    }

    private static boolean y(int i8, int i9) {
        return i8 < (i9 >> 1) + (i9 >> 2);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof r) && s() && ((r) obj).s() && hashCode() != obj.hashCode()) {
            return false;
        }
        return M.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return M.b(this);
    }

    public AbstractC1012o n() {
        AbstractC1012o abstractC1012o = this.f12227s;
        if (abstractC1012o != null) {
            return abstractC1012o;
        }
        AbstractC1012o r8 = r();
        this.f12227s = r8;
        return r8;
    }

    AbstractC1012o r() {
        return AbstractC1012o.n(toArray());
    }

    boolean s() {
        return false;
    }
}
