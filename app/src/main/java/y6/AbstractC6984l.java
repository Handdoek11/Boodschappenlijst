package y6;

import J6.AbstractC0642b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: y6.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6984l extends AbstractC6983k {

    /* renamed from: y6.l$a */
    static final class a extends J6.s implements I6.a {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Object[] f44659o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object[] objArr) {
            super(0);
            this.f44659o = objArr;
        }

        @Override // I6.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Iterator invoke() {
            return AbstractC0642b.a(this.f44659o);
        }
    }

    public static final int A(byte[] bArr, byte b8) {
        J6.r.e(bArr, "<this>");
        int length = bArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (b8 == bArr[i8]) {
                return i8;
            }
        }
        return -1;
    }

    public static final int B(int[] iArr, int i8) {
        J6.r.e(iArr, "<this>");
        int length = iArr.length;
        for (int i9 = 0; i9 < length; i9++) {
            if (i8 == iArr[i9]) {
                return i9;
            }
        }
        return -1;
    }

    public static final int C(long[] jArr, long j8) {
        J6.r.e(jArr, "<this>");
        int length = jArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (j8 == jArr[i8]) {
                return i8;
            }
        }
        return -1;
    }

    public static int D(Object[] objArr, Object obj) {
        J6.r.e(objArr, "<this>");
        int i8 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i8 < length) {
                if (objArr[i8] == null) {
                    return i8;
                }
                i8++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i8 < length2) {
            if (J6.r.a(obj, objArr[i8])) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public static final int E(short[] sArr, short s8) {
        J6.r.e(sArr, "<this>");
        int length = sArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (s8 == sArr[i8]) {
                return i8;
            }
        }
        return -1;
    }

    public static final Appendable F(Object[] objArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, I6.l lVar) {
        J6.r.e(objArr, "<this>");
        J6.r.e(appendable, "buffer");
        J6.r.e(charSequence, "separator");
        J6.r.e(charSequence2, "prefix");
        J6.r.e(charSequence3, "postfix");
        J6.r.e(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i9 = 0;
        for (Object obj : objArr) {
            i9++;
            if (i9 > 1) {
                appendable.append(charSequence);
            }
            if (i8 >= 0 && i9 > i8) {
                break;
            }
            S6.h.a(appendable, obj, lVar);
        }
        if (i8 >= 0 && i9 > i8) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static char H(char[] cArr) {
        J6.r.e(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static Object I(Object[] objArr) {
        J6.r.e(objArr, "<this>");
        if (objArr.length == 1) {
            return objArr[0];
        }
        return null;
    }

    public static final Object[] J(Object[] objArr, Comparator comparator) {
        J6.r.e(objArr, "<this>");
        J6.r.e(comparator, "comparator");
        if (objArr.length == 0) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        J6.r.d(copyOf, "copyOf(...)");
        AbstractC6983k.n(copyOf, comparator);
        return copyOf;
    }

    public static List K(Object[] objArr, Comparator comparator) {
        J6.r.e(objArr, "<this>");
        J6.r.e(comparator, "comparator");
        return AbstractC6980h.c(J(objArr, comparator));
    }

    public static final Collection L(Object[] objArr, Collection collection) {
        J6.r.e(objArr, "<this>");
        J6.r.e(collection, "destination");
        for (Object obj : objArr) {
            collection.add(obj);
        }
        return collection;
    }

    public static List M(Object[] objArr) {
        J6.r.e(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? N(objArr) : AbstractC6987o.b(objArr[0]) : AbstractC6987o.e();
    }

    public static final List N(Object[] objArr) {
        J6.r.e(objArr, "<this>");
        return new ArrayList(AbstractC6989q.d(objArr));
    }

    public static final Set O(Object[] objArr) {
        J6.r.e(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? (Set) L(objArr, new LinkedHashSet(AbstractC6971J.b(objArr.length))) : P.a(objArr[0]) : P.b();
    }

    public static Iterable P(Object[] objArr) {
        J6.r.e(objArr, "<this>");
        return new C6966E(new a(objArr));
    }

    public static boolean p(byte[] bArr, byte b8) {
        J6.r.e(bArr, "<this>");
        return A(bArr, b8) >= 0;
    }

    public static boolean q(int[] iArr, int i8) {
        J6.r.e(iArr, "<this>");
        return B(iArr, i8) >= 0;
    }

    public static boolean r(long[] jArr, long j8) {
        J6.r.e(jArr, "<this>");
        return C(jArr, j8) >= 0;
    }

    public static final boolean s(Object[] objArr, Object obj) {
        J6.r.e(objArr, "<this>");
        return AbstractC6980h.D(objArr, obj) >= 0;
    }

    public static boolean t(short[] sArr, short s8) {
        J6.r.e(sArr, "<this>");
        return E(sArr, s8) >= 0;
    }

    public static List u(Object[] objArr) {
        J6.r.e(objArr, "<this>");
        return (List) v(objArr, new ArrayList());
    }

    public static final Collection v(Object[] objArr, Collection collection) {
        J6.r.e(objArr, "<this>");
        J6.r.e(collection, "destination");
        for (Object obj : objArr) {
            if (obj != null) {
                collection.add(obj);
            }
        }
        return collection;
    }

    public static Object w(Object[] objArr) {
        J6.r.e(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static int x(long[] jArr) {
        J6.r.e(jArr, "<this>");
        return jArr.length - 1;
    }

    public static final int y(Object[] objArr) {
        J6.r.e(objArr, "<this>");
        return objArr.length - 1;
    }

    public static Object z(Object[] objArr, int i8) {
        J6.r.e(objArr, "<this>");
        if (i8 < 0 || i8 > y(objArr)) {
            return null;
        }
        return objArr[i8];
    }
}
