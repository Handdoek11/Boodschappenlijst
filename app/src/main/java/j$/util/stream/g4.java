package j$.util.stream;

import j$.util.AbstractC5897d;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;

/* loaded from: classes3.dex */
final class g4 extends k4 implements DoubleConsumer, j$.util.V {

    /* renamed from: e, reason: collision with root package name */
    double f37703e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f37704f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g4(Spliterator spliterator, int i8) {
        super(spliterator);
        this.f37704f = i8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g4(Spliterator spliterator, k4 k4Var, int i8) {
        super(spliterator, k4Var);
        this.f37704f = i8;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }

    @Override // j$.util.stream.k4, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5897d.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5897d.f(this, consumer);
    }

    @Override // j$.util.e0
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        while (tryAdvance(doubleConsumer)) {
        }
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d8) {
        this.f37732d = (this.f37732d + 1) & 63;
        this.f37703e = d8;
    }

    @Override // j$.util.stream.k4
    final Spliterator c(Spliterator spliterator) {
        switch (this.f37704f) {
            case 0:
                return new g4((j$.util.V) spliterator, this, 0);
            default:
                return new g4((j$.util.V) spliterator, this, 1);
        }
    }

    @Override // j$.util.stream.k4, j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator trySplit() {
        switch (this.f37704f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.k4, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.e0 trySplit() {
        switch (this.f37704f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.V
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        switch (this.f37704f) {
            case 0:
                boolean z7 = this.f37731c;
                Spliterator spliterator = this.f37729a;
                if (z7) {
                    this.f37731c = false;
                    boolean tryAdvance = ((j$.util.V) spliterator).tryAdvance((DoubleConsumer) this);
                    if (tryAdvance && b()) {
                        DoublePredicate doublePredicate = null;
                        doublePredicate.test(this.f37703e);
                        throw null;
                    }
                    if (!tryAdvance) {
                        return tryAdvance;
                    }
                    doubleConsumer.accept(this.f37703e);
                    return tryAdvance;
                }
                return ((j$.util.V) spliterator).tryAdvance(doubleConsumer);
            default:
                if (this.f37731c && b() && ((j$.util.V) this.f37729a).tryAdvance((DoubleConsumer) this)) {
                    DoublePredicate doublePredicate2 = null;
                    doublePredicate2.test(this.f37703e);
                    throw null;
                }
                this.f37731c = false;
                return false;
        }
    }

    @Override // j$.util.stream.k4, j$.util.Spliterator
    public j$.util.V trySplit() {
        switch (this.f37704f) {
            case 1:
                if (this.f37730b.get()) {
                    return null;
                }
                return (j$.util.V) super.trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.e0
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f37704f) {
            case 1:
                tryAdvance((DoubleConsumer) obj);
                return false;
            default:
                return tryAdvance((DoubleConsumer) obj);
        }
    }
}
