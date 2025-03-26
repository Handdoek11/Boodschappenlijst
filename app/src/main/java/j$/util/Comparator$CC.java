package j$.util;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToIntFunction;

/* renamed from: j$.util.Comparator$-CC, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class Comparator$CC {
    public static Comparator a() {
        return EnumC5899f.INSTANCE;
    }

    public static <T, U> Comparator<T> comparing(Function<? super T, ? extends U> function, Comparator<? super U> comparator) {
        Objects.requireNonNull(function);
        Objects.requireNonNull(comparator);
        return new C5895c(comparator, function, 1);
    }

    public static <T> Comparator<T> comparingInt(ToIntFunction<? super T> toIntFunction) {
        Objects.requireNonNull(toIntFunction);
        return new C5894b(0, toIntFunction);
    }
}
