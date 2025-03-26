package y6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class y extends x {

    static final class a extends J6.s implements I6.l {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f44660o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i8) {
            super(1);
            this.f44660o = i8;
        }

        public final Object b(int i8) {
            throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + this.f44660o + '.');
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((Number) obj).intValue());
        }
    }

    public static Object A(Iterable iterable) {
        J6.r.e(iterable, "<this>");
        if (iterable instanceof List) {
            return AbstractC6987o.B((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object B(List list) {
        J6.r.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object C(Iterable iterable) {
        J6.r.e(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object D(List list) {
        J6.r.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final int E(Iterable iterable, Object obj) {
        J6.r.e(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i8 = 0;
        for (Object obj2 : iterable) {
            if (i8 < 0) {
                AbstractC6987o.k();
            }
            if (J6.r.a(obj, obj2)) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public static final Appendable F(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, I6.l lVar) {
        J6.r.e(iterable, "<this>");
        J6.r.e(appendable, "buffer");
        J6.r.e(charSequence, "separator");
        J6.r.e(charSequence2, "prefix");
        J6.r.e(charSequence3, "postfix");
        J6.r.e(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i9 = 0;
        for (Object obj : iterable) {
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

    public static final String H(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, I6.l lVar) {
        J6.r.e(iterable, "<this>");
        J6.r.e(charSequence, "separator");
        J6.r.e(charSequence2, "prefix");
        J6.r.e(charSequence3, "postfix");
        J6.r.e(charSequence4, "truncated");
        String sb = ((StringBuilder) F(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i8, charSequence4, lVar)).toString();
        J6.r.d(sb, "toString(...)");
        return sb;
    }

    public static /* synthetic */ String I(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, I6.l lVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i9 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i9 & 4) == 0 ? charSequence3 : "";
        if ((i9 & 8) != 0) {
            i8 = -1;
        }
        int i10 = i8;
        if ((i9 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i9 & 32) != 0) {
            lVar = null;
        }
        return H(iterable, charSequence, charSequence5, charSequence6, i10, charSequence7, lVar);
    }

    public static Object J(List list) {
        J6.r.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(AbstractC6987o.f(list));
    }

    public static Object K(List list) {
        J6.r.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable L(Iterable iterable) {
        J6.r.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static List M(Iterable iterable, Iterable iterable2) {
        J6.r.e(iterable, "<this>");
        J6.r.e(iterable2, "elements");
        if (iterable instanceof Collection) {
            return AbstractC6987o.N((Collection) iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        AbstractC6987o.o(arrayList, iterable);
        AbstractC6987o.o(arrayList, iterable2);
        return arrayList;
    }

    public static List N(Collection collection, Iterable iterable) {
        J6.r.e(collection, "<this>");
        J6.r.e(iterable, "elements");
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            AbstractC6987o.o(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static List O(Collection collection, Object obj) {
        J6.r.e(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static Object P(Collection collection, N6.c cVar) {
        J6.r.e(collection, "<this>");
        J6.r.e(cVar, "random");
        if (collection.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return w(collection, cVar.d(collection.size()));
    }

    public static List Q(Iterable iterable) {
        J6.r.e(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return AbstractC6987o.a0(iterable);
        }
        List b02 = b0(iterable);
        x.s(b02);
        return b02;
    }

    public static Object R(Iterable iterable) {
        J6.r.e(iterable, "<this>");
        if (iterable instanceof List) {
            return S((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static final Object S(List list) {
        J6.r.e(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static Object T(List list) {
        J6.r.e(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List U(Iterable iterable, Comparator comparator) {
        J6.r.e(iterable, "<this>");
        J6.r.e(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List b02 = b0(iterable);
            AbstractC6987o.n(b02, comparator);
            return b02;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return AbstractC6987o.a0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        AbstractC6983k.n(array, comparator);
        return AbstractC6980h.c(array);
    }

    public static final List V(Iterable iterable, int i8) {
        J6.r.e(iterable, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return AbstractC6987o.e();
        }
        if (iterable instanceof Collection) {
            if (i8 >= ((Collection) iterable).size()) {
                return AbstractC6987o.a0(iterable);
            }
            if (i8 == 1) {
                return AbstractC6987o.b(AbstractC6987o.A(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i8);
        Iterator it = iterable.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i9++;
            if (i9 == i8) {
                break;
            }
        }
        return AbstractC6989q.i(arrayList);
    }

    public static boolean[] W(Collection collection) {
        J6.r.e(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        Iterator it = collection.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            zArr[i8] = ((Boolean) it.next()).booleanValue();
            i8++;
        }
        return zArr;
    }

    public static final Collection X(Iterable iterable, Collection collection) {
        J6.r.e(iterable, "<this>");
        J6.r.e(collection, "destination");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
        return collection;
    }

    public static HashSet Y(Iterable iterable) {
        J6.r.e(iterable, "<this>");
        return (HashSet) X(iterable, new HashSet(AbstractC6971J.b(AbstractC6987o.l(iterable, 12))));
    }

    public static int[] Z(Collection collection) {
        J6.r.e(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            iArr[i8] = ((Number) it.next()).intValue();
            i8++;
        }
        return iArr;
    }

    public static List a0(Iterable iterable) {
        J6.r.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return AbstractC6989q.i(b0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return AbstractC6987o.e();
        }
        if (size != 1) {
            return AbstractC6987o.c0(collection);
        }
        return AbstractC6987o.b(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final List b0(Iterable iterable) {
        J6.r.e(iterable, "<this>");
        return iterable instanceof Collection ? AbstractC6987o.c0((Collection) iterable) : (List) X(iterable, new ArrayList());
    }

    public static List c0(Collection collection) {
        J6.r.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static Set d0(Iterable iterable) {
        J6.r.e(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) X(iterable, new LinkedHashSet());
    }

    public static Set e0(Iterable iterable) {
        J6.r.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return S.d((Set) X(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return P.b();
        }
        if (size != 1) {
            return (Set) X(iterable, new LinkedHashSet(AbstractC6971J.b(collection.size())));
        }
        return P.a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static List f0(Iterable iterable, Iterable iterable2) {
        J6.r.e(iterable, "<this>");
        J6.r.e(iterable2, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(AbstractC6987o.l(iterable, 10), AbstractC6987o.l(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(x6.u.a(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static boolean t(Iterable iterable) {
        J6.r.e(iterable, "<this>");
        return iterable instanceof Collection ? !((Collection) iterable).isEmpty() : iterable.iterator().hasNext();
    }

    public static boolean u(Iterable iterable, Object obj) {
        J6.r.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : E(iterable, obj) >= 0;
    }

    public static List v(List list, int i8) {
        J6.r.e(list, "<this>");
        if (i8 >= 0) {
            return V(list, P6.m.c(list.size() - i8, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static final Object w(Iterable iterable, int i8) {
        J6.r.e(iterable, "<this>");
        return iterable instanceof List ? ((List) iterable).get(i8) : x(iterable, i8, new a(i8));
    }

    public static final Object x(Iterable iterable, int i8, I6.l lVar) {
        J6.r.e(iterable, "<this>");
        J6.r.e(lVar, "defaultValue");
        if (iterable instanceof List) {
            List list = (List) iterable;
            return (i8 < 0 || i8 > AbstractC6987o.f(list)) ? lVar.invoke(Integer.valueOf(i8)) : list.get(i8);
        }
        if (i8 < 0) {
            return lVar.invoke(Integer.valueOf(i8));
        }
        int i9 = 0;
        for (Object obj : iterable) {
            int i10 = i9 + 1;
            if (i8 == i9) {
                return obj;
            }
            i9 = i10;
        }
        return lVar.invoke(Integer.valueOf(i8));
    }

    public static List y(Iterable iterable) {
        J6.r.e(iterable, "<this>");
        return (List) z(iterable, new ArrayList());
    }

    public static final Collection z(Iterable iterable, Collection collection) {
        J6.r.e(iterable, "<this>");
        J6.r.e(collection, "destination");
        for (Object obj : iterable) {
            if (obj != null) {
                collection.add(obj);
            }
        }
        return collection;
    }
}
