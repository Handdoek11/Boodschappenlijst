package j$.util.stream;

import j$.util.AbstractC5897d;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import java.util.function.LongPredicate;

/* loaded from: classes3.dex */
final class i4 extends k4 implements LongConsumer, j$.util.b0 {

    /* renamed from: e, reason: collision with root package name */
    long f37717e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f37718f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i4(Spliterator spliterator, int i8) {
        super(spliterator);
        this.f37718f = i8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i4(Spliterator spliterator, k4 k4Var, int i8) {
        super(spliterator, k4Var);
        this.f37718f = i8;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // j$.util.stream.k4, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5897d.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5897d.h(this, consumer);
    }

    @Override // j$.util.e0
    public final void forEachRemaining(LongConsumer longConsumer) {
        while (tryAdvance(longConsumer)) {
        }
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j8) {
        this.f37732d = (this.f37732d + 1) & 63;
        this.f37717e = j8;
    }

    @Override // j$.util.stream.k4
    final Spliterator c(Spliterator spliterator) {
        switch (this.f37718f) {
            case 0:
                return new i4((j$.util.b0) spliterator, this, 0);
            default:
                return new i4((j$.util.b0) spliterator, this, 1);
        }
    }

    @Override // j$.util.stream.k4, j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator trySplit() {
        switch (this.f37718f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.k4, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.e0 trySplit() {
        switch (this.f37718f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.b0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        switch (this.f37718f) {
            case 0:
                boolean z7 = this.f37731c;
                Spliterator spliterator = this.f37729a;
                if (z7) {
                    this.f37731c = false;
                    boolean tryAdvance = ((j$.util.b0) spliterator).tryAdvance((LongConsumer) this);
                    if (tryAdvance && b()) {
                        LongPredicate longPredicate = null;
                        longPredicate.test(this.f37717e);
                        throw null;
                    }
                    if (!tryAdvance) {
                        return tryAdvance;
                    }
                    longConsumer.accept(this.f37717e);
                    return tryAdvance;
                }
                return ((j$.util.b0) spliterator).tryAdvance(longConsumer);
            default:
                if (this.f37731c && b() && ((j$.util.b0) this.f37729a).tryAdvance((LongConsumer) this)) {
                    LongPredicate longPredicate2 = null;
                    longPredicate2.test(this.f37717e);
                    throw null;
                }
                this.f37731c = false;
                return false;
        }
    }

    @Override // j$.util.stream.k4, j$.util.Spliterator
    public j$.util.b0 trySplit() {
        switch (this.f37718f) {
            case 1:
                if (this.f37730b.get()) {
                    return null;
                }
                return (j$.util.b0) super.trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.e0
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f37718f) {
            case 1:
                tryAdvance((LongConsumer) obj);
                return false;
            default:
                return tryAdvance((LongConsumer) obj);
        }
    }
}
