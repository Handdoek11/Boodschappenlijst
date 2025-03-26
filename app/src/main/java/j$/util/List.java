package j$.util;

import java.util.Arrays;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* loaded from: classes3.dex */
public interface List<E> extends Collection<E> {
    void replaceAll(UnaryOperator<E> unaryOperator);

    void sort(Comparator<? super E> comparator);

    @Override // java.util.Collection, java.lang.Iterable, j$.util.List, j$.util.Collection
    Spliterator<E> spliterator();

    /* renamed from: j$.util.List$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$replaceAll(java.util.List list, UnaryOperator unaryOperator) {
            Objects.requireNonNull(unaryOperator);
            ListIterator listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                listIterator.set(unaryOperator.apply(listIterator.next()));
            }
        }

        public static void $default$sort(java.util.List list, Comparator comparator) {
            Object[] array = list.toArray();
            Arrays.sort(array, comparator);
            ListIterator<E> listIterator = list.listIterator();
            for (Object obj : array) {
                listIterator.next();
                listIterator.set(obj);
            }
        }

        public static Spliterator $default$spliterator(java.util.List list) {
            if (list instanceof RandomAccess) {
                return new C5893a(list);
            }
            return Spliterators.spliterator(list, 16);
        }
    }
}
