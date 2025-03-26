package j$.util;

import j$.util.List;
import j$.util.stream.AbstractC6032y0;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* loaded from: classes3.dex */
public interface Collection<E> extends j$.lang.a {
    @Override // j$.util.Collection, j$.lang.a
    void forEach(Consumer<? super E> consumer);

    Stream<E> parallelStream();

    boolean removeIf(Predicate<? super E> predicate);

    Spliterator<E> spliterator();

    Stream<E> stream();

    <T> T[] toArray(IntFunction<T[]> intFunction);

    /* renamed from: j$.util.Collection$-EL, reason: invalid class name */
    public final /* synthetic */ class EL {
        public static /* synthetic */ Stream b(java.util.Collection collection) {
            return collection instanceof Collection ? ((Collection) collection).parallelStream() : CC.$default$parallelStream(collection);
        }

        public static /* synthetic */ Stream stream(java.util.Collection collection) {
            return collection instanceof Collection ? ((Collection) collection).stream() : CC.$default$stream(collection);
        }

        public static Spliterator c(java.util.Collection collection) {
            if (collection instanceof Collection) {
                return ((Collection) collection).spliterator();
            }
            if (collection instanceof LinkedHashSet) {
                return Spliterators.spliterator((LinkedHashSet) collection, 17);
            }
            if (!(collection instanceof java.util.SortedSet)) {
                return collection instanceof java.util.Set ? Spliterators.spliterator((java.util.Set) collection, 1) : collection instanceof java.util.List ? List.CC.$default$spliterator((java.util.List) collection) : Spliterators.spliterator(collection, 0);
            }
            java.util.SortedSet sortedSet = (java.util.SortedSet) collection;
            return new S(sortedSet, sortedSet);
        }

        public static void a(java.util.Collection collection, Consumer consumer) {
            if (collection instanceof Collection) {
                ((Collection) collection).forEach(consumer);
                return;
            }
            Objects.requireNonNull(consumer);
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                consumer.accept(it.next());
            }
        }
    }

    /* renamed from: j$.util.Collection$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$removeIf(java.util.Collection collection, Predicate predicate) {
            Objects.requireNonNull(predicate);
            Iterator<E> it = collection.iterator();
            boolean z7 = false;
            while (it.hasNext()) {
                if (predicate.test(it.next())) {
                    it.remove();
                    z7 = true;
                }
            }
            return z7;
        }

        public static Stream $default$stream(java.util.Collection collection) {
            return AbstractC6032y0.f0(EL.c(collection), false);
        }

        public static Stream $default$parallelStream(java.util.Collection collection) {
            return AbstractC6032y0.f0(EL.c(collection), true);
        }
    }
}
