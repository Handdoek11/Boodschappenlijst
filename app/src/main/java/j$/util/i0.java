package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
final class i0 implements P, LongConsumer, InterfaceC6047z {

    /* renamed from: a, reason: collision with root package name */
    boolean f37384a = false;

    /* renamed from: b, reason: collision with root package name */
    long f37385b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ b0 f37386c;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // j$.util.Q
    public final void forEachRemaining(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        while (hasNext()) {
            longConsumer.accept(nextLong());
        }
    }

    @Override // java.util.Iterator
    public final Long next() {
        if (u0.f37856a) {
            u0.a(i0.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
            throw null;
        }
        return Long.valueOf(nextLong());
    }

    @Override // j$.util.P, java.util.Iterator, j$.util.InterfaceC6047z
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            forEachRemaining((LongConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (u0.f37856a) {
            u0.a(i0.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((LongConsumer) new M(consumer));
    }

    i0(b0 b0Var) {
        this.f37386c = b0Var;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j8) {
        this.f37384a = true;
        this.f37385b = j8;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f37384a) {
            this.f37386c.tryAdvance((LongConsumer) this);
        }
        return this.f37384a;
    }

    @Override // j$.util.P
    public final long nextLong() {
        if (!this.f37384a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f37384a = false;
        return this.f37385b;
    }
}
