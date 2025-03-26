package j$.util.stream;

import j$.util.AbstractC5897d;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* loaded from: classes3.dex */
final class h4 extends k4 implements IntConsumer, j$.util.Y {

    /* renamed from: e, reason: collision with root package name */
    int f37710e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f37711f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h4(Spliterator spliterator, int i8) {
        super(spliterator);
        this.f37711f = i8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h4(Spliterator spliterator, k4 k4Var, int i8) {
        super(spliterator, k4Var);
        this.f37711f = i8;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }

    @Override // j$.util.stream.k4, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5897d.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5897d.g(this, consumer);
    }

    @Override // j$.util.e0
    public final void forEachRemaining(IntConsumer intConsumer) {
        while (tryAdvance(intConsumer)) {
        }
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i8) {
        this.f37732d = (this.f37732d + 1) & 63;
        this.f37710e = i8;
    }

    @Override // j$.util.stream.k4
    final Spliterator c(Spliterator spliterator) {
        switch (this.f37711f) {
            case 0:
                return new h4((j$.util.Y) spliterator, this, 0);
            default:
                return new h4((j$.util.Y) spliterator, this, 1);
        }
    }

    @Override // j$.util.stream.k4, j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator trySplit() {
        switch (this.f37711f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.k4, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.e0 trySplit() {
        switch (this.f37711f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.Y
    public final boolean tryAdvance(IntConsumer intConsumer) {
        switch (this.f37711f) {
            case 0:
                boolean z7 = this.f37731c;
                Spliterator spliterator = this.f37729a;
                if (z7) {
                    this.f37731c = false;
                    boolean tryAdvance = ((j$.util.Y) spliterator).tryAdvance((IntConsumer) this);
                    if (tryAdvance && b()) {
                        IntPredicate intPredicate = null;
                        intPredicate.test(this.f37710e);
                        throw null;
                    }
                    if (!tryAdvance) {
                        return tryAdvance;
                    }
                    intConsumer.accept(this.f37710e);
                    return tryAdvance;
                }
                return ((j$.util.Y) spliterator).tryAdvance(intConsumer);
            default:
                if (this.f37731c && b() && ((j$.util.Y) this.f37729a).tryAdvance((IntConsumer) this)) {
                    IntPredicate intPredicate2 = null;
                    intPredicate2.test(this.f37710e);
                    throw null;
                }
                this.f37731c = false;
                return false;
        }
    }

    @Override // j$.util.stream.k4, j$.util.Spliterator
    public j$.util.Y trySplit() {
        switch (this.f37711f) {
            case 1:
                if (this.f37730b.get()) {
                    return null;
                }
                return (j$.util.Y) super.trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.e0
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f37711f) {
            case 1:
                tryAdvance((IntConsumer) obj);
                return false;
            default:
                return tryAdvance((IntConsumer) obj);
        }
    }
}
