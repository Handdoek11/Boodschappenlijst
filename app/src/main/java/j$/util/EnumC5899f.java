package j$.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.util.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class EnumC5899f implements Comparator, InterfaceC5898e {
    public static final EnumC5899f INSTANCE;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ EnumC5899f[] f37359a;

    public static EnumC5899f valueOf(String str) {
        return (EnumC5899f) Enum.valueOf(EnumC5899f.class, str);
    }

    public static EnumC5899f[] values() {
        return (EnumC5899f[]) f37359a.clone();
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo((Comparable) obj2);
    }

    static {
        EnumC5899f enumC5899f = new EnumC5899f("INSTANCE", 0);
        INSTANCE = enumC5899f;
        f37359a = new EnumC5899f[]{enumC5899f};
    }

    @Override // java.util.Comparator
    public final Comparator thenComparing(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return new C5895c(this, comparator, 0);
    }

    @Override // java.util.Comparator
    public final Comparator thenComparing(Function function, Comparator comparator) {
        return AbstractC5897d.s(this, Comparator$CC.comparing(function, comparator));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparingInt(ToIntFunction toIntFunction) {
        return AbstractC5897d.s(this, Comparator$CC.comparingInt(toIntFunction));
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return Collections.reverseOrder();
    }

    @Override // java.util.Comparator
    public final Comparator thenComparing(Function function) {
        Objects.requireNonNull(function);
        return AbstractC5897d.s(this, new C5894b(2, function));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparingLong(ToLongFunction toLongFunction) {
        Objects.requireNonNull(toLongFunction);
        return AbstractC5897d.s(this, new C5894b(3, toLongFunction));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        Objects.requireNonNull(toDoubleFunction);
        return AbstractC5897d.s(this, new C5894b(1, toDoubleFunction));
    }
}
