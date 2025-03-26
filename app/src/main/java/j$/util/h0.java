package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
final class h0 implements L, IntConsumer, InterfaceC6047z {

    /* renamed from: a, reason: collision with root package name */
    boolean f37380a = false;

    /* renamed from: b, reason: collision with root package name */
    int f37381b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Y f37382c;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }

    @Override // j$.util.Q
    public final void forEachRemaining(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        while (hasNext()) {
            intConsumer.accept(nextInt());
        }
    }

    @Override // java.util.Iterator
    public final Integer next() {
        if (u0.f37856a) {
            u0.a(h0.class, "{0} calling PrimitiveIterator.OfInt.nextInt()");
            throw null;
        }
        return Integer.valueOf(nextInt());
    }

    @Override // j$.util.L, java.util.Iterator, j$.util.InterfaceC6047z
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            forEachRemaining((IntConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (u0.f37856a) {
            u0.a(h0.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((IntConsumer) new I(consumer));
    }

    h0(Y y7) {
        this.f37382c = y7;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i8) {
        this.f37380a = true;
        this.f37381b = i8;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f37380a) {
            this.f37382c.tryAdvance((IntConsumer) this);
        }
        return this.f37380a;
    }

    @Override // j$.util.L
    public final int nextInt() {
        if (!this.f37380a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f37380a = false;
        return this.f37381b;
    }
}
