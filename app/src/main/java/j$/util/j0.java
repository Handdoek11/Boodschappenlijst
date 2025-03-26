package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes3.dex */
final class j0 implements H, DoubleConsumer, InterfaceC6047z {

    /* renamed from: a, reason: collision with root package name */
    boolean f37392a = false;

    /* renamed from: b, reason: collision with root package name */
    double f37393b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ V f37394c;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }

    @Override // j$.util.Q
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        while (hasNext()) {
            doubleConsumer.accept(nextDouble());
        }
    }

    @Override // java.util.Iterator
    public final Double next() {
        if (u0.f37856a) {
            u0.a(j0.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
            throw null;
        }
        return Double.valueOf(nextDouble());
    }

    @Override // j$.util.H, java.util.Iterator, j$.util.InterfaceC6047z
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            forEachRemaining((DoubleConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (u0.f37856a) {
            u0.a(j0.class, "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((DoubleConsumer) new E(consumer));
    }

    j0(V v7) {
        this.f37394c = v7;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d8) {
        this.f37392a = true;
        this.f37393b = d8;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f37392a) {
            this.f37394c.tryAdvance((DoubleConsumer) this);
        }
        return this.f37392a;
    }

    @Override // j$.util.H
    public final double nextDouble() {
        if (!this.f37392a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f37392a = false;
        return this.f37393b;
    }
}
