package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* loaded from: classes3.dex */
public final class Optional<T> {

    /* renamed from: b, reason: collision with root package name */
    private static final Optional f37260b = new Optional();

    /* renamed from: a, reason: collision with root package name */
    private final Object f37261a;

    private Optional() {
        this.f37261a = null;
    }

    public static <T> Optional<T> empty() {
        return f37260b;
    }

    private Optional(Object obj) {
        this.f37261a = Objects.requireNonNull(obj);
    }

    public static <T> Optional<T> of(T t7) {
        return new Optional<>(t7);
    }

    public static <T> Optional<T> ofNullable(T t7) {
        return t7 == null ? empty() : of(t7);
    }

    public final Object a() {
        Object obj = this.f37261a;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean b() {
        return this.f37261a != null;
    }

    public void ifPresent(Consumer<? super T> consumer) {
        A.a aVar = (Object) this.f37261a;
        if (aVar != null) {
            consumer.accept(aVar);
        }
    }

    public Optional<T> filter(Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        if (b() && !predicate.test((Object) this.f37261a)) {
            return empty();
        }
        return this;
    }

    public <U> Optional<U> map(Function<? super T, ? extends U> function) {
        Objects.requireNonNull(function);
        if (!b()) {
            return empty();
        }
        return ofNullable(function.apply((Object) this.f37261a));
    }

    public T orElse(T t7) {
        T t8 = (T) this.f37261a;
        return t8 != null ? t8 : t7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Optional) {
            return Objects.equals(this.f37261a, ((Optional) obj).f37261a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f37261a);
    }

    public final String toString() {
        Object obj = this.f37261a;
        if (obj != null) {
            return String.format("Optional[%s]", obj);
        }
        return "Optional.empty";
    }
}
