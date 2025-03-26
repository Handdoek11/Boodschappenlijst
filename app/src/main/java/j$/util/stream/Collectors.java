package j$.util.stream;

import j$.util.stream.Collector;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

/* loaded from: classes3.dex */
public final class Collectors {

    /* renamed from: a, reason: collision with root package name */
    static final Set f37439a;

    /* renamed from: b, reason: collision with root package name */
    static final Set f37440b;

    static {
        Collector.Characteristics characteristics = Collector.Characteristics.CONCURRENT;
        Collector.Characteristics characteristics2 = Collector.Characteristics.UNORDERED;
        Collector.Characteristics characteristics3 = Collector.Characteristics.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(characteristics, characteristics2, characteristics3));
        Collections.unmodifiableSet(EnumSet.of(characteristics, characteristics2));
        f37439a = Collections.unmodifiableSet(EnumSet.of(characteristics3));
        Collections.unmodifiableSet(EnumSet.of(characteristics2, characteristics3));
        f37440b = Collections.emptySet();
        Collections.unmodifiableSet(EnumSet.of(characteristics2));
    }

    static void a(double[] dArr, double d8) {
        double d9 = d8 - dArr[1];
        double d10 = dArr[0];
        double d11 = d10 + d9;
        dArr[1] = (d11 - d10) - d9;
        dArr[0] = d11;
    }

    public static <T, K, U> Collector<T, ?, Map<K, U>> toMap(Function<? super T, ? extends K> function, Function<? super T, ? extends U> function2) {
        return new C5972m(new C5962k(21), new C5967l(0, function, function2), new C5962k(0), new C5962k(1), f37439a);
    }
}
