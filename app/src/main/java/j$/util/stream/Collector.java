package j$.util.stream;

import j$.util.Objects;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* loaded from: classes3.dex */
public interface Collector<T, A, R> {
    BiConsumer accumulator();

    Set characteristics();

    BinaryOperator combiner();

    Function finisher();

    Supplier supplier();

    /* renamed from: j$.util.stream.Collector$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static <T, A, R> Collector<T, A, R> of(Supplier<A> supplier, BiConsumer<A, T> biConsumer, BinaryOperator<A> binaryOperator, Function<A, R> function, Characteristics... characteristicsArr) {
            Objects.requireNonNull(supplier);
            Objects.requireNonNull(biConsumer);
            Objects.requireNonNull(binaryOperator);
            Objects.requireNonNull(function);
            Objects.requireNonNull(characteristicsArr);
            Set set = Collectors.f37440b;
            if (characteristicsArr.length > 0) {
                EnumSet noneOf = EnumSet.noneOf(Characteristics.class);
                Collections.addAll(noneOf, characteristicsArr);
                set = Collections.unmodifiableSet(noneOf);
            }
            return new C5972m(supplier, biConsumer, binaryOperator, function, set);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Characteristics {
        public static final Characteristics CONCURRENT;
        public static final Characteristics IDENTITY_FINISH;
        public static final Characteristics UNORDERED;

        /* renamed from: a, reason: collision with root package name */
        private static final /* synthetic */ Characteristics[] f37438a;

        public static Characteristics valueOf(String str) {
            return (Characteristics) Enum.valueOf(Characteristics.class, str);
        }

        public static Characteristics[] values() {
            return (Characteristics[]) f37438a.clone();
        }

        static {
            Characteristics characteristics = new Characteristics("CONCURRENT", 0);
            CONCURRENT = characteristics;
            Characteristics characteristics2 = new Characteristics("UNORDERED", 1);
            UNORDERED = characteristics2;
            Characteristics characteristics3 = new Characteristics("IDENTITY_FINISH", 2);
            IDENTITY_FINISH = characteristics3;
            f37438a = new Characteristics[]{characteristics, characteristics2, characteristics3};
        }
    }
}
