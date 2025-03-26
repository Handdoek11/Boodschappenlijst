package j$.util.stream;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5952i implements Collector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.stream.Collector f37712a;

    private /* synthetic */ C5952i(java.util.stream.Collector collector) {
        this.f37712a = collector;
    }

    public static /* synthetic */ Collector a(java.util.stream.Collector collector) {
        if (collector == null) {
            return null;
        }
        return collector instanceof C5957j ? ((C5957j) collector).f37719a : new C5952i(collector);
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ BiConsumer accumulator() {
        return this.f37712a.accumulator();
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ Set characteristics() {
        return AbstractC5916a3.a(this.f37712a.characteristics());
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ BinaryOperator combiner() {
        return this.f37712a.combiner();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.stream.Collector collector = this.f37712a;
        if (obj instanceof C5952i) {
            obj = ((C5952i) obj).f37712a;
        }
        return collector.equals(obj);
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ Function finisher() {
        return this.f37712a.finisher();
    }

    public final /* synthetic */ int hashCode() {
        return this.f37712a.hashCode();
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ Supplier supplier() {
        return this.f37712a.supplier();
    }
}
