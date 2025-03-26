package j$.util.stream;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5972m implements Collector {

    /* renamed from: a, reason: collision with root package name */
    private final Supplier f37739a;

    /* renamed from: b, reason: collision with root package name */
    private final BiConsumer f37740b;

    /* renamed from: c, reason: collision with root package name */
    private final BinaryOperator f37741c;

    /* renamed from: d, reason: collision with root package name */
    private final Function f37742d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f37743e;

    C5972m(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator, Function function, Set set) {
        this.f37739a = supplier;
        this.f37740b = biConsumer;
        this.f37741c = binaryOperator;
        this.f37742d = function;
        this.f37743e = set;
    }

    @Override // j$.util.stream.Collector
    public final BiConsumer accumulator() {
        return this.f37740b;
    }

    @Override // j$.util.stream.Collector
    public final Supplier supplier() {
        return this.f37739a;
    }

    @Override // j$.util.stream.Collector
    public final BinaryOperator combiner() {
        return this.f37741c;
    }

    @Override // j$.util.stream.Collector
    public final Function finisher() {
        return this.f37742d;
    }

    @Override // j$.util.stream.Collector
    public final Set characteristics() {
        return this.f37743e;
    }
}
