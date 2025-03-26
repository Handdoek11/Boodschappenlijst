package j$.util.stream;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5957j implements java.util.stream.Collector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Collector f37719a;

    private /* synthetic */ C5957j(Collector collector) {
        this.f37719a = collector;
    }

    public static /* synthetic */ java.util.stream.Collector a(Collector collector) {
        if (collector == null) {
            return null;
        }
        return collector instanceof C5952i ? ((C5952i) collector).f37712a : new C5957j(collector);
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ BiConsumer accumulator() {
        return this.f37719a.accumulator();
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ Set characteristics() {
        return AbstractC5916a3.a(this.f37719a.characteristics());
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ BinaryOperator combiner() {
        return this.f37719a.combiner();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Collector collector = this.f37719a;
        if (obj instanceof C5957j) {
            obj = ((C5957j) obj).f37719a;
        }
        return collector.equals(obj);
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ Function finisher() {
        return this.f37719a.finisher();
    }

    public final /* synthetic */ int hashCode() {
        return this.f37719a.hashCode();
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ Supplier supplier() {
        return this.f37719a.supplier();
    }
}
