package j$.util;

import j$.util.List;
import java.util.Comparator;
import java.util.Iterator;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC5897d {
    public static /* synthetic */ void r(java.util.List list, Comparator comparator) {
        if (list instanceof List) {
            ((List) list).sort(comparator);
        } else {
            List.CC.$default$sort(list, comparator);
        }
    }

    public static java.util.Optional m(Optional optional) {
        if (optional == null) {
            return null;
        }
        if (optional.b()) {
            return java.util.Optional.of(optional.a());
        }
        return java.util.Optional.empty();
    }

    public static Optional i(java.util.Optional optional) {
        if (optional == null) {
            return null;
        }
        if (optional.isPresent()) {
            return Optional.of(optional.get());
        }
        return Optional.empty();
    }

    public static OptionalDouble n(B b8) {
        if (b8 == null) {
            return null;
        }
        if (b8.c()) {
            return OptionalDouble.of(b8.b());
        }
        return OptionalDouble.empty();
    }

    public static B j(OptionalDouble optionalDouble) {
        if (optionalDouble == null) {
            return null;
        }
        if (optionalDouble.isPresent()) {
            return B.d(optionalDouble.getAsDouble());
        }
        return B.a();
    }

    public static OptionalLong p(D d8) {
        if (d8 == null) {
            return null;
        }
        if (d8.c()) {
            return OptionalLong.of(d8.b());
        }
        return OptionalLong.empty();
    }

    public static D l(OptionalLong optionalLong) {
        if (optionalLong == null) {
            return null;
        }
        if (optionalLong.isPresent()) {
            return D.d(optionalLong.getAsLong());
        }
        return D.a();
    }

    public static OptionalInt o(C c8) {
        if (c8 == null) {
            return null;
        }
        if (c8.c()) {
            return OptionalInt.of(c8.b());
        }
        return OptionalInt.empty();
    }

    public static C k(OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        if (optionalInt.isPresent()) {
            return C.d(optionalInt.getAsInt());
        }
        return C.a();
    }

    public static void q(Iterator it, Consumer consumer) {
        if (it instanceof InterfaceC6047z) {
            ((InterfaceC6047z) it).forEachRemaining(consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    public static C5895c s(Comparator comparator, Comparator comparator2) {
        Objects.requireNonNull(comparator2);
        return new C5895c((EnumC5899f) ((InterfaceC5898e) comparator), comparator2, 0);
    }

    public static long d(Spliterator spliterator) {
        if ((spliterator.characteristics() & 64) == 0) {
            return -1L;
        }
        return spliterator.estimateSize();
    }

    public static boolean e(Spliterator spliterator, int i8) {
        return (spliterator.characteristics() & i8) == i8;
    }

    public static boolean g(Y y7, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            return y7.tryAdvance((IntConsumer) consumer);
        }
        if (u0.f37856a) {
            u0.a(y7.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return y7.tryAdvance((IntConsumer) new I(consumer));
    }

    public static void b(Y y7, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            y7.forEachRemaining((IntConsumer) consumer);
        } else {
            if (u0.f37856a) {
                u0.a(y7.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            y7.forEachRemaining((IntConsumer) new I(consumer));
        }
    }

    public static boolean h(b0 b0Var, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            return b0Var.tryAdvance((LongConsumer) consumer);
        }
        if (u0.f37856a) {
            u0.a(b0Var.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return b0Var.tryAdvance((LongConsumer) new M(consumer));
    }

    public static void c(b0 b0Var, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            b0Var.forEachRemaining((LongConsumer) consumer);
        } else {
            if (u0.f37856a) {
                u0.a(b0Var.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            b0Var.forEachRemaining((LongConsumer) new M(consumer));
        }
    }

    public static boolean f(V v7, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            return v7.tryAdvance((DoubleConsumer) consumer);
        }
        if (u0.f37856a) {
            u0.a(v7.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return v7.tryAdvance((DoubleConsumer) new E(consumer));
    }

    public static void a(V v7, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            v7.forEachRemaining((DoubleConsumer) consumer);
        } else {
            if (u0.f37856a) {
                u0.a(v7.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            v7.forEachRemaining((DoubleConsumer) new E(consumer));
        }
    }

    public Spliterator trySplit() {
        return null;
    }

    public boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        return false;
    }

    public void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
    }

    public long estimateSize() {
        return 0L;
    }

    public int characteristics() {
        return 16448;
    }
}
